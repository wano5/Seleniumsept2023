package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage {
	WebDriver driver;
	
	public  checkoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
    @FindBy(id="continue-shopping")
    private WebElement continueshopping;
    
    @FindBy(id="remove-sauce-labs-backpack")
    private WebElement remove;
    @FindBy(id="remove-sauce-labs-bike-light")
    private WebElement remove2;
    @FindBy(id="checkout")
    private WebElement checkout;
    
    public void clickContinueShopping() {
    	continueshopping.click();
    }
    public void clickRemove() {
    	remove.click();
    }	
    public void clickRemove2() {
    	remove2.click();
    }
    	public void clickCheckOut() {
    		checkout.click();
    	}
    
    }

