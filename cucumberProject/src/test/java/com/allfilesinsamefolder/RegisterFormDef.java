package com.allfilesinsamefolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;


public class RegisterFormDef {

	
	public void loginUrl(){
		System.setProperty("webdriver.chrome.driver", "D:\\Radical2018\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	
	//RegisterFormDef loginUrl;
	@Given("^open register form$")
	public void enterDetails(){
		System.setProperty("webdriver.chrome.driver", "D:\\Radical2018\\chromedriver_win32_B39\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Etisha");
		driver.findElement(By.xpath("input[@placeholder='Last Name']")).sendKeys("Jain");
		}
	
	

}
