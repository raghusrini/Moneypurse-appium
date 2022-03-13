package demo;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class B {
  @Test
  public void ff() 
  {
	  System.out.println("Seenu");
	 // SwipeFunctions sw1 = new SwipeFunctions();
		//sw1.swipeUp();
	//	SwipeFunctions sw2 =new SwipeFunctions();
		//sw2.swipeDown();
		A sw3 =new A();
		sw3.f();
		
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("Raghu Seenu");
  }

}
