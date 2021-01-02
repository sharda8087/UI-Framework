package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.org.base.TestBase.driver;

public class LeftMenuPageObject {

	private WebElement seleniumlink;
	private WebElement ragiteruserlink;
	private WebElement soapuilink;
	
	
	public WebElement getSeleniumlink() {
		seleniumlink = driver.findElement(By.linkText("Selenium"));
		return seleniumlink;
	}
	public WebElement getRagiteruserlink() {
		ragiteruserlink = driver.findElement(By.linkText("Register User"));
		return ragiteruserlink;
	}
	public WebElement getSoapuilink() {
		soapuilink = driver.findElement(By.linkText("Soap UI"));
		return soapuilink;
	}
	
	
	
	
}
