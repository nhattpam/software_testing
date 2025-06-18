package com.nhattpam.tests.login;

import com.nhattpam.pages.LoginPage;
import com.nhattpam.utils.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginUITest extends BaseTest {
    private LoginPage loginPage;

    @BeforeClass
    public void initPages() {
        this.loginPage = new LoginPage(this.driver);
    }

    /**
     * Test: Kiểm tra màu của nút login thông qua accessibilityLabel
     * Yêu cầu phía app gắn accessibilityLabel="bg:#007AFF"
     */
    @Test
    public void testLoginButtonColor() {
        WebElement loginButton = loginPage.getLoginButton();
        String accessibilityLabel = loginButton.getAttribute("accessibilityLabel");

        System.out.println("accessibilityLabel: " + accessibilityLabel);
        Assert.assertNotNull(accessibilityLabel, "accessibilityLabel bị null");

        Assert.assertTrue(
                accessibilityLabel.contains("#007AFF"),
                "Sai màu login button! Mong đợi: #007AFF - Thực tế: " + accessibilityLabel
        );
    }

    @Test
    public void testLoginButtonText() {
        WebElement loginButton = loginPage.getLoginButton();

        String desc = loginButton.getAttribute("content-desc");

        Assert.assertEquals(desc, "Đăng nhập", "Nội dung nút không đúng!");
    }

}
