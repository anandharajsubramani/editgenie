package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;


public class EQUATIONpage extends BASEclass{
	public static String Status;
	public static ExtentTest test;
	public static String testNodes1 = "Testcase 5 - right side panel equation link Validation";
	public static String testcaseDescription1 = "Verify editgenie right side panel, once editgenie Homepage is loaded successfully";
	public static String testNodes2 = "Testcase 6 - right side panel equation citation link Validation";
	public static String testcaseDescription2 = "Verify editgenie right side panel, once editgenie Homepage is loaded successfully";
	public static String category1 = "Regression" ;
	public static String category2 = ("sanity") ;
	public static String category3 = ("dynamic testing") ;
	public static String authors = "Automation testing - anandharaj";

	
	
	
	
	@FindBy(xpath="//*[@id=\"equationpanel\"]//li")
		List<WebElement> equationlink;

		@FindBy(xpath="//*[@id=\"equationpanel\"]/li/div/p/span")
		List<WebElement> equationcitation;
		


	 public  EQUATIONpage() {
			PageFactory.initElements(getDriver(), this);
			
	
		}
	

public void equationlink() throws Throwable {
	 test = wl.startTestCase(testNodes1, testcaseDescription1);
	 test.assignCategory(category1);
	  test.assignAuthor(authors); 
	  test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on right side panel" );
	 
	  if(equationlink.isEmpty()== false) {
		  test.log(com.aventstack.extentreports.Status.INFO,"click on each equation link " );
		  for(WebElement wed: equationlink) {
				
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
			 test.log(com.aventstack.extentreports.Status.WARNING,"equationlink is not present in right side panel");

	  }
	  
		  
	  System.out.println(Status);
		wl.reportStep(getDriver(), "The page equation link is under verification", Status);  
}
public void equationcitationlink() throws Throwable {
	 test = wl.startTestCase(testNodes2, testcaseDescription2);
	 test.assignCategory(category1);
	  test.assignAuthor(authors); 
	  test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on right side panel" );
		  test.log(com.aventstack.extentreports.Status.INFO,"click on  equation tab" );	
		  if(equationcitation.isEmpty()== false) { 
				test.log(com.aventstack.extentreports.Status.INFO,"click on each equation citation " );	
        for(WebElement wed: equationcitation) {
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
				 test.log(com.aventstack.extentreports.Status.WARNING,"equation citation link is not present in right side panel");
	  	  }

  	  System.out.println(Status);
  		wl.reportStep(getDriver(), "The page equation citation link is under verification", Status);  

	

}
	
}
