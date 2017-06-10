package com.sam.seelniumFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MainClass {

	
	@Test
	void firstTest(){
		
		String driverName ="webdriver.gecko.driver";
		String driverPath = "F:\\Tools\\selenium-java-3.3.0\\geckodriver.exe";
		System.setProperty(driverName,driverPath);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		
	}
	
	
}
