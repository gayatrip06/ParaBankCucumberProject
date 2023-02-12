package com.application.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "com.application.stepdefinition",
		"com.framework.webdriver" }, plugin = { "pretty", "html:Reports/AutomationReport.html" },tags="@Regression or @Sanity")

public class TestSuite {

}
