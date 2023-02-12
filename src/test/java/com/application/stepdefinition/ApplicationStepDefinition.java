package com.application.stepdefinition;

import com.application.actions.ForgotLoginPageActions;
import com.application.actions.LoginPageActions;
import com.application.actions.RegistrationPageActions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicationStepDefinition {
	
	LoginPageActions loginPage;
	ForgotLoginPageActions forgotLoginPage;
	RegistrationPageActions registrationPage;
	
	@Given("User launch the application")
	public void user_launch_the_application() {
		loginPage = LoginPageActions.getLoginPage();
		loginPage.launchapplication();	    
	}

	@Then("Application login page should be displayed")
	public void application_login_page_should_be_displayed() {
		loginPage = LoginPageActions.getLoginPage();
		loginPage.verifyApplicationIsLaunched();
	    
	}

	@Then("Application logo should be displayed")
	public void application_logo_should_be_displayed() {
		loginPage = LoginPageActions.getLoginPage();
		loginPage.verifyLogo();
	    
	}

	@Then("Application caption should be displayed")
	public void application_caption_should_be_displayed() {
		loginPage = LoginPageActions.getLoginPage();
		loginPage.verifyCaption();
	    
	}

	@When("^User enter (.*) and (.*)$")
	public void enterUsernameAndPassword(String user, String pass ) {
		loginPage = LoginPageActions.getLoginPage();
		loginPage.enterUsernameAndPassword(user, pass);	    
	}

	@When("Click on login button")
	public void click_on_login_button() {
		loginPage = LoginPageActions.getLoginPage();
		loginPage.clickOnLogin();
	    
	}

	@Then("Application login should be successful")
	public void application_login_should_be_successful() {	    
		loginPage = LoginPageActions.getLoginPage();
		loginPage.VerifyLoginIsSuccessful();
	}


}
