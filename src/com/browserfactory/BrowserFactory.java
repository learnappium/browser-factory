package com.browserfactory;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Seed
 *
 */
public class BrowserFactory {
	
	public static WebDriver GetBrowser(String browserName){
		if(browserName.equals("Chrome"))
			return getChromeInstance();
		else
			return getFFInstance();
	}
	
	private static FirefoxDriver getFFInstance() {
		return new FirefoxDriver();
	}
	
	private static ChromeDriver getChromeInstance() {
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver");
		return new ChromeDriver();
	}
}
