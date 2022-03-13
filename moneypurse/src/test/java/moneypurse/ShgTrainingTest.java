package moneypurse;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ShgTrainingTest
{
	private AndroidDriver<AndroidElement> driver = null;
	int i;
	@Test
	public void training() throws Exception
	{
		ShgAuditingTest test10 = new ShgAuditingTest();
		  
		  driver = test10.auditing();
		  
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

		//Training
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Training']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Health awareness']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Book keeper awareness']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Livelihood awareness']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Social awareness']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Educational awareness']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Educational awareness']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
		Thread.sleep(7000);
		System.out.println("Training details updated successfully");
		
		//return driver;
		driver.closeApp();
	}
}
