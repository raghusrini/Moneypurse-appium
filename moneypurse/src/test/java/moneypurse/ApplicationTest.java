package moneypurse;
import org.testng.annotations.Test;

import com.beust.jcommander.internal.Lists;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;

import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class ApplicationTest
{
	AndroidDriver<AndroidElement> driver;
	int i;
	

	@SuppressWarnings("unchecked")
	@Test
	public void moneypurseApp() 
	{
		try
		{
			//Desired capabilities 
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "11.0");
			cap.setCapability("deviceName", "Android emulator");
			cap.setCapability("automationName", "appium");
			cap.setCapability("appPackage", "com.yesteam.shg");
			cap.setCapability("appActivity", "com.yesteam.shg.view.SplashscreenActivity");
			cap.setCapability("SystemPort", 8201);
			cap.setCapability("udid", "emulator-5554");
			cap.setCapability("noReset", true);

			//Connect Appium Server and launch apk

			driver = new AndroidDriver<AndroidElement> (new URL("http:127.0.0.1:4723/wd/hub"),cap);
			System.out.println("Server connected successfully");
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			System.out.println("App Launched successfully");

			//open App

		/*	MobileElement allow=driver.findElement(By.xpath("//android.widget.Button[@index='0']"));
			allow.click();
			Thread.sleep(3000);

			// Enter login credentials

			MobileElement mNum =driver.findElement(By.xpath("//android.widget.EditText[@index='1']"));
			mNum.sendKeys("9677442028");
			Thread.sleep(5000);

			MobileElement click =driver.findElement(By.xpath("//android.widget.TextView[@index='0']"));
			click.click();
			Thread.sleep(3000);

			MobileElement otp =driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/pin_first_edittext']"));
			otp.sendKeys("1");
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
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Login']")).click();
			Thread.sleep(2000);*/

			//Login with pin
			driver.findElement(By.xpath("//android.widget.Button[@text='1']")).click();
			
			driver.findElement(By.xpath("//android.widget.Button[@text='2']")).click();
			
			driver.findElement(By.xpath("//android.widget.Button[@text='3']")).click();
			driver.findElement(By.xpath("//android.widget.Button[@text='4']")).click();
			Thread.sleep(5000);	
			System.out.println("Login successfully");

			//onboard
			// click SHG
			MobileElement shg=driver.findElement(By.xpath("//android.widget.TextView[@text='SHG']"));
			shg.click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Add New']")).click();
			Thread.sleep(7000);

			//Create SHG profile
			MobileElement gname=	driver.findElement(By.xpath("//android.widget.EditText[@text='SHG Name *']"));
			gname.sendKeys("Mother Teresa");
			
			System.out.println(gname);

			MobileElement sw =driver.findElement(By.xpath("//android.widget.TextView[@text='SHG Formation Date *']"));
			sw.click();
			
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.yesteam.shg:id/date_picker_year']")).click();

			driver.findElement(By.xpath("//android.widget.TextView[@content-desc='2021']")).click();
			Thread.sleep(2000);

			//driver.findElement(By.xpath("//android.widget.TextView[@text='1998']")).click();
			/*TouchAction sw1= new TouchAction(driver)
					.press(PointOption.point(540,1824))
					.waitAction(waitOptions(ofMills(1000)))
					.moveTo(PointOption.point(540,-672))
					.release()
					.perform();*/

			//WebElement element1 =
			//WebElement element2 =driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1999']"));
			//Action flick = TouchAction<TouchAction<T>>(driver()).flick(toFlick,0,-500,FlickAction.SPEED_NORMAL).build();
			//System.out.println("reached");
			//TouchAction swipe = new TouchAction(driver).press(ElementOption.element(element1)).waitAction(waitOptions(ofSeconds())).moveTo(ElementOption.element(element2)).release().perform();

			/* TouchActions flick = new TouchActions(driver).flick(toFlick,0,-500, 0);
			flick.perform();*/

			/*	Select sel =new Select(element);
			sel.selectByVisibleText("2021");
			sel.getFirstSelectedOption();
			//01 dd /scroll list*/
			/*WebElement date1 =driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.yesteam.shg:id/date_picker_year']"));
			date1.click();

			List<WebElement> list =date1.findElements(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/month_text_view']"));
			System.out.println(list.get(0).getAttribute("value"));
			list.get(0);  */

			//JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,250)", "");



			// WebElement  firstele = sel.getFirstSelectedOption();
			//System.out.println("first element="+firstele.getText());
			//
			//MobileElement ee=	driver.findElement(By.xpath("//android.widget.TextView[@content-desc='2021']"));
			//ee.click();
			

			//MobileElement date =driver.findElement(By.xpath("//android.widget.TextView[@content-desc='2021']"));

			//JavascriptExecutor jse =(JavascriptExecutor) driver;
			//jse.executeScript("argument[0].scrollIntoView();", yr);

			//jse.executeScript("argument[0].scrollTop =argument[1];",driver.findElement(By.className("android.widget.TextView")),500);


			driver.findElement(By.xpath("//android.view.View[@content-desc='01 February 2021']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text = 'Total Members *']")).sendKeys("5");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.EditText[@text = 'Pincode *']")).sendKeys("641049");
			Thread.sleep(2000);
			// select dropdown and enter the date of meetings
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Date of meeting at every month *']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = '10']")).click();
			Thread.sleep(3000);
			//select dropdown and enter the group type
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_groupType']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Female']")).click();
			Thread.sleep(3000);
			//swipe up
			//	SwipeFunctions.swipeUp();
			Dimension dimension = driver.manage().window().getSize();
			int start_x = (int)(dimension.width * 0.5);
			int start_y = (int)(dimension.height * 0.8);

			int end_x = (int)(dimension.width * 0.2);
			int end_y = (int)(dimension.height * 0.2);

			TouchAction touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_saving_amount']")).sendKeys("500");
			Thread.sleep(4000);
			//driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.yesteam.shg:id/radio_municipalty']")).click();
			//Thread.sleep(6000);

			//select dropdown and enter the block details
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_block_municipalty_corp']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_itemname'[0]]")).click();
			Thread.sleep(4000);


			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.7);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			//select dropdown and enter the panchayat
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_panchayat_town_ward']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Edatheru']")).click();
			Thread.sleep(3000);

			// Enter street name
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id= 'com.yesteam.shg:id/et_village']")).sendKeys("vinayagar street");
			Thread.sleep(3000);
			System.out.println("Address details submitted");

			driver.findElement(By.xpath("//android.widget.TextView[@text='Add Bank']")).click();
			Thread.sleep(2000);
			//Enter Bank 1 details
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id= 'com.yesteam.shg:id/tv_bank_name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'BANK OF BARODA']")).click();
			Thread.sleep(3000);
			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.7);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_bank_branch']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'KARAIKAL']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//android.widget.EditText[@text = 'Account Number *']")).sendKeys("35540100012");
			Thread.sleep(3000);

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Account Type *']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Savings']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_acc_openingDate']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.yesteam.shg:id/date_picker_year']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc='2021']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.view.View[@content-desc= '21 February 2021']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			System.out.println("Bank 1 details submitted");
			

			//Add Bank 2 details
			driver.findElement(By.xpath("//android.widget.TextView[@text='Bank Name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'BANK OF INDIA']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_bank_branch_2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'KARAIKAL']")).click();
			Thread.sleep(2000);
			
			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.7);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.EditText[@text = 'Account Number']")).sendKeys("67890123");
			Thread.sleep(2000);
			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Account Type']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Savings']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_acc_openingDate2']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.view.View[@content-desc= '05 February 2022']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			System.out.println("Bank 2 details submitted");

			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Next']")).click();

			System.out.println("SHG profile updated successfully");
			Thread.sleep(5000);
			//member

			MobileElement addMember =driver.findElement(By.xpath("//android.widget.TextView[@text ='Add Member']"));
			addMember.click();
			Thread.sleep(2000);

			MobileElement name =driver.findElement(By.xpath("//android.widget.EditText[@text ='Name *']"));
			name.sendKeys("Jaya");
			Thread.sleep(2000);

			MobileElement fatherName =driver.findElement(By.xpath("//android.widget.EditText[@text ='Father *']"));
			fatherName.sendKeys("Gugan");
			Thread.sleep(2000);

			MobileElement husband =  driver.findElement(By.xpath("//android.widget.EditText[@resource-id ='com.yesteam.shg:id/et_husband_name']"));
			husband.sendKeys("Guna");
			Thread.sleep(2000);

			MobileElement dob =driver.findElement(By.xpath("//android.widget.TextView[@resource-id ='com.yesteam.shg:id/tv_dob']"));
			dob.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.yesteam.shg:id/date_picker_year']")).click();
			Thread.sleep(3000);

			Dimension windowSize = driver.manage().window().getSize();
			Map<String, Object> args = new HashMap<String, Object>();
			args.put("command", "input");
			args.put("args", Lists.newArrayList("swipe", windowSize.width / 2,
					windowSize.height / 2, windowSize.width / 2, windowSize.height));
			while (driver.findElements(By.xpath("//android.widget.TextView[@text='2000']")).size() == 0)
			{
				driver.executeScript("mobile: shell", args);
			}
			driver.findElement(By.xpath("//android.widget.TextView[@text='2000']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.view.View[@content-desc='17 February 2000']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			MobileElement	mobnum =driver.findElement(By.xpath("//android.widget.EditText[@text ='Mobile Number *']"));
			mobnum.sendKeys("8870852177");
			Thread.sleep(4000);
			MobileElement	des =driver.findElement(By.xpath("//android.widget.TextView[@text ='Designation *']"));
			des.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='President']")).click();
			Thread.sleep(3000);
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);



		/*	MobileElement block =driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_block_municipalty_corp']"));
			block.click();
			Thread.sleep(2000);
			MobileElement chose =driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_itemname'[0]]"));
			chose.click();
			Thread.sleep(2000);
			MobileElement div =driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_panchayat_town_ward']"));
			div.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Keezhaiyur']")).click();
			Thread.sleep(2000);*/
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			MobileElement village =	driver.findElement(By.xpath("//android.widget.EditText[@text ='Village / Street *']"));
			village.sendKeys("Ganga street");
			Thread.sleep(2000);
			MobileElement doornum =	driver.findElement(By.xpath("//android.widget.EditText[@text ='Door Number *']"));
			doornum.sendKeys("30A/11");
			Thread.sleep(2000);

			MobileElement accnum=driver.findElement(By.xpath("//android.widget.EditText[@text= 'Account Number']"));
			accnum.sendKeys("3554010000");
			Thread.sleep(2000);

			//sw
			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);



			MobileElement cacc=driver.findElement(By.xpath("//android.widget.EditText[@text= 'Confirm Account Number']"));
			cacc.sendKeys("3554010000");
			Thread.sleep(2000);

			MobileElement bankname =driver.findElement(By.xpath("//android.widget.TextView[@text= 'Bank Name']"));
			bankname.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'BANK OF BARODA']")).click();
			Thread.sleep(2000);
			MobileElement branch =driver.findElement(By.xpath("//android.widget.TextView[@text= 'Branch Name']"));
			branch.click();
			Thread.sleep(2000);
			MobileElement bname	=driver.findElement(By.xpath("//android.widget.TextView[@text= 'KARAIKAL']"));
			bname.click();
			Thread.sleep(2000);

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);


			MobileElement acctype =	driver.findElement(By.xpath("//android.widget.TextView[@text= 'Account Type']"));
			acctype.click();
			Thread.sleep(2000);

			MobileElement clck =driver.findElement(By.xpath("//android.widget.TextView[@text= 'Savings']"));
			clck.click();
			Thread.sleep(2000);
			MobileElement save =driver.findElement(By.xpath("//android.widget.TextView[@text ='Save']"));
			save.click();
			Thread.sleep(2000);
			//second member
			driver.findElement(By.xpath("//android.widget.TextView[@text ='Add Member']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Name *']")).sendKeys("Vinitha");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Father *']")).sendKeys("Ganga");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id ='com.yesteam.shg:id/et_husband_name']")).sendKeys("Govind");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id ='com.yesteam.shg:id/tv_dob']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.yesteam.shg:id/date_picker_year']")).click();
			Thread.sleep(3000);

			windowSize = driver.manage().window().getSize();
			Map<String, Object> args1 = new HashMap<String, Object>();
			args1.put("command", "input");
			args1.put("args", Lists.newArrayList("swipe", windowSize.width / 2,
					windowSize.height / 2, windowSize.width / 2, windowSize.height));
			while (driver.findElements(By.xpath("//android.widget.TextView[@text='1995']")).size() == 0)
			{
				driver.executeScript("mobile: shell", args1);
			}
			driver.findElement(By.xpath("//android.widget.TextView[@text='1995']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.view.View[@content-desc='10 February 1995']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Mobile Number *']")).sendKeys("8870852176");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@text ='Designation *']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Vice President']")).click();
			Thread.sleep(2000);
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

		/*	driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_block_municipalty_corp']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_itemname'[0]]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_panchayat_town_ward']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Keezhaiyur']")).click();
			Thread.sleep(2000);*/
			//sw


			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Village / Street *']")).sendKeys("Ganga street");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Door Number *']")).sendKeys("32A");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text= 'Account Number']")).sendKeys("355401234");
			Thread.sleep(2000);
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.EditText[@text= 'Confirm Account Number']")).sendKeys("355401234");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Bank Name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'BANK OF INDIA']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Branch Name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'KARAIKAL']")).click();
			Thread.sleep(2000);

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Account Type']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Savings']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text ='Save']")).click();
			Thread.sleep(2000);
			//Third Member

			driver.findElement(By.xpath("//android.widget.TextView[@text ='Add Member']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Name *']")).sendKeys("Lakshmi");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Father *']")).sendKeys("Kavin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id ='com.yesteam.shg:id/et_husband_name']")).sendKeys("Dinesh Kumar");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id ='com.yesteam.shg:id/tv_dob']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.yesteam.shg:id/date_picker_year']")).click();
			Thread.sleep(3000);

			windowSize = driver.manage().window().getSize();
			Map<String, Object> args2 = new HashMap<String, Object>();
			args2.put("command", "input");
			args2.put("args", Lists.newArrayList("swipe", windowSize.width / 2,	
					windowSize.height / 2, windowSize.width / 2, windowSize.height));
			while (driver.findElements(By.xpath("//android.widget.TextView[@text='1995']")).size() == 0)
			{
				driver.executeScript("mobile: shell", args2);
			}
			driver.findElement(By.xpath("//android.widget.TextView[@text='1995']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.view.View[@content-desc='01 February 1995']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Mobile Number *']")).sendKeys("8870852190");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@text ='Designation *']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Secretary']")).click();
			Thread.sleep(2000);
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			/*driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_block_municipalty_corp']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_itemname'[0]]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_panchayat_town_ward']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Keezhaiyur']")).click();*/
			//sw
			Thread.sleep(2000);

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Village / Street *']")).sendKeys("Ganga street");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Door Number *']")).sendKeys("35A");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text= 'Account Number']")).sendKeys("355401034");
			Thread.sleep(2000);
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.EditText[@text= 'Confirm Account Number']")).sendKeys("355401034");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Bank Name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'BANK OF INDIA']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Branch Name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'KARAIKAL']")).click();
			Thread.sleep(2000);
			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Account Type']")).click();
			Thread.sleep(2000);



			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Savings']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text ='Save']")).click();

			Thread.sleep(2000);


			//Fourth Member

			driver.findElement(By.xpath("//android.widget.TextView[@text ='Add Member']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Name *']")).sendKeys("Amutha");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Father *']")).sendKeys("Anbu");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id ='com.yesteam.shg:id/et_husband_name']")).sendKeys("Azar k");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id ='com.yesteam.shg:id/tv_dob']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.yesteam.shg:id/date_picker_year']")).click();
			Thread.sleep(3000);

			windowSize = driver.manage().window().getSize();
			Map<String, Object> args3 = new HashMap<String, Object>();
			args3.put("command", "input");
			args3.put("args", Lists.newArrayList("swipe", windowSize.width / 2,
					windowSize.height / 2, windowSize.width / 2, windowSize.height));
			while (driver.findElements(By.xpath("//android.widget.TextView[@text='1997']")).size() == 0)
			{
				driver.executeScript("mobile: shell", args3);
			}
			driver.findElement(By.xpath("//android.widget.TextView[@text='1997']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.view.View[@content-desc='25 February 1997']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Mobile Number *']")).sendKeys("8870852177");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@text ='Designation *']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Treasurer']")).click();
			Thread.sleep(2000);
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

		/*	driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_block_municipalty_corp']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_itemname'[0]]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_panchayat_town_ward']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Keezhaiyur']")).click();*/
			//sw
			Thread.sleep(3000);

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Village / Street *']")).sendKeys("Ganga street");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Door Number *']")).sendKeys("300A");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.EditText[@text= 'Account Number']")).sendKeys("355401230");
			Thread.sleep(3000);
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//android.widget.EditText[@text= 'Confirm Account Number']")).sendKeys("355401230");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Bank Name']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'BANK OF INDIA']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Branch Name']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'KARAIKAL']")).click();
			Thread.sleep(3000);

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Account Type']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Savings']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text ='Save']")).click();

			Thread.sleep(2000);



			//Fifth Member

			driver.findElement(By.xpath("//android.widget.TextView[@text ='Add Member']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Name *']")).sendKeys("Seetha");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Father *']")).sendKeys("Guna");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id ='com.yesteam.shg:id/et_husband_name']")).sendKeys("Govind");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id ='com.yesteam.shg:id/tv_dob']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.yesteam.shg:id/date_picker_year']")).click();
			Thread.sleep(3000);

			windowSize = driver.manage().window().getSize();
			Map<String, Object> args4 = new HashMap<String, Object>();
			args4.put("command", "input");
			args4.put("args", Lists.newArrayList("swipe", windowSize.width / 2,
					windowSize.height / 2, windowSize.width / 2, windowSize.height));
			while (driver.findElements(By.xpath("//android.widget.TextView[@text='1999']")).size() == 0)
			{
				driver.executeScript("mobile: shell", args4);
			}
			driver.findElement(By.xpath("//android.widget.TextView[@text='1999']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.view.View[@content-desc='18 February 1999']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Mobile Number *']")).sendKeys("8870872176");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@text ='Designation *']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Member']")).click();
			Thread.sleep(2000);
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			/*driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_block_municipalty_corp']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_itemname'[0]]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_panchayat_town_ward']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Keezhaiyur']")).click();
			//sw
			Thread.sleep(3000);*/

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Village / Street *']")).sendKeys("Ganga street");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Door Number *']")).sendKeys("12A");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text= 'Account Number']")).sendKeys("357401234");
			Thread.sleep(2000);
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.EditText[@text= 'Confirm Account Number']")).sendKeys("357401234");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Bank Name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'BANK OF INDIA']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Branch Name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'KARAIKAL']")).click();
			Thread.sleep(2000);
			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Account Type']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Savings']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text ='Save']")).click();
			Thread.sleep(2000);



			//added

			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Next']")).click();

			Thread.sleep(4000);

		/*	//change leaders role with rotational date
			MobileElement back =driver.findElement(By.xpath("//android.widget.TextView[@text ='Back']"));
			back.click();	
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@text ='Back']")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.TextView[@text ='Change']")).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_new_president']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='VINITHA / GANGA']")).click();
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//android.widget.TextView[@text ='VINITHA / GANGA']")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text ='President Rotation Date']")).click();
			Thread.sleep(2000)
			driver.findElement(By.xpath("//android.view.View[@content-desc='15 February 2022']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
			Thread.sleep(5000);
			System.out.println("Leader changed");
			//sw 3
			for (i=1;i<=3;i++) 
			{
				dimension = driver.manage().window().getSize();
				start_x = (int)(dimension.width * 0.5);
				start_y = (int)(dimension.height * 0.8);

				end_x = (int)(dimension.width * 0.2);
				end_y = (int)(dimension.height * 0.2);

				touch = new TouchAction(driver);
				touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
				Thread.sleep(2000);
			}
			for(i=1;i<=2;i++)
			{
				driver.findElement(By.xpath("//android.widget.TextView[@text = 'Next']")).click();
				Thread.sleep(5000);
			}*/


			//shg loan

			// select cut off date

			driver.findElement(By.xpath("//android.widget.TextView[@text='dd/mm/yyyy']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.view.View[@content-desc='10 February 2022']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			//Add loan
			driver.findElement(By.xpath("//android.widget.TextView[@text='Add Loan']")).click();
			Thread.sleep(4000);
			//Enter loan bank details
			driver.findElement(By.xpath("//android.widget.TextView[@text='Bank Name / MFI / Federation']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='BANK OF BARODA']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Branch Name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='KARAIKAL']")).click();
			//loan type
			driver.findElement(By.xpath("//android.widget.TextView[@text='Loan Type']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='TERM LOAN']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Account Number']")).sendKeys("355401000012");
			Thread.sleep(2000);
			//loan date
			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Sanction Date (DD/MM/YYYY)']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.view.View[@content-desc='01 February 2022']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			//
			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);


			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Sanction Amount (Limit)']")).sendKeys("200000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text=Loan Disbursement Date (DD/MM/YYYY)']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.view.View[@content-desc='04 February 2022']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			//Disbursement amount
			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Disbursement Amount']")).sendKeys("200000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Tenure ( Months )']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='12']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Purpose of Loan']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='AGRI']")).click();
			Thread.sleep(2000);
			//
			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);


			driver.findElement(By.xpath("//android.widget.EditText[@text='Rate of Interest (00.00)']")).sendKeys("8.5");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Installment Amount']")).sendKeys("15000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan OutStanding as on 10/02/2022']")).sendKeys("200000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Next']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Next']")).click();
			Thread.sleep(3000);


			//member financial

			MobileElement search =    driver.findElement(By.xpath("//android.widget.EditText[@text='Search Member']"));
			search.sendKeys("Jaya");
			Thread.sleep(2000);
			MobileElement icon =	driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_edit']"));
			icon.click();
			Thread.sleep(2000);

			MobileElement csav =driver.findElement(By.xpath("//android.widget.EditText[@index = '3']"));
			csav.sendKeys("500");
			Thread.sleep(2000);

			MobileElement volsav = driver.findElement(By.xpath("//android.widget.EditText[@resource-id = 'com.yesteam.shg:id/et_voluntary_savings']"));
			volsav.sendKeys("200");	
			Thread.sleep(2000);

			MobileElement iout =driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1109][1022,1174]')]"));
			iout.sendKeys("2000");	
			Thread.sleep(2000);

			MobileElement tout =driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1279][1022,1344]')]"));
			tout.sendKeys("10000");	
			Thread.sleep(2000);
			MobileElement save2 =driver.findElement(By.xpath("//android.widget.TextView[@text='Save']"));
			save2.click();
			Thread.sleep(2000);

			//add other financial details
			driver.findElement(By.xpath("//android.widget.EditText[@text='Search Member']")).sendKeys("Vinitha");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_edit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@index = '3']")).sendKeys("500");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id = 'com.yesteam.shg:id/et_voluntary_savings']")).sendKeys("200");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1109][1022,1174]')]")).sendKeys("2000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1279][1022,1344]')]")).sendKeys("20000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Save']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.EditText[@text='Search Member']")).sendKeys("Lakshmi");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_edit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@index = '3']")).sendKeys("500");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id = 'com.yesteam.shg:id/et_voluntary_savings']")).sendKeys("200");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1109][1022,1174]')]")).sendKeys("2000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1279][1022,1344]')]")).sendKeys("10000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Save']")).click();
			Thread.sleep(2000);


			driver.findElement(By.xpath("//android.widget.EditText[@text='Search Member']")).sendKeys("Amutha");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_edit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@index = '3']")).sendKeys("500");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id = 'com.yesteam.shg:id/et_voluntary_savings']")).sendKeys("200");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1109][1022,1174]')]")).sendKeys("2000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1279][1022,1344]')]")).sendKeys("10000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Save']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.EditText[@text='Search Member']")).sendKeys("Seetha");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_edit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@index = '3']")).sendKeys("500");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id = 'com.yesteam.shg:id/et_voluntary_savings']")).sendKeys("200");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1109][1022,1174]')]")).sendKeys("2000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1279][1022,1344]')]")).sendKeys("10000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Save']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
			Thread.sleep(5000);

			//Add bank balance

			//Bank 1 balance details
			driver.findElement(By.xpath("//android.widget.ImageView[contains(@bounds,'[937,951][1003,1017]')]")).click();
			Thread.sleep(2000);
			MobileElement blnce =driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_savings_bank_balance']"));
			blnce.sendKeys("25000");
			Thread.sleep(2000);

			MobileElement facc =	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_fixed_deposit_acc_no']"));
			facc.sendKeys("63737123");
			Thread.sleep(2000);
			MobileElement fbal =driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_fixed_deposit_balance']"));
			fbal.sendKeys("5000");
			Thread.sleep(2000);
			for(i=1;i<=2;i++)
			{
				dimension = driver.manage().window().getSize();
				start_x = (int)(dimension.width * 0.5);
				start_y = (int)(dimension.height * 0.8);

				end_x = (int)(dimension.width * 0.2);
				end_y = (int)(dimension.height * 0.2);

				touch = new TouchAction(driver);
				touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
				Thread.sleep(2000);
			}

			MobileElement racc =driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_recurring_deposit_acc_no']"));
			racc.sendKeys("35123467");
			Thread.sleep(2000);
			MobileElement rbal =	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_recurring_deposit_balance']"));
			rbal.sendKeys("5000");
			Thread.sleep(2000);
			MobileElement save1 =driver.findElement(By.xpath("//android.widget.TextView[@text='Save']"));
			save1.click();
			Thread.sleep(3000);
			// Bank 2 balance 
			driver.findElement(By.xpath("//android.widget.ImageView[contains(@bounds,'[937,1045][1003,1111]')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_savings_bank_balance']")).sendKeys("15000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_fixed_deposit_acc_no']")).sendKeys("63737120");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_fixed_deposit_balance']")).sendKeys("10000");
			Thread.sleep(2000);

			for(i=1;i<=2;i++)
			{
				dimension = driver.manage().window().getSize();
				start_x = (int)(dimension.width * 0.5);
				start_y = (int)(dimension.height * 0.8);

				end_x = (int)(dimension.width * 0.2);
				end_y = (int)(dimension.height * 0.2);

				touch = new TouchAction(driver);
				touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
				Thread.sleep(2000);
			}

			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_recurring_deposit_acc_no']")).sendKeys("35123460");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_recurring_deposit_balance']")).sendKeys("5000");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Save']")).click();
			Thread.sleep(2000);

			//last
			driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
			Thread.sleep(4000);

			//balance sheet

			// sheet
			MobileElement chand =	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_cash_in_hand']"));
			chand.sendKeys("38500");
			Thread.sleep(2000);
			MobileElement  fasset =	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_fixed_asset']"));
			fasset.sendKeys("30000");
			Thread.sleep(2000);
			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			MobileElement exincome=	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_excess_amt']"));
			exincome.sendKeys("0");	
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.TextView[@text ='Finish']")).click();
			Thread.sleep(5000);


			/*	//member

			MobileElement addMember =driver.findElement(By.xpath("//android.widget.TextView[@text ='Add Member']"));
			addMember.click();

			MobileElement name =driver.findElement(By.xpath("//android.widget.EditText[@text ='Name *']"));
			name.sendKeys("Gayu");

			MobileElement fatherName =driver.findElement(By.xpath("//android.widget.EditText[@text ='Father *']"));
			fatherName.sendKeys("Gugan");

			MobileElement husband =  driver.findElement(By.xpath("//android.widget.EditText[@resource-id ='com.yesteam.shg:id/et_husband_name']"));
			husband.sendKeys("Guna");

			MobileElement dob =driver.findElement(By.xpath("//android.widget.TextView[@resource-id ='com.yesteam.shg:id/tv_dob']"));
			dob.click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.yesteam.shg:id/date_picker_year']")).click();
			Thread.sleep(7000);
			//c year
			//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1982']"));
			driver.findElement(By.xpath("//android.view.View[@content-desc='18 February 1983']")).click();
			//c ok
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();

			MobileElement	mobnum =driver.findElement(By.xpath("//android.widget.EditText[@text ='Mobile Number *']"));
			mobnum.sendKeys("8870852177");

			MobileElement	des =driver.findElement(By.xpath("//android.widget.TextView[@text ='Designation *']"));
			des.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='President']")).click();

			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);



			MobileElement block =driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_block_municipalty_corp']"));
			block.click();
			MobileElement chose =driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_itemname'[0]]"));
			chose.click();
			MobileElement div =driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_panchayat_town_ward']"));
			div.click();		
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Keezhaiyur']")).click();
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			MobileElement village =	driver.findElement(By.xpath("//android.widget.EditText[@text ='Village / Street *']"));
			village.sendKeys("Ganga street");
			MobileElement doornum =	driver.findElement(By.xpath("//android.widget.EditText[@text ='Door Number *']"));
			doornum.sendKeys("30A/11");

			MobileElement accnum=driver.findElement(By.xpath("//android.widget.EditText[@text= 'Account Number']"));
			accnum.sendKeys("3554010000");
			//sw




			MobileElement cacc=driver.findElement(By.xpath("//android.widget.EditText[@text= 'Confirm Account Number']"));
			cacc.sendKeys("3554010000");

			MobileElement bankname =driver.findElement(By.xpath("//android.widget.TextView[@text= 'Bank Name']"));
			bankname.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'BANK OF BARODA']")).click();

			MobileElement branch =driver.findElement(By.xpath("//android.widget.TextView[@text= 'Branch Name']"));
			branch.click();
			MobileElement bname	=driver.findElement(By.xpath("//android.widget.TextView[@text= 'KARAIKAL']"));
			bname.click();

			//
			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			MobileElement acctype =	driver.findElement(By.xpath("//android.widget.TextView[@text= 'Account Type']"));
			acctype.click();

			MobileElement clck =driver.findElement(By.xpath("//android.widget.TextView[@text= 'Savings']"));
			clck.click();
			MobileElement save =driver.findElement(By.xpath("//android.widget.TextView[@text ='Save']"));
			save.click();
			Thread.sleep(5000);
			//second member
			addMember.click();
			name.sendKeys("Vinitha");
			fatherName.sendKeys("Ganga");
			husband.sendKeys("Govind");
			dob.click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.yesteam.shg:id/date_picker_year']")).click();
			Thread.sleep(7000);
			//c year
			//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1982']"));
			driver.findElement(By.xpath("//android.view.View[@content-desc='10 February 1982']"));
			//c ok
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			mobnum.sendKeys("8870852176");
			des.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='Vice President']")).click();

			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			block.click();
			chose.click();
			div.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Keezhaiyur']")).click();
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			village.sendKeys("Ganga street");
			doornum.sendKeys("32A");
			accnum.sendKeys("355401234");
			//sw



			cacc.sendKeys("355401234");
			bankname.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'BANK OF INDIA']")).click();
			branch.click();
			bname.click();

			//
			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			acctype.click();
			clck.click();
			save.click();
			Thread.sleep(5000);

			//Third Member

			addMember.click();
			name.sendKeys("Lakshmi");
			fatherName.sendKeys("Kavin");
			husband.sendKeys("Dinesh kumar");
			dob.click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.yesteam.shg:id/date_picker_year']")).click();
			Thread.sleep(7000);
			//c year
			//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1982']"));
			driver.findElement(By.xpath("//android.view.View[@content-desc='10 February 1981']")).click();
			//c ok
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			mobnum.sendKeys("8870852175");
			des.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='Secretary']")).click();

			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			block.click();
			chose.click();
			div.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Keezhaiyur']")).click();
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			village.sendKeys("Ganga street");
			doornum.sendKeys("29A");
			accnum.sendKeys("355401233");
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			cacc.sendKeys("355401233");
			bankname.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'BANK OF INDIA']")).click();
			branch.click();
			bname.click();
			acctype.click();
			clck.click();
			save.click();
			Thread.sleep(5000);

			//Fourth Member

			addMember.click();
			name.sendKeys("Amutha");
			fatherName.sendKeys("Anbu");
			husband.sendKeys("Azar");
			dob.click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.yesteam.shg:id/date_picker_year']")).click();
			Thread.sleep(7000);
			//c year
			//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1982']"));
			driver.findElement(By.xpath("//android.view.View[@content-desc='1 February 1980']")).click();
			//c ok
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			mobnum.sendKeys("8870852174");
			des.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='Treasurer']")).click();

			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			block.click();
			chose.click();
			div.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Keezhaiyur']")).click();
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			village.sendKeys("Ganga street");
			doornum.sendKeys("28A");
			accnum.sendKeys("355401200");
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			cacc.sendKeys("355401200");
			bankname.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'BANK OF INDIA']")).click();
			branch.click();
			bname.click();
			acctype.click();
			clck.click();
			save.click();
			Thread.sleep(5000);

			//Fifth Member

			addMember.click();
			name.sendKeys("Simran");
			fatherName.sendKeys("Guna");
			husband.sendKeys("Gowtham");
			dob.click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.yesteam.shg:id/date_picker_year']")).click();
			Thread.sleep(7000);
			//c year
			//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1982']"));
			driver.findElement(By.xpath("//android.view.View[@content-desc='18 February 1979']")).click();
			//c ok
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			mobnum.sendKeys("8870852170");
			des.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='Member']")).click();

			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			block.click();
			chose.click();
			div.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Keezhaiyur']")).click();
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			village.sendKeys("Ganga street");
			doornum.sendKeys("32");
			accnum.sendKeys("355401144");
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);
			cacc.sendKeys("355401144");
			bankname.click();
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'BANK OF INDIA']")).click();
			branch.click();
			bname.click();
			acctype.click();
			clck.click();
			save.click();
			Thread.sleep(5000);
			//added

			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Next']")).click();
			Thread.sleep(3000);


			//change leaders role with rotational date
			MobileElement back =driver.findElement(By.xpath("//android.widget.TextView[@text ='Back']"));
			back.click();	
			Thread.sleep(4000);
			back.click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.TextView[@text ='Change']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//android.widget.TextView[@text ='New President']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@text ='VINITHA / GANGA']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@text ='President Rotation Date']")).click();

			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.view.View[@content-desc='12 February 2022']")).click();
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='Submit']")).click();
			Thread.sleep(4000);
			System.out.println("Leader changed");
			//sw 3
			for (i=1;i<=3;i++) 
			{
				dimension = driver.manage().window().getSize();
				start_x = (int)(dimension.width * 0.5);
				start_y = (int)(dimension.height * 0.8);

				end_x = (int)(dimension.width * 0.2);
				end_y = (int)(dimension.height * 0.2);

				touch = new TouchAction(driver);
				touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
				Thread.sleep(1000);
			}
			for(i=1;i<=2;i++)
			{
				driver.findElement(By.xpath("//android.widget.TextView[@text = 'Next']")).click();
				Thread.sleep(3000);
			}

			//shg loan

			// select cut off date

			driver.findElement(By.xpath("//android.widget.TextView[@text='dd/mm/yyyy']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.view.View[@content-desc='10 February 2022']")).click();
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			//Add loan
			driver.findElement(By.xpath("//android.widget.TextView[@text='Add Loan']")).click();
			Thread.sleep(4000);
			//Enter loan bank details
			driver.findElement(By.xpath("//android.widget.TextView[@text='Bank Name / MFI / Federation']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='BANK OF BARODA']")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='Branch Name']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='KARAIKAL']")).click();
			//loan type
			driver.findElement(By.xpath("//android.widget.TextView[@text='Loan Type']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='TERM LOAN']")).click();
			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Account Number']")).sendKeys("355401000012");

			//loan date
			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Sanction Date (DD/MM/YYYY)']")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.view.View[@content-desc='01 February 2022']")).click();
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			//
			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);


			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Sanction Amount (Limit)']")).sendKeys("200000");
			driver.findElement(By.xpath("//android.widget.TextView[@text=Loan Disbursement Date (DD/MM/YYYY)']")).click();
			driver.findElement(By.xpath("//android.view.View[@content-desc='04 February 2022']")).click();
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			//Disbursement amount
			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Disbursement Amount']")).sendKeys("200000");
			driver.findElement(By.xpath("//android.widget.TextView[@text='Tenure ( Months )']")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='12']")).click();

			driver.findElement(By.xpath("//android.widget.TextView[@text='Purpose of Loan']")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='AGRI']")).click();
			//
			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);


			driver.findElement(By.xpath("//android.widget.EditText[@text='Rate of Interest (00.00)']")).sendKeys("8.5");
			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan Installment Amount']")).sendKeys("15000");
			driver.findElement(By.xpath("//android.widget.EditText[@text='Loan OutStanding as on 10/02/2022']")).sendKeys("200000");

			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Next']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text = 'Next']")).click();
			Thread.sleep(4000);

			//member financial

			MobileElement search =    driver.findElement(By.xpath("//android.widget.EditText[@text='Search Member']"));
			search.sendKeys("Gayu");

			MobileElement icon =	driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.yesteam.shg:id/img_edit']"));
			icon.click();

			MobileElement csav =driver.findElement(By.xpath("//android.widget.EditText[@index = '3']"));
			csav.sendKeys("500");	

			MobileElement volsav = driver.findElement(By.xpath("//android.widget.EditText[@resource-id = 'com.yesteam.shg:id/et_voluntary_savings']"));
			volsav.sendKeys("200");	

			MobileElement iout =driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1109][1022,1174]')]"));
			iout.sendKeys("2000");	

			MobileElement tout =driver.findElement(By.xpath("//android.widget.EditText[contains(@bounds,'[58,1279][1022,1344]')]"));
			tout.sendKeys("10000");	

			MobileElement save2 =driver.findElement(By.xpath("//android.widget.TextView[@text='Save']"));
			save2.click();
			Thread.sleep(3000);

			//add other financial details
			search.sendKeys("Vinitha");
			icon.click();
			csav.sendKeys("500");
			volsav.sendKeys("200");
			iout.sendKeys("2000");
			tout.sendKeys("10000");
			save2.click();
			Thread.sleep(3000);

			search.sendKeys("Lakshmi");
			icon.click();
			csav.sendKeys("500");
			volsav.sendKeys("200");
			iout.sendKeys("2000");
			tout.sendKeys("10000");
			save2.click();
			Thread.sleep(3000);

			search.sendKeys("Amutha");
			icon.click();
			csav.sendKeys("300");
			volsav.sendKeys("100");
			iout.sendKeys("2000");
			tout.sendKeys("10000");
			save2.click();
			Thread.sleep(3000);

			search.sendKeys("Simran");
			icon.click();
			csav.sendKeys("500");
			volsav.sendKeys("100");
			iout.sendKeys("1000");
			tout.sendKeys("10000");
			save2.click();
			Thread.sleep(3000);


			driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
			Thread.sleep(5000);

			//Bank balance

			//Bank 1 balance details
			driver.findElement(By.xpath("//android.widget.ImageView[contains(@bounds,'[937,951][1003,1017]')]")).click();
			MobileElement blnce =driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_savings_bank_balance']"));
			blnce.sendKeys("25000");
			MobileElement facc =	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_fixed_deposit_acc_no']"));
			facc.sendKeys("63737123");
			MobileElement fbal =driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_fixed_deposit_balance']"));
			fbal.sendKeys("5000");
			for(i=1;i<=2;i++)
			{
				dimension = driver.manage().window().getSize();
				start_x = (int)(dimension.width * 0.5);
				start_y = (int)(dimension.height * 0.8);

				end_x = (int)(dimension.width * 0.2);
				end_y = (int)(dimension.height * 0.2);

				touch = new TouchAction(driver);
				touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
				Thread.sleep(2000);
			}

			MobileElement racc =driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_recurring_deposit_acc_no']"));
			racc.sendKeys("35123467");
			MobileElement rbal =	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_recurring_deposit_balance']"));
			rbal.sendKeys("5000");
			MobileElement save1 =driver.findElement(By.xpath("//android.widget.TextView[@text='Save']"));
			save1.click();
			Thread.sleep(4000);
			// Bank 2 balance 
			driver.findElement(By.xpath("//android.widget.ImageView[contains(@bounds,'[937,1045][1003,1111]')]")).click();
			blnce.sendKeys("15000");
			facc.sendKeys("63737120");
			fbal.sendKeys("10000");
			racc.sendKeys("35123460");
			rbal.sendKeys("5000");
			save1.click();
			Thread.sleep(4000);

			//last
			driver.findElement(By.xpath("//android.widget.TextView[@text='Next']")).click();
			Thread.sleep(4000);

			//Balance sheet

			// sheet
			MobileElement chand =	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_cash_in_hand']"));
			chand.sendKeys("");
			MobileElement  fasset =	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_fixed_asset']"));
			fasset.sendKeys("");
			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.8);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			MobileElement exincome=	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.yesteam.shg:id/et_excess_amt']"));
			exincome.sendKeys("");	
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.TextView[@text ='Finish']"));
			Thread.sleep(5000);*/

		}
		catch(Exception e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
	}
	private WaitOptions waitOptions(Object ofMills) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object ofMills(int j) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object ofSeconds() {
		// TODO Auto-generated method stub
		return null;
	}

	@AfterTest
	public void tearDown() throws Exception
	{
		try
		{

		}
		catch(Exception e)
		{
			driver.quit();
		}
	}

}
