package src.test.java;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public AndroidDriver driver;
public    String url = "http://localhost:4723/wd/hub";
@BeforeTest

    public void setup() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        // options.setDeviceName("sdk_gphone64_x86_64");
        options.setDeviceName("sdk_gphone64_x86_64");
        //options.setPlatformName("Android");
        options.setPlatformVersion("12a");
        // options.setAutomationName("Appium");
        options.setApp("C:\\Users\\20112\\IdeaProjects\\appium\\src\\test\\java\\src\\test\\resources\\ApiDemos-debug.apk");
        //options.setApp(System.getProperty("C:\\Users\\20112\\IdeaProjects\\appium\\src\\test\\resources\\ApiDemos-debug.apk"));
        //  driver2 = new AppiumDriver(new URL(url),options);
        driver = new AndroidDriver(new URL(url),options);
        /*different locator appium surrport
         * ID -Name -Class Name - Accessibility ID - Xpath - ccs clestor -UIAUtomator */
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
