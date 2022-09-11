package org.mvn.testscripts;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeNew1Test {
	@Test
	
	public void practiceNew1Test() {
		
		Reporter.log("hello, had your lunch",true);
		
	}
	 public void practiceNew1Test2() {
		 String URL=System.getProperty("url");
		 String USERNAME=System.getProperty("username");
		 String PASSWORD=System.getProperty("password");
		 String BROWSER = System.getProperty("browser");
		 //hi siva bye 
		 Reporter.log("TEST-->CLASS1");
		 Reporter.log(BROWSER);
		 Reporter.log(PASSWORD);
		 Reporter.log(URL);
		 Reporter.log(USERNAME);
	 }
	
	
}

	

