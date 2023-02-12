package com.api.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "com.api.stepdefinition",
		"com.api.page","com.framework.commons.ApiCommons" }, plugin = { "pretty", "html:Reports/AutomationReport.html" },tags="@Api")

public class ApiSuite {

}
