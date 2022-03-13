package moneypurse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ShgBookKeepingPayment 
{

	private AndroidDriver<AndroidElement> driver = null;
	int i;
	@Test(priority=0)
	public AndroidDriver<AndroidElement> expenses() throws Exception
	{
	
		 ShgBookKeepingReceipt test03 = new ShgBookKeepingReceipt();
		  driver = test03.atCash();
		  driver = test03.atBank();
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
		
		//Cash

		driver.findElement(By.xpath("//android.widget.TextView[@text='Payment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_subs_chrgs']")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_subs_fed']")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_meeting_exp']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_other_exp']")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_submit']")).click();
		Thread.sleep(8000);

		//Bank
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Payment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_bank']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_bank_name']")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOB | 35540100012 | SB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_bank_chrgs']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_insurance']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_other_bank_exp']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_submit']")).click();
		Thread.sleep(8000);
		
		return driver;
	}

	@Test(priority=1)
	public AndroidDriver<AndroidElement> disbursement() throws Exception
	{
		//Cash
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Payment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_disbursement']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_payment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Internal Loan disbursement']")).click();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[900,1465][947,1542]']")).sendKeys("1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='com.yesteam.shg:id/cb_auto_fill']")).click();
		Thread.sleep(2000);
		//sw
		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int)(dimension.width * 0.5);
		int start_y = (int)(dimension.height * 0.8);

		int end_x = (int)(dimension.width * 0.2);
		int end_y = (int)(dimension.height * 0.2);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_submit']")).click();
		Thread.sleep(5000);
		
		
		//cash2
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Payment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_disbursement']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_payment']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.TextView[@text='Savings disbursement']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[900,1465][947,1542]']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='com.yesteam.shg:id/cb_auto_fill']")).click();
		Thread.sleep(2000);
		//sw
		 dimension = driver.manage().window().getSize();
		 start_x = (int)(dimension.width * 0.5);
		 start_y = (int)(dimension.height * 0.8);

		 end_x = (int)(dimension.width * 0.2);
		 end_y = (int)(dimension.height * 0.2);

		 touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_submit']")).click();
		Thread.sleep(5000);


		//Bank
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);


		driver.findElement(By.xpath("//android.widget.TextView[@text='Payment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_disbursement']")).click();
		Thread.sleep(2000);				
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_bank']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_bank_name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOB | 35540100012 | SB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_payment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Term Loan disbursement']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[900,1603][947,1680]']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='com.yesteam.shg:id/cb_auto_fill']")).click();
		Thread.sleep(2000);
		
	    //sw
		
		dimension = driver.manage().window().getSize();
		 start_x = (int)(dimension.width * 0.5);
		 start_y = (int)(dimension.height * 0.8);

		 end_x = (int)(dimension.width * 0.2);
		 end_y = (int)(dimension.height * 0.2);

		 touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

		
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_submit']")).click();
		Thread.sleep(5000);

		//Bank2

		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Payment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_disbursement']")).click();
		Thread.sleep(2000);				
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_bank']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_bank_name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOB | 35540100012 | SB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_payment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='MFI Loan disbursement']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[900,1603][947,1680]']")).sendKeys("2000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='com.yesteam.shg:id/cb_auto_fill']")).click();
		Thread.sleep(2000);
		//sw
		
		dimension = driver.manage().window().getSize();
		 start_x = (int)(dimension.width * 0.5);
		 start_y = (int)(dimension.height * 0.8);

		 end_x = (int)(dimension.width * 0.2);
		 end_y = (int)(dimension.height * 0.2);

		 touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

		
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_submit']")).click();
		Thread.sleep(8000);
		
		return driver;

	}

	@Test(priority=2)
	public AndroidDriver<AndroidElement> groupLoanRepayment() throws Exception
	{
		//Term loan
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Payment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_yes']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_Loan_repayment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/txt_select_loantype']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Term Loan disbursement']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/txt_interestt_amount']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/txt_charges_amount']")).sendKeys("500");
		Thread.sleep(2000);
		
		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int)(dimension.width * 0.5);
		int start_y = (int)(dimension.height * 0.8);

		int end_x = (int)(dimension.width * 0.2);
		int end_y = (int)(dimension.height * 0.2);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/edt_repay_loan']")).sendKeys("10000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_submit']")).click();
		Thread.sleep(8000);

		//MFI loan

		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Payment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_yes']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_Loan_repayment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/txt_select_loantype']")).click();
		Thread.sleep(2000);


		driver.findElement(By.xpath("//android.widget.TextView[@text='MFI Loan disbursement']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/txt_interestt_amount']")).sendKeys("1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/txt_charges_amount']")).sendKeys("700");
		Thread.sleep(2000);
		
		 dimension = driver.manage().window().getSize();
		 start_x = (int)(dimension.width * 0.5);
		 start_y = (int)(dimension.height * 0.8);

		 end_x = (int)(dimension.width * 0.2);
		 end_y = (int)(dimension.height * 0.2);

		 touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

		
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/edt_repay_loan']")).sendKeys("15000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_submit']")).click();
		Thread.sleep(10000);
		
		return driver;
	}

}
