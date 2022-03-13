package demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class A 
{
	AndroidDriver<WebElement> driver = null;
	int i;	
	@Test
	public void f() 
	{
		System.out.println("Raghu");
		//01 dd /scroll list
		WebElement date1 =driver.findElement(By.xpath(""));
		date1.click();

		List<WebElement> list =date1.findElements(By.xpath(""));
		System.out.println(list.get(10).getAttribute("value"));
		list.get(10);  
		
		//02 scrollc 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Map<String,Object> hm = new HashMap<String,Object>();
		hm.put("name", "down");
		hm.put("offset", 0.20);
		hm.put("element", list.get(0));
		js.executeScript("mobile:selectDateWheelValue",hm);
		
		//01
	
	}
}
