package org.mvn.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeNew3Test {
	@Test
	
	public void practiceSet() {
		
		Reporter.log("hi good afternoon",true);
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
				Reporter.log("----->browser is"+BROWSER+"----->url is "+URL);
		
		
		
		
	}
	
	
	
	

}
