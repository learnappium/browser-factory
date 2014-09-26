package com.browserfactory;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * @author Seed
 *
 */
public class BrowserFactory {
	
	public static WebDriver GetBrowser(String browserName){
		if(browserName.equals("Chrome"))
			return getChromeInstance();
		if(browserName.equals("Safari"))
			return getSafariInstance();
		if(browserName.equals("HtmlUnit"))
			return getHtmlUnitInstance();
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
	
	private static SafariDriver getSafariInstance() {
		return new SafariDriver();
	}
	
	private static HtmlUnitDriver getHtmlUnitInstance() {
		return new HtmlUnitDriver();
	}
}
