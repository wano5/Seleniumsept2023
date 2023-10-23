package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class completePage {
      
WebDriver driver;
	
	public completePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	@FindBy(xpath="//h2")
	private WebElement header;
	
	@FindBy(xpath="//button[@data-test='back-to-products']")
	private WebElement backHome;
	
	public void clickbackHome() {
		backHome.click();
	}
	public String getHeaderText() {
		return header.getText();
		
	}
}     

