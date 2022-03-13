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

public class ShgOnBoardBank 
{
	 AndroidDriver<AndroidElement> driver = null;
	 int i;
	@Test
	public void bankBalance() throws Exception
	{
		try
		{

			//Bank 1 balance details
			driver.findElement(By.xpath("//android.widget.ImageView[contains(@bounds,'[937,951][1003,1017]')]")).click();
			Thread.sleep(2000);
			MobileElement blnce =driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_savings_bank_balance']"));
			blnce.sendKeys("25000");
			Thread.sleep(2000);
			
			MobileElement facc =	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_fixed_deposit_acc_no']"));
			facc.sendKeys("63737123");
			Thread.sleep(2000);
			MobileElement fbal =driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_fixed_deposit_balance']"));
			fbal.sendKeys("5000");
			Thread.sleep(2000);
			for(i=1;i<=2;i++)
			{
				Dimension dimension = driver.manage().window().getSize();
				int start_x = (int)(dimension.width * 0.5);
				int start_y = (int)(dimension.height * 0.8);

				int end_x = (int)(dimension.width * 0.2);
				int end_y = (int)(dimension.height * 0.2);

				TouchAction touch = new TouchAction(driver);
				touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
				Thread.sleep(2000);
			}
			
			MobileElement racc =driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_recurring_deposit_acc_no']"));
			racc.sendKeys("35123467");
			Thread.sleep(2000);
			MobileElement rbal =	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_recurring_deposit_balance']"));
			rbal.sendKeys("5000");
			Thread.sleep(2000);
			MobileElement save =driver.findElement(By.xpath("//android.widget.TextView[@text='Save']"));
			save.click();
			Thread.sleep(3000);
	// Bank 2 balance 
			driver.findElement(By.xpath("//android.widget.ImageView[contains(@bounds,'[937,1045][1003,1111]')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_savings_bank_balance']")).sendKeys("15000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_fixed_deposit_acc_no']")).sendKeys("63737120");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_fixed_deposit_balance']")).sendKeys("10000");
			Thread.sleep(2000);
			
			for(i=1;i<=2;i++)
			{
				Dimension dimension = driver.manage().window().getSize();
				int start_x = (int)(dimension.width * 0.5);
				int start_y = (int)(dimension.height * 0.8);

				int end_x = (int)(dimension.width * 0.2);
				int end_y = (int)(dimension.height * 0.2);

				TouchAction touch = new TouchAction(driver);
				touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
				Thread.sleep(2000);
			}
			
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_recurring_deposit_acc_no']")).sendKeys("35123460");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_recurring_deposit_balance']")).sendKeys("5000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Save']")).click();
			Thread.sleep(2000);
			
			//last
			driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
			Thread.sleep(4000);
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
