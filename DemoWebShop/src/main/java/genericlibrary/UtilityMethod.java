package genericlibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethod {
	 
	static Select selectoption;
	static JavascriptExecutor jse;
	 
	 public static void selectOptionByIndex(WebElement dropdown,int index)
	 {
	  selectoption=new Select(dropdown);
	  
	  selectoption.selectByIndex(index);
	 }
	 
	 public static void selectOptionByVale(WebElement dropdown, String value )
	 {

	  selectoption=new Select(dropdown);
	  selectoption.selectByValue(value);
	  
	 }
	 public static void selectOptionByVisiableTest(WebElement dropdown,String text)
	 {

	  selectoption=new Select(dropdown);
	  selectoption.selectByVisibleText(text);
	 }

	 
	 
	 public static String getWebPageScreenshort(WebDriver driver) {
		 
		String img = FrameWorkConstants.Screenshort_path+getTime()+".png";
		 
		 //step 1
		 
		 TakesScreenshot ts= (TakesScreenshot) driver;
		 
		 //step 2
		 
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		//step3
		
		File perm = new File(img);
		
		try {
			FileHandler.copy(temp, perm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return "."+img;
	 }

	 public static String getTime() {
		 
		return LocalDateTime.now().toString().replace("-", "_").replace(":","_");
	 }
	 
	 
	 public static String getWebElementScreenShort(WebElement element) {
		 
		String img= FrameWorkConstants.Screenshort_path+getTime()+".png";
		 
		 File temp = element.getScreenshotAs(OutputType.FILE);
		 
		 File prem= new File(img);
		 
		 try {
			FileHandler.copy(temp, prem);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "."+img;
		 
	 }
	 
	 //switch by using window title
	 public static void switchToWindowByTitle(WebDriver driver, String title  ) {
		 
		 Set<String> allWindow = driver.getWindowHandles();
		 
		for (String window : allWindow) {
			
			driver.switchTo().window(window);
			if(driver.getTitle().contains(title)) {
				break;
			}
		}
	 }
	 
	 //switch by using window url
	 
 public static void switchToWindowByUrl(WebDriver driver, String Url  ) {
		 
		 Set<String> allWindow = driver.getWindowHandles();
		 
		for (String window : allWindow) {
			
			driver.switchTo().window(window);
			if(driver.getTitle().contains(Url)) {
				break;
			}
		}
	 }
 
 public static void initObjects(WebDriver driver) {
	 jse= (JavascriptExecutor) driver;
 }
 
 
 public void scrollWindwBy( int x, int y) {
	 
	 jse.executeScript("window.scrollBy("+x+","+y+")");
 }
 
 public void scrollWindwTo(int x, int y) {
	 
	 jse.executeScript("window.scrollBy("+x+","+y+")");
 }
 
 
public void scrollIntoView(WebElement element ,boolean elementposition) {
	 
	 jse.executeScript("arguments[0].scrollIntoView("+elementposition+")",element);
 }

public void handleDisableOrHiddentButton(WebElement element) {
	
	jse.executeScript("arguments[0].click();",element);
	
}
 public void handleHiddenOrDisableTextield(WebElement element,String value) {
	 jse.executeScript("arguments[0].value='"+value+"')", element);
} 
 
 public static void acceptAlert(WebDriver driver) {
	
	 driver.switchTo().alert().accept();
}
}  
