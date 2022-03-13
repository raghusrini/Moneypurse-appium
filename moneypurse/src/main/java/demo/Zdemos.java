package demo;



import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class Zdemos
{
	static AppiumDriver<AndroidElement> driver = null;
	static int i;
	public static  void main(String[] args) throws Exception
	{
		
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "11.0");
			cap.setCapability("deviceName", "emulator-5554");
			cap.setCapability("automationName", "appium");
			cap.setCapability("appPackage", "com.touchboarder.android.api.demos");
			cap.setCapability("appActivity", "com.touchboarder.androidapidemos.MainActivity");

			AppiumDriver<AndroidElement> driver = null;	
			
			driver = new AndroidDriver<AndroidElement> (new URL("http:127.0.0.1:4723/wd/hub"),cap);

			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

			driver.findElement(By.xpath("//android.widget.Button[@text = 'Continue']")).click();
			driver.findElement(By.xpath("//android.widget.Button[@text = 'OK']")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'OK']")).click();

			WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text = 'API Demos']"));
			ele.sendKeys(Keys.ARROW_DOWN);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Views']")).click();
			Thread.sleep(500);
			
		
			/*Robot robot = new Robot();
			/*Random random = new Random();
			while(true)
			{
			robot.delay(6000);
			int x = random.nextInt()%500;
			int y = random.nextInt()%480;
			robot.mouseMove(x, y);
			}*/
			/*robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);

			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(500);*/

			/*robot.keyPress(KeyEvent.VK_DOWN);
robot.keyPress(KeyEvent.VK_DOWN);*/

			//MobileElement elm = (MobileElement)driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']"));



			/*for(i=1;i<3;i++)

			{
				Dimension dimension = driver.manage().window().getSize();
				int start_x = (int)(dimension.width * 0.5);
				int start_y = (int)(dimension.height * 0.8);

				int end_x = (int)(dimension.width * 0.2);
				int end_y = (int)(dimension.height * 0.2);

				TouchAction touch = new TouchAction(driver);
				touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

				Thread.sleep(3000);
			}


			Dimension dimension = driver.manage().window().getSize();
			int start_x = (int)(dimension.width * 0.5);
			int start_y = (int)(dimension.height * 0.2);

			int end_x = (int)(dimension.width * 0.2);
			int end_y = (int)(dimension.height * 0.8);

			TouchAction touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

			Thread.sleep(3000);
			//click d down
			driver.findElement(By.xpath("//android.widget.TextView[@text='Spinner']")).click();

			MobileElement selectDown =driver.findElement(By.xpath("//android.widget.Spinner[@index='3']"));
			selectDown.click();
			MobileElement selectOption =driver.findElement(By.xpath("//android.widget.CheckedTextView[@text = 'Uranus']"));
			selectOption.click();
			// System.out.println("the drop down available options :"+items);
			/* for(WebElement e:ele2)
			    {
			    	String val=e.getText();
			    	if(val.equalsIgnoreCase("mars"))
			    	{
			    		e.click();
			    		break;
			    	}
			    }*/


			//JavascriptExecutor js = (JavascriptExecutor) driver; 
			//js.executeScript("window.scrollBy(0,1000)");

			//WebElement element = driver.findElement(By.xpath("//android.widget.Spinner[@index = '9']"));
			//Select s = new Select(element);	
			//s.selectByIndex(7);




		
	}

	/*public static void swipeUp() throws Exception
	{
		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int)(dimension.width * 0.5);
		int start_y = (int)(dimension.height * 1.0);

		int end_x = (int)(dimension.width * 0.2);
		int end_y = (int)(dimension.height * 0.2);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

		Thread.sleep(3000);
	}*/
	/*	public static void swipeDown() throws Exception
	{

		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int)(dimension.width * 0.5);
		int start_y = (int)(dimension.height * 0.2);

		int end_x = (int)(dimension.width * 0.2);
		int end_y = (int)(dimension.height * 0.8);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

		Thread.sleep(3000);
	}*/
}
