package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='unclickable']//span[contains(text(), 'Dashboards')]")
    public WebElement DashboardModule;

    @FindBy(xpath = "//a[@class='unclickable']//span[contains(text(), 'Fleet')]")
    public WebElement FleetModule;

    @FindBy(xpath = "//a[@class='unclickable']//span[contains(text(), 'Customers')]")
    public WebElement CustomersModule;

    @FindBy(xpath = "//a[@class='unclickable']//span[contains(text(), 'Sales')]")
    public WebElement SalesModule;

    @FindBy(xpath = "//a[@class='unclickable']//span[contains(text(), 'Activities')]")
    public WebElement ActivitiesModule;

    @FindBy(xpath = "//a[@class='unclickable']//span[contains(text(), 'Marketing')]")
    public WebElement MarketingModule;

    @FindBy(xpath = "//a[@class='unclickable']//span[contains(text(), 'Reports &')]")
    public WebElement ReportsSegmentsModule;

    @FindBy(xpath = "//a[@class='unclickable']//span[contains(text(), 'System')]")
    public WebElement SystemModule;

    @FindBy(xpath = "//a/span[.='Contacts']")
    public WebElement Contacts;

    @FindBy(xpath = "//div[contains(@class, 'alert alert-error fade')]/div")
    public WebElement AlertMessage;

    @FindBy(xpath = "//span[.='Vehicle Contracts']")
    public WebElement Contracts;

    @FindBy(xpath = "//li[@id='user-menu']/a")
    public WebElement UserMenu;

    @FindBy(linkText = "Logout")
    public WebElement LogoutBtn;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement CloseAlert;

    @FindBy(xpath = "//span[.='Vehicle Services Logs']")
    public WebElement fleetVehicleServiceLog;

    @FindBy(xpath = "//h1[.='VehicleServicesLogs']")
    public WebElement fleetVehicleServiceLogHeader;


}
