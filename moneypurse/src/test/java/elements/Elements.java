package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements 
{
	
		public static WebElement locateElement(WebDriver driver, String locator, String value)
		{
			WebElement element = null;
			
			switch(locator)
			
			{
				case "id":
					element = driver.findElement(By.id(value));
					break;
					
				case "name":
					element = driver.findElement(By.name(value));
					break;
					
				case "class":
					element = driver.findElement(By.className(value));
					break;
					
				case "tag":
					element = driver.findElement(By.tagName(value));
					break;
					
				case "link":
					element = driver.findElement(By.linkText(value));
					break;
					
				case "partial":
					element = driver.findElement(By.partialLinkText(value));
					break;
					
				case "css":
					element = driver.findElement(By.cssSelector(value));
					break;
					
				case "xpath":
					element = driver.findElement(By.xpath(value));
					break;
					
			}
			return element;
		}
	}


