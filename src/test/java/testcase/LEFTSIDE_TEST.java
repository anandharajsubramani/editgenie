package testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.base.BASEclass;
import com.dataprovider.Dataproviders;
import com.pageobjects.Homepage;
import com.pageobjects.LEFTSIDE;
import com.utility.Log;
import com.utility.WebDriverListener123;

public class LEFTSIDE_TEST  extends BASEclass{
	 private static ExtentTest test;
		public static String Status;
		public static String testCaseName = "editgenie homepage functionality(left side panel)";
		public static String testDescription = "Verify editgenie left side panel once editgenie Homepage is loaded successfully";
		public static String testNodes1 = "Testcase 1 - verify journal in left side panel";
		public static String testcaseDescription1 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes2 = "Testcase 2 - verify articleid in left side panel";
		public static String testcaseDescription2 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes3 = "Testcase 3 - verify volume in left side panel";
		public static String testcaseDescription3 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes4 = "Testcase 4 - verify issue in left side panel";
		public static String testcaseDescription4 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes5 = "Testcase 5 - verify articletype in left side panel";
		public static String testcaseDescription5 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes6 = "Testcase 6 - verify printissn in left side panel";
		public static String testcaseDescription6 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes7 = "Testcase 7 -verify onlineissn in left side panel";
		public static String testcaseDescription7 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes8 = "Testcase 8 - verify articletitle in left side panel";
		public static String testcaseDescription8 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes9 = "Testcase 9 - verify copyrights in left side panel";
		public static String testcaseDescription9 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes10 = "Testcase 10 - verify Received in left side panel";
		public static String testcaseDescription10 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes11= "Testcase 11 - verify Accepted  in left side panel";
		public static String testcaseDescription11 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
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
  getDriver().quit();
		}
	
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 0)
	public void  journal()throws Throwable {	
		  test = wl.startTestCase(testNodes1, testcaseDescription1);
	 test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigate to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.journalvalidation(); 
		    test.log(com.aventstack.extentreports.Status.INFO,"click on left side panel" );
			test.log(com.aventstack.extentreports.Status.INFO,"verify the journal in left side panel" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.WARNING," journal is not present in left side panel");
 			Status = "warning";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS," journal is present in left side panel : " + jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "The page journal is under verification", Status); 
 		}
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 1)
	public void  articlid()throws Throwable {	
		  test = wl.startTestCase(testNodes2, testcaseDescription2);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigate to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.articleidvalidation(); 
	
		 test.log(com.aventstack.extentreports.Status.INFO,"click on left side panel" );
			test.log(com.aventstack.extentreports.Status.INFO,"verify the articleid in left side panel" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.WARNING," articleid is not present in left side panel");
 			Status = "warning";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS," articleid is present in left side panel : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "The page articleid is under verification", Status); 
 		}
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 2)
	public void  volume()throws Throwable {	
		  test = wl.startTestCase(testNodes3, testcaseDescription3);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigate to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.volumevalidation(); 
		
		 test.log(com.aventstack.extentreports.Status.INFO,"click on left side panel" );
			test.log(com.aventstack.extentreports.Status.INFO,"verify the volume in left side panel" );
			  if(jh.length()!= 00 || jh.isEmpty()) { 
			 test.log(com.aventstack.extentreports.Status.WARNING,"volume is not present in left side panel");
 			Status = "warning";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS," volume is present in left side panel ;"+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "The page volume is under verification", Status); 
 		}
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 3)
	public void  issue()throws Throwable {	
		  test = wl.startTestCase(testNodes4, testcaseDescription4);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigate to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.issuevalidation(); 
		 test.log(com.aventstack.extentreports.Status.INFO,"click on left side panel" );
			test.log(com.aventstack.extentreports.Status.INFO,"verify the issue in left side panel" );
			if(jh.length()!=0 || jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.WARNING,"issue is not present in left side panel");
 			Status = "warning";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS," issue is  present in left side panel : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "The page issue is under verification", Status); 
 		}
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 4)
	public void  articletype()throws Throwable {	
		  test = wl.startTestCase(testNodes5, testcaseDescription5);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigate to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.articletypevalidation(); 

		 
		     test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
				test.log(com.aventstack.extentreports.Status.INFO,"verify the articletype in left side panel" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.WARNING," articletype is not present in left side panel");
 			Status = "warning";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS,"articletype is  present in left side panel : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "The page articletype is under verification", Status); 
 		}
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 5)
	public void  printissn()throws Throwable {	
		  test = wl.startTestCase(testNodes6, testcaseDescription6);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigate to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.printissnvalidation(); 
		 test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
			test.log(com.aventstack.extentreports.Status.INFO,"verify the printissn in left side panel" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.WARNING," printissn is not present in left side panel");
 			Status = "warning";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS,"printissn is present in left side panel : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "The page printissn is under verification", Status); 
 		}
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 6)
	public void  onlineissn()throws Throwable {	
		  test = wl.startTestCase(testNodes7, testcaseDescription7);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.onlineissnvalidation(); 
		 test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
			test.log(com.aventstack.extentreports.Status.INFO,"verify the onlineissn in left side panel" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.WARNING,"onlineissn is not present in left side panel");
 			Status = "warning";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS,"onlineissn is  present in left side panel : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "The page onlineissn is under verification", Status); 
 		}
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 7)
	public void  articletitle()throws Throwable {	
		  test = wl.startTestCase(testNodes8, testcaseDescription8);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigate to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.articletitlevalidation(); 
		 test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
			test.log(com.aventstack.extentreports.Status.INFO,"verify the articletitle in left side panel" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.WARNING,"articletitle is not present in left side panel");
 			Status = "warning";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS,"articletitle is present in left side panel : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "The page articletitle is under verification", Status); 
 		}
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 8)
	public void  copyrights()throws Throwable {	
		  test = wl.startTestCase(testNodes9, testcaseDescription9);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigate to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.copyrightsvalidation(); 
		 test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
			test.log(com.aventstack.extentreports.Status.INFO,"verify the copyrights in left side panel" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.WARNING,"copyrights is not present in left side panel");
 			Status = "warning";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS,"copyrights is present in left side panel : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "The page copyrights is under verification", Status); 
 		}
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 9)
	public void receiveddate()throws Throwable {	
		  test = wl.startTestCase(testNodes10, testcaseDescription10);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigate to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	  LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		
	    String jh = hv.receiveddate(); 
	    test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
		test.log(com.aventstack.extentreports.Status.INFO,"verify the receiveddate in left side panel" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.WARNING,"Received date is not present in left side panel");
			Status = "warning";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS,"Received date is  present in left side panel: "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
wl.reportStep(getDriver(), "The page received date is under verification", Status); 

	}
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 10)
	public void accepteddate()throws Throwable {	
		  test = wl.startTestCase(testNodes11, testcaseDescription11);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigate to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	  LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		
	    String jh = hv.accpetedddate(); 
	    test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
		test.log(com.aventstack.extentreports.Status.INFO,"verify the Accepted date in left side panel" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.WARNING,"Accepted date is not present in left side panel");
			Status = "warning";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS,"Accepted date is present in left side panel : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
wl.reportStep(getDriver(), "The page Accepted date is under verification", Status); 

	}
	
	
	
	
}
	

