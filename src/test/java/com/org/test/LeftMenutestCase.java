package com.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.org.base.TestBase;
import com.org.pageobject.LeftMenuPageObject;

public class LeftMenutestCase extends TestBase {
	
	LeftMenuPageObject lmpo = new LeftMenuPageObject();
	
	public void validateseleniumlink() {
		WebElement seleniumlink = driver.findElement(By.linkText("Selenium"));
		seleniumlink.click();
	}
	
	
	public void validateregisterUserlink() {
		WebElement ragisteruserlink = driver.findElement(By.linkText("Register User"));
		ragisteruserlink.click();
	}

	
	public void validatesoapUIlink() {
		WebElement saopuilink = driver.findElement(By.linkText("Soap UI"));
		saopuilink.click();
	}
}
