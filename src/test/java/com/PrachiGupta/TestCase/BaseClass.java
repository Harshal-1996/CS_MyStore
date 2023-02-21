package com.PrachiGupta.TestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.PrachiGupta.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig rc=new ReadConfig();
	
	String url=rc.getbaseUrl();
	String browser=rc.getbrowser();
	String id=rc.getid();
	String password=rc.getpass();
	
	public static WebDriver driver;
	void setup() {
		String browser="chrome";
		
		switch(browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			break;
		default :
		driver=null;	
		break;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		// for logging
		
		
	}
	
}

