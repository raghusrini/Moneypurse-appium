package demo;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class InitDriver {
	

	
	
		 AndroidDriver<AndroidElement> driver = null;
		
		public   AndroidDriver<AndroidElement> openApp()
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

		/*@AfterTest
		public void tearDown() 
		{
			
		}*/
	}




