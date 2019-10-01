package tests ;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config01;
import locators.AmazonLoc01;
import testdata.values;
import webdriverAPI.DriverFunctions;

public class AmazonSignupTest extends Config01 {

	DriverFunctions df = new DriverFunctions();
	AmazonLoc01 al = new AmazonLoc01();
	values vl = new values();
	@Test
	public void AzHomepage() {
		String url=	driver.getCurrentUrl();
		System.out.println(url);
	}

	//	@Test(priority=1)
	//	public void Azsignup() {
	//		clickonaccount(al.Account);
	//		clickonsignin(al.signin);
	//		createaccount(al.crtacc);
	//	
	//	}

	@Test
	public void randomclick() {
		//driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/a[2]/span[2]")).click();
		//df.clickonaccount(al.Account);
		//clickonaccount();
		df.clickonaccount();

	}	

	@Test
	public void tittle() {
		String acttittle = 	driver.getTitle();
		System.out.println(acttittle);

	}

	@Test
	public void searchforiPhone() {
		tpiphone();
		clickonsearch();
		srcresult();
		//Assert.assertEquals(df.properres, vl.srciph);

	}

}
