package moneypurse;
import org.testng.annotations.Test;

import com.beust.jcommander.internal.Lists;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.Before;

import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class ShgOnBoardGroup
{

	AndroidDriver<AndroidElement> driver = null;
	int i;



	@Test
	public void createShgGroup() 
	{ 
		Dimension windowSize = driver.manage().window().getSize();
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("command", "input");
		args.put("args", Lists.newArrayList("swipe", windowSize.width / 2,
				windowSize.height / 2, windowSize.width / 2, windowSize.height));
		while (driver.findElements(By.xpath("//android.view.View[@content-desc='07 February 2022']")).size() == 0)
		{
			driver.executeScript("mobile: shell", args);
		}
		
		driver.findElement(By.xpath("//android.view.View[@content-desc='07 February 2022']")).click();
		

		try 

		{
			App01 a = new App01();
			driver =a.openApp();
			driver = a.openMoneyPurse();

System.out.println("reached");
			//OnBoard

			// click SHG
			MobileElement shg=driver.findElement(By.xpath("//android.widget.TextView[@text='SHG']"));
			shg.click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Add New']")).click();
			Thread.sleep(3000);

			//Create SHG profile
			driver.findElement(By.xpath("//android.widget.EditText[@text='SHG Name *']")).sendKeys("aalaigl");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='SHG Formation Date *']")).click();
			Thread.sleep(3000);
			//
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.yesteam.shg:id/date_picker_year']")).click();
			Thread.sleep(2000);
			MobileElement date =driver.findElement(By.xpath("//android.widget.TextView[@content-desc='2021']"));
			date.click();


			driver.findElement(By.xpath("//android.view.View[@content-desc='23 February 2021']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text = 'Total Members *']")).sendKeys("5");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.EditText[@text = 'Pincode *']")).sendKeys("641049");
			Thread.sleep(3000);
			// select dropdown and enter the date of meetings
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Date of meeting at every month *']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = '10']")).click();
			Thread.sleep(3000);
			//select dropdown and enter the group type
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_groupType']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Female']")).click();
			Thread.sleep(3000);
			//swipe up
			Dimension dimension = driver.manage().window().getSize();
			int start_x = (int)(dimension.width * 0.5);
			int start_y = (int)(dimension.height * 0.8);

			int end_x = (int)(dimension.width * 0.2);
			int end_y = (int)(dimension.height * 0.2);

			TouchAction touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_saving_amount']")).sendKeys("500");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/radio_municipalty']")).click();
			Thread.sleep(6000);

			//select dropdown and enter the block details
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_block_municipalty_corp']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_itemname'[0]]")).click();
			Thread.sleep(3000);

		//	SwipeFunctions sw = new SwipeFunctions();
		//	driver = sw.swipeUp();
			/*dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.7);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);*/

			//select dropdown and enter the panchayat
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_panchayat_town_ward']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Edatheru']")).click();
			Thread.sleep(3000);

			// Enter street name
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id= 'com.yesteam.shg:id/et_village']")).sendKeys("vinayagar street");
			Thread.sleep(3000);

			driver.findElement(By.xpath("//android.widget.TextView[@text='Add Bank']")).click();
			Thread.sleep(2000);
			//Enter Bank 1 details
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id= 'com.yesteam.shg:id/tv_bank_name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'BANK OF BARODA']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_bank_branch']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'KARAIKAL']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//android.widget.EditText[@text = 'Account Number *']")).sendKeys("35540100012");
			Thread.sleep(3000);

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Account Type *']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Savings']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_acc_openingDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.view.View[@content-desc= '01 February 2022']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);

			//Add Bank 2 details
			driver.findElement(By.xpath("//android.widget.TextView[@text='Bank Name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'BANK OF INDIA']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_bank_branch_2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'KARAIKAL']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.EditText[@text = 'Account Number']")).sendKeys("67890123");
			Thread.sleep(2000);
			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Account Type']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Savings']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_acc_openingDate2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.view.View[@content-desc= '05 February 2022']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Next']")).click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}

//return driver;

	}

	
	
}
