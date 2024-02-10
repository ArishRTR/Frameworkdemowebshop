package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericlibrary.UtilityMethod;
import genericlibrary.baseclass;
import objectRepositry.BookPage;
import objectRepositry.homepage;

public class Bookstest extends baseclass {
	
	@Test
	
	public void book_001() throws InterruptedException {
		homepage hp= new homepage(driver);
		hp.getBooklink().click();
		Thread.sleep(2000);
		BookPage bookpage =new BookPage(driver);
		UtilityMethod.selectOptionByIndex(bookpage.getSortby(), 2);
		Thread.sleep(2000);
		UtilityMethod.selectOptionByIndex(bookpage.getDisplaysize(), 2);
		Thread.sleep(2000);
		UtilityMethod.selectOptionByVisiableTest(bookpage.getView(),"List");
		//UtilityMethod.selectOptionByVale(bookpage.getView(),"https://demowebshop.tricentis.com/books?viewmode=grid");
		
}	
//   @Test
//	 public void book_002() {
//		
//		driver.findElement(By.partialLinkText("Books")).click();
//		 
//		 WebElement sortby = driver.findElement(By.id("products-orderby"));
//		 
//		 Select select = new Select(sortby);
//		 
//		 select.selectByIndex(2);
//		 select.selectByIndex(1);
//		 
//		 WebElement displaysize = driver.findElement(By.id("products-pagesize"));
//		 Select select1 = new Select(displaysize);
//		 
//		
//		 select1.selectByIndex(2); 
//		 
//		 WebElement view_as = driver.findElement(By.id("products-viewmode"));
//		 
//		 Select select2 =new Select(view_as);
//		 
//		 select2.selectByVisibleText("List");
//		 
//		 
//		 
//		 
//	 }
}
