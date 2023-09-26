package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.base.BASEclass;
import com.dataprovider.Dataproviders;
import com.pageobjects.Homepage;

import com.utility.Log;
import com.utility.WebDriverListener123;

public class HOMEpagetest extends BASEclass{
	 WebDriverListener123 wl = new WebDriverListener123();
	 private static ExtentTest test;
		public static String Status;
		public static String testCaseName = "editgenie homepage functionality";
		public static String testDescription = "Verify editgenie title and logo once editgenie Homepage is loaded successfully";
		public static String testNodes1 = "Testcase 1 - Title Validation";
		public static String testcaseDescription1 = "Verify ";
		public static String testNodes2 = "Testcase 3 - LOGO Validation";
		public static String testcaseDescription2 = "Verify tracking system logo, once ticketing sytem Homepage is loaded successfully";
		
		public static String category1 = "Regression" ;
		public static String category2 = ("sanity") ;
		public static String category3 = ("dynamic testing") ;
		public static String authors = "Automation testing - anandharaj";
		public static String browserName = "chrome";
	 Homepage fed;
	
	 @Parameters("browser")
	 @BeforeMethod(groups=  {"smoke","sanity","regression"})
	public void setup(String browser) throws Throwable {
		launchbrowser(browser);
		
	}
	 @BeforeClass
		public void main() {
			  wl.startTestModule(testCaseName, testDescription); 
		}
	
	
	
	@AfterMethod()
	public void teardown() throws Throwable {
		getDriver().close();	
		Thread.sleep(1000);
  getDriver().quit();
		}
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 0)
	public void  logovalidation()throws Throwable {	
		  test = wl.startTestCase(testNodes2, testcaseDescription2);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	 fed = new	Homepage();	
	 fed.home();
	 Thread.sleep(5000);
	 boolean results = fed.validatelogo();
	   Thread.sleep(5555);
	   // test.log(com.aventstack.extentreports.Status.INFO,"navigating to tracking system" );
		if (results) {
			test.log(com.aventstack.extentreports.Status.PASS,"Logo is present ");
 			Status = "Pass";
 			Log.info("login is success");	
			
		} else {
			test.log(com.aventstack.extentreports.Status.FAIL," Logo is not present in homepage");
 			Status = "Fail";
		}
		System.out.println(Status);
		wl.reportStep(getDriver(), "logo checking process", Status);
		}
	
	
	
@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 1)
public void titlevalidation () throws Throwable {
	 test = wl.startTestCase(testNodes1, testcaseDescription1);
	  test.assignCategory(category1);
	 test.assignAuthor(authors);
	 Log.info("verifying if logo is valid");
	 fed = new	Homepage();	
	 fed.home();
	
	String d =fed.gettitleofhomepage();
	
	Thread.sleep(2222);
	System.out.println(d+ "  "+"nnnnbb");
	String tit = "Editgenie";
	Thread.sleep(5555);
	test.log(com.aventstack.extentreports.Status.INFO,"navigating to tracking system" );
	test.log(com.aventstack.extentreports.Status.INFO,"verified to title of the page" );
		test.log(com.aventstack.extentreports.Status.INFO,"actual results:"+ " "+ d );
		test.log(com.aventstack.extentreports.Status.INFO,"expected results:"+ " "+ tit );

		if (d.equalsIgnoreCase(tit)) {
			test.log(com.aventstack.extentreports.Status.PASS,"vefiried page title is valid ");
 			Status = "Pass";
 			Log.info("login is success");
		} 
		else {
			test.log(com.aventstack.extentreports.Status.FAIL," page title  is not valid  ");
 			Status = "Fail";
		}
		System.out.println(Status);
 		wl.reportStep(getDriver(), "title of the page verifing process", Status);
}

}