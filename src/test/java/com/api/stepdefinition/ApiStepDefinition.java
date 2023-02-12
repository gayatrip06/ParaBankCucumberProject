package com.api.stepdefinition;

import static io.restassured.RestAssured.given;

import java.net.URI;
import java.util.Properties;

import com.api.page.ApiPage;
import com.framework.commons.ApiCommons;
import com.framework.commons.WebCommons;
import com.framework.utilities.ReadProp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiStepDefinition extends ApiPage {
	
	Properties prop = ReadProp.readData("Config.properties");
	String projectName=null;
	Response response = null;
		
	@Given("^Api request is created with (.*) name$")
	public void VerifyCreateRepositoryRequest(String Project) {
		RestAssured.baseURI = prop.getProperty("baseurl");
		String token = "Bearer " + prop.getProperty("token");
		String endpoint = "/user/repos";
		String requestBody = getRequestBodyToCreateNewRepo(Project);

		response= given()
			.contentType("application/json")
			.headers("Authorization",token)
			.body(requestBody)
			.when()
			.post(endpoint);		
}

@Then("^Status code should be (.*)$")
public void status_code_should_be(Integer code) {
   verifyStatusCode(response, code);
}

@Then("^Status message should be (.*)$")
public void status_message_should_be_created(String status) {
   verifyStatusMessage(response, status);
}

@Then("^Response time should be less than or equal to (.*)$")
public void response_time_should_be_less_than_or_equal_to(Integer time) {
    verifyResponseTime(response, time);
}
}
