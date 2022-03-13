package moneypurse;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class ShgOnBoardFinancial
{
	 AndroidDriver<AndroidElement> driver = null;
	 int i;
	@Test
	public void membersFinancial() throws Exception
	{
		try
		{

			MobileElement search =    driver.findElement(By.xpath("//android.widget.EditText[@text='Search Member']"));
			search.sendKeys("Gayu");
			Thread.sleep(2000);
			MobileElement icon =	driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_edit']"));
			icon.click();
			Thread.sleep(2000);

			MobileElement csav =driver.findElement(By.xpath("//android.widget.EditText[@index = '3']"));
			csav.sendKeys("500");
			Thread.sleep(2000);

			MobileElement volsav = driver.findElement(By.xpath("//android.widget.EditText[@resource-id = 'com.yesteam.shg:id/et_voluntary_savings']"));
			volsav.sendKeys("200");	
			Thread.sleep(2000);

			MobileElement iout =driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1109][1022,1174]')]"));
			iout.sendKeys("2000");	
			Thread.sleep(2000);

			MobileElement tout =driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1279][1022,1344]')]"));
			tout.sendKeys("10000");	
			Thread.sleep(2000);
			MobileElement save =driver.findElement(By.xpath("//android.widget.TextView[@text='Save']"));
			save.click();
			Thread.sleep(2000);

			//add other financial details
			driver.findElement(By.xpath("//android.widget.EditText[@text='Search Member']")).sendKeys("Vinitha");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_edit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@index = '3']")).sendKeys("500");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id = 'com.yesteam.shg:id/et_voluntary_savings']")).sendKeys("200");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1109][1022,1174]')]")).sendKeys("2000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1279][1022,1344]')]")).sendKeys("20000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Save']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.EditText[@text='Search Member']")).sendKeys("Lakshmi");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_edit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@index = '3']")).sendKeys("500");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id = 'com.yesteam.shg:id/et_voluntary_savings']")).sendKeys("200");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1109][1022,1174]')]")).sendKeys("2000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1279][1022,1344]')]")).sendKeys("10000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Save']")).click();
			Thread.sleep(2000);


			driver.findElement(By.xpath("//android.widget.EditText[@text='Search Member']")).sendKeys("Amutha");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_edit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@index = '3']")).sendKeys("500");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id = 'com.yesteam.shg:id/et_voluntary_savings']")).sendKeys("200");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1109][1022,1174]')]")).sendKeys("2000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1279][1022,1344]')]")).sendKeys("10000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Save']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.EditText[@text='Search Member']")).sendKeys("Seetha");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_edit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@index = '3']")).sendKeys("500");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id = 'com.yesteam.shg:id/et_voluntary_savings']")).sendKeys("200");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1109][1022,1174]')]")).sendKeys("2000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1279][1022,1344]')]")).sendKeys("10000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Save']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
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
