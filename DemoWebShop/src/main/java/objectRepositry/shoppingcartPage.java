package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shoppingcartPage extends BasePage {

	public shoppingcartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "termsofservice")
	
	private WebElement termsofservicesRedioButton;

	public WebElement getTermsofservicesRedioButton() {
		return termsofservicesRedioButton;
	}
	
	@FindBy(id = "checkout")
	private WebElement checkOutButton;

	public WebElement getCheckOutButton() {
		return checkOutButton;
	}
	
	@FindBy(xpath = "//div[@class=\"page-title\"]//h1")
	private WebElement Shopping_page_title;

	public WebElement getShopping_page_title() {
		return Shopping_page_title;
	}
	
}
