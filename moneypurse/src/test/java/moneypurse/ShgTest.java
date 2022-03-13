package moneypurse;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ShgTest {
	
	private AndroidDriver<AndroidElement> driver = null;
	
  @Test
  public void shg() throws Exception 
  {
	  ShgProfileTest test01= new ShgProfileTest();
	  driver = test01.groupTest();
	  driver = test01.memberTest();
	  
	  Thread.sleep(5000);
	  ShgTransactionTest test02 = new ShgTransactionTest();
	  
	  driver = test02.receipt();
	  
	  Thread.sleep(5000);

	  ShgBookKeepingReceipt test03 = new ShgBookKeepingReceipt();
	  driver = test03.atCash();
	  driver = test03.atBank();
	  
	  Thread.sleep(5000);

	  ShgBookKeepingPayment test04 = new ShgBookKeepingPayment();
	  driver = test04.expenses();
	  driver = test04.disbursement();
	  driver = test04.groupLoanRepayment();
	  
	  
	  Thread.sleep(5000);

	  ShgBookKeepingContra test05 = new ShgBookKeepingContra();
	  
	  driver = (AndroidDriver<AndroidElement>) test05.deposit();
	  driver = (AndroidDriver<AndroidElement>) test05.withdrawl();
	  driver = (AndroidDriver<AndroidElement>) test05.transfer();
	  
	  Thread.sleep(5000);

	  ShgBookKeepingShgLoan test06 = new ShgBookKeepingShgLoan();
	  
	  driver = (AndroidDriver<AndroidElement>) test06.addNewLoan();
	  
	  Thread.sleep(5000);

	  ShgBookKeepingDisbursement test07 = new ShgBookKeepingDisbursement();
	  driver = test07.disbursement();
	  
	  Thread.sleep(5000);

	  
	  
	  Thread.sleep(5000);

	  ShgReportsTest test09 = new ShgReportsTest();
	  driver = test09.memberReports();
	  driver = test09.groupReports();
	  driver = test09.bankBalance();
	  driver = test09.bankTransactionSummary();
	  driver = test09.financialStatement();
	  
	  Thread.sleep(5000);

	  ShgAuditingTest test10 = new ShgAuditingTest();
	  
	  driver = test10.auditing();
	  
	  Thread.sleep(5000);

	  ShgTrainingTest test11 = new ShgTrainingTest();
	  
	  driver = test11.training();
	  
	  Thread.sleep(5000);

	//  return driver;
  }
}
