package com.browserfactory.test;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.browserfactory.BrowserFactory;

public class RemoteBrowserTest
{
	private RemoteWebDriver _driver = null;
	
	@AfterMethod
	public void tearDown() throws Exception {
		if(_driver != null) {
			_driver.close();
			_driver.quit();
		}
	}
    
	@Test
	public void RemoteFirefoxCreated() {
		_driver = BrowserFactory.GetRemoteBrowser("firefox");
		Assert.assertEquals(_driver.getClass(), RemoteWebDriver.class);
	}
}
