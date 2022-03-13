package moneypurse;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterTest;

public class ShgOnBoardMemberProfile
{
	AndroidDriver<AndroidElement> driver = null;
	int i;
	@Test
	public  void createMemberDetails() throws Exception
	{
		try
		{
			
			MobileElement addMember =driver.findElement(By.xpath("//android.widget.TextView[@text ='Add Member']"));
			addMember.click();
			Thread.sleep(2000);

			MobileElement name =driver.findElement(By.xpath("//android.widget.EditText[@text ='Name *']"));
			name.sendKeys("Gayu");
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
			Thread.sleep(10000);
			//c year
			//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1982']"));
			driver.findElement(By.xpath("//android.view.View[@content-desc='18 February 1983']")).click();
			Thread.sleep(2000);
			//c ok
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			MobileElement	mobnum =driver.findElement(By.xpath("//android.widget.EditText[@text ='Mobile Number *']"));
			mobnum.sendKeys("8870852177");
			Thread.sleep(2000);
			MobileElement	des =driver.findElement(By.xpath("//android.widget.TextView[@text ='Designation *']"));
			des.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='President']")).click();
			Thread.sleep(2000);
			//sw

			Dimension dimension = driver.manage().window().getSize();
			int start_x = (int)(dimension.width * 0.5);
			int start_y = (int)(dimension.height * 0.9);

			int end_x = (int)(dimension.width * 0.2);
			int end_y = (int)(dimension.height * 0.2);

			TouchAction touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);



			MobileElement block =driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_block_municipalty_corp']"));
			block.click();
			Thread.sleep(2000);
			MobileElement chose =driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_itemname'[0]]"));
			chose.click();
			Thread.sleep(2000);
			MobileElement div =driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_panchayat_town_ward']"));
			div.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Keezhaiyur']")).click();
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
			start_y = (int)(dimension.height * 0.8);

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
			Thread.sleep(10000);
			//c year
			//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1982']"));
			driver.findElement(By.xpath("//android.view.View[@content-desc='10 February 1982']")).click();
			//c ok
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Mobile Number *']")).sendKeys("8870852176");
			Thread.sleep(2000);
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

			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_block_municipalty_corp']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_itemname'[0]]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_panchayat_town_ward']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Keezhaiyur']")).click();
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
			start_y = (int)(dimension.height * 0.8);

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
			Thread.sleep(10000);
			//c year
			//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1982']"));
			driver.findElement(By.xpath("//android.view.View[@content-desc='10 February 1981']")).click();
			//c ok
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Mobile Number *']")).sendKeys("8870852190");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text ='Designation *']")).click();
			Thread.sleep(2000);
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

			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_block_municipalty_corp']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_itemname'[0]]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_panchayat_town_ward']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Keezhaiyur']")).click();
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
			start_y = (int)(dimension.height * 0.8);

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
			Thread.sleep(10000);
			//c year
			//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1982']"));
			driver.findElement(By.xpath("//android.view.View[@content-desc='08 February 1980']")).click();
			//c ok
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Mobile Number *']")).sendKeys("8870852177");
			driver.findElement(By.xpath("//android.widget.TextView[@text ='Designation *']")).click();
			Thread.sleep(2000);
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

			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_block_municipalty_corp']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_itemname'[0]]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_panchayat_town_ward']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Keezhaiyur']")).click();
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
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Door Number *']")).sendKeys("300A");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text= 'Account Number']")).sendKeys("355401230");
			//sw

			dimension = driver.manage().window().getSize();
			start_x = (int)(dimension.width * 0.5);
			start_y = (int)(dimension.height * 0.9);

			end_x = (int)(dimension.width * 0.2);
			end_y = (int)(dimension.height * 0.2);

			touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//android.widget.EditText[@text= 'Confirm Account Number']")).sendKeys("355401230");
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
			start_y = (int)(dimension.height * 0.8);

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
			Thread.sleep(10000);
			//c year
			//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1982']"));
			driver.findElement(By.xpath("//android.view.View[@content-desc='11 February 1979']")).click();
			//c ok
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.EditText[@text ='Mobile Number *']")).sendKeys("8870872176");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text ='Designation *']")).click();
			Thread.sleep(2000);
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

			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_block_municipalty_corp']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_itemname'[0]]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@resource-id = 'com.yesteam.shg:id/tv_panchayat_town_ward']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text= 'Keezhaiyur']")).click();
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
			start_y = (int)(dimension.height * 0.8);

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

			Thread.sleep(2000);

			//change leaders role with rotational date
			MobileElement back =driver.findElement(By.xpath("//android.widget.TextView[@text ='Back']"));
			back.click();	
			Thread.sleep(4000);
			back.click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("//android.widget.TextView[@text ='Change']")).click();
			Thread.sleep(5000);

			driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.yesteam.shg:id/tv_new_president']")).click();

			//driver.findElement(By.xpath("//android.widget.TextView[@text ='New President']")).click();
			//Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text='VINITHA / GANGA']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.widget.TextView[@text ='President Rotation Date']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//android.view.View[@content-desc='12 February 2022']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
			Thread.sleep(2000);
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
				Thread.sleep(2000);
			}
			for(i=1;i<=2;i++)
			{
				driver.findElement(By.xpath("//android.widget.TextView[@text = 'Next']")).click();
				Thread.sleep(3000);
			}

		}
		catch(Exception ex)
		{
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
		}

		return ;
	}	


	/*	@AfterTest
	public void tearDown() throws Exception
	{
		try
		{

		}
		catch(Exception ex)
		{

		}
	}*/

}
