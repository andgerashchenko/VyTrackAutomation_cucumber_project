package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleServicePage {

    public VehicleServicePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Vehicle Services Logs']")
    public WebElement fleetVehicleServiceLog;

    @FindBy(xpath = "//h1[.='VehicleServicesLogs']")
    public WebElement fleetVehicleServiceLogHeader;


}
