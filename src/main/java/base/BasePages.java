package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidElement;

import java.time.Duration;
import java.util.ResourceBundle;

public class BasePages {

    public static AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;

    public BasePages(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void hideKeyboard() {

        driver.hideKeyboard();
    }

    public void enter() {
        ((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public void touch(WebElement e) {
        TouchAction touch = new TouchAction(driver);


        touch.tap(TapOptions.tapOptions().withElement(element(e))).perform();
    }

    public void longPressElement(WebElement lp) {
        TouchAction l = new TouchAction(driver);
        l.longPress(LongPressOptions.longPressOptions().withElement(element(lp)).withDuration(Duration.ofSeconds(2))).release().perform();
    }
}