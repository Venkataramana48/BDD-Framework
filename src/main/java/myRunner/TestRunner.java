package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "D:\\Selenium Jars\\Selenium Projects\\LocalBadabing Project with Selenium\\Badabing Project"
				+ "\\FreeCrmBDDFramework\\src\\main\\java\\Features\\taggedhooks.feature", //the path of the feature files
		glue = {"stepDefinitions"}, //the path of the step definition files
		format={"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false //to check the mapping is proper between feature file and step definition file
		//tags = {"~@SmokeTest" , "~@RegressionTest" , "~@End2End"}
		)


 
public class TestRunner {

}

//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest