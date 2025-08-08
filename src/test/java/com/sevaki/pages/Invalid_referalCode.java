package com.sevaki.pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.sevaki.BaseClass.Android_components;

public class Invalid_referalCode extends Android_components{
	public static void Invalidreferal() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"I’m New, Register Now\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.EditText[@index='3']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@index='3']")).sendKeys("Khajabee");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.EditText[@index='4']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@index='4']")).sendKeys("7989981189");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.EditText[@index='5']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@index='5']")).sendKeys("test@gmail.com");
		Thread.sleep(3000);
		//Referral code
		driver.findElement(By.xpath("//android.widget.EditText[@index='6']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@index='6']")).sendKeys("ETRYIU");
		driver.findElement(By.xpath("//android.widget.CheckBox[@class='android.widget.CheckBox']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Register Now\"]")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File desc=new File ("C:\\Users\\DELL\\Desktop\\Screenshorts\\Rereral.png");
		Files.copy(src, desc);
}
}