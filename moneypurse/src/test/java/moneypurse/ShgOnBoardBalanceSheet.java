package moneypurse;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterTest;

public class ShgOnBoardBalanceSheet
{
	 AndroidDriver<AndroidElement> driver = null;
	 int i;
	@Test
	public void balanceSheet() throws Exception
	{
		try
		{
			// sheet
			MobileElement chand =	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_cash_in_hand']"));
			chand.sendKeys("38500");
			Thread.sleep(2000);
			MobileElement  fasset =	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_fixed_asset']"));
			fasset.sendKeys("30000");
			Thread.sleep(2000);
			Dimension dimension = driver.manage().window().getSize();
			int start_x = (int)(dimension.width * 0.5);
			int start_y = (int)(dimension.height * 0.8);

			int end_x = (int)(dimension.width * 0.2);
			int end_y = (int)(dimension.height * 0.2);

			TouchAction touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			MobileElement exincome=	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_excess_amt']"));
			exincome.sendKeys("0");	
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.TextView[@text ='Finish']")).click();
			Thread.sleep(5000);

		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
	}
	
	@AfterTest
	public void tearDown() throws Exception 
	{
		try
		{

		}
		catch(Exception e)
		{

		}
	}

}
