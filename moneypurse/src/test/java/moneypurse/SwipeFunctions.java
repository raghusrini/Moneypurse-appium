package moneypurse;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.beust.jcommander.internal.Lists;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeFunctions 
{
	static AndroidDriver<AndroidElement> driver = null;
	int i;
	/*@Test
	public  AndroidDriver<AndroidElement> swipeDown() 

	{

		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int)(dimension.width * 0.5);
		int start_y = (int)(dimension.height * 0.2);

		int end_x = (int)(dimension.width * 0.2);
		int end_y = (int)(dimension.height * 0.8);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
return driver;
	}*/

	public  static AndroidDriver<AndroidElement> swipeActionPerform(AndroidDriver<AndroidElement> driver,String actionname)

	{
		//String result = "";

		switch (actionname) {
		case "swipeUp":
			Dimension dimension = driver.manage().window().getSize();
			int start_x = (int)(dimension.width * 0.5);
			int start_y = (int)(dimension.height * 0.8);

			int end_x = (int)(dimension.width * 0.2);
			int end_y = (int)(dimension.height * 0.2);
			TouchAction touch = new TouchAction((PerformsTouchActions) driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

			break; 
			
		case "swipeDown":
		    dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.2);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.8);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			break;
			
		case "scrollToElement":
			Dimension windowSize = driver.manage().window().getSize();
			Map<String, Object> args = new HashMap<String, Object>();
			args.put("command", "input");
			args.put("args", Lists.newArrayList("swipe", windowSize.width / 2,
					windowSize.height / 2, windowSize.width / 2, windowSize.height));
			


		}
		return driver;
	}
	/*{

		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int)(dimension.width * 0.5);
		int start_y = (int)(dimension.height * 0.8);

		int end_x = (int)(dimension.width * 0.2);
		int end_y = (int)(dimension.height * 0.2);

		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();

		return driver;
	}*/
/*	@Test
	public AndroidDriver<AndroidElement> scrollToElement()
	{
		Dimension windowSize = driver.manage().window().getSize();
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("command", "input");
		args.put("args", Lists.newArrayList("swipe", windowSize.width / 2,
				windowSize.height / 2, windowSize.width / 2, windowSize.height));
		return driver;
		
		Dimension windowSize = driver.manage().window().getSize();
			Map<String, Object> args = new HashMap<String, Object>();
			args.put("command", "input");
			args.put("args", Lists.newArrayList("swipe", windowSize.width / 2,
					windowSize.height / 2, windowSize.width / 2, windowSize.height));
			while (driver.findElements(By.xpath("//android.widget.TextView[@text='2000']")).size() == 0)
			{
				driver.executeScript("mobile: shell", args);
			}

	}*/
}

