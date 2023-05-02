package src.test.java;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium extends BaseTest {
    // AppiumDriver driver2;
    /**
     * there 2 type of By one generic for appium and web
     * other only for appium  (AppiumBy)
     */

    private AppiumBy preference = (AppiumBy) AppiumBy.accessibilityId("Preference");

    @Test
    public void appiumTest() throws InterruptedException {

        /*to set and show the specification of app we use class UiAutomator2Options
         * */
        driver.findElement(preference).click();
        Thread.sleep(10000);
    }
}