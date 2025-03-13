package com.nhattpam.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.net.URL;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        URL resource = getClass().getClassLoader().getResource("chromedriver.exe");
        if (resource == null) {
            throw new RuntimeException("Chromedriver not found in resources folder!");
        }

        String driverPath = new File(resource.getFile()).getAbsolutePath();
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--incognito");
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
    }


    @AfterClass
    public void tearDown() {
        if (driver != null) {
//            driver.quit();
        }
    }
}
