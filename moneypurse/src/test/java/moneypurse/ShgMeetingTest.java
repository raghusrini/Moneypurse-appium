package moneypurse;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ShgMeetingTest 
{
	private AndroidDriver<AndroidElement> driver = null;
	int i;

	@Test
	public AndroidDriver<AndroidElement> attendance() throws Exception
	{
		/* ShgBookKeepingDisbursement test07 = new ShgBookKeepingDisbursement();
		  driver = test07.disbursement();
		  Thread.sleep(5000);*/
		
		App01 start =new App01();
		driver =start.openApp();
		driver = start.openMoneyPurse();
		Thread.sleep(4000);

		// click SHG
		MobileElement shg=driver.findElement(By.xpath("//android.widget.TextView[@text='SHG']"));
		shg.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);


		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_shg_search']")).sendKeys("rani");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Rani / Amutha']")).click();
		Thread.sleep(2000);
		//sw
		driver.findElement(By.xpath("//android.widget.TextView[@text='SELECT']")).click();
		Thread.sleep(2000);

		//Attendance

		driver.findElement(By.xpath("//android.widget.TextView[@text='Meeting']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Attendance']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='JAYA / GUGAN']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='VINITHA / GANGA']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='LAKSHMI / KAVIN']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='AMUTHA / ANBU']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='SEETHA / GUNA']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='VINITHA / GANGA']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
		Thread.sleep(8000);
		System.out.println("Attendance updated successfully");
		
		return driver;
	}

	@Test
	public AndroidDriver<AndroidElement> minutesOfMeeting() throws Exception
	{

		//MinutesofMeeting
		driver.findElement(By.xpath("//android.widget.TextView[@text='Meeting']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[436,1222][656,1332]']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Collected the savings amount']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Discussed about disbursing the personal loan']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Collected the repayment amount and interest']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Decided to get the bank loan']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);

		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int)(dimension.width * 0.5);
		int start_y = (int)(dimension.height * 0.8);

		int end_x = (int)(dimension.width * 0.2);
		int end_y = (int)(dimension.height * 0.2);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();


		driver.findElement(By.xpath("//android.widget.TextView[@text='COVID 19 Lockdown Month']/following-sibling::android.widget.CheckBox")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
		Thread.sleep(8000);
		System.out.println("meetings updated successfully");

return driver;
	}

	@Test
	public AndroidDriver<AndroidElement> upload() throws Exception
	{
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Meeting']")).click();
		Thread.sleep(2000);
		//add documents
		
		driver.findElement(By.xpath("//android.widget.TextView[@bounds='[716,1222][936,1332]']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/galleryimg']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Photos']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Download']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Photo taken on Feb 21, 2022 10:51:20 PM']")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
		Thread.sleep(8000);
		System.out.println("Uploaded successfully");
		
		return driver;
		
		//driver.closeApp();
	}


}
