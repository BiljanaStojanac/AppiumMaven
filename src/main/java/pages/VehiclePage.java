package pages;

import base.BasePages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class VehiclePage extends BasePages {
    public VehiclePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    private By txtMake = By.id("com.tricentis.insuranceCalculatorApp:id/Make");
    private By txtYearOfConstruction = By.id("com.tricentis.insuranceCalculatorApp:id/YearOfConstruction");
    private By txtListPrice = By.id("com.tricentis.insuranceCalculatorApp:id/List_Price");
    private By txtMileagePerYear = By.id("com.tricentis.insuranceCalculatorApp:id/Mileage_per_year");
    private By txtPerformance = By.id("com.tricentis.insuranceCalculatorApp:id/Performance");
    private By txtFuel = By.id("com.tricentis.insuranceCalculatorApp:id/Fuel");
    private By txtUsage = By.id("com.tricentis.insuranceCalculatorApp:id/Usage");

    public void enterMake(String text){

        driver.findElement(txtMake).sendKeys(text);
    }
    public void enterYearOfConstruction(String text){

        driver.findElement(txtYearOfConstruction).sendKeys(text);
    }
    public void enterListPrice(String text){

        driver.findElement(txtListPrice).sendKeys(text);
    }
    public void enterMileagePerYear(String text){

        driver.findElement(txtMileagePerYear).sendKeys(text);
    }
    public void enterPerformance(String text){

        driver.findElement(txtPerformance).sendKeys(text);
    }
    public void enterFuel(String text){

        driver.findElement(txtFuel).sendKeys(text);
    }
    public void enterUsage(String text){

        driver.findElement(txtUsage).sendKeys(text);
    }
}
