package moneypurse;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestApplication 
{
	AndroidDriver<AndroidElement> driver = null;
	int i;
	

	
	
	@Test
	public void testApp() throws Exception
	{
		App01 start =new App01();
		start.openApp();
		
		LoginTest log = new LoginTest();
		log.openMoneyPurse();

		
		ShgOnBoardTest shg = new ShgOnBoardTest();
		shg.createShgGroup();
		System.out.println("Group details added successfully");



		ShgOnBoardTest01 memberprofile = new ShgOnBoardTest01();
		memberprofile.createMemberDetails();
		System.out.println("Members details added successfully");



		ShgOnBoardTest02 loan = new ShgOnBoardTest02();
		loan.shgLoan();
		System.out.println("loan disbursed successfuly");



		ShgOnBoardTest03 memberfin = new ShgOnBoardTest03();
		memberfin.membersFinancial();
		System.out.println("Member savings and outstanding added successfully");


		ShgOnBoardTest04 bankbal = new ShgOnBoardTest04();
		bankbal.bankBalance();
		System.out.println(" Bank balance added successfully");


		ShgOnBoardTest05 balsheet = new ShgOnBoardTest05();
		balsheet.balanceSheet();
		System.out.println("Assets and Liabilities are equal");
		System.out.println(" Successfully onboarded ");

	}
	
	
	@AfterTest
	public void tearDown() 
	{
		try
		{
			System.out.println("Test case passed");
			// driver.closeApp();
		}
		catch(Exception ex)
		{
			//  driver.quit();
		}



	}
}