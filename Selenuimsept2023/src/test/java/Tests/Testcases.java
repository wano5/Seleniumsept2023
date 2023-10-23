package Tests;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.checkoutPage;
import pages.completePage;
import pages.infoPage;
import pages.loginPage;
import pages.overveiwPage;
import pages.productsPage;
import pages.productsdetailPage;

public class Testcases {
	WebDriver driver;
	loginPage lp;
	productsPage pp;
	productsdetailPage pdp;
	checkoutPage cp;
	infoPage ip;
	overveiwPage ovp;
	completePage cpm;

	@BeforeMethod
	public void setup() {
		driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		}
	@AfterMethod
	public void done() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
		@Test
		public void shopping() throws InterruptedException {
			lp= new loginPage(driver);
			pp= new productsPage(driver);
			pdp=new productsdetailPage(driver);
			cp= new checkoutPage(driver);
			ip=new infoPage(driver);
		ovp=new overveiwPage(driver);
			cpm=new completePage(driver);
			lp.login();
			String price1=pp.getprice1();
			System.out.println(price1);
			pp.clickbackpack();
			Thread.sleep(2000);
			driver.navigate().back();
			String price2=pp.getprice2();
			System.out.println(price2);
			Thread.sleep(2000);
			pp.clickbikelight();
			Thread.sleep(2000);
			pdp.clickAddToCart();
			Thread.sleep(2000);
			driver.navigate().back();
			pdp.clickBikeLight();
			pdp.clickAddToCart2();
			Thread.sleep(2000);
			pdp.clickCart();
			//cp.clickContinueShopping();
			cp.clickCheckOut();
			ip.enterdeatails();
			ovp.clickFinish();
			String msg=cpm.getHeaderText();
			System.out.println("Greetings:"+ msg);
			Assert.assertEquals(msg, "Thank you for your order!");
			Assert.assertEquals(false, false);
			
			
	}
	}


