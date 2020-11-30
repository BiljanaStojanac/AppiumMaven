package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utilities.CaptureScreenshots;
import utilities.SetConnection;
import utilities.SetAppiumServer;

public class PreconditionAndPostcondition {

    public AppiumDriver<MobileElement> driver;
    public static String propertyFile = "Android_InsuranceCalculator.properties";
    public static Logger log = Logger.getLogger(PreconditionAndPostcondition.class);


   @BeforeMethod
    public void setUp(){
        if(driver==null)
        {
            PropertyConfigurator
                    .configure(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\log4j.properties");
            if (propertyFile.startsWith("Android_")) {


              //  SetAppiumServer.start();
               log.info("Appium server started");
                SetConnection.loadAndriodConfProp();
                log.info(propertyFile + " properties file loaded !!!");
                SetConnection.setAndroidCapabilities();
                driver = SetConnection.getAndroidDriver();

            } else if (propertyFile.startsWith("IOS_")) {

            }

        }
    }
    @AfterMethod
    public void tearDownScreenshot(ITestResult result)
    {

        if(ITestResult.FAILURE==result.getStatus())
        {
            CaptureScreenshots.capturescreen(driver,result.getName(),"FAILURE");
        }
        else
        {
            CaptureScreenshots.capturescreen(driver,result.getName(),"SUCCESS");
        }
    }
    public void quit(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
       // driver.removeApp("com.tricentis.insuranceCalculatorApp");
        driver.quit();
        log.info("Test case execution completed");

      //  SetAppiumServer.stop();
        log.info("Appium server stopped !!!");
    }

}
