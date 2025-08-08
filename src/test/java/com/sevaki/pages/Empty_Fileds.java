package com.sevaki.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.sevaki.BaseClass.Android_components;

public class Empty_Fileds extends Android_components{
	public static void clickon_Registernow_button() throws Exception {
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"I’m New, Register Now\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Register Now\"]")).click();
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File desc=new File ("C:\\Users\\DELL\\Desktop\\Screenshorts\\empty.png");
		Files.copy(src, desc);
	}

}
