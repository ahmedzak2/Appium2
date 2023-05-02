package src.test.java;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
public class AppiumEdit {
    private AndroidDriver driver;

    @Test
    public void appiumTest() throws MalformedURLException {


            AppiumDriverLocalService serviceBuilder = new AppiumServiceBuilder()
                    .withAppiumJS(new File("C:\\Users\\ZakariaSaadA\\node_modules\\appium\\lib\\main.js"))
                    .withIPAddress("127.0.0.1")
                    .usingPort(4723)
                    .build();
/*
* this  need appium2
* */
            serviceBuilder.start();

            DesiredCapabilities options = new DesiredCapabilities();
            options.setCapability("deviceName", "sdk_gphone64_x86_64");
            options.setCapability("platformName", "Android");
            options.setCapability("platformVersion", "12");
            options.setCapability("app", "C:\\Users\\20112\\IdeaProjects\\appium\\src\\test\\resources\\ApiDemos-debug.apk");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

            // Add your test code here

            driver.quit();
            serviceBuilder.stop();

    }
}
