package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserStory11StepDef extends LoginPage {
    BasePage basePage = new BasePage();


    @Given("as a authorized user on login page")
    public void as_a_authorized_user_on_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
    }
    @When("authorized user logs in valid credentials")
    public void authorized_user_logs_in_valid_credentials() {
        login();
    }

    @When("user on homepage")
    public void user_on_homepage() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
        wait.until(ExpectedConditions.titleIs("Dashboard"));
        Assert.assertEquals("Dashboard",Driver.getDriver().getTitle());
    }
    @When("user clicks Vehicle Service Log dropdown")
    public void user_clicks_vehicle_service_log_dropdown() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(basePage.FleetModule).click(basePage.fleetVehicleServiceLog).perform();
//        WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(),10);
//        webDriverWait(ExpectedConditions.visibilityOf())
    }
    @Then("user should be able to see Vehicle service Log page")
    public void user_should_be_able_to_see_vehicle_service_log_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("VehicleServicesLogs"));
    }


}
