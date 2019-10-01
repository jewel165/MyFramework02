package webdriverAPI ;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import locators.AmazonLoc01;
import testdata.values;

public class DriverFunctions {
	AmazonLoc01 lc= new AmazonLoc01();
	values vl = new values();
	public WebDriver driver;
	
	public String properres;
	//pageload
	public void pageload() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	public void maxscreen() {
		driver.manage().window().maximize();
	}

	public void wttime() {
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	//All Clicks
	public void clickonaccount() {
		driver.findElement(By.xpath(lc.Account)).click();
	}
	public void clickonsignin(String loctor)	{
		driver.findElement(By.xpath(loctor)).click();
	}

	public void createaccount(String loctor) {
		driver.findElement(By.xpath(loctor)).click();

	}
	
	public void clickonsearch() {
		driver.findElement(By.xpath(lc.searchbutton)).click();
	}
//	all type-in
	public void tpiphone() {
		driver.findElement(By.xpath(lc.srcbar)).sendKeys(vl.srciph);
		
	}
	
//	Search ressult field
	public void srcresult() {
	String result01=	driver.findElement(By.xpath(lc.srcressult)).getText();
	String properres = result01.replaceAll("^\"|\"$", "");
	System.out.println(properres);
	}
}

