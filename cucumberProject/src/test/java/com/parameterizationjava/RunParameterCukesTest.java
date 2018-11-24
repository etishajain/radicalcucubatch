package com.parameterizationjava;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) // TO run cucumber automation
//@Cucumber.Options(format = {"pretty", "html:target/cucumber-htmlreport", "json-pretty:target/cucumber-report.json"} )  // Please run feature file present at this location
// and use java code present in below folder
 

@CucumberOptions(features = {"src/test/resources/com/parameterization/", "src/test/java/com/allfilesinsamefolder"},   //This feature file path to be used
					glue={"com/parameterizationjava/","src/test/java/com/allfilesinsamefolder"},   //Use this java file folder java code is called glue code in cucumber
					
					//Glue code- always only one file and keep only one step def file- generally glue code doesnt change
					monochrome = true, //console output in readable format
					//dryRun = true,
					plugin = {"pretty", 
							"html:target/cucumber-htmlreport", 
							"json:target/cucumber-report"+1676+".json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"
							}
					)







public class RunParameterCukesTest {
}