package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage {
	WebDriver driver;
	public productsPage(WebDriver dr) {
		this.driver=dr;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(id="item_4_title_link")
	private WebElement backpack;
	@FindBy(xpath="//div[text()='29.99']")
	private WebElement price1;
	@FindBy(id="item_0_title_link")
	private WebElement bikelight;
	@FindBy(xpath="//div[text()='9.99']")
	private WebElement price2;
	
	public void clickbackpack() {
		backpack.click();
	}
	
    public String getprice1() {
    	return price1.getText();
    }
    public void clickbikelight() {
		bikelight.click();
		}
    public String getprice2() {
    	return price2.getText();
    }
}
