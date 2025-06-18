package com.nhattpam.tests;

import com.nhattpam.pages.LoginPage;
import com.nhattpam.utils.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    private LoginPage loginPage;

    public LoginTest() {
    }

    @BeforeClass
    public void initPages() {
        this.loginPage = new LoginPage(this.driver);
    }

    @Test
    public void testLogin() {
        this.loginPage.login("testuser", "testpass");
    }
}
