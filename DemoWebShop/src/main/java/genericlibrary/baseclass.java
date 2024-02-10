package genericlibrary;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import objectRepositry.homepage;
import objectRepositry.loginpage;

public class baseclass extends UtilityMethod {
	
	public  WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;
	
	@BeforeSuite
	public void bsuite() {
		report= new ExtentReports("./reports/.report.html");
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void asuite() {
		
		report.flush();
		System.out.println("after suite");
	}
	 
	@BeforeClass
	public void bclass() throws IOException {
		System.out.println("beforeclass");
				
		
		
		//launch browser
		driver= new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		// enter url
		//driver.get("https://demowebshop.tricentis.com/");
		driver.get(FileUtility.getproperty("url"));
		
		initObjects(driver);
	}
		
		
	@BeforeMethod
	public void bmethod(Method method) throws IOException {
		String methodname = method.getName();
		 test=report.startTest(methodname);
		 
		System.out.println("before method");
		 // we can't hardcode
//		
//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys(FileUtility.getproperty("email"));
//		driver.findElement(By.id("Password")).sendKeys(FileUtility.getproperty("password"));
//		driver.findElement(By.cssSelector(".button-1.login-button")).click();
//		
		
		homepage hp=new homepage(driver);
		
		loginpage login = new loginpage(driver);
		
		//click on login link on home page
		hp.getLoginlink().click();
		
		//enter email address
		login.getEmail().sendKeys(FileUtility.getproperty("email"));
		
		//enter password
		login.getPassword().sendKeys(FileUtility.getproperty("password"));
		
		//click on login button on login page
		login.getLogin().click();
			
	}
	
	
	public void amethod() {
		
		report.endTest(test);
		System.out.println("after method");
		//driver.findElement(By.linkText("Log out")).click();
		homepage hp=new homepage(driver);
		
		hp.getLogoutbutton().click();
		
	}

		@AfterClass
		
		public void aclass() {
			System.out.println("after class");
			
			//driver.quit();
		}
	
	
	
}
