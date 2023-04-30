import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium2 {
    // AppiumDriver driver2;
    private AndroidDriver driver;
    String url = "http://localhost:4723/wd/hub";
    @Test
    public void appiumTest() throws MalformedURLException, InterruptedException {

        /*to set and show the specification of app we use class UiAutomator2Options
         * */
        DesiredCapabilities options=new DesiredCapabilities();
        // options.setDeviceName("sdk_gphone64_x86_64");
        options.setCapability("deviceName","sdk_gphone64_x86_64");
        options.setCapability("platformName","Android");
        options.setCapability("platformVersion","12");
        // options.setAutomationName("Appium");
        options.setCapability("app","C:\\Users\\20112\\IdeaProjects\\appium\\src\\test\\resources\\ApiDemos-debug.apk");
        //options.setApp(System.getProperty("C:\\Users\\20112\\IdeaProjects\\appium\\src\\test\\resources\\ApiDemos-debug.apk"));
        //  driver2 = new AppiumDriver(new URL(url),options);
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
        Thread.sleep(10000);
        driver.quit();
    }
}