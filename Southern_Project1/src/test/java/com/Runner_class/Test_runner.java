package com.Runner_class;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature_File", glue = "com.Step_Definitions", monochrome = true, dryRun = false, plugin = {
		"html:target/Report/cucumber.html", "pretty", "json:target/Report/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, publish = true)

public class Test_runner {

}
