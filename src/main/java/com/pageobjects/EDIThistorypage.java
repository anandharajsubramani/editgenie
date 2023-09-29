package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;


public class EDIThistorypage extends BASEclass {
	public static String Status;

	public static String testNodes1 = "Testcase 2 - right side panel edit history Validation";
	public static String testcaseDescription1 = "Verify editgenie right side panel, once editgenie Homepage is loaded successfully";
	public static String category1 = "Regression" ;
	public static String category2 = ("sanity") ;
	public static String category3 = ("dynamic testing") ;
	public static String authors = "Automation testing - anandharaj";

	@FindBy(xpath="//*[@id=\"equationpanel\"]//li")
	List<WebElement> edithistorylink;


	//AUTHOR QUERY COLUMN
		@FindBy(xpath=" //*[@id=\"rdo_eh_Sequential\"]  ")
		WebElement SequentialORDER;
	         
		@FindBy(xpath="//*[@id=\"rdo_eh_Timestamp\"]")
		WebElement TimestampORDER;
		
		 private static ExtentTest test;

	 public  EDIThistorypage() {
			PageFactory.initElements(getDriver(), this);
		}
	   

public void EDITHISTORY() throws Throwable {

	  test = wl.startTestCase(testNodes1, testcaseDescription1);
	  test.assignCategory(category1);
	  test.assignAuthor(authors); 
	  test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie");
	  test.log(com.aventstack.extentreports.Status.INFO,"click on right side panel");
	  test.log(com.aventstack.extentreports.Status.INFO,"click on EDIT HISTORY");
	  test.log(com.aventstack.extentreports.Status.INFO,"click on history tab " );
	  if(edithistorylink.isEmpty()== true) {
		  test.log(com.aventstack.extentreports.Status.INFO,"click on each history " );
	  for(WebElement wed: edithistorylink ) {	
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
	  test.log(com.aventstack.extentreports.Status.INFO,"click on  TimestampORDER " );
	  Actionsclass.click(getDriver(), TimestampORDER); 
		 test.log(com.aventstack.extentreports.Status.INFO,"SequentialORDER" );
		Actionsclass.click(getDriver(), SequentialORDER); 
	  }
	  else {
			Status = "warning";
			test.log(com.aventstack.extentreports.Status.WARNING,"history is not present in right side panel");
		}
	  
	 System.out.println(Status);
	wl.reportStep(getDriver(), "The page history is under verification", Status);
	

}

}
