package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import jdk.jfr.Experimental;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US7_ContractPageAccess {
    @Given("{string} logging in to the page with {string}")
    public void logging_in_to_the_page_with(String userName, String password) {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        LoginPage loginPage = new LoginPage();
        loginPage.loginUsername.sendKeys(userName);
        loginPage.loginPassword.sendKeys(password);
        loginPage.loginBtn.click();
    }
    @Then("{string} has correct accessibility to Contract page")
    public void has_correct_accessibility_to_contract_page(String userType) throws InterruptedException {
        BasePage basePage = new BasePage();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        if(basePage.AlertMessage.isDisplayed()&&basePage.AlertMessage.getText().contains("The application is not configured")){
            basePage.CloseAlert.click();
        }
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(basePage.FleetModule));
        basePage.FleetModule.click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(basePage.Contracts));
        basePage.Contracts.click();
        Thread.sleep(1000);

        if(userType.equals("TruckDriver")){
            wait.until(ExpectedConditions.visibilityOf(basePage.AlertMessage));
            String alert = "You do not have permission to perform this action.";
            Assert.assertEquals("No alert message displayed", alert, basePage.AlertMessage.getText());
        }else if(userType.equals("StoreManager")||userType.equals("SalesManager")){
            wait.until(ExpectedConditions.titleContains("Contract"));
            Assert.assertTrue("Contract page wasn't accessed", Driver.getDriver().getTitle().contains("Contract"));
        }

    }


}
