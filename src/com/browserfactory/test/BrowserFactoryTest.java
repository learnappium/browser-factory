package com.browserfactory.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.browserfactory.BrowserFactory;

public class BrowserFactoryTest {
	private WebDriver _driver;

	@BeforeMethod
	public void setUp() throws Exception {
	}

	@AfterMethod
	public void tearDown() throws Exception {
		if(_driver != null) {
			_driver.close();
			_driver.quit();
		}
	}

	@Test
	public void test() {
		_driver = BrowserFactory.GetBrowser("FireFox");
		Assert.assertEquals(FirefoxDriver.class, _driver.getClass());
	}
}
