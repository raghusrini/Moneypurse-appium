package moneypurse;

import org.testng.annotations.Test;

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

public class ShgOnBoardLoan
{
	AndroidDriver<AndroidElement> driver = null;
	int i;
	@Test
	public void shgLoan() throws Exception
	{
		try
		{
			// select cut off date

			driver.findElement(By.xpath("//android.widget.TextView[@text='dd/mm/yyyy']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.view.View[@content-desc='10 February 2022']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			//Add loan
			driver.findElement(By.xpath("//android.widget.TextView[@text='Add Loan']")).click();
			Thread.sleep(4000);
			//Enter loan bank details
			driver.findElement(By.xpath("//android.widget.TextView[@text='Bank Name / MFI / Federation']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='BANK OF BARODA']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Branch Name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='KARAIKAL']")).click();
			Thread.sleep(2000);
			//loan type
			driver.findElement(By.xpath("//android.widget.TextView[@text='Loan Type']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='TERM LOAN']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Account Number']")).sendKeys("355401000012");
			Thread.sleep(2000);
			//loan date
			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Sanction Date (DD/MM/YYYY)']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.view.View[@content-desc='01 February 2022']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			//
			Dimension dimension = driver.manage().window().getSize();
			int start_x = (int)(dimension.width * 0.5);
			int start_y = (int)(dimension.height * 0.8);

			int end_x = (int)(dimension.width * 0.2);
			int end_y = (int)(dimension.height * 0.2);

			TouchAction touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);


			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Sanction Amount (Limit)']")).sendKeys("200000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text=Loan Disbursement Date (DD/MM/YYYY)']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.view.View[@content-desc='04 February 2022']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			//Disbursement amount
			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Disbursement Amount']")).sendKeys("200000");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Tenure ( Months )']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='12']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Purpose of Loan']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='AGRI']")).click();
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


			driver.findElement(By.xpath("//android.widget.EditText[@text='Rate of Interest (00.00)']")).sendKeys("8.5");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Installment Amount']")).sendKeys("15000");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan OutStanding as on 10/02/2022']")).sendKeys("200000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Next']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Next']")).click();
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
	}
	@BeforeTest
	public void beforeTest() {
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
