package moneypurse;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ShgBookKeepingDeposit
{
	private AndroidDriver<AndroidElement> driver = null;
	int i;

	@Test
	public void fixedDeposit() throws Exception
	{

		App01 start =new App01();
		driver =start.openApp();
		driver = start.openMoneyPurse();
		Thread.sleep(4000);

		// click SHG
		MobileElement shg=driver.findElement(By.xpath("//android.widget.TextView[@text='SHG']"));
		shg.click();
		Thread.sleep(6000);


		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_shg_search']")).sendKeys("arthy");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Arthy / Lakshmi']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.TextView[@text='SELECT']")).click();
		Thread.sleep(2000);





		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);
		//FD account
		driver.findElement(By.xpath("//android.widget.TextView[@text='Deposit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_new_rd_act']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_bank_tv']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='AXIS BANK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_accountnumber']")).sendKeys("475411134");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_depositamount']")).sendKeys("2000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_rate_of_interest']")).sendKeys("5.5");
		Thread.sleep(2000);
		
		driver =SwipeFunctions.swipeActionPerform(driver, "swipeUp");
		//sw
	/*	Dimension dimension = driver.manage().window().getSize();
		int start_x = (int)(dimension.width * 0.5);
		int start_y = (int)(dimension.height * 0.8);

		int end_x = (int)(dimension.width * 0.2);
		int end_y = (int)(dimension.height * 0.2);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
*/
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/txt_opening_date']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.yesteam.shg:id/previousButton']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[186,878][307,999]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/txt_done']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/txt_maturity_date']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.yesteam.shg:id/previousButton']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='26']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/txt_done']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_bk_deposit_submit']")).click();
		Thread.sleep(8000);
		System.out.println("FD account created successfully");

		//FD Transaction
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);
		//FD account
		driver.findElement(By.xpath("//android.widget.TextView[@text='Deposit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_transaction']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_bank_tv']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='AXIS BANK']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_Bank_interest']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_withdrawel']")).sendKeys("100");
		Thread.sleep(2000);
		
		//sw
		driver =SwipeFunctions.swipeActionPerform(driver, "swipeUp");

		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_Bank_Expenses']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_bk_deposit_submit']")).click();
		Thread.sleep(8000);
		System.out.println("FD Transaction successfully");

		
	}


	@Test
	public void recurringDeposit() throws Exception
	{

		//RD Account

		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//android.widget.TextView[@text='Deposit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();

		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_rd']")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_new_rd_act']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_bank_tv']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='AXIS BANK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_accountnumber']")).sendKeys("4774111134");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_depositamount']")).sendKeys("2000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_rate_of_interest']")).sendKeys("5.5");
		Thread.sleep(2000);

		driver =SwipeFunctions.swipeActionPerform(driver, "swipeUp");

		
		//sw
	/*	Dimension dimension = driver.manage().window().getSize();
		int start_x = (int)(dimension.width * 0.5);
		int start_y = (int)(dimension.height * 0.8);

		int end_x = (int)(dimension.width * 0.2);
		int end_y = (int)(dimension.height * 0.2);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

*/
		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_tenure']")).sendKeys("12");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/txt_opening_date']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.yesteam.shg:id/previousButton']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[186,878][307,999]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/txt_done']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/txt_maturity_date']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.yesteam.shg:id/previousButton']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='25']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/txt_done']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_bk_deposit_submit']")).click();
		Thread.sleep(8000);
		System.out.println("RD account created successfully");

		//RD Transaction

		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);
		//RD account
		driver.findElement(By.xpath("//android.widget.TextView[@text='Deposit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_rd']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_transaction']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_bank_tv']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='AXIS BANK']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_bank_deposit']")).sendKeys("1000");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_Bank_interest']")).sendKeys("100");
		Thread.sleep(4000);
		
		driver =SwipeFunctions.swipeActionPerform(driver, "swipeUp");

		
	/*	//sw
		 dimension = driver.manage().window().getSize();
		 start_x = (int)(dimension.width * 0.5);
		 start_y = (int)(dimension.height * 0.8);

		 end_x = (int)(dimension.width * 0.2);
		 end_y = (int)(dimension.height * 0.2);

		 touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
*/
		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_withdrawel']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_Bank_Expenses']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_bk_deposit_submit']")).click();
		Thread.sleep(8000);
		System.out.println("RD Transaction successfully");
		
		

	}
}
