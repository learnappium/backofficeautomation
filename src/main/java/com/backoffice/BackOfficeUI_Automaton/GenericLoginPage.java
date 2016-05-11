package com.backoffice.BackOfficeUI_Automaton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bacoffice.backofficeUI_Automation_BaseTest.BaseTest;

public class GenericLoginPage extends BaseTest{
	public WebDriver driver;
	public GenericLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="UserName")
	WebElement username;
	
	@FindBy(name="Password")
	WebElement password;	
	
	@FindBy(id="verify_user_btn")
	WebElement verifyButton;
	
	@FindBy(id="btnSubmit")
	WebElement submitButton;
	
	public GenericLoginPage enterUsername(){
		username.sendKeys("superadmin@adsk.com");   
		return this;
	}
	
	public GenericLoginPage clickOnVerifyButton(){
		verifyButton.click();
		return this;
	}
	
	public GenericLoginPage enterPassword(){
		password.sendKeys("Aut0d#sk");   
		return this;
	}
	
	public RequestAprrovalPage clickOnSumitButton(){
		submitButton.click();
		return new RequestAprrovalPage(driver);

}
}
