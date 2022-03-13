package moneypurse;//android.widget.Button[@text='1']

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ShgAuditingTest
{
	private AndroidDriver<AndroidElement> driver = null;
	int i;
	@Test
	public AndroidDriver<AndroidElement> auditing() throws Exception
	{
		/* ShgReportsTest test09 = new ShgReportsTest();
		  driver = test09.memberReports();
		  driver = test09.groupReports();
		  driver = test09.bankBalance();
		  driver = test09.bankTransactionSummary();
		  driver = test09.financialStatement();*/
		ShgMeetingTest test08 = new ShgMeetingTest();
		  driver = test08.attendance();
		  driver = test08.minutesOfMeeting();
		  driver = test08.upload();
		  
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
		//sw
		driver.findElement(By.xpath("//android.widget.TextView[@text='SELECT']")).click();
		Thread.sleep(2000);*/

		//Auditing

		driver.findElement(By.xpath("//android.widget.TextView[@text='Auditing']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/et_start_date']")).click();
		Thread.sleep(3000);
		
			
			driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.yesteam.shg:id/previousButton']")).click();
			Thread.sleep(2000);
		

		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[186,786][307,907]']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Done']")).click();
		Thread.sleep(3000);
		//end date
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/et_end_date']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.yesteam.shg:id/previousButton']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[624,1149][745,1270]']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Done']")).click();
		Thread.sleep(3000);
		//audit date

		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/et_auditing_date']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//android.widget.ImageButton[@resource-id='com.yesteam.shg:id/previousButton']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[916,1149][1037,1270]']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Done']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_auditor_name']")).sendKeys("G.Ganesh Kumar");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
		Thread.sleep(7000);
		System.out.println("Auditing details updated successfully");
		
		return driver;
		
		//driver.closeApp();

	}
}
