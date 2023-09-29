package testcase;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.base.BASEclass;
import com.pageobjects.Homepage;
import com.pageobjects.LOGIN_EG;
import com.utility.WebDriverListener123;

public class LOGIN_testcase extends BASEclass {
	

		private static ExtentTest test;
		public static String Status;
		public static String testCaseName = "Login Functionality";
		public static String testDescription = "Verify EDITGENIE homepage, once editgenie loginpage is loaded successfully";
		public static String testNodes1 = "Testcase 1 -Verify logging into the Application ";
		public static String testcaseDescription1 = "User should get logged in and taken to the 'logo' of the page  ";
		public static String category1 = "Regression" ;
		public static String authors = "Automation testing - anandharaj";
		public static String browserName = "chrome";
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
	public void teardown()  {
		 getDriver().close();
	//wl.onException(result, getDriver());
   getDriver().quit();
		}
	@Test()
	public void  logineg() throws Throwable {	
		  test = wl.startTestCase(testNodes1, testcaseDescription1);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	LOGIN_EG fed = new	LOGIN_EG();	
	String actual = fed.validateWARNING();
	String except = "The article proof (link) is either currently open in another browser/tab or you have just closed one. "
			+ "Please ensure the article proof (link) is not open in another browser/tab and re-try after 5 minutes.";
	
		test.log(com.aventstack.extentreports.Status.INFO,"actual results:"+ " "+ actual );
		test.log(com.aventstack.extentreports.Status.INFO,"expected results:"+ " "+ except );
	
	
	if (actual.equalsIgnoreCase(except)) {
		test.log(com.aventstack.extentreports.Status.FAIL,"vefiried user should not able to login");
			Status = "Fail";
		
	} else {
		test.log(com.aventstack.extentreports.Status.PASS,"vefiried user should  able to login ");
			Status = "Pass";
	}
	System.out.println(Status);
		wl.reportStep(getDriver(), "title of the page verifing process", Status);
		
	}

}
