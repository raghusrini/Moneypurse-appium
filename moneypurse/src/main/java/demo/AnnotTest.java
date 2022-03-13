package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotTest  {
  @Test
  public void fe()
  {
	  
	  System.out.println("good nyt");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("sl well");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("sl wl22");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("welcome");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("bye");
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
