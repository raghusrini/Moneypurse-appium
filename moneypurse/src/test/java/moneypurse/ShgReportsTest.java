package moneypurse;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ShgReportsTest 
{
	private AndroidDriver<AndroidElement> driver = null;
	int i;


	@Test(priority=0)

	public void memberReports() throws Exception
	{
		
		  
		App01 start =new App01();
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
		//sw
		driver.findElement(By.xpath("//android.widget.TextView[@text='SELECT']")).click();
		Thread.sleep(2000);
		
		//Reports
		
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Reports']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[150,1042][384,1180]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='JAYA / GUGAN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Savings Summary']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//b
		driver.findElement(By.xpath("//android.widget.TextView[@text='JAYA / GUGAN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Loan Summary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Internal Loan']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Term Loan']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='MFI Loan']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//b
		driver.findElement(By.xpath("//android.widget.TextView[@text='JAYA / GUGAN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Monthly Summary']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		//b
		
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='VINITHA / GANGA']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Savings Summary']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//b
		driver.findElement(By.xpath("//android.widget.TextView[@text='VINITHA / GANGA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Loan Summary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Internal Loan']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Term Loan']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='MFI Loan']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//b
		driver.findElement(By.xpath("//android.widget.TextView[@text='VINITHA / GANGA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Monthly Summary']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		//b
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='LAKSHMI / KAVIN']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Savings Summary']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//b
		driver.findElement(By.xpath("//android.widget.TextView[@text='LAKSHMI / KAVIN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Loan Summary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Internal Loan']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Term Loan']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='MFI Loan']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//b
		driver.findElement(By.xpath("//android.widget.TextView[@text='LAKSHMI / KAVIN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Monthly Summary']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='AMUTHA / ANBU']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Savings Summary']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//b
		driver.findElement(By.xpath("//android.widget.TextView[@text='AMUTHA / ANBU']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Loan Summary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Internal Loan']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Term Loan']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='MFI Loan']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//b
		driver.findElement(By.xpath("//android.widget.TextView[@text='AMUTHA / ANBU']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Monthly Summary']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.TextView[@text='SEETHA / GUNA']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Savings Summary']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//b
		driver.findElement(By.xpath("//android.widget.TextView[@text='SEETHA / GUNA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Loan Summary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Internal Loan']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Term Loan']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='MFI Loan']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//b
		driver.findElement(By.xpath("//android.widget.TextView[@text='SEETHA / GUNA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Monthly Summary']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		
	}
	@Test(priority=1)
	public void groupReports() throws Exception 
	{
		driver.findElement(By.xpath("//android.widget.TextView[@text='Reports']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[429,1042][663,1180]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_group_savings_summary']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(5000);
		//b
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_group_loan_summary']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Term Loan']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='MFI Loan']")).click();
		
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(5000);
		
		//return driver;
	}
	@Test(priority=2)
	public void bankBalance() throws Exception 
	{		
    driver.findElement(By.xpath("//android.widget.TextView[@text='Reports']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//android.widget.TextView[@bounds='[709,1042][943,1180]']")).click();
	
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	//return driver;
	}
	@Test(priority=3)
	public void bankTransactionSummary() throws Exception 
	{
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Reports']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[150,1373][384,1511]']")).click();
		
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		
		//return driver;
	}

	@Test(priority=4)
	public void financialStatement() throws Exception
	{
		driver.findElement(By.xpath("//android.widget.TextView[@text='Reports']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[429,1373][663,1511]']")).click();
		Thread.sleep(2000);
		//From

		for(i=0;i<=4;i++)
		{	
			driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.yesteam.shg:id/previousButton']")).click();
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[332,988][453,1109]']")).click();
		Thread.sleep(2000);

		for(i=0;i<=5;i++)
		{	
			driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.yesteam.shg:id/forwardButton']")).click();
			Thread.sleep(2000);
		}

		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[186,988][307,1109]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/txt_done']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/txt_balance_view_more']")).click();
		
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		
		Thread.sleep(7000);
		
		//return driver;

	}
}
