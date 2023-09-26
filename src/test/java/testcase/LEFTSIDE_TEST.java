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
	 WebDriverListener123 wl = new WebDriverListener123();
	 private static ExtentTest test;
		public static String Status;
		public static String testCaseName = "editgenie homepage functionality";
		public static String testDescription = "Verify editgenie left side panel once editgenie Homepage is loaded successfully";
		public static String testNodes1 = "Testcase 1 - Leftside panel journal Validation";
		public static String testcaseDescription1 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes2 = "Testcase 2 - Leftside panel articleid Validation";
		public static String testcaseDescription2 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes3 = "Testcase 3 - Leftside panel volume Validation";
		public static String testcaseDescription3 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes4 = "Testcase 4 - Leftside panel issue Validation";
		public static String testcaseDescription4 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes5 = "Testcase 5 - Leftside panel articletype Validation";
		public static String testcaseDescription5 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes6 = "Testcase 6 - Leftside panel printissn Validation";
		public static String testcaseDescription6 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes7 = "Testcase 7 - Leftside panel onlineissn Validation";
		public static String testcaseDescription7 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes8 = "Testcase 8 - Leftside panel articletitle Validation";
		public static String testcaseDescription8 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes9 = "Testcase 9 - Leftside panel copyrights Validation";
		public static String testcaseDescription9 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes10 = "Testcase 10 - Leftside panel received Validation";
		public static String testcaseDescription10 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes11= "Testcase 11 - Leftside panel accepted Validation";
		public static String testcaseDescription11 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		
		/*public static String testNodes12 = "Testcase 12 - Leftside panel volume Validation";
		public static String testcaseDescription12 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes13 = "Testcase 13 - Leftside panel volume Validation";
		public static String testcaseDescription13 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";
		public static String testNodes14 = "Testcase 14 - Leftside panel volume Validation";
		public static String testcaseDescription14 = "Verify editgenie left side panel, once editgenie Homepage is loaded successfully";*/
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
	
	
/*	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 0)
	public void  journal()throws Throwable {	
		  test = wl.startTestCase(testNodes1, testcaseDescription1);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.journalvalidation(); 
		 System.out.println("fdhfh"+ " "+jh);
		 
		     test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
				test.log(com.aventstack.extentreports.Status.INFO,"verified to journal of the page" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.FAIL," journal is not present in journal column");
 			Status = "Fail";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS," journal is present in journal column : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "journal checking process", Status); 
 		}
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 1)
	public void  articlid()throws Throwable {	
		  test = wl.startTestCase(testNodes2, testcaseDescription2);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.articleidvalidation(); 
		 System.out.println("fdhfh"+ " "+jh);
		 
		     test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
				test.log(com.aventstack.extentreports.Status.INFO,"verified to articleid of the page" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.FAIL," articleid is not present in journal column");
 			Status = "Fail";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS," articleid is present in journal column : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "articleid checking process", Status); 
 		}
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 2)
	public void  volume()throws Throwable {	
		  test = wl.startTestCase(testNodes3, testcaseDescription3);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.volumevalidation(); 
		 System.out.println("fdhfh"+ " "+jh);
		 
		     test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
				test.log(com.aventstack.extentreports.Status.INFO,"verified to volume of the page" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.FAIL," volume is not present in journal column");
 			Status = "Fail";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS," volume is present in journal column : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "volume checking process", Status); 
 		}
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 3)
	public void  issue()throws Throwable {	
		  test = wl.startTestCase(testNodes4, testcaseDescription4);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.issuevalidation(); 
		 System.out.println("fdhfh"+ " "+jh);
		 
		     test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
				test.log(com.aventstack.extentreports.Status.INFO,"verified to issue of the page" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.FAIL," issue is not present in journal column");
 			Status = "Fail";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS," issue is present in journal column : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "issue checking process", Status); 
 		}
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 4)
	public void  articletype()throws Throwable {	
		  test = wl.startTestCase(testNodes5, testcaseDescription5);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.articletypevalidation(); 
		 System.out.println("fdhfh"+ " "+jh);
		 
		     test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
				test.log(com.aventstack.extentreports.Status.INFO,"verified to articletype of the page" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.FAIL," articletype is not present in articletype column");
 			Status = "Fail";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS,"articletype is present in articletype column : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "articletype checking process", Status); 
 		}
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 5)
	public void  printissn()throws Throwable {	
		  test = wl.startTestCase(testNodes6, testcaseDescription6);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.printissnvalidation(); 
		 System.out.println("fdhfh"+ " "+jh);
		 
		     test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
				test.log(com.aventstack.extentreports.Status.INFO,"verified to printissn of the page" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.FAIL," printissn is not present in issn column");
 			Status = "Fail";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS,"printissn is present in issn column : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "printissn checking process", Status); 
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
		 System.out.println("fdhfh"+ " "+jh);
		 
		     test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
				test.log(com.aventstack.extentreports.Status.INFO,"verified to onlineissn of the page" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.FAIL," onlineissn is not present in issn column");
 			Status = "Fail";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS,"onlineissn is present in issn column : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "onlineissn checking process", Status); 
 		}
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 7)
	public void  articletitle()throws Throwable {	
		  test = wl.startTestCase(testNodes8, testcaseDescription8);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.articletitlevalidation(); 
		 System.out.println("fdhfh"+ " "+jh);
		 
		     test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
				test.log(com.aventstack.extentreports.Status.INFO,"verified to articletitle of the page" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.FAIL,"articletitle is not present in articletitle column");
 			Status = "Fail";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS,"articletitle is present in articletitle column : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "articletitle checking process", Status); 
 		}
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 8)
	public void  copyrights()throws Throwable {	
		  test = wl.startTestCase(testNodes9, testcaseDescription9);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		 String jh = hv.copyrightsvalidation(); 
		 System.out.println("fdhfh"+ " "+jh);
		 
		     test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
				test.log(com.aventstack.extentreports.Status.INFO,"verified to copyrights of the page" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.FAIL,"copyrights is not present in copyrights column");
 			Status = "Fail";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS,"copyrights is present in copyrights column : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
 		wl.reportStep(getDriver(), "copyrights checking process", Status); 
 		}*/
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 9)
	public void receiveddate()throws Throwable {	
		  test = wl.startTestCase(testNodes10, testcaseDescription10);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	  LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		
	    String jh = hv.receiveddate(); 
		 System.out.println("fdhfh"+ " "+jh);
		 
		     test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
				test.log(com.aventstack.extentreports.Status.INFO,"verified to receiveddate of the page" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.FAIL,"receiveddate is not present in history column");
			Status = "Fail";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS,"receiveddate is present in history column : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
wl.reportStep(getDriver(), "receiveddate checking process", Status); 

	}
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 10)
	public void accepteddate()throws Throwable {	
		  test = wl.startTestCase(testNodes11, testcaseDescription11);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	  LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		
	    String jh = hv.accpetedddate(); 
		 System.out.println("fdhfh"+ " "+jh);
		 
		     test.log(com.aventstack.extentreports.Status.INFO,"click on lift side panel" );
				test.log(com.aventstack.extentreports.Status.INFO,"verified to accpetedddate of the page" );
		 if(jh.isEmpty()){ 
			 test.log(com.aventstack.extentreports.Status.FAIL,"accpetedddate is not present in history column");
			Status = "Fail";
			 } 
		 else {
			 test.log(com.aventstack.extentreports.Status.PASS,"accpetedddate is present in history column : "+ jh);
	 			Status = "Pass";
		}
		 System.out.println(Status);
wl.reportStep(getDriver(), "accpetedddate checking process", Status); 

	}
	
	
	
	
}
	

	
	
	/*@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 0)
	public void  logovalidation1()throws Throwable {	
		  test = wl.startTestCase(testNodes2, testcaseDescription2);
		  test.assignCategory(category1);
		 test.assignAuthor(authors);
		 test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    LEFTSIDE hv = fed.leftside();
	    Thread.sleep(5000);
		/*
		 * String jh = hv.journalvalidation(); System.out.println("fdhfh"+ " "+jh); if
		 * (jh.isEmpty()) { System.out.println("fail"); } else {
		 * 
		 * System.out.println("pass" + "text is present "+ jh);
		 * 
		 * }
		 

	String m = hv.accpetedddate();	
	System.out.println(m);
	if (m.isEmpty())
	{ 
		System.out.println("fail"); 
	} else {
	  
	  System.out.println("pass" + "text is present "+ m);
	  
	  }
}
*/


