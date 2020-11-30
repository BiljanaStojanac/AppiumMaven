package testcases;

import base.PreconditionAndPostcondition;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import java.util.ResourceBundle;

import static org.testng.Assert.assertEquals;


public class CarTests extends PreconditionAndPostcondition {
    HomePage home;
    ResourceBundle element;
    @BeforeTest
    public void init() {

       setUp();

        home = new HomePage(driver);
        element = ResourceBundle.getBundle("values/CarValues");
    }
    @Test(priority = 1)
    public void CarE2E(){

        home.clickCarImage();
        enterVehicleData();
        home.clickPersonButton();

        //Enter Person data
        enterPersonData();
        home.clickProductDetailsButton();

        //Enter Product details
        enterProductDetails();
        home.clickProductQuoteButton();

        //Vefiry Product Quote
        ProductQuotePage productQuote = new ProductQuotePage(driver);
        assertEquals(productQuote.getFirstName(),element.getString("FirstName"),"Text for FirstName is incorrect");
        assertEquals(productQuote.getLastName(),element.getString("LastName"),"Text for LastName is incorrect");
        assertEquals(productQuote.getDateOfBirth(),element.getString("DateOfBirth"),"Text for DateOfBirth is incorrect");
        assertEquals(productQuote.getSex(),element.getString("Gender"),"Text for Sex is incorrect");
        assertEquals(productQuote.getOccupation(),element.getString("Occupation"),"Text for Occupation is incorrect");

    }
    private void enterVehicleData()
    {
        VehiclePage enterDataVehicle = new VehiclePage(driver);
        enterDataVehicle.enterMake(element.getString("Make"));
        enterDataVehicle.enterYearOfConstruction(element.getString("YearOfConstruction"));
        enterDataVehicle.enterListPrice(element.getString("ListPrice"));
        enterDataVehicle.enterMileagePerYear(element.getString("MileagePerYear"));
        enterDataVehicle.enterPerformance(element.getString("Performance"));
        enterDataVehicle.enterFuel(element.getString("Fuel"));
        enterDataVehicle.enterUsage(element.getString("Usage"));

    }

    private void enterPersonData(){
        PersonPage enterDataPerson = new PersonPage(driver);
        enterDataPerson.enterFirstName(element.getString("FirstName"));
        enterDataPerson.enterLastName(element.getString("LastName"));
        enterDataPerson.enterDateOfBirth(element.getString("DateOfBirth"));
        enterDataPerson.enterOccupation(element.getString("Occupation"));
        enterDataPerson.selectGenderFemale();
        enterDataPerson.selectPersonUnder23No();

    }

    private void enterProductDetails(){

        ProductDetailsPage enterProductDetails = new ProductDetailsPage(driver);
        enterProductDetails.preferredStartDate(element.getString("PreferredStartDate"));
        enterProductDetails.paymentOption("PaymentOption");
        enterProductDetails.euroProtection();
        enterProductDetails.legalProtection();
        enterProductDetails.InsuranceSumSlider(element.getString("DamageInsuranceSum"));
        enterProductDetails.DamageInsurance(element.getString("DamageInsurance"));
    }
    @AfterTest
    public void quitDriver(){
        //quit();
    }
}
