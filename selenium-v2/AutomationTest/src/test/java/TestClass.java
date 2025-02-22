import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class TestClass {

    String homeLink = "https://www.google.com";
    String devLink = "https://auto.fresher.dev/";
    String driverPath = "chromedriver.exe";
    //    WebDriver chromeDriver;
    ChromeDriver chromeDriver;

    @BeforeMethod
    public void Setup() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();

    }


    @Test
    public void Run() {
        checkXemChiDuocNhapSoNumberInput();
        sleep(6000);
    }

    @AfterMethod
    public void CleanUp() {
        chromeDriver.quit();
    }

    private void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception ex) {
            System.out.printf(ex.getMessage());
        }
    }

    private void buttonClick(){
        chromeDriver.get(devLink + "/lessons/lession7/index.html");
        //click
        WebElement button = chromeDriver.findElement(By.id("btnExample1"));
        Actions action = new Actions(chromeDriver);

        //Move to element
        action.moveToElement(button);

        //left click
        action.click(button).build().perform();


        //right click
        action.contextClick(button).build().perform();

        //double click
        action.doubleClick(button).build().perform();

        //Drag and drop
        action.dragAndDrop(button, button).build().perform();

    }

    private void clickTungButton(){
        chromeDriver.get(devLink + "/lessons/lession7/index.html");
        //click tung button
        List<WebElement> buttons = chromeDriver.findElements(By.className("btn-success"));
        for (int i = 0; i < buttons.size(); i++) {
            buttons.get(i).click();
            sleep(3000);
        }
    }

    private void searchGoogle(){
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--incognito");
        opt.addArguments("--lang-vi");

        chromeDriver = new ChromeDriver(opt);
        chromeDriver.get("https://google.com/");
        chromeDriver.manage().window().maximize();

        //Kiem o search tren page google
        WebElement searchBox = chromeDriver.findElement(By.name("q"));
        searchBox.sendKeys("HELLLOOOO");
        searchBox.submit();

    }

    private void layGiaTriButton(){
        chromeDriver.get(devLink + "/lessons/lession7/index.html");
        WebElement lbStatusButton = chromeDriver.findElement(By.id("lbStatusButton"));
        String status = lbStatusButton.getText();

        Assert.assertEquals(status, "A simple primary alert—check it out!");
    }

    private void soSanhVaClearInput(){
        chromeDriver.get(devLink + "/lessons/lession7/index.html");
        WebElement input1 = chromeDriver.findElement(By.id("txtInput1"));
        String inputValue = input1.getAttribute("value");
        Assert.assertEquals(inputValue, "Default value of input");

        String newValue = "New value of input";

        input1.clear();
        input1.sendKeys(newValue);

        String newInputValue = input1.getAttribute("value");
        Assert.assertEquals(newInputValue, newValue);
    }

    private void checkXemCoNhapDuocTextInput(){ //-> remove attribute "disabled"
        chromeDriver.get(devLink + "/lessons/lession7/index.html");

        WebElement input = chromeDriver.findElement(By.id("txtInput2"));
        removeAttribute(input, "disabled");
        input.clear();
        input.sendKeys("asdasd");
        setAttribute(input, "disabled");
    }

    public void removeAttribute(WebElement element, String attr){
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].removeAttribute('" + attr + "')", element);
    }

    public void setAttribute(WebElement element, String attr) {
        ((JavascriptExecutor) chromeDriver).executeScript(
                "arguments[0].setAttribute('" + attr + "', '')", element
        );
    }

    private void checkXemChiDuocNhapSoNumberInput(){
        chromeDriver.get(devLink + "/lessons/lession7/index.html");

        WebElement input = chromeDriver.findElement(By.id("txtInput3"));

        String testInput = "abc123.12%$%";
        String expected =  "123.12";

//        input.sendKeys(testInput);
        sendText(input, testInput);
        sleep(100);

        String actual  = getText(input);

        Assert.assertEquals(actual, expected);
    }



    private String getText(WebElement element){
        return element.getAttribute("value");
    }

    private void sendText(WebElement element, String input){
        element.clear();
        sleep(100);
        element.sendKeys(input);
        sleep(100);
    }

}

