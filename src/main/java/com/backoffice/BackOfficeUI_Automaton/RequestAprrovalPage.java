package com.backoffice.BackOfficeUI_Automaton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bacoffice.backofficeUI_Automation_BaseTest.BaseTest;

public class RequestAprrovalPage extends BaseTest{
	public WebDriver driver;
	public RequestAprrovalPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(linkText="Allow")
	WebElement allowbuton;
	
	public BackOfficeMain clickOnAllowButton(){
		allowbuton.click();
		return new BackOfficeMain(driver);
	}
}
