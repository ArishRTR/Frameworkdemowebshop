package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class computerPage extends BasePage {

	public computerPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//div[@class=\"page-title\"]/h1")
	private WebElement computerTitle;
	
	
	@FindBy(xpath = "//img[@alt=\"Picture for category Desktops\"]/../../..//a")
	private WebElement desktopimg;
	
	
	@FindBy(xpath = "//a[.='Build your own cheap computer']/../../..//input")
	private WebElement clickOnAddtTOcart;
	
	
	@FindBy(id = "add-to-cart-button-72")
	private WebElement addToCart;
	

	public WebElement getAddToCart() {
		return addToCart;
	}


	public WebElement getClickOnAddtTOcart() {
		return clickOnAddtTOcart;
	}


	public WebElement getDesktopimg() {
		return desktopimg;
	}


	public WebElement getComputerTitle() {
		return computerTitle;
	}
	
	
}
