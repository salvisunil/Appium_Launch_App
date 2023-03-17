package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SendSMS {
    //    @Test
//    public void sms() throws MalformedURLException, InterruptedException {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 9");
        cap.setCapability(MobileCapabilityType.UDID, "7e95cade0408"); //Give Device ID of your mobile phone
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
        cap.setCapability("appium:autoGrantPermissions", "true");
     cap.setCapability("appium:ensureWebviewsHavePages", true);
        cap.setCapability("appium:nativeWebScreenshot", true);
       cap.setCapability("appium:newCommandTimeout", 3600);
        cap.setCapability("appium:connectHardwareKeyboard", true);

        cap.setCapability("appPackage", "com.android.mms");
        cap.setCapability("appActivity", "com.android.mms.ui.ComposeMessageRouterActivity");
        cap.setCapability("webStorageEnabled",false);
        cap.setCapability("unicodeKeyboard", "false");
        cap.setCapability("resetKeyboard", "false");

        URL url = new URL("http://localhost:4723/wd/hub/");
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, cap);

//        Thread.sleep(5000);

//        driver.findElement(By.id())

        driver.findElement(By.className("com.android.mms:id/recipients_viewer")).click();
        driver.findElement(By.id("com.android.mms:id/recipients_editor")).sendKeys("9979");
        driver.findElement(By.id("com.android.mms:id/name")).click();
        driver.findElement(By.id("com.android.mms:id/embedded_text_editor")).sendKeys("Hello Ramesh!");
        driver.findElement(By.id("com.android.mms:id/send_button")).click();

//        Thread.sleep(5000);

//        driver.quit();
    }
//}
}