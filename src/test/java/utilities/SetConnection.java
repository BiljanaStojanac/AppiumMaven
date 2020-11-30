package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.ResourceBundle;
import java.net.MalformedURLException;
import java.net.URL;


public class SetConnection {

	public static ResourceBundle elementConn;


	private static AppiumDriver<MobileElement> driver;
	private static URL serverUrl;
	private static DesiredCapabilities capabilities = new DesiredCapabilities();
	private static String APPIUM_PORT;
	private static int IMPLICIT_WAIT_TIME;
	private static int EXPLICIT_WAIT_TIME;
	private static String BASE_PKG;
	private static String APP_ACTIVITY;
	private static String APP_PATH;
	private static String BROWSER_NAME;
	private static String PLATFORM_NAME;
	private static String PLATFORM_VERSION;
	private static String DEVICE_NAME;
	private static String UDID;
	private static String BUNDLE_ID;
	private static String APP;
	


	public static void loadAndriodConfProp()
	{

		elementConn = ResourceBundle.getBundle("properties/Android_InsuranceCalculator");


		IMPLICIT_WAIT_TIME = Integer.parseInt(elementConn.getString("implicit.wait"));
		EXPLICIT_WAIT_TIME = Integer.parseInt(elementConn.getString("explicit.wait"));
		BASE_PKG = elementConn.getString("base.pgk");
		APP_ACTIVITY = elementConn.getString("application.activity");
		APP_PATH = elementConn.getString("application.path");
		BROWSER_NAME = elementConn.getString("base.pgk");
		PLATFORM_NAME = elementConn.getString("platform.name");
		PLATFORM_VERSION = elementConn.getString("platform.version");
		DEVICE_NAME = elementConn.getString("device.name");
		APPIUM_PORT = elementConn.getString("appium.server.port");
		UDID = elementConn.getString("udid");
	}
	
	//setting android cap
	public static void setAndroidCapabilities() {
		
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
		//capabilities.setCapability(CapabilityType.BROWSER_NAME, BROWSER_NAME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, BASE_PKG);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY);
		capabilities.setCapability(MobileCapabilityType.UDID, UDID);
		//capabilities.setCapability("app", APP_PATH);
		capabilities.setCapability(MobileCapabilityType.FULL_RESET, "False");
		capabilities.setCapability(MobileCapabilityType.NO_RESET, "True");
	}
	
	
	
	
	public static void loadIOSConfProp(String loadPropertyFile) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public static void setIOSCapabilities() {
		
		
		
	}
	
	
	public static AppiumDriver<MobileElement> getAndroidDriver() {
		
		try {
			serverUrl=new URL("http://localhost:"+APPIUM_PORT+"/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new AndroidDriver<MobileElement>(serverUrl,capabilities);
		return driver;
		
	}
	
	
	public static AppiumDriver<MobileElement> getIOSDriver() {
		
		
		return driver;
		
	}

}
