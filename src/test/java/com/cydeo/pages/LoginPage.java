package com.cydeo.pages;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "prependedInput")
    public WebElement loginUsername;

    @FindBy(id = "prependedInput2")
    public WebElement loginPassword;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    public void login(){
        loginUsername.sendKeys(ConfigReader.getProperty("td_user"));
        loginPassword.sendKeys(ConfigReader.getProperty("password"));
        loginBtn.click();
    }
}
