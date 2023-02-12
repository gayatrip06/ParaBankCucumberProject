package com.framework.commons;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import io.restassured.response.Response;

public class ApiCommons{

	public void verifyStatusCode(Response response, int expCode) {
		int actualCode = response.getStatusCode();
		Assert.assertEquals(actualCode, expCode);
	}

	public void verifyStatusMessage(Response response, String expStatus) {
		String actualStatus = response.getStatusLine();
		Assert.assertTrue(actualStatus.contains(expStatus));
	}

	public void verifyResponseTime(Response response, long expTime) {
		long actualTime = response.getTimeIn(TimeUnit.SECONDS);
		Assert.assertTrue(actualTime <= expTime);
	}

	public void verifyResponseBody(Response response, String key, String expValue) {
		String actualValue = response.getBody().jsonPath().getString(key);
		Assert.assertEquals(actualValue, expValue);
	}

	public void verifyResponseHeaders(Response response, String headerName, String expValue) {
		String actualValue = response.getHeader(headerName);
		Assert.assertEquals(actualValue, expValue);
	}

}
