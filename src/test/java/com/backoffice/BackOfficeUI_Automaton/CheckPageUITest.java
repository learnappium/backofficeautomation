package com.backoffice.BackOfficeUI_Automaton;

import org.testng.annotations.Test;

import com.bacoffice.backofficeUI_Automation_BaseTest.BaseTest;


public class CheckPageUITest extends BaseTest{

	
	
	@Test
	public void CheckUI(){
		//logger.info("this is test");
		new BackOfficeMain(driver)
		    .clickOnSignin()
		    .enterUsername()
		    .clickOnVerifyButton()
		    .enterPassword()
		    .clickOnSumitButton()
		    .clickOnAllowButton()
		    .letmerest()
		    ;
		    
		
	}
}
