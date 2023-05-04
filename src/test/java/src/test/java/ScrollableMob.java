package src.test.java;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class ScrollableMob extends BaseTest{
    private AppiumBy view = (AppiumBy) AppiumBy.accessibilityId("Views");
    @Test
    public void scrollableMobDown() throws InterruptedException {
      driver.findElement(view).click();
     /*
     * to use Google automation to ensure i can scrol down
     *
     * by write scrit only google use
     * new UiScrollable(new UiSelector()) to create class and define it
     * scrollIntoView(text())  method use to scroll then i use text to tell it scroll to what
     * to make sure the quetion don't have any problem "WebView"
     * */
            driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
            Thread.sleep(4000);
    }

    }
