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

public class journal_tst extends BASEclass {
	 private static ExtentTest test;
		public static String Status;
		public static String testCaseName = "editgenie homepage functionality";
		public static String testDescription = "Once the EditGenie home page is successfully loaded check the EditGenie title and logo";
		public static String testNodes1 = "Testcase 1 - Title Validation";
		public static String testcaseDescription1 = "Verify ";
		public static String testNodes2 = "Testcase 2 - LOGO Validation";
		public static String testcaseDescription2 = "Verify tracking system logo, once ticketing sytem Homepage is loaded successfully";
		public static String category1 = "Regression" ;
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
		 test.log(com.aventstack.extentreports.Status.INFO,"navigate to editgenie" );
		 
	 fed = new	Homepage();	
	 fed.home();

	 Thread.sleep(5000);
	 test.log(com.aventstack.extentreports.Status.INFO,"Check whether the logo is there or not" );
	 String results = fed.journal();
	 System.out.println("gscajh");
	 System.out.println(results);
	   Thread.sleep(5555);
	   // test.log(com.aventstack.extentreports.Status.INFO,"navigating to tracking system" );
/*	if (results) {
			test.log(com.aventstack.extentreports.Status.PASS,"Logo is present ");
			Status = "Pass";
			Log.info("login is success");	
			
		} else {
			test.log(com.aventstack.extentreports.Status.FAIL," Logo is not present in homepage");
			Status = "Fail";
		}
		System.out.println(Status);
		wl.reportStep(getDriver(), "The page logo is under verification", Status);*/
		}


}