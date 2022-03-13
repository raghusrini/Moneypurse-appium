package moneypurse;

import org.testng.annotations.Test;

import com.beust.jcommander.internal.Lists;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterTest;

public class ShgProfileTest 
{
	private AndroidDriver<AndroidElement> driver = null;
	int i;

	@Test
	public void groupTest() throws Exception 
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
		driver.findElement(By.xpath("//android.widget.TextView[@text='Profile']")).click();
		Thread.sleep(2000);
		//Group

		driver.findElement(By.xpath("//android.widget.TextView[@text='Group']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Change']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='New President']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='AMUTHA / ANBU']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='President Rotation Date']")).click();
		Thread.sleep(2000);
		
		Dimension windowSize = driver.manage().window().getSize();
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("command", "input");
		args.put("args", Lists.newArrayList("swipe", windowSize.width / 2,
				windowSize.height / 2, windowSize.width / 2, windowSize.height));
		while (driver.findElements(By.xpath("//android.view.View[@content-desc='01 February 2022']")).size() == 0)
		{
			driver.executeScript("mobile: shell", args);
		}
		
		driver.findElement(By.xpath("//android.view.View[@content-desc='01 February 2022']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.yesteam.shg:id/ok']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/btn_rotation_submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_meetingDate']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='10']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_saving_amount']")).sendKeys("9000");
		Thread.sleep(2000);


		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int)(dimension.width * 0.5);
		int start_y = (int)(dimension.height * 0.9);

		int end_x = (int)(dimension.width * 0.2);
		int end_y = (int)(dimension.height * 0.2);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();


		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_make_default']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
		Thread.sleep(7000);
		System.out.println("Group profile updated successfully");
		
		//return driver;
	}
	

	@Test
	public void memberTest() throws InterruptedException 
	{
		driver.findElement(By.xpath("//android.widget.TextView[@text='Profile']")).click();
		Thread.sleep(2000);
		//member

		driver.findElement(By.xpath("//android.widget.TextView[@text='Member']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='JAYA / GUGAN']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_profile']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Gallery']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Photos']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Download']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Photo taken on Feb 21, 2022 10:50:25 PM']")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='JAYA / GUGAN']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_edit_mobile_no']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='New Mobile Number *']")).sendKeys("9870852102");


		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
		Thread.sleep(4000);





		driver.findElement(By.xpath("//android.widget.TextView[@text='VINITHA / GANGA']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_profile']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Gallery']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Photos']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Download']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Photo taken on Feb 21, 2022 10:54:11 PM']")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='VINITHA / GANGA']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_edit_mobile_no']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='New Mobile Number *']")).sendKeys("8870811020");


	
		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
		Thread.sleep(4000);


		driver.findElement(By.xpath("//android.widget.TextView[@text='LAKSHMI / KAVIN']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_profile']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Gallery']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Photos']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Download']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Photo taken on Feb 21, 2022 6:38:26 PM']")).click();
		Thread.sleep(12000);
		

		driver.findElement(By.xpath("//android.widget.TextView[@text='AMUTHA / ANBU']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_profile']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Gallery']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Photos']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Download']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Photo taken on Feb 21, 2022 6:39:12 PM']")).click();
		Thread.sleep(12000);
		


		driver.findElement(By.xpath("//android.widget.TextView[@text='SEETHA / GUNA']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_profile']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Gallery']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Photos']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Download']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Photo taken on Feb 21, 2022 6:38:44 PM']")).click();
		Thread.sleep(12000);
		
	    driver.navigate().back();
	    
	    Thread.sleep(7000);
		//return driver;
		driver.closeApp();
	}
       
}
