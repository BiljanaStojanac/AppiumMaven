package pages;

import base.BasePages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;




public class HomePage extends BasePages {


    public HomePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    private By carImage = By.id("com.tricentis.insuranceCalculatorApp:id/Car");
    private By MotorbikeImage = By.id("com.tricentis.insuranceCalculatorApp:id/Motorbike");
    private By TruckImage = By.id("com.tricentis.insuranceCalculatorApp:id/Motorbike");
    private By btnHome = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.LinearLayout[1]/android.widget.TextView");
    private By btnVehicle = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.LinearLayout[2]/android.widget.TextView");
    private By btnPerson = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.LinearLayout[3]/android.widget.TextView");
    private By btnProductDetails = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.LinearLayout[4]/android.widget.TextView");
    private By btnQuote = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.LinearLayout[5]/android.widget.TextView");

    public VehiclePage clickCarImage(){
        driver.findElement(carImage).click();
       return new VehiclePage(driver);
    }
    public VehiclePage clickMotorbikeImage(){
        driver.findElement(MotorbikeImage).click();
        return new VehiclePage(driver);

    }
    public VehiclePage clickTruckImage(){

        driver.findElement(TruckImage).click();
        return new VehiclePage(driver);
    }
    public void clickHomeButton()
    {
        driver.findElement(btnHome).click();
    }
    public VehiclePage clickVehicleButton()
    {
        driver.findElement(btnVehicle).click();
        return new VehiclePage(driver);
    }
    public PersonPage clickPersonButton()
    {
        driver.findElement(btnPerson).click();
        return new PersonPage(driver);
    }

    public ProductDetailsPage clickProductDetailsButton(){
        driver.findElement(btnProductDetails).click();
        return new ProductDetailsPage(driver);
    }
    public ProductQuotePage clickProductQuoteButton(){
        driver.findElement(btnQuote).click();
        return  new ProductQuotePage(driver);
    }
}
