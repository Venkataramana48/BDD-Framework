package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "D:\\Selenium Jars\\Selenium Projects\\LocalBadabing Project with Selenium\\Badabing Project"
				+ "\\FreeCrmBDDFramework\\src\\main\\java\\com\\qa\\features\\freecrm.feature", // the path of the
																								// feature files
		glue = { "com/qa/stepDefinitions" }, // the path of the step definition files
		format = { "pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml" }, // to generate different types of reporting
		monochrome = true, // display the console output in a proper readable format
		strict = true, // it will check if any step is not defined in step definition file
		dryRun = false // to check the mapping is proper between feature file and step definition file
// tags = {"~@SmokeTest" , "~@RegressionTest" , "~@End2End"}
)

public class TestRunner {

}
