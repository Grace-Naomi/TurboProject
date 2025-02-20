package com.cucumberFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    SeleniumActions seleniumActions;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        seleniumActions = new SeleniumActions(driver);
        PageFactory.initElements(driver, this);
    }

    private By usernameInput = By.id("user-name");
    private By passwordInput = By.id("password");
    private By loginButton = By.cssSelector(".submit-button.btn_action");

    @FindBy(id="user-name")
    private WebElement userNameInputBox;

    @FindBy(id="password")
    private WebElement passwordInputBox;

    @FindBy(css = ".submit-button.btn_action")
    private WebElement submitButton;

    public void loginAt(String un, String pwd){
        seleniumActions.typeValue(userNameInputBox, un);
        seleniumActions.typeValue(passwordInputBox, pwd);
        seleniumActions.clickOnElement(submitButton);
    }


   // By usernameInput = By.id("user-name");
   // By passwordInput = By.id("password");
    //By loginButton = By.cssSelector(".submit-button.btn_action");

    public void login(String un, String pwd){
        //driver.findElement(usernameInput).sendKeys(un);
        //driver.findElement(passwordInput).sendKeys(pwd);
       // driver.findElement(loginButton).click();
        seleniumActions.typeValue(usernameInput, un);
        seleniumActions.typeValue(passwordInput, pwd);
        seleniumActions.clickOnElement(loginButton);
    }



}