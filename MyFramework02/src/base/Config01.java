package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import webdriverAPI.DriverFunctions;

public class Config01 extends DriverFunctions {
	
	
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\mdala\\\\eclipse-workspace\\\\DEC_2018\\\\drivers\\\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://wwww.amazon.com");
		pageload();
		maxscreen();
		wttime();
	}	
	
		
	@AfterMethod
	public void closebroswer() {
		driver.quit();
	}
}
