package com.nhattpam.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private AppiumDriver driver;

    @AndroidFindBy(xpath = "//*[@resource-id='page/login_by_account/input_username']")
    private WebElement usernameField;



    @AndroidFindBy(xpath = "//*[@resource-id='page/login_by_account/input_password']")
    private WebElement passwordField;

    @AndroidFindBy(xpath = "//*[@resource-id='page/login_by_account/button_submit']")
    private WebElement loginButton;

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void login(String username, String password) {
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}
