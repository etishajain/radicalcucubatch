package com.MultipleFeatureFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {

	//We will write normal method and write @Given with brackets of string present in given
	
	@Given("^open facebook page$")  // @Given("open facebook page")-----this meane contains text given in bracket
	public void openFacebookPage(){
		System.setProperty("webdriver.chrome.driver", "D:\\Radical2018\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	//(^ ddddd $ means that its strictly to this to seaech)
	//Ifgiven step defination not present in feature file will give error of missing feature details
	
	@When("^I enter Login name$")
	public void i_enter_Login_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^I verify textboox value$")
	public void i_verify_textboox_value() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}
	
}
