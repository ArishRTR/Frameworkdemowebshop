package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage extends BasePage {
	public BookPage(WebDriver driver) {
	super(driver);
	}
	
	@FindBy(id = "products-orderby")
    private	WebElement sortby;
	
	@FindBy(id = "products-pagesize")
	 private WebElement displaysize;
	
	@FindBy(id="products-viewmode")
	
	private WebElement view;
	
	@FindBy(xpath = "//a[.=\"Computing and Internet\"]/../..//input")
	
	private WebElement computer_and_Internet_book;
	
	
	@FindBy(xpath = "//div[@class=\"page-title\"]//h1")
	private WebElement Book_page_Title;

	public WebElement getBook_page_Title() {
		return Book_page_Title;
	}

	public WebElement getComputer_and_Internet_book() {
		return computer_and_Internet_book;
	}

	public WebElement getView() {
		return view;
	}

	public WebElement getDisplaysize() {
		return displaysize;
	}

	public WebElement getSortby() {
		return sortby;
	}

}
