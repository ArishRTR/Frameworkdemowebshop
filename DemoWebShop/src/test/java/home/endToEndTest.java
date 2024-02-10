package home;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import genericlibrary.FileUtility;
import genericlibrary.UtilityMethod;
import genericlibrary.baseclass;
import objectRepositry.BookPage;
import objectRepositry.CheckOutpage;
import objectRepositry.Jewelrypage;
import objectRepositry.digitalpage;
import objectRepositry.emailfriendpage;
import objectRepositry.homepage;
import objectRepositry.loginpage;
import objectRepositry.shoppingcartPage;

public class endToEndTest extends baseclass {
	
	@Test
	
	//
	public void endToend_001() throws IOException, InterruptedException {
		
		homepage homepage= new homepage(driver);
		
		BookPage bookpage= new BookPage(driver);
		
		loginpage loginpage =new loginpage(driver);
		
		shoppingcartPage shoppingpage =new shoppingcartPage(driver);
		
		CheckOutpage checkoutpage= new CheckOutpage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homepage.getBooklink().click();
		
		//click on computing and Internet book
		bookpage.getComputer_and_Internet_book().click();
		//verify  the bookpage title 
		Assert.assertEquals(bookpage.getBook_page_Title().getText(),"Books");
		Reporter.log("Books page is displayed",true);
		test.log(LogStatus.INFO,"computet book is added to the cart");
		
		//click on shoppinglink 
		homepage.getShoppingLink().click();
		//verify the shopping cart page is dispalyed or not
		Assert.assertEquals(shoppingpage.getShopping_page_title().getText(), "Shopping cart");
		Reporter.log("Books page is displayed",true);
		
		
		//click on agree button
		shoppingpage.getTermsofservicesRedioButton().click();
		shoppingpage.getCheckOutButton().click();
		
		//click on billing contune button
		checkoutpage.getbilling_Continue_button().click();
		//verify checkout page is displayed or not
		Assert.assertEquals(checkoutpage.getCheck_out_page_title().getText(), "Checkout");
		
		//click on shipping address contiune button
	    checkoutpage.getShippping_address_contiune_button().click();
		
	    //click on shipping method next day air radio button
	    checkoutpage.getShipping_method_next_day_air().click();
		
	    //click on shipping method contiune button
		checkoutpage.getShipping_method_contiune().click();
	

		checkoutpage.getPayment_CheckMoney_Order().click();
		
		checkoutpage.getPayment_contiune_button().click();
		
		checkoutpage.getPayment_info_contiune_button().click();
		
		checkoutpage.getConfirm_order_button().click();
		
		UtilityMethod.getWebPageScreenshort(driver);
		
		checkoutpage.getThank_you_continue_button().click();
		//Assert.assertEquals(checkoutpage.getThank_you_page_title().getText(),"Thank you");
		Reporter.log("Thank you page displayed",true);
		
		
		
	}
	
	@Test
	
	public void endtoend_002() {

		homepage homepage= new homepage(driver);
		
		BookPage bookpage= new BookPage(driver);
		
		loginpage loginpage =new loginpage(driver);
		
		shoppingcartPage shoppingpage =new shoppingcartPage(driver);
		
		CheckOutpage checkoutpage= new CheckOutpage(driver);
		
		digitalpage digitalpage = new digitalpage(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		homepage.getDigital_downloads_link().click();
		
		//verify  the title of the page
		Assert.assertEquals(digitalpage.getDigital_download_title().getText(), "Digital downloads");
		Reporter.log("digital page is displayed",true);
		
		digitalpage.getAlbum_3rd_addTocart().click();
		
		homepage.getShoppingLink().click();
		
		//verify  shopping cart page displaye or not
		Assert.assertEquals(shoppingpage.getShopping_page_title().getText(),"Shopping cart");
		Reporter.log("shopping cart page is displayed",true);
		
		shoppingpage.getTermsofservicesRedioButton().click();
		
		shoppingpage.getCheckOutButton().click();
		
		
		//verify  the check out page is displayed or not
		
		Assert.assertEquals(checkoutpage.getCheck_out_page_title().getText(),"Checkout");
		Reporter.log("check out  page is displayed",true);
		
		checkoutpage.getBilling_Continue_buttton().click();
		
		checkoutpage.getPayment_CheckMoney_Order().click();
		
		checkoutpage.getPayment_contiune_button().click();
		
		checkoutpage.getPayment_info_contiune_button().click();
		
		getWebPageScreenshort(driver);
		
		checkoutpage.getConfirm_order_button().click();
		
		
		// verify page is displayed or not
		Assert.assertEquals(checkoutpage.getThank_you_page_title().getText(), "Thank you");
		
		checkoutpage.getThank_you_continue_button().click();
		
	}
	
	
	@Test
	public void endtoend_003() {
		homepage homepage= new homepage(driver);
		
		BookPage bookpage= new BookPage(driver);
		
		loginpage loginpage =new loginpage(driver);
		
		shoppingcartPage shoppingpage =new shoppingcartPage(driver);
		
		CheckOutpage checkoutpage= new CheckOutpage(driver);
		
		Jewelrypage jewelrypage =new Jewelrypage(driver);
		
		emailfriendpage emailpage= new emailfriendpage(driver);
		
		homepage.getJewelry_link().click();
		//verify jewelry page is displayed or not
		Assert.assertEquals(jewelrypage.getJewelry_page_title().getText(),"Jewelry");
		Reporter.log("jewelry page is displayed",true);
		
		jewelrypage.getVintage_Style_Three_Stone_Diamond_Engagement_Ring().click();
		
		//verify email a friend page is displaye or not 
		Assert.assertEquals(emailpage.getEmail_a_friend().getText(),"Email a friend");
		Reporter.log("email page is displayed",true);
		
		emailpage.getEmail_a_friend().sendKeys("harishkumar10121999@gmail.com");
		
		emailpage.getEnter_your_email_address().sendKeys("arishkumar10121999@gmail.com");
		
		emailpage.getSend_email_button().click();
	}

}
