package com.nhattpam.tests;

import org.testng.annotations.Test;
import com.nhattpam.pages.LoginPage;

public class LoginTest extends BaseTest {
    LoginPage loginPage;

    @Test
    public void testValidLogin() {

        driver.get("https://facebook.com");
        loginPage = new LoginPage(driver);
        loginPage.login("testuser", "password123");
        // Thêm assert kiểm tra kết quả
    }
}
