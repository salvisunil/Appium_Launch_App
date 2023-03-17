package DialNumber;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DialNum {
    //@Test
  //  public void Calling() throws MalformedURLException {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName","Redmi Note 9");
        cap.setCapability("udid", "7e95cade0408"); //Give Device ID of your mobile phone
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "12");
        cap.setCapability("appPackage", "com.android.contacts");
        cap.setCapability("appActivity", "com.android.contacts.activities.NonPhoneActivity");
       // cap.setCapability("autoGrantPermissions", true);

      //  AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub/"),cap);
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub/"), cap);
        //driver.quit();

    }


    }

