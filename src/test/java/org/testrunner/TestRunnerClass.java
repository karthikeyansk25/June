package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources",glue = "org\\stepdefinition", monochrome=false, dryRun = false, 
snippets = SnippetType.CAMELCASE)
public class TestRunnerClass {
	
	@AfterClass
	public static void report() {
		Report.createJvmReport("C:\\Users\\Admin\\eclipse-workspace\\cucumber_project\\JsonReport");

	}

}
