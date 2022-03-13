package moneypurse;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class App01
{
	private AndroidDriver<AndroidElement> driver = null;
	@Test
	protected AndroidDriver<AndroidElement> openApp() throws Exception
	{
		try 
		{ 
			//Desired capabilities 
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "11.0");
			cap.setCapability("deviceName", "emulator-5554");
			cap.setCapability("automationName", "appium");
			cap.setCapability("appPackage", "com.yesteam.shg");
			cap.setCapability("appActivity", "com.yesteam.shg.view.SplashscreenActivity");
			cap.setCapability("SystemPort", 8200);
			cap.setCapability("udid", "emulator-5554");
			cap.setCapability("noReset", true);

			//Connect Appium Server and launch apk

			driver = new AndroidDriver<AndroidElement> (new URL("http:127.0.0.1:4723/wd/hub"),cap);
			System.out.println("Server connected successfully");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			System.out.println("App Launched successfully");
			Thread.sleep(4000);
		}
		catch(Exception e) 
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		} 	  
		
		return driver;
	}
	

	@Test
	public  AndroidDriver<AndroidElement> openMoneyPurse() 
	{

		try 
		{
			
			
			//App01 start =new App01();
			//driver =start.openApp();
			//open App

		/*	MobileElement allow=driver.findElement(By.xpath("//android.widget.Button[@index='0']"));
			allow.click();
			Thread.sleep(3000);

			// Enter login credentials

			MobileElement mNum =driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
			mNum.sendKeys("9677442028");
			Thread.sleep(3000);

			MobileElement click =driver.findElement(By.xpath("//android.widget.TextView[@index='0']"));
			click.click();
			Thread.sleep(3000);

			MobileElement otp =driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/pin_first_edittext']"));
			otp.sendKeys("1");
			//android.widget.EditText[@index='0']
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/pin_second_edittext']")).sendKeys("1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/pin_third_edittext']")).sendKeys("1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/pin_forth_edittext']")).sendKeys("1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/pin_fifth_edittext']")).sendKeys("1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/pin_sixth_edittext']")).sendKeys("1");
			Thread.sleep(2000);
			
			//Enter Pin
			driver.findElement(By.xpath("//android.widget.Button[@text='1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='3']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='4']")).click();
			Thread.sleep(2000);
			
			//Reenter pin
			driver.findElement(By.xpath("//android.widget.Button[@text='1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='3']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='4']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Login']")).click();
			Thread.sleep(2000);*/
			
			//Login with pin
			driver.findElement(By.xpath("//android.widget.Button[@text='1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='3']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='4']")).click();
			Thread.sleep(7000);	
			System.out.println("Login successfully");
			
			

		}
		catch(Exception e) 
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
		return driver;
				

	}
}
	
	
		
	




