package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;
import com.utility.WebDriverListener123;


public class REFERANCEpage extends BASEclass {
	public static String Status;
	public static String testNodes1 = "Testcase 11 - right side panel ref link Validation";
	public static String testcaseDescription1 = "Verify editgenie right side panel, once editgenie Homepage is loaded successfully";
	public static String testNodes2 = "Testcase 12 - right side panel ref citation link Validation";
	public static String testcaseDescription2 = "Verify editgenie right side panel, once editgenie Homepage is loaded successfully";
	public static String category1 = "Regression" ;
	public static String category2 = ("sanity") ;
	public static String category3 = ("dynamic testing") ;
	public static String authors = "Automation testing - anandharaj";
		@FindBy(xpath="//*[@id=\"referencepanel\"]/li/div/p/span ")
		List<WebElement> refcitation;
		@FindBy(xpath="//*[@id=\"referencepanel\"]//li ")
		List<WebElement> reflink;
		 private static ExtentTest test;

	 public  REFERANCEpage() {
			PageFactory.initElements(getDriver(), this);
		}
	   
	
public void reflink() throws Throwable {

	  test = wl.startTestCase(testNodes1, testcaseDescription1);
	  
	  test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on right side panel" );
	 
	  test.assignCategory(category2);
	  test.assignAuthor(authors); 
	  
	  if(reflink.isEmpty()== false) {
		  test.log(com.aventstack.extentreports.Status.INFO,"click on each table link " );
	  for(WebElement wed: reflink) {
			
		if(wed.equals(wed)) {	
			Thread.sleep(8000);
			 
			Actionsclass.click(getDriver(), wed);
			 String dd = Actionsclass.screenShot(getDriver());
			 String gh = "." +dd;
			 //test.addScreenCaptureFromPath(gh);
            test.info(MediaEntityBuilder.createScreenCaptureFromPath(gh).build());
		 Status = "pass";
	  }
		
	}
	  }
	  else {
		  Status = "warning";
			 test.log(com.aventstack.extentreports.Status.WARNING,"ref link is not present in right side panel");
		}
	  System.out.println(Status);
		wl.reportStep(getDriver(), "The page ref link is under verification", Status);  
}
public void reflcitationink() throws Throwable {

			  test = wl.startTestCase(testNodes2, testcaseDescription2);
			  
			  test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
			  test.log(com.aventstack.extentreports.Status.INFO,"click on right side panel" );
			  test.log(com.aventstack.extentreports.Status.INFO,"click on reflink tab" );
			  test.assignCategory(category2);
			  test.assignAuthor(authors); 
			  
			  if(reflink.isEmpty()== false) {
				  test.log(com.aventstack.extentreports.Status.INFO,"click on each  ref citation " );
		for(WebElement wed: refcitation) {
			
			if(wed.equals(wed)) {	
				Thread.sleep(8000);
				
				Actionsclass.click(getDriver(), wed);
				 String dd = Actionsclass.screenShot(getDriver());
				 String gh = "." +dd;
				 //test.addScreenCaptureFromPath(gh);
	            test.info(MediaEntityBuilder.createScreenCaptureFromPath(gh).build());
			 Status = "pass";
		  }
			
		}
			  }
			  else {
				  Status = "warning";
					 test.log(com.aventstack.extentreports.Status.WARNING,"ref citation link is not present in right side panel");
				}
		  System.out.println(Status);
			wl.reportStep(getDriver(), "The page ref citation link is under verification", Status);   
     }
}
