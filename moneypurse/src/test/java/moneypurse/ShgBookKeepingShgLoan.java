package moneypurse;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import com.beust.jcommander.internal.Lists;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ShgBookKeepingShgLoan 
{

	private AndroidDriver<AndroidElement> driver = null;
	int i;
	@Test
	public AndroidDriver<AndroidElement> addNewLoan() throws Exception
	{

		ShgBookKeepingContra test05 = new ShgBookKeepingContra();
		  
		  driver = (AndroidDriver<AndroidElement>) test05.deposit();
		  driver = (AndroidDriver<AndroidElement>) test05.withdrawl();
		  driver = (AndroidDriver<AndroidElement>) test05.transfer();
		  
		  Thread.sleep(5000);
		  
		/*App01 start =new App01();
		driver =start.openApp();
		driver = start.openMoneyPurse();
		Thread.sleep(4000);

		// click SHG
		MobileElement shg=driver.findElement(By.xpath("//android.widget.TextView[@text='SHG']"));
		shg.click();
		Thread.sleep(6000);


		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_shg_search']")).sendKeys("rani");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Rani / Amutha']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.TextView[@text='SELECT']")).click();
		Thread.sleep(2000);*/





		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);

		//shgloan

		driver.findElement(By.xpath("//android.widget.TextView[@text='SHG Loan']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(4000);


		driver.findElement(By.xpath("//android.widget.TextView[@text='Add Loan']")).click();
		Thread.sleep(4000);
		//Enter MFI loan bank details
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='MFI']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Select bank account']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOB | 35540100012 | SB']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='MFI Name']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='NABFINS']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Branch']")).sendKeys("Karaikal");
		Thread.sleep(4000);


		driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Account Number']")).sendKeys("375401000004");
		Thread.sleep(2000);
		//loan date
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_loan_sanction_date_tv']")).click();
		Thread.sleep(2000);
		
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
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		Thread.sleep(2000);

		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int)(dimension.width * 0.5);
		int start_y = (int)(dimension.height * 0.8);

		int end_x = (int)(dimension.width * 0.2);
		int end_y = (int)(dimension.height * 0.2);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Sanction Amount (Limit)']")).sendKeys("100000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_loan_disbursement_date_tv']")).click();
		Thread.sleep(2000);
		
		
		windowSize = driver.manage().window().getSize();
		args = new HashMap<String, Object>();
		args.put("command", "input");
		args.put("args", Lists.newArrayList("swipe", windowSize.width / 2,
				windowSize.height / 2, windowSize.width / 2, windowSize.height));
		while (driver.findElements(By.xpath("//android.view.View[@content-desc='15 February 2022']")).size() == 0)
		{
			driver.executeScript("mobile: shell", args);
		}
		
		driver.findElement(By.xpath("//android.view.View[@content-desc='15 February 2022']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		Thread.sleep(2000);
		//Disbursement amount
		driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Disbursement Amount']")).sendKeys("100000");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//android.widget.TextView[@text='Purpose of Loan']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='MSME']")).click();
		Thread.sleep(3000);
		//
		dimension = driver.manage().window().getSize();
		start_x = (int)(dimension.width * 0.5);
		start_y = (int)(dimension.height * 0.8);

		end_x = (int)(dimension.width * 0.2);
		end_y = (int)(dimension.height * 0.2);

		touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_rate_of_interest']")).sendKeys("10");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_tenure_month_tv']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='10']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
		Thread.sleep(8000);
		
		driver.navigate().back();
		Thread.sleep(7000);
		return  driver;
		//driver.closeApp();	
		
	}
}
