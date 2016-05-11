package com.backoffice.BackOfficeUI_Automaton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bacoffice.backofficeUI_Automation_BaseTest.BaseTest;

public class BackOfficeMain extends BaseTest{
	public WebDriver driver;
	public BackOfficeMain(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, BackOfficeMain.class);
		  PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Sign in")
	WebElement signin;

	
	public GenericLoginPage clickOnSignin(){
		//driver.findElement(By.linkText("Sign in")).click();
		//logger.info("clicking on signin");
		signin.click();
		
		return new GenericLoginPage(driver);
	}
	
	public BackOfficeMain letmerest(){
		signin.click();
		
		return this;
	}
	
	
}
