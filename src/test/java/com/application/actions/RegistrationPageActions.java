package com.application.actions;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.application.elements.RegistrationPageElements;
import com.framework.webdriver.WebDriverClass;

public class RegistrationPageActions extends RegistrationPageElements{
	
	public void verifyRegistrationPageHeader() {
		Assert.assertEquals(getElementText(title),"Signing up is easy!" );
	}

	public static RegistrationPageActions getRegisterPage() {
		return PageFactory.initElements(new WebDriverClass().getDriver(), RegistrationPageActions.class);
	}

}
