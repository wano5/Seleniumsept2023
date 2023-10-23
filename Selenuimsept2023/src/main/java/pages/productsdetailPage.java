package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsdetailPage {
	WebDriver driver;
	public productsdetailPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
}
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	private WebElement addToCart;
	 
	@FindBy(className="inventory_item_name")
	  private WebElement clickBikeLight;
	
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	private WebElement addToCart2;

	@FindBy(name="remove-sauce-labs-backpack")
	private WebElement remove1;

	@FindBy(name="remove-sauce-labs-bike-light")
	private WebElement remove2;

	@FindBy(className="shopping_cart_link")
	private WebElement cart;

	public void clickAddToCart() {
		
		addToCart.click();
	}
	public void clickBikeLight() {
		clickBikeLight.click();
	}

		public void clickAddToCart2() {
			addToCart2.click();
		}

	                                 
	public void removeItem(){
		remove1.click();
	}

	public void clickCart() {
		cart.click();
	}
	}