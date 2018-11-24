package com.multiplestepdeffilesjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SamplestepdefFB {
	
	WebDriver driver;
	@Given("the user is on facebook login Page")
	public void loginpage() throws InterruptedException {
		ParentStepDefs obj= new ParentStepDefs();
		driver= obj.getDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("he enters \"([^\"]*)\" as user name") 
	public void enterUName(String Uname){
		driver.findElement(By.xpath(" ")).sendKeys(Uname);
	}
	
	@When("he enters \"([^\"]*)\" as password") 
	public void enterPwd(String pwd){
		driver.findElement(By.xpath(" ")).sendKeys(pwd);
	}
}
