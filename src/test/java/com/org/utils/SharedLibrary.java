package com.org.utils;

import org.openqa.selenium.WebElement;

public class SharedLibrary {

	public static void entertext(WebElement elem, String text) {
		elem.sendKeys(text);
	}
	
	public void click(WebElement elem) {
		elem.click();
	}
	
	
	
}
