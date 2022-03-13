package moneypurse;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.net.URL;

public class LoginTest extends Base
{
	
	private AndroidDriver<AndroidElement> driver = null;
	 int i;

	@Test
	public  void openMoneyPurse() 
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


	}
	
	/*@AfterTest
	public void tearDown() 
	{
		try
		{
			System.out.println("");

		}
		catch(Exception e)
		{
			

		}

	}*/

}
