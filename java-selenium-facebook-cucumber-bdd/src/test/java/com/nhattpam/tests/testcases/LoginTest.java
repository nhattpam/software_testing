package com.nhattpam.tests.testcases;

import com.nhattpam.pages.LoginPage;
import com.nhattpam.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    private LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        driver.get("https://www.facebook.com/");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testValidLogin() {
        loginPage.enterEmail("testuser@gmail.com");
        loginPage.enterPassword("12345678");
        loginPage.clickLoginButton();

        Assert.assertTrue(driver.getCurrentUrl().contains("facebook.com"));
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
