package com.application.actions;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.application.elements.LoginPageElements;
import com.framework.utilities.ReadProp;
import com.framework.webdriver.WebDriverClass;

public class LoginPageActions extends LoginPageElements{
	
	Properties prop = ReadProp.readData("Config.properties");
	
	public void launchapplication() {
		driver.get(prop.getProperty("url"));
		wait(2);
	}
	
	public void verifyApplicationIsLaunched() {
		Assert.assertEquals(getPageTitle(), prop.getProperty("title"));
	}
	
	public void verifyLogo() {
		Assert.assertTrue(logo.isDisplayed());
	}
	
	public void verifyCaption() {
		Assert.assertEquals(getElementText(caption), prop.getProperty("caption"));
	}
	
	public void verifyLoginPageHeader() {
		Assert.assertEquals(getElementText(loginPageHeader), prop.getProperty("loginHeader"));
	}
	
	public void enterUsernameAndPassword(String user, String pass) {
		enterInfo(usernameTxtb,user);
		enterInfo(passwordTxtb,pass);
	}
	
	public void clickOnLogin() {
		clickOnElement(loginBtn);
	}
	
	public void VerifyLoginIsSuccessful() {
		waitForElement(accountOverviewPageHeader,10);
	}
	
	public void getRegistrationPage() {
		clickOnElement(registrationLink);
		waitForElement(registrationPageHeader,10);

	}
	
	public void getForgotLoginPage() {
		clickOnElement(forgotLoginLink);
		waitForElement(forgotLoginPageHeader,10);

	}
	
	public static LoginPageActions getLoginPage() {
		return PageFactory.initElements(new WebDriverClass().getDriver(), LoginPageActions.class);
	}

}
