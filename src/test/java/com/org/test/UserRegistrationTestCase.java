package com.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.org.base.TestBase;
import com.org.pageobject.UserRagistrationPageObject;
import com.org.utils.SharedLibrary;

public class UserRegistrationTestCase extends TestBase {
	
	UserRagistrationPageObject urp = new UserRagistrationPageObject();
	
	public void firstname() {
		
		WebElement fname = driver.findElement(By.id("fname"));
		SharedLibrary.entertext(urp.getFname(), "shardha");
	}
	
	public void middlename() {
		WebElement fname = driver.findElement(By.id("mname"));
		SharedLibrary.entertext(urp.getMname(), "chandrashekhar");
	}
	
	public void lastname() {
		WebElement fname = driver.findElement(By.id("lname"));
         SharedLibrary.entertext(urp.getLname(), "sharma");
         }

	
}
