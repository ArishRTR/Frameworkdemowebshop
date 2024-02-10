package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends BasePage {
	
	public homepage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Log in")
	 private WebElement loginlink;
	
	
	@FindBy(linkText = "Log out")
	private  WebElement logoutbutton;
	
	@FindBy(linkText ="Books")
	 private WebElement booklink;
	
	@FindBy(linkText = "Computers")
	private WebElement computerlink;
	
	@FindBy(partialLinkText = "Shopping cart")
	private WebElement shoppingLink;
	
	@FindBy(partialLinkText = "Register")
	private WebElement registerlink;
	
	
	@FindBy(xpath = "//a[.=\"14.1-inch Laptop\"]")
	private WebElement laptop14_1_inch;
	
	
	public WebElement getLaptop14_1_inch() {
		return laptop14_1_inch;
	}
	public WebElement getRegisterlink() {
		return registerlink;
	}
	public WebElement getShoppingLink() {
		return shoppingLink;
	}
	public WebElement getComputerlink() {
		return computerlink;
	}
	public WebElement getLoginlink() {
		return loginlink;
	}
	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	
	public WebElement getBooklink() {
		return booklink;
	}
	
	//digital

	@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
	private WebElement Digital_downloads_link;


	public WebElement getDigital_downloads_link() {
		return Digital_downloads_link;
	}
	
	//jewelry
	@FindBy(partialLinkText = "JEWELRY")
	
	private WebElement Jewelry_link;


	public WebElement getJewelry_link() {
		return Jewelry_link;
	}

	 
}
