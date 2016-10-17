package com.bacoffice.backofficeUI_Automation_BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public WebDriver driver;
	//public Logger logger=Logger.getLogger("Google");
	@BeforeTest
	public void thisisTest(){
		System.out.println("this is test");
		
		/*System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

		  driver = new ChromeDriver();*/
		
		driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 // logger.info("opening url");
		driver.navigate().to("myurl");
		//logger.info("url opened");
	}

	
	

}
