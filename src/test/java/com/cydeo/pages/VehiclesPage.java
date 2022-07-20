package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage{

    public VehiclesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[.='Vehicles']")
    public WebElement vehicles;

    @FindBy (xpath = "//div[starts-with(@id, 'grid-custom-entity-grid')]")
    public WebElement grid;

    @FindBy (xpath = "//tbody[@class='grid-body']")
    public WebElement gridBody;

    @FindBy (xpath = "//span[.='General Information']")
    public WebElement generalInfoTxt;
}
