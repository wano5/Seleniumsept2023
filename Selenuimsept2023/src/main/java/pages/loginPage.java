package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver;
	public loginPage(WebDriver dr) {
		this.driver=dr;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(id="user-name")
	private WebElement username;
	@FindBy(id="password")
	private WebElement pwd;
	@FindBy(id="login-button")
	private WebElement btn;


	public void login() {
		username.sendKeys("standard_user");
		pwd.sendKeys("secret_sauce");
		btn.click();

	}
}