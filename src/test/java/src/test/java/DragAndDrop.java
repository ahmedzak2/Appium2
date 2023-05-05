package src.test.java;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseTest {
    private AppiumBy view = (AppiumBy) AppiumBy.accessibilityId("Views");
    private AppiumBy drag = (AppiumBy) AppiumBy.accessibilityId("Drag and Drop");
private  By circle1= By.id("io.appium.android.apis:id/drag_dot_1");
private By resultText = By.id("io.appium.android.apis:id/drag_result_text");
    @Test
    public void scrollableMobDown() throws InterruptedException {
        driver.findElement(view).click();
        driver.findElement(drag).click();
        RemoteWebElement source = (RemoteWebElement) driver.findElement(circle1);
         Thread.sleep(4000);
        /*
        * you should specify the element which to drag and  what coordination's you need to go you can get this coordination's form appium inspector
        * */
        ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) source).getId(),
                "endX", 635,
                "endY", 645
        ));
        Thread.sleep(4000);
        Assert.assertEquals(driver.findElement(resultText).getText(),"Dropped!","The test if failed to drag");
    }
}
