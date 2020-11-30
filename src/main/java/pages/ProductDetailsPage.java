package pages;

import base.BasePages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class ProductDetailsPage extends BasePages {
    public ProductDetailsPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    private By txtPreferredStartDate = By.id("com.tricentis.insuranceCalculatorApp:id/psdTextfield");
    private By txtPaymentOption = By.id("com.tricentis.insuranceCalculatorApp:id/paymentoptionTextfield");
    private By btnEuroProtection = By.id("com.tricentis.insuranceCalculatorApp:id/europrotectionSwitch");
    private By btnLegalProtection = By.id("com.tricentis.insuranceCalculatorApp:id/legalprotectionSwitch");
    private By InsuranceSumSlider = By.id("com.tricentis.insuranceCalculatorApp:id/insuranceSumSlider");
    private By lblInsuranceSum = By.id("com.tricentis.insuranceCalculatorApp:id/insurancesumValue");
    private By txtDamageInsurance = By.id("com.tricentis.insuranceCalculatorApp:id/damageinsuranceTextfield");


    public void preferredStartDate(String text){

        driver.findElement(txtPreferredStartDate).sendKeys(text);
    }
    public void paymentOption(String text)
    {

        driver.findElement(txtPaymentOption).sendKeys(text);
    }
    public void euroProtection()
    {
        driver.findElement(btnEuroProtection).click();
    }
    public void legalProtection(){
        driver.findElement(btnLegalProtection).click();
    }
    public void InsuranceSumSlider(String text)
    {
        driver.findElement(InsuranceSumSlider).sendKeys(text);

    }
    public void DamageInsurance(String text)
    {

        driver.findElement(txtDamageInsurance).sendKeys(text);
    }

}
