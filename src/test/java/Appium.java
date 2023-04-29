/*
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium {
   // AppiumDriver driver2;
AndroidDriver driver;
    String url = "http://localhost:4723/wd/hub";
    @Test
    public void appiumTest() throws MalformedURLException {

        */
/*to set and show the specification of app we use class UiAutomator2Options
        * *//*

        UiAutomator2Options options=new UiAutomator2Options();
       // options.setDeviceName("sdk_gphone64_x86_64");
        options.setDeviceName("sdk_gphone64_x86_64");
        options.setPlatformName("Android");
      options.setPlatformVersion("12");
       // options.setAutomationName("Appium");
        options.setApp("C:\\Users\\20112\\IdeaProjects\\appium\\src\\test\\resources\\ApiDemos-debug.apk");
     //options.setApp(System.getProperty("C:\\Users\\20112\\IdeaProjects\\appium\\src\\test\\resources\\ApiDemos-debug.apk"));
      //  driver2 = new AppiumDriver(new URL(url),options);
        driver = new AndroidDriver(new URL(url),options);
    }
}
*/
