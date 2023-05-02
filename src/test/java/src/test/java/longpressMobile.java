package src.test.java;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
//import io.appium.java_client.TouchAction;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class longpressMobile extends BaseTest {
    private AppiumBy views = (AppiumBy) AppiumBy.accessibilityId("Views");
    private AppiumBy expandableLists= (AppiumBy) AppiumBy.accessibilityId("Expandable Lists");
    private By custom = By.xpath("//android.widget.TextView[@content-desc='1. Custom Adapter\']");
    /*
     *  definition to  add the gesture: longPress on  command
     * */
    private AppiumBy customAdapter= (AppiumBy) AppiumBy.accessibilityId("Custom Adapter");
    private By people = By.xpath("//android.widget.TextView[@text='People Names']");
    private By simpleMenu= By.id("android:id/title");
    @Test
    public void longPreesClick() throws InterruptedException {
        driver.findElement(views).click();
        driver.findElement(expandableLists).click();
        driver.findElement(custom).click();
        /*
         *  definition to  add the gesture: longPress on  command
         * */
        RemoteWebElement lonpPress = (RemoteWebElement) driver.findElement(people);
        //  AndroidElement elements = driver.findElements(people);
     /*   lonpPress.click();
        Thread.sleep(20000);
        lonpPress.click();
        Thread.sleep(20000);
     */   //TouchAction action = new TouchAction(driver);
        //action.longPress(e).waitAction(Duration.ofMillis(3000)).release().perform();

       // driver.executeScript("gesture: longPress", ImmutableMap.of("elementId", lonpPress.getId(), "pressure", 0.5, "duration", 3000));
        TouchAction touch = new TouchAction(driver);
        touch.longPress(longPressOptions().withElement(element(lonpPress)).withDuration(ofSeconds(3))).release().perform();
        Thread.sleep(2000);
      String text =  driver.findElement(simpleMenu).getText();
        Assert.assertEquals(text,"Sample menu","wrong message ");
Assert.assertTrue(driver.findElement(simpleMenu).isDisplayed(),"wrong error ");
    }
}