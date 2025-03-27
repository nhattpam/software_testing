package com.nhattpam.tests.stepdefinitions;

import com.nhattpam.pages.LoginPage;
import com.nhattpam.utils.BaseTest;
import com.nhattpam.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class LoginSteps extends BaseTest {
    WebDriver driver;
    LoginPage loginPage;

    @Given("Người dùng mở trang đăng nhập Facebook")
    public void openFacebookLoginPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        loginPage = new LoginPage(driver);
    }

//    @When("Nhập username {string} và password {string}")
//    public void enterCredentials(String email, String password) {
//        loginPage.enterEmail(email);
//        loginPage.enterPassword(password);
//    }

    @When("Nhập username và password từ file config")
    public void enterCredentialsFromConfig() {
        String email = ConfigReader.getProperty("facebook.username");
        String password = ConfigReader.getProperty("facebook.password");

        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }


    @And("Nhấn nút Login")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("Hệ thống hiển thị trang chủ Facebook")
    public void verifyHomePage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("facebook.com"));
        driver.quit();
    }
}