package home;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlibrary.UtilityMethod;
import genericlibrary.baseclass;
import objectRepositry.computerPage;
import objectRepositry.homepage;

public class computerTest extends baseclass {

	@Test 
	
	public void computer_001() throws InterruptedException {
		homepage hp=new homepage(driver);
		computerPage cp =new computerPage(driver);
		
		hp.getComputerlink().click();
		
		String title = cp.getComputerTitle().getText();
		
		UtilityMethod.getWebPageScreenshort(driver);
		Assert.assertEquals(title,"Computers");
		
		
		cp.getDesktopimg().click();
		
		
		cp.getClickOnAddtTOcart().click();
		
		cp.getClickOnAddtTOcart().click();
		 Thread.sleep(2000);
		hp.getShoppingLink().click();
		
		String text = cp.getComputerTitle().getText();
		UtilityMethod.getWebPageScreenshort(driver);
		
		Assert.assertEquals(text, "Shopping cart");
		
	}
}
