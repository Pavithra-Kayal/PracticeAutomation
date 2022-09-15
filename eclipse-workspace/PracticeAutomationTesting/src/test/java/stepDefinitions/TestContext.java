package stepDefinitions;


import org.openqa.selenium.WebDriver;

import Pages.PageobjectManager;
import Utils.PageObjectUtils;
import driverManager.DriverManager;


public class TestContext {
	WebDriver driver;
    PageobjectManager pageObjectManager;
	PageObjectUtils pageObjectUtils;
	DriverManager driverManager;
	
	
	public TestContext() {
		driverManager = new DriverManager();
		driver = driverManager.getDriver();
		pageObjectManager = new PageobjectManager(driver);
		pageObjectUtils = new PageObjectUtils(driver);
		
	}
			


}