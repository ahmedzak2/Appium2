package src.test.java;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Swipe extends BaseTest{
    private AppiumBy view = (AppiumBy) AppiumBy.accessibilityId("Views");
    private AppiumBy gallery = (AppiumBy) AppiumBy.accessibilityId("Gallery");
    private AppiumBy photo = (AppiumBy) AppiumBy.accessibilityId("Photos");
    private By anotherPhoto = By.xpath("//android.widget.TextView[@text='1. Photos']");
    private By childImage = By.xpath("(//android.widget.ImageView)[1]");
    private By people = By.xpath("//android.widget.TextView[@content-desc='2. People']");
    @Test

    public void swipeClass()throws InterruptedException{
        driver.findElement(view).click();
        driver.findElement(gallery).click();
        driver.findElement(anotherPhoto).click();
        RemoteWebElement firstImage= (RemoteWebElement) driver.findElement(childImage);
Assert.assertEquals( (driver.findElement(childImage).getAttribute("focusable")),"true","there wong in message ");

/*
* function to swipe
* */

      //  driver.executeScript("mobile: swipeGesture", ImmutableMap.of("elementId", firstImage.getId(), "direction", "left", "pervent", .75));
Thread.sleep(5000);
        swipeAction(firstImage,"left");
Thread.sleep(5000);

        Assert.assertEquals( (driver.findElement(childImage).getAttribute("focusable")),"false","there wong in message ");


    }
}
