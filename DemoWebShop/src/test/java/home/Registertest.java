package home;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericlibrary.ExcelUtility;
import genericlibrary.UtilityMethod;
import genericlibrary.baseclass;
import objectRepositry.homepage;
import objectRepositry.registerPage;

public class Registertest extends baseclass {
	
	
	@DataProvider(name = "Register")
	
	public String [][]data() throws EncryptedDocumentException, IOException{
		
		return ExcelUtility.getRowData("Register");
		
	}
	
	
	
	@Test(dataProvider = "Register")
	
	public void Register_001(String firstname, String lastname,String email, String password,String confirmpassword) {
		
		homepage hp= new homepage(driver);
		
		registerPage rg = new registerPage(driver);
		
		// first click on logout
		
		hp.getLogoutbutton().click();
		
		//click on register link
		hp.getRegisterlink().click();
		
		//verify title
		
		String Title = rg.getTitle().getText();
		
		Assert.assertEquals(Title, "Register");
		
		//click on male Radio button
		
		rg.getMaleRadioButton().click();
		
		//enter  first name
		
		rg.getFistName().sendKeys(firstname);
		
		//enter last name
		rg.getLastName().sendKeys(lastname);
		
		//enter email id
		rg.getEmailId().sendKeys(email);
		
		//enter password
		rg.getPassword().sendKeys(password);
		
		//enter confirm password
		rg.getConfirmPassword().sendKeys(confirmpassword);
		
		//click on registerbutton
		
		UtilityMethod.getWebPageScreenshort(driver);
		
		rg.getRegisterButton().click();
		
		
		
		
	}

}
