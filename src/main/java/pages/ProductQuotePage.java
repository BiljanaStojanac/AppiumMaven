package pages;

import base.BasePages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class ProductQuotePage extends BasePages {
    public ProductQuotePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    //Offer
    private By lblAutomobileLiabilityValue = By.id("com.tricentis.insuranceCalculatorApp:id/automobileLiabilityValueLabel");
    private By lblPremiumTaxValue = By.id("com.tricentis.insuranceCalculatorApp:id/premiumTax_Value");
    private By lblSumValue = By.id("com.tricentis.insuranceCalculatorApp:id/sumValueLabel");

    //Insurant
    private By lblFirstNameValue = By.id("com.tricentis.insuranceCalculatorApp:id/first_name_value");
    private By lblLastNameValue = By.id("com.tricentis.insuranceCalculatorApp:id/last_name_value");
    private By lblDatOfBirthValue = By.id("com.tricentis.insuranceCalculatorApp:id/date_of_birth_value");
    private By lblSexValue = By.id("com.tricentis.insuranceCalculatorApp:id/sex_value");
    private By lblOccupationValue = By.id("com.tricentis.insuranceCalculatorApp:id/occupation_value");

    //Vehicle
    private By lblMakeValue  = By.id("com.tricentis.insuranceCalculatorApp:id/make_value");
    private By lblYearValue = By.id("com.tricentis.insuranceCalculatorApp:id/yoc_value");
    private By lblPerformanceValue = By.id("com.tricentis.insuranceCalculatorApp:id/performance_value");
    private By lblFuelValue = By.id("com.tricentis.insuranceCalculatorApp:id/fuel_value");
    private By lblListPriceValue = By.id("com.tricentis.insuranceCalculatorApp:id/listprice_value");
    private By lblMileageValue = By.id("com.tricentis.insuranceCalculatorApp:id/mpy_value");


    //Product Choice
    private By lblInsuranceSumValue = By.id("com.tricentis.insuranceCalculatorApp:id/insurance_sum_value");
    private By lblEuroProtectionValue = By.id("com.tricentis.insuranceCalculatorApp:id/euro_protection_value");
    private By btnReset  = By.id("com.tricentis.insuranceCalculatorApp:id/next");


    //Get insurant data
   public String getFirstName()
   {
       return driver.findElement(lblFirstNameValue).getText();
   }
   public String getLastName()
   {
       return driver.findElement(lblLastNameValue).getText();
   }
    public String getDateOfBirth()
    {
        return driver.findElement(lblDatOfBirthValue).getText();
    }
    public String getSex()
    {
        return driver.findElement(lblSexValue).getText();
    }
    public String getOccupation()
    {
        return driver.findElement(lblOccupationValue).getText();
    }

    //get vehicle data
    public String getMake()
    {
        return driver.findElement(lblMakeValue).getText();
    }
    public String getYear()
    {
        return driver.findElement(lblYearValue).getText();
    }
    public String getPerformance()
    {
        return driver.findElement(lblPerformanceValue).getText();
    }
    public String getFuel()
    {
        return driver.findElement(lblFuelValue).getText();
    }
    public String getListPrice()
    {
        return driver.findElement(lblListPriceValue).getText();
    }
    public String getMileage()
    {
        return driver.findElement(lblMileageValue).getText();
    }

    //get Product choice
    public String getInsuranceSum()
    {
        return driver.findElement(lblInsuranceSumValue).getText();
    }
    public String getEuroProtection()
    {
        return driver.findElement(lblEuroProtectionValue).getText();
    }
    public void clickReset()
    {
        driver.findElement(btnReset).click();

    }
}
