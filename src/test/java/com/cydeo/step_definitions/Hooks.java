package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {
    //@Before
    public void setUp(){
        System.out.println("Before Scenario is running");
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            //7.3.3
           scenario.attach(screenshot, "image/png", scenario.getName());
            //5.6.0
           // scenario.embed(screenshot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}
