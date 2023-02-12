package com.framework.webdriver;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.framework.utilities.ReadProp;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverClass {

	// All the common methods to handle browser session
	static WebDriver driver = null;
	Properties prop = ReadProp.readData("Config.properties");

	@Before
	public void setupBrowser() {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@After
	public void teardownBrowser() {
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

}
