package com.Craftville.qa.Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


public class BaseTest {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Properties prop;
	
	public BaseTest() {
		try {
		 prop =new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\kavitha\\eclipse-workspace\\Craftsvilla\\src\\main\\java\\com\\Craftville\\qa\\config\\Properties");
			prop.load(ip);
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
	public static void initialization() {
		String browserName= prop.getProperty("browserchrome");
		if(browserName.equalsIgnoreCase("chrome")) {
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\kavitha\\eclipse-workspace\\Craftsvilla\\Driver\\chromedriver_win32\\chromedriver.exe");
	       driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\kavitha\\eclipse-workspace\\Craftsvilla\\Driver\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
	  
	  driver.get(prop.getProperty("url"));	
	  wait = new WebDriverWait(driver,10);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	  driver.manage().deleteAllCookies();
	  
	  
}
	
	
	
}