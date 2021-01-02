package com.org.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	
	public static ChromeDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C://Users//shardha.sharma//Desktop//RMG_JAVA//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/shardha.sharma/Desktop/RMG_JAVA/WebSite/WebSite/Home.html");
		
	}
	
	
	
	@AfterClass
	public static void closeBrowser() {
		 
		driver.quit();
	}

}
