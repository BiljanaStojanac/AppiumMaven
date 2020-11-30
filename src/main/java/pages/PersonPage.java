package pages;

import base.BasePages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PersonPage extends BasePages {
    public PersonPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

  private By txtFirstName = By.id("com.tricentis.insuranceCalculatorApp:id/firstnameTextfield");
    private By txtLastName = By.id("com.tricentis.insuranceCalculatorApp:id/lastnameTextfield");
    private By txtDateOfBirth = By.id("com.tricentis.insuranceCalculatorApp:id/dobTextfield");
    private By btnGenderMale = By.id("com.tricentis.insuranceCalculatorApp:id/gender_male");
    private By btnGenderFemale = By.id("com.tricentis.insuranceCalculatorApp:id/gender_female");
    private By txtOccupation = By.id("com.tricentis.insuranceCalculatorApp:id/occupationTextfield");
    private By btnPersonUnder23Yes = By.id("com.tricentis.insuranceCalculatorApp:id/putt_yes");
    private By btnPersonUnder23No = By.id("com.tricentis.insuranceCalculatorApp:id/putt_no");
    private By txtDateOfBirthUnder23 = By.id("com.tricentis.insuranceCalculatorApp:id/doboydTextfield");


    public void enterFirstName(String text){

        driver.findElement(txtFirstName).sendKeys(text);
    }
    public void enterLastName(String text){

        driver.findElement(txtLastName).sendKeys(text);
    }
    public void enterDateOfBirth(String text){

        driver.findElement(txtDateOfBirth).sendKeys(text);
    }
    public void selectGenderMale(){

        driver.findElement(btnGenderMale).click();
    }
    public void selectGenderFemale(){

        driver.findElement(btnGenderFemale).click();
    }
    public void enterOccupation(String text){

        driver.findElement(txtOccupation).sendKeys(text);
    }
    public void selectPersonUnder23Yes(){

        driver.findElement(btnPersonUnder23Yes).click();
    }
    public void selectPersonUnder23No(){

        driver.findElement(btnPersonUnder23No).click();
    }
    public void enterDateOfBirthUnder23(String text){

        driver.findElement(txtDateOfBirthUnder23).sendKeys(text);
    }

   public void enterPersonData()
   {

   }
    /* public void gender(){
          WebElement element = driver.findElement(btnGenderMale);
        //var maleSelected = driver.findElement(btnGenderMale).isSelected();
         if(element.isSelected()){

             driver.findElement(btnGenderFemale).click();
         }
         else{
             System.out.println("Nije selektovano");
             driver.findElement(btnGenderMale).click();}

     }*/

}
