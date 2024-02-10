package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class emailfriendpage extends BasePage {

	public emailfriendpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//div[@class=\"page-title\"]/h1")
	private WebElement email_a_friend;

	public WebElement getEmail_a_friend() {
		return email_a_friend;
	}
	
	@FindBy(id = "FriendEmail")
	private WebElement Enter_friend_email;
	
	@FindBy(id="YourEmailAddress")
	private WebElement Enter_your_email_address;

	public WebElement getEnter_friend_email() {
		return Enter_friend_email;
	}

	public WebElement getEnter_your_email_address() {
		return Enter_your_email_address;
	}
	
	@FindBy(name = "send-email")
	private WebElement Send_email_button;

	public WebElement getSend_email_button() {
		return Send_email_button;
	}
}
