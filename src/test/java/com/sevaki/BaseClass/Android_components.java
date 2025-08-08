package com.sevaki.BaseClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Android_components {
	public static AndroidDriver driver;
	public static void Opening_theAPP() throws Exception {
	UiAutomator2Options options = new UiAutomator2Options();
    options.setPlatformName("Android");
   // options.setPlatformVersion("9.0");
    options.setDeviceName("Android Emulator");
    options.setAutomationName("UiAutomator2");
    options.setApp("C:\\Users\\DELL\\Downloads\\app-release 6 (3).apk");
    options.setAppWaitActivity("*");
    options.setAutoGrantPermissions(true);

    URL url = new URL("http://127.0.0.1:4723/wd/hub");
     driver = new AndroidDriver(url, options);
    try {
        System.out.println("App launched successfully!");
    } catch (Exception e) {
        e.printStackTrace();
    }
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
}
	public static void ClosetheAPP() {
	driver.quit();
	System.out.println("driver closed successfully");
	}
}
