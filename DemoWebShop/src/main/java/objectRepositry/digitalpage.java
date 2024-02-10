package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class digitalpage extends BasePage {

	public digitalpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//div[@class=\"page-title\"]/h1")
	private WebElement digital_download_title;

	public WebElement getDigital_download_title() {
		return digital_download_title;
	}

	@FindBy(xpath = "//a[.='3rd Album']/../..//input")
	private WebElement  album_3rd_addTocart;

	public WebElement getAlbum_3rd_addTocart() {
		return album_3rd_addTocart;
	}
}

