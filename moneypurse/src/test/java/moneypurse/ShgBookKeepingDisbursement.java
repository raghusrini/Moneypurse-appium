package moneypurse;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ShgBookKeepingDisbursement
{
	private AndroidDriver<AndroidElement> driver = null;
	int i;
	@Test
	public void disbursement() throws Exception
	{
		
		 ShgBookKeepingShgLoan test06 = new ShgBookKeepingShgLoan();
		  
		  driver = (AndroidDriver<AndroidElement>) test06.addNewLoan();
		  
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

		//Disbursement

		driver.findElement(By.xpath("//android.widget.TextView[@text='Disbursement']")).click();
		Thread.sleep(4000); 
		driver.findElement(By.xpath("//android.widget.Switch[@bounds='[892,635][1024,767]']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//android.widget.Switch[@bounds='[892,775][1024,907]']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//android.widget.Switch[@bounds='[892,915][1024,1047]']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//android.widget.Switch[@bounds='[892,1055][1024,1187]']")).click();
		Thread.sleep(7000);
		driver.navigate().back();
		Thread.sleep(7000);
		//return  driver;
		
		//driver.closeApp();


	}
}
