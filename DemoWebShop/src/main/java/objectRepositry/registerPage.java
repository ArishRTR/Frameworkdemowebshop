package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlibrary.baseclass;

public class registerPage extends BasePage{
	
	public registerPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	@FindBy(xpath ="//div[@class=\"page-title\"]//h1")
	private WebElement title;
	
	
	
	public WebElement getTitle() {
		return title;
	}

	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	
	@FindBy(id="gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(id = "FirstName")
	private WebElement fistName;
	
	@FindBy(id="LastName")
	private WebElement lastName;
	
	@FindBy(id = "Email")
	private WebElement emailId;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFistName() {
		return fistName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

}
