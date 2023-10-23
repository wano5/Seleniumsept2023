package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class infoPage {
	WebDriver driver;
	public infoPage(WebDriver dr) {
		this.driver=dr;
		PageFactory.initElements(driver, this);
	}	
    @FindBy(name="firstName")
    private WebElement fName;
    
    @FindBy(name="lastName")
    private WebElement lName;
    
    @FindBy(name="postalCode")
    private WebElement postcode;
    
    @FindBy(name="continue")
    private WebElement cont;
    
    public void enterdeatails() {
    	fName.sendKeys("warda");
    	lName.sendKeys("shaukat");
    	postcode.sendKeys("12345678");
    	cont.click();
    	
    }
}
