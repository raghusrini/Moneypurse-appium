package moneypurse;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ShgBookKeepingReceipt
{

	private AndroidDriver<AndroidElement> driver = null;
	int i;
	@Test
	public AndroidDriver<AndroidElement> atCash() throws Exception
	{
		
	/*	ShgTransactionTest test02 = new ShgTransactionTest();
		  
		  driver = test02.receipt();
		  
		  Thread.sleep(5000);*/
		App01 start =new App01();
		driver =start.openApp();
		driver = start.openMoneyPurse();
		Thread.sleep(4000);

		// click SHG
		MobileElement shg=driver.findElement(By.xpath("//android.widget.TextView[@text='SHG']"));
		shg.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(5000);


		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_shg_search']")).sendKeys("rani");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Rani / Amutha']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.TextView[@text='SELECT']")).click();
		Thread.sleep(2000);





		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//android.widget.TextView[@text='Receipt']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(4000);
		//cash

		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_donation']")).sendKeys("500");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_seed_fund']")).sendKeys("200");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_other_income']")).sendKeys("1000");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
		Thread.sleep(8000);
		return driver;
	}

	@Test(priority=1)
	public AndroidDriver<AndroidElement> atBank() throws Exception
	{

		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//android.widget.TextView[@text='Receipt']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(4000);
		//bank 1

		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_bank']")).click();
		Thread.sleep(4000);
		
		MobileElement selBank =driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_bank_tv']"));
		selBank.click();
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOB | 35540100012 | SB']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_donation']")).sendKeys("400");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_seed_fund']")).sendKeys("500");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_other_income']")).sendKeys("700");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_saving_ac_interest']")).sendKeys("1000");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_interest_subvention']")).sendKeys("500");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
		Thread.sleep(8000);
	
		
		
		//bank 2
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//android.widget.TextView[@text='Receipt']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_bank']")).click();
		Thread.sleep(4000);
		
		MobileElement selBank2 =driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_bank_tv']"));
		selBank2.click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOI | 67890123 | SB']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_donation']")).sendKeys("500");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_seed_fund']")).sendKeys("1500");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_other_income']")).sendKeys("700");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_saving_ac_interest']")).sendKeys("1000");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_interest_subvention']")).sendKeys("500");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
		Thread.sleep(10000);
	
        return driver; 
		//driver.closeApp();



	}

}
