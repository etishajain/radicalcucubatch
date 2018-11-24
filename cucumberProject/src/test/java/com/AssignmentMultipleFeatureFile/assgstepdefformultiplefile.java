package com.AssignmentMultipleFeatureFile;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class assgstepdefformultiplefile {

	WebDriver driver;  // Here i am creating local variable of webdriver type

	@Given("^login for bla bla car$")
	
	public void hitURL() throws InterruptedException{
		assgparentmultiplefiles par=new assgparentmultiplefiles();
		par.launchBrowser();
		driver= par.launchBrowser();
		driver.get("https://www.blablacar.in/login");
		}
	
	@Given("^Enter URL$")
	public void googleURL(){
		driver.get("https://www.google.com/");
	}
	
	
		
	
}
