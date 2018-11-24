package com.AssignmentMultipleFeatureFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assgparentmultiplefiles {
	
	
	public WebDriver launchBrowser() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Radical2018\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
		return driver;
	}

}
