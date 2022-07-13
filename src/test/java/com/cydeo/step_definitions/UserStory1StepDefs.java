package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.VehiclesPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserStory1StepDefs extends LoginPage {

    BasePage basePage = new BasePage();
    VehiclesPage vehiclesPage = new VehiclesPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
    }

    @Then("user logs in as a {string}")
    public void user_logs_in_as_a(String string) throws InterruptedException {
        login();
        Thread.sleep(3000);
    }
    @Then("user clicks on the {string} module")
    public void user_clicks_on_the_module(String module) {
        basePage.FleetModule.click();
    }

    @When("user navigates to vehicle page")
    public void user_navigates_to_vehicle_page() throws InterruptedException {
        vehiclesPage.vehicles.click();
        Thread.sleep(3000);
    }
    @When("user sees the grid")
    public void user_sees_the_grid() {
        Assert.assertTrue(vehiclesPage.grid.isDisplayed());

    }
    @When("user clicks any car on the grid")
    public void user_clicks_any_car_on_the_grid() throws InterruptedException {
        vehiclesPage.gridBody.click();
        Thread.sleep(3000);
    }
    @Then("user sees the vehicle information")
    public void user_sees_the_vehicle_information() {
        Assert.assertTrue(vehiclesPage.generalInfoTxt.isDisplayed());
    }

}
