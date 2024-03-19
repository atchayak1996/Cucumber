package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Kayira\\eclipse-workspace\\Cucumber2Project\\src\\test\\resources\\Login",glue="org.stepdefinition",
dryRun=false,tags="@sanity",
plugin = { "html:C:\\Users\\Kayira\\eclipse-workspace\\Cucumber2Project\\AllRepo\\HtmlReport\\report.html",
		"json:C:\\Users\\Kayira\\eclipse-workspace\\Cucumber2Project\\AllRepo\\JsonReport\\fb.json",
		"junit:C:\\Users\\Kayira\\eclipse-workspace\\Cucumber2Project\\AllRepo\\JunitReport\\login.xml"})
public class TestRunner {
@AfterClass
public static void tc() {
	JvmReport.generateJvmReport("C:\\Users\\Kayira\\eclipse-workspace\\Cucumber2Project\\AllRepo\\JsonReport\\fb.json");

}
}
