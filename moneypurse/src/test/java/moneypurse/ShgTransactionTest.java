package moneypurse;

import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;

public class ShgTransactionTest 

{
	private AndroidDriver<AndroidElement> driver = null;
	int i;
	

	@Test
	public void receipt() throws Exception
	{
	
		/*ShgProfileTest test01= new ShgProfileTest();
		  driver = test01.groupTest();
		  driver = test01.memberTest();
		  Thread.sleep(5000);*/		
	  	App01 start =new App01();
		driver =start.openApp();
		driver = start.openMoneyPurse();
		Thread.sleep(4000);

		// click SHG
		MobileElement shg=driver.findElement(By.xpath("//android.widget.TextView[@text='SHG']"));
		shg.click();
		Thread.sleep(10000);


		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_shg_search']")).sendKeys("rani");

		driver.findElement(By.xpath("//android.widget.TextView[@text='Rani / Amutha']")).click();
		Thread.sleep(2000);
		//sw
		driver.findElement(By.xpath("//android.widget.TextView[@text='SELECT']")).click();
		Thread.sleep(2000);
		//Receipt
		driver.findElement(By.xpath("//android.widget.TextView[@text='Transaction']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Receipt']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(8000);
		
		//member1
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='JAYA / GUGAN']/following-sibling::android.widget.ImageView")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_voluntary_savings']")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/tv_subscription_view']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/tv_penalty_view']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/tv_other_income_view']")).sendKeys("200");
		Thread.sleep(2000);
		
		driver =SwipeFunctions.swipeActionPerform(driver, "swipeUp");
		
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1864][975,1920]']")).sendKeys("1500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1964][975,2020]']")).sendKeys("500");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1347][975,1403]']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1447][975,1503]']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1738][975,1794]']")).sendKeys("1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1838][975,1894]']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_save']")).click();
		Thread.sleep(5000);
		
		
		//member2
		
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='VINITHA / GANGA']/following-sibling::android.widget.ImageView")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_voluntary_savings']")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/tv_subscription_view']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/tv_penalty_view']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/tv_other_income_view']")).sendKeys("200");
		Thread.sleep(2000);
		
		driver =SwipeFunctions.swipeActionPerform(driver, "swipeUp");
		
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1018][975,1074]']")).sendKeys("1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1118][975,1174]']")).sendKeys("100");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1378][975,1434]']")).sendKeys("10000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1478][975,1534]']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1738][975,1794]']")).sendKeys("1000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1838][975,1894]']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_save']")).click();
		Thread.sleep(5000);
		
		//member3
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='LAKSHMI / KAVIN']/following-sibling::android.widget.ImageView")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_voluntary_savings']")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/tv_subscription_view']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/tv_penalty_view']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/tv_other_income_view']")).sendKeys("200");
		Thread.sleep(2000);
		
		driver =SwipeFunctions.swipeActionPerform(driver, "swipeUp");
		
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1018][975,1074]']")).sendKeys("1500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1118][975,1174]']")).sendKeys("500");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1378][975,1434]']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1478][975,1534]']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1738][975,1794]']")).sendKeys("1500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1838][975,1894]']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_save']")).click();
		Thread.sleep(5000);
		
		//member4
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='AMUTHA / ANBU']/following-sibling::android.widget.ImageView")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_voluntary_savings']")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/tv_subscription_view']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/tv_penalty_view']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/tv_other_income_view']")).sendKeys("200");
		Thread.sleep(2000);
		
		driver =SwipeFunctions.swipeActionPerform(driver, "swipeUp");
		
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1018][975,1074]']")).sendKeys("1500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1118][975,1174]']")).sendKeys("500");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1378][975,1434]']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1478][975,1534]']")).sendKeys("5000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1738][975,1794]']")).sendKeys("1500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1838][975,1894]']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_save']")).click();
		Thread.sleep(5000);
		
		driver =SwipeFunctions.swipeActionPerform(driver, "swipeUp");
		
		
		//member5
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='SEETHA / GUNA']/following-sibling::android.widget.ImageView")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_voluntary_savings']")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/tv_subscription_view']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/tv_penalty_view']")).sendKeys("100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/tv_other_income_view']")).sendKeys("200");
		Thread.sleep(2000);
		
		driver =SwipeFunctions.swipeActionPerform(driver, "swipeUp");
		
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1018][975,1074]']")).sendKeys("1500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1118][975,1174]']")).sendKeys("500");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1378][975,1434]']")).sendKeys("2000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1478][975,1534]']")).sendKeys("2000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1738][975,1794]']")).sendKeys("1500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@bounds='[921,1838][975,1894]']")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_save']")).click();
		Thread.sleep(5000);


		driver =SwipeFunctions.swipeActionPerform(driver, "swipeUp");
		
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_submit']")).click();
		Thread.sleep(10000);
		System.out.println("Transaction successfull");
		
		// return driver;
		
	}
	
	/*@Test
	public void payment() throws Exception
	{
	}
*/
	
}
