package com.application.actions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.application.elements.ForgotLoginPageElements;
import com.framework.webdriver.WebDriverClass;

public class ForgotLoginPageActions extends ForgotLoginPageElements{

	public void verifyForgotLoginPageHeader() {
		Assert.assertEquals(getElementText(forgotPassPageTitle),"Customer Lookup");
	}
	
	public static ForgotLoginPageActions getForgotLoginPage() {
		return PageFactory.initElements(new WebDriverClass().getDriver(), ForgotLoginPageActions.class);
	}

}
