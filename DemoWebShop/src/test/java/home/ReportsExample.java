package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import genericlibrary.UtilityMethod;
import genericlibrary.baseclass;
import objectRepositry.homepage;

public class ReportsExample extends baseclass {

	ExtentReports report= new ExtentReports("./reports/"+UtilityMethod.getTime()+".html");
	@Test
	public void test() {
		
		ExtentTest test=report.startTest("login test");
		
		WebDriver driver =new ChromeDriver();
		test.log(LogStatus.INFO, "browser is lanch");
		
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "maximized");
		
		driver.get("https://www.google.com");
		test.log(LogStatus.INFO,"navigate to google");
		
		test.log(LogStatus.PASS, "test script pass");
		
		test.log(LogStatus.INFO,test.addScreenCapture(UtilityMethod.getWebPageScreenshort(driver)));
		
		report.endTest(test);
		
		report.flush();
		
		
		
	}

	@Test
	public void test1() {

		ExtentTest test1=report.startTest("login1 test");
		
		WebDriver driver =new ChromeDriver();
		test1.log(LogStatus.INFO, "browser is lanch");
		
		driver.manage().window().maximize();
		test1.log(LogStatus.INFO, "maximized");
		
		driver.get("https://google.com");
		test1.log(LogStatus.INFO,"navigate to google");
		
		test1.log(LogStatus.PASS, "test script fail");
		
		report.endTest(test1);
		
		report.flush();
		
		
	}
	
	@Test
	public void home_001() throws InterruptedException{
		
		
		homepage hp =new homepage(driver);
		scrollWindwBy(0, 1000);
		
		Thread.sleep(3000);
		scrollWindwTo(0, 3000);
		Thread.sleep(3000);
		
		scrollIntoView(hp.getLaptop14_1_inch() ,true);
		Thread.sleep(3000);
		
		scrollIntoView(hp.getLaptop14_1_inch() ,false);
		Thread.sleep(3000);
		
		
	}
	
	
}
