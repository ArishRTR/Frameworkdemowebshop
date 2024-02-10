package objectRepositry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage extends BasePage{
	
			
		public loginpage(WebDriver driver) {
			
			super(driver);
		}
		
		@FindBy(id = "Email")
		WebElement email;
		
		@FindBy(id = "Password")
		WebElement password;
		
		@FindBy(css = ".button-1.login-button")
		WebElement loginbutton;

		public WebElement getLogin() {
			return loginbutton;
		}

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}
		
	
			
		
	}

