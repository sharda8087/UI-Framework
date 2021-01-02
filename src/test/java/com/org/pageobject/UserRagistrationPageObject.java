package com.org.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.org.base.TestBase.driver;


public class UserRagistrationPageObject {
	
	private WebElement fname;
	private WebElement mname;
	private WebElement lname;
	private WebElement age;
	
	
	public WebElement getFname() {
		fname = driver.findElement(By.id("fname"));
		return fname;
	}
	
	public WebElement getMname() {
		fname = driver.findElement(By.id("mname"));
		return mname;
	}
	public WebElement getLname() {
		fname = driver.findElement(By.id("lname"));
		return lname;
	}
	public WebElement getAge() {
		return age;
	}
	
}
