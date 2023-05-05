package src.test.java;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class App extends BaseTest {
    private AppiumBy app = (AppiumBy) AppiumBy.accessibilityId("App");
    private AppiumBy alertDialogs = (AppiumBy) AppiumBy.accessibilityId("Alert Dialogs");
    private AppiumBy cancelDialog = (AppiumBy) AppiumBy.accessibilityId("OK Cancel dialog with a message");
    private By alertText = By.id("android:id/alertTitle");
    private AppiumBy longMessage = (AppiumBy) AppiumBy.accessibilityId("OK Cancel dialog with a long message");
    private By andiordMessage = By.id("android:id/message");
    private AppiumBy listDialog = (AppiumBy) AppiumBy.accessibilityId("List dialog");
    //private By listDialog1 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]\n");
    private By commandOne = By.xpath("(//android.widget.TextView)[2]");
    private By comandOne2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
    private By commandOneResult = By.xpath("//android.widget.TextView");

    private AppiumBy singleChoice = (AppiumBy) AppiumBy.accessibilityId("Single choice list");
    private By cancelButton = By.id("android:id/button2");
    private By traffic = By.xpath("(//android.widget.CheckedTextView)[3]");

    private AppiumBy repeatAlarm= (AppiumBy) AppiumBy.accessibilityId("Repeat alarm");
private By friday = By.xpath("(//android.widget.CheckedTextView)[5]");
private By okButton = By.id("android:id/button1");
    private AppiumBy textEntryDialog= (AppiumBy) AppiumBy.accessibilityId("Text Entry dialog");
    private By userName =By.id("io.appium.android.apis:id/username_edit");
    private By password = By.id("io.appium.android.apis:id/password_edit");


    @Test
    public void AppExecriseTest() throws MalformedURLException, InterruptedException {
        driver.findElement(app).click();
        driver.findElement(alertDialogs).click();
        driver.findElement(cancelDialog).click();
        Assert.assertEquals(driver.findElement(alertText).getText(), "Lorem ipsum dolor sit aie consectetur adipiscing\n" +
                "Plloaso mako nuto siwuf cakso dodtos anr koop.", "there wrong in message");
        Thread.sleep(4000);

        driver.findElement(cancelButton).click();
        Thread.sleep(3000);

    }

    @Test
    public void cancelLongMessageTest() throws MalformedURLException, InterruptedException {
        driver.findElement(app).click();
        driver.findElement(alertDialogs).click();
        driver.findElement(longMessage).click();
        Assert.assertTrue(driver.findElement(andiordMessage).getText().contains("Plloaso mako nuto siwuf cakso dodtos"), "there wrong in message");
        Thread.sleep(4000);

        driver.findElement(cancelButton).click();
        Thread.sleep(3000);

    }

    @Test
    public void gitListDialogTest() throws MalformedURLException, InterruptedException {
        driver.findElement(app).click();
        driver.findElement(alertDialogs).click();

        driver.findElement(listDialog).click();
        driver.findElement(commandOne).click();
        Thread.sleep(10000);
        Assert.assertTrue(driver.findElement(commandOneResult).getText().contains("You selected: 0 , Command one"), "there something wrong");

    }

    @Test
    public void gitSingleChoiceListTest() throws MalformedURLException, InterruptedException {
        driver.findElement(app).click();
        driver.findElement(alertDialogs).click();
        driver.findElement(singleChoice).click();
        driver.findElement(traffic).click();
        Thread.sleep(5000);
    }

    @Test
    public void repeatAlarmTest() throws MalformedURLException, InterruptedException {
        driver.findElement(app).click();
        driver.findElement(alertDialogs).click();
        driver.findElement(repeatAlarm).click();
        driver.findElement(friday).click();
        Thread.sleep(4000);
        driver.findElement(okButton).click();
Thread.sleep(4000);

    }
    @Test
    public void textEntryDialogTest() throws MalformedURLException, InterruptedException{
        driver.findElement(app).click();
        driver.findElement(alertDialogs).click();
        driver.findElement(textEntryDialog).click();
        driver.findElement(userName).sendKeys("fuck off");
        driver.findElement(password).sendKeys("why");
        Thread.sleep(5000);
       Assert.assertEquals(driver.findElement(userName).getText(),"fuck off","wrong you die");
        driver.findElement(okButton).click();


    }
}
