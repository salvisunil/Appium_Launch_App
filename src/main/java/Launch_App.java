import com.google.common.annotations.VisibleForTesting;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.JavascriptExecutor;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class Launch_App {
    //public static WebDriver driver;
    @Test
    public void myFirstApp(){
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 9");
        cap.setCapability(MobileCapabilityType.UDID, "7e95cade0408"); //Give Device ID of your mobile phone
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
        // cap.setCapability(MobileCapabilityType.APP,new File("C:\\Users\\Sunil.Salvi\\Downloads\\selendroid-test-app.apk").getAbsolutePath());
        cap.setCapability("appPackage", "com.miui.calculator");
        cap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
        cap.setCapability("autoGrantPermissions", true);
        //do not clear cache
        cap.setCapability("noReset", "true");
        cap.setCapability("fullReset", "false");//do not install the app again

//
//        try {
//            AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"), cap);
//            Thread.sleep(5000);
//            // driver.quit();
//        } catch (Exception e) {

        AndroidDriver<MobileElement> driver = null;
        try {
            driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub/"), cap);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        //            JavascriptExecutor js = (JavascriptExecutor)driver;
        //            js.executeScript("document.getElementById(s).click()");
        for (String s : Arrays.asList("com.miui.calculator:id/btn_3_s", "com.miui.calculator:id/btn_plus_s", "com.miui.calculator:id/btn_9_s", "com.miui.calculator:id/btn_equal_s", "com.miui.calculator:id/btn_c_s"))
            driver.findElement(By.id(s)).click();

        for (String s : Arrays.asList("com.miui.calculator:id/btn_3_s", "com.miui.calculator:id/btn_minus_s", "com.miui.calculator:id/btn_9_s", "com.miui.calculator:id/btn_equal_s", "com.miui.calculator:id/btn_c_s")) {
            driver.findElement(By.id(s)).click();
        }

        for (String s : Arrays.asList("com.miui.calculator:id/btn_3_s", "com.miui.calculator:id/btn_mul_s", "com.miui.calculator:id/btn_9_s", "com.miui.calculator:id/btn_equal_s", "com.miui.calculator:id/btn_c_s")) {
            driver.findElement(By.id(s)).click();
        }

        for (String s : Arrays.asList("com.miui.calculator:id/btn_3_s", "com.miui.calculator:id/btn_div_s", "com.miui.calculator:id/btn_9_s", "com.miui.calculator:id/btn_equal_s")) {
            driver.findElement(By.id(s)).click();
        }


    }

    }

