package moneypurse;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ShgBookKeepingContra 
{
	private AndroidDriver<AndroidElement> driver = null;
	int i;

	@Test(priority=0)
	public AndroidDriver<AndroidElement> deposit() throws Exception
	{
		ShgBookKeepingPayment test04 = new ShgBookKeepingPayment();
		  driver = test04.expenses();
		  driver = test04.disbursement();
		  driver = test04.groupLoanRepayment();
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



//Deposit

		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);

		
		//To Bank1
		driver.findElement(By.xpath("//android.widget.TextView[@text='Contra']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Select Bank | Account Number']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOB | 35540100012 | SB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_contra_deposit']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_bk_contra_submit']")).click();
		Thread.sleep(7000);
		
		System.out.println("Deposit to Bank1 transaction successfull");

		//To Bank2        
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);

		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Contra']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Select Bank | Account Number']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOI | 67890123 | SB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_contra_deposit']")).sendKeys("2000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_bk_contra_submit']")).click();
		Thread.sleep(7000);
		System.out.println("Deposit to Bank2 transaction successfull");
return driver;
	}

	@Test(priority=1)
	public AndroidDriver<AndroidElement> withdrawl() throws Exception
	{
		//Withdrawl
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);

		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Contra']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(2000);
		//In Bank1
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_withdrawal']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Select Bank | Account Number']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOB | 35540100012 | SB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_contra_deposit']")).sendKeys("1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_bk_contra_submit']")).click();
		Thread.sleep(7000);
		
		System.out.println("Withdrawl in Bank1 transaction successfull");

		
		//In Bank2
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);

		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Contra']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_withdrawal']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Select Bank | Account Number']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOI | 67890123 | SB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_contra_deposit']")).sendKeys("2000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_bk_contra_submit']")).click();
		Thread.sleep(7000);
		System.out.println("Withdrawl in Bank2 transaction successfull");
		return driver;
	}

	@Test(priority=2)
	public AndroidDriver<AndroidElement> transfer() throws Exception
	{
		
		
		//Transfer
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);

		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Contra']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(2000);
		// Bank1 to Bank2
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_transfer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_bank_transfer_tv']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOB | 35540100012 | SB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_bank_to_transfer_tv']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOI | 67890123 | SB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_transfer']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_bk_contra_submit']")).click();
		Thread.sleep(2000);
		
		System.out.println("Transfer Bank1 to Bank2 transaction successfull");
		
		// Bank2 to Bank1	
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);

		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Contra']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_transfer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_bank_transfer_tv']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOI | 67890123 | SB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_bank_to_transfer_tv']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOB | 35540100012 | SB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_transfer']")).sendKeys("2500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_bk_contra_submit']")).click();
		Thread.sleep(7000);
		System.out.println("Transfer Bank2 to Bank1 transaction successfull");
		
	  /*  // TL to Bank1
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);

		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Contra']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_transfer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_bank_transfer_tv']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOB | 1234567 | TL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_bank_to_transfer_tv']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOB | 35540100012 | SB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_transfer']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_bk_contra_submit']")).click();
		Thread.sleep(7000);
		System.out.println("Transfer TL to Bank1 transaction successfull");*/
		
		//Bank2 to TL
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book Keeping']")).click();
		Thread.sleep(4000);

		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Contra']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/rb_transfer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_bank_transfer_tv']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOI | 67890123 | SB']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/select_bank_to_transfer_tv']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='BOB | 1234567 | TL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_transfer']")).sendKeys("2500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_bk_contra_submit']")).click();
		Thread.sleep(7000);
		
		System.out.println("Transfer Bank2 to TL transaction successfull");
		
		return driver;
	}
}

