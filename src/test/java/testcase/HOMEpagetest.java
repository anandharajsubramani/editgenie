package testcase;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.base.BASEclass;
import com.dataprovider.Dataproviders;
import com.mystore.actiondriver.Actionsclass;
import com.pageobjects.ADDoptions_in_ABSTRACT;
import com.pageobjects.ADDoptions_in_AUTHORNAME;
import com.pageobjects.ADDoptions_in_refernece;
import com.pageobjects.Homepage;
import com.utility.Log;


public class HOMEpagetest extends BASEclass{

	 private static ExtentTest test;
		public static String Status;
		public static String testCaseName = "editgenie  functionality";
		public static String testDescription = "Once the EditGenie home page is successfully loaded check the all functionality working or not";
		public static String testNodes1 = "Testcase 1 - Title Validation";
		public static String testcaseDescription1 = "Verify ";
		public static String testNodes2 = "Testcase 2 - LOGO Validation";
		public static String testcaseDescription2 = "Verify tracking system logo, once ticketing sytem Homepage is loaded successfully";
		public static String testNodes3 = "Testcase 3 - author name Validation in frot matter area";
		public static String testcaseDescription3 = "Verify tracking system logo, once ticketing sytem Homepage is loaded successfully";
		public static String category1 = "Regression" ;
	    public static String authors = "Automation testing - anandharaj";
		public static String browserName = "chrome";
	 Homepage fed;
	 
	 @FindBy(xpath="//*[@id=\"btn\"]")
	    WebElement   startproofingclick;
	 
	 
	 @Parameters("browser")
	 @BeforeMethod(groups=  {"smoke","sanity","regression"})
	public void setup(String browser) throws Throwable {
		launchbrowser(browser);
	}
	 @BeforeClass
		public void main() throws Throwable {
			  wl.startTestModule(testCaseName, testDescription); 
			 
		}
	@AfterMethod()
	public void teardown() throws Throwable {
		Thread.sleep(1000);
		getDriver().close();	
		  Thread.sleep(3000);
         /// getDriver().quit();
		}

		
/* @Test(dataProviderClass=Dataproviders.class,groups=
  {"smoke","sanity","regression"},priority = 0) 
 public void  logovalidation()throws Throwable { 
	 test = wl.startTestCase(testNodes2,testcaseDescription2); 
          test.assignCategory(category1);
		  test.assignAuthor(authors);
		  test.log(com.aventstack.extentreports.Status.INFO,"navigate to editgenie" );
		  
		  fed = new Homepage(); 
		  fed.home();
		  Thread.sleep(5000);
		  test.log(com.aventstack.extentreports.Status.
		  INFO,"Check whether the logo is there or not" ); 
		  boolean results =fed.validatelogo(); 
		  Thread.sleep(5555); //
		  test.log(com.aventstack.extentreports.Status.INFO,"navigating to tracking system" ); 
		  if (results) {
		 test.log(com.aventstack.extentreports.Status.PASS,"Logo is present "); 
		 Status= "Pass";
		 Log.info("login is success");
		  
		 } 
		  else { 
			  test.log(com.aventstack.extentreports.Status.FAIL," Logo is not present in homepage");
			  Status = "Fail"; 
			  }
		  System.out.println(Status);
		  wl.reportStep(getDriver(), "The page logo is under verification", Status);
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
	test.log(com.aventstack.extentreports.Status.INFO,"navigate to editgenie" );
	test.log(com.aventstack.extentreports.Status.INFO,"verify to the title of the page" );
		test.log(com.aventstack.extentreports.Status.INFO,"actual result is the outcome:"+ " "+ d ); 
		test.log(com.aventstack.extentreports.Status.INFO,"refers to the expected result:"+ " "+ tit );
		test.log(com.aventstack.extentreports.Status.INFO,"compare both results" );
		if (d.equalsIgnoreCase(tit)) {
			test.log(com.aventstack.extentreports.Status.PASS,"Validated page title is valid ");
 			Status = "Pass";
 			Log.info("login is success");
		} 
		else {
			test.log(com.aventstack.extentreports.Status.FAIL,"Validated page title is not valid ");
 			Status = "Fail";
		}
		System.out.println(Status);
 		wl.reportStep(getDriver(), "The page title is under verification", Status);

      }

	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 2)
	public void authorname () throws Throwable {
		 fed = new	Homepage();	
		 fed.home();
		 ADDoptions_in_AUTHORNAME fdh = new ADDoptions_in_AUTHORNAME();
	
		 fdh.addauthorname();
		fdh.addcomment();
		//fdh.addorcid();
	fdh.addfrontnotename();
fdh.editauthorname();
	  
	fdh.addaffiliations();
	fdh.addaffiliation_citiation();
 fdh.addaffiliation_delete();

	}
	 @Test(dataProviderClass=Dataproviders.class,groups=
		  {"smoke","sanity","regression"},priority = 4) 
		  public void reference_area () throws Throwable {
		 
		  fed = new Homepage(); 
		  fed.home(); 
		  System.out.println("fch123"); 
		  //  fed.authortitle(); 
		  System.out.println("fch");
		   ADDoptions_in_refernece hk = fed.reference_area();
		   hk.editreference();
		  }

	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 2)
	public void authorname1 () throws Throwable {
		
		 ADDoptions_in_AUTHORNAME fdh = new ADDoptions_in_AUTHORNAME();
	
		// fdh.addauthorname();
			fdh.addcomment();
		// fdh.addfrontnotename();

	//fdh.addorcid();
	//fdh.editauthorname();
	  
	//fdh.addaffiliations();
	//fdh.addaffiliation_citiation();
	// fdh.addaffiliation_delete();
	
		System.out.println("fch");
		
	}*/
	
	


  @Test(dataProviderClass=Dataproviders.class,groups=
  {"smoke","sanity","regression"},priority = 3) 
  public void abstractarea () throws Throwable {
  fed = new Homepage(); 
  fed.home(); 
  System.out.println("fch123"); 
  //  fed.authortitle(); 
  System.out.println("fch");
  ADDoptions_in_ABSTRACT cx =fed.abstractarea();
  cx.addcomment(); 
  cx.addlink();
  
  }
  
  
 
	
	
	
	
	
	

}