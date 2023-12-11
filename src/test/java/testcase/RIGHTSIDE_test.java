package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.base.BASEclass;
import com.dataprovider.Dataproviders;
import com.pageobjects.AUTHORqueriespage;
import com.pageobjects.COMMENTpage;
import com.pageobjects.EDIThistorypage;
import com.pageobjects.EQUATIONpage;
import com.pageobjects.FIGUREpage;
import com.pageobjects.Homepage;
import com.pageobjects.LEFTSIDE;
import com.pageobjects.QUICKLINKpage;
import com.pageobjects.REFERANCEpage;
import com.pageobjects.RIGHTSIDE;
import com.pageobjects.TABLElinkpage;


public class RIGHTSIDE_test extends BASEclass {
       private static ExtentTest test;
		public static String Status;
		public static String testCaseName = "editgenie homepage functionality (right side panel )";
		public static String testDescription = "Verify editgenie right side panel once editgenie Homepage is loaded successfully";
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
		//Thread.sleep(1000);
		 // getDriver().close();	
		 // Thread.sleep(3000);
// getDriver().quit();
		}
	

@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 0)
	public void  authorqueries()throws Throwable {	
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    RIGHTSIDE hv = fed.rightside();
	    Thread.sleep(5000);
		 AUTHORqueriespage jh = hv.authorqueries(); 
		 Thread.sleep(5000);
		 jh.authorqueries();
		 }
	


	/*@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 1)
	public void  edithistory()throws Throwable {	
		 
		  
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    RIGHTSIDE hv = fed.rightside();
	    Thread.sleep(5000);
	     EDIThistorypage jh = hv.edithistory();; 
		 Thread.sleep(5000);
		 jh.EDITHISTORY();
		 }
	

@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 2)
	public void  comments()throws Throwable {	
		 
		  
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    RIGHTSIDE hv = fed.rightside();
	    Thread.sleep(5000);
	   COMMENTpage jh = hv.comments(); 
		 Thread.sleep(5000);
		 jh.comments();
		 }

	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 3)
	public void  quicklink()throws Throwable {	
		 
		  
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    RIGHTSIDE hv = fed.rightside();
	    Thread.sleep(5000);
	   QUICKLINKpage jh = hv.quicklink();; 
		 Thread.sleep(5000);
		 jh.quicklink();;
		 }
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 4)
	public void  equationlink()throws Throwable {	
	
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    RIGHTSIDE hv = fed.rightside();
	    Thread.sleep(5000);
	  EQUATIONpage jh = hv.equation(); 
		 Thread.sleep(5000);
		 jh.equationlink();
		 }
	
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 5)
	public void  equationcitationlink()throws Throwable {	
	
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    RIGHTSIDE hv = fed.rightside();
	    Thread.sleep(5000);
	  EQUATIONpage jh = hv.equation(); 
		 Thread.sleep(5000);
		 jh.equationcitationlink();
		 }
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority =6 )
	public void  figurelink()throws Throwable {	
		 
		  
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    RIGHTSIDE hv = fed.rightside();
	    Thread.sleep(5000);
	 FIGUREpage jh = hv.figure();; 
		 Thread.sleep(5000);
		 jh.figurelink();
		 }
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority =7 )
	public void  figurelink123()throws Throwable {	
		 
		  
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    RIGHTSIDE hv = fed.rightside();
	    Thread.sleep(5000);
	 FIGUREpage jh = hv.figure();; 
		 Thread.sleep(5000);
		 jh.figurelink1();
		 }
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 8)
	public void  tablelink()throws Throwable {	
		 
		  
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    RIGHTSIDE hv = fed.rightside();
	    Thread.sleep(5000);
           TABLElinkpage jh = hv.table();; 
		 Thread.sleep(5000);
		 jh.tablelink();
		 }
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 9)
	public void  tablecitation()throws Throwable {	
		 
		  
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    RIGHTSIDE hv = fed.rightside();
	    Thread.sleep(5000);
           TABLElinkpage jh = hv.table();; 
		 Thread.sleep(5000);
		 jh.tablecitation();
		 }
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 10)
	public void  reflink()throws Throwable {	
		 
		  
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    RIGHTSIDE hv = fed.rightside();
	    Thread.sleep(5000);
           REFERANCEpage dh = hv.ref();
		 Thread.sleep(5000);
		 dh.reflink();
		 }
	
	@Test(dataProviderClass=Dataproviders.class,groups= {"smoke","sanity","regression"},priority = 11)
	public void  reflinkcitation()throws Throwable {	
		 
		  
	 fed = new	Homepage();	
	    fed.home();
	    Thread.sleep(4000);
	    RIGHTSIDE hv = fed.rightside();
	    Thread.sleep(5000);
           REFERANCEpage dh = hv.ref();
		 Thread.sleep(5000);
		 dh.reflcitationink();
		 }*/




}