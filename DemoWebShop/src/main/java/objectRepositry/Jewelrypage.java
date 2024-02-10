package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Jewelrypage extends BasePage {

	public Jewelrypage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//div[@class=\"page-title\"]/h1")
	private WebElement Jewelry_page_title;

	public WebElement getJewelry_page_title() {
		return Jewelry_page_title;
	}
	
	@FindBy(xpath = "//a[.=\"Vintage Style Three Stone Diamond Engagement Ring\"]")
	private WebElement Vintage_Style_Three_Stone_Diamond_Engagement_Ring;

	public WebElement getVintage_Style_Three_Stone_Diamond_Engagement_Ring() {
		return Vintage_Style_Three_Stone_Diamond_Engagement_Ring;
	}
}
