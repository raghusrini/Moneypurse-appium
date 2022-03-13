package actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ActionEvents {

	public static String actionPerform(WebElement element, String actionname, String value) {
		String result = "";

		switch (actionname) {
		case "click":
			element.click();
			break;

		case "type":
			element.sendKeys(value);
			break;

		case "clear":
			element.clear();
			break;

		case "selected":
			result = String.valueOf(element.isSelected());
			break;

		case "attribute":
			result = element.getAttribute(value);
			break;

		case "css":
			result = element.getCssValue(value);
			break;

		case "gettext":
			result = element.getText();
			break;

		case "tag":
			result = element.getTagName();
			break;

		case "enabled":
			result = String.valueOf(element.isEnabled());
			break;

		case "displayed":
			result = String.valueOf(element.isDisplayed());
			break;

		case "location":
			result = String.valueOf(element.getLocation());
			break;

		case "select":
			Select obj = new Select(element);
			element.click();
			obj.selectByVisibleText(value);
			break;
		}
		return result;
	}

	public static String browserCommand(WebDriver driver, String actionname, String value) {
		String result = "";

		switch (actionname) {
		case "navigate":
			driver.navigate().to(value);
			break;

		case "back":
			driver.navigate().back();
			break;

		case "forward":
			driver.navigate().forward();
			break;

		case "title":
			result = driver.getTitle();
			break;

		case "source":
			result = driver.getPageSource();
			break;

		case "url":
			result = driver.getCurrentUrl();
			break;
		}

		return result;
	}

	public static void printScreen(WebDriver driver, String filename) {
		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File dest = new File("D:\\screens\\" + filename + ".jpg");

			FileOutputStream fout = new FileOutputStream(dest);

			int x = 0;

			FileInputStream fin = new FileInputStream(src);

			while ((x = fin.read()) != -1) {
				fout.write(x);
			}

			fout.close();
			fin.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
