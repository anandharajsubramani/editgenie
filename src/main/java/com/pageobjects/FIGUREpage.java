package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;


public class FIGUREpage extends BASEclass  {
	public static String Status;
	
	public static String testNodes1 = "Testcase 7 - right side panel figure link Validation";
	public static String testcaseDescription1 = "Verify editgenie right side panel, once editgenie Homepage is loaded successfully";
	public static String testNodes2 = "Testcase 8 - right side panel figure citation link Validation";
	public static String testcaseDescription2 = "Verify editgenie right side panel, once editgenie Homepage is loaded successfully";
	public static String category1 = "Regression" ;
	public static String category2 = ("sanity") ;
	public static String category3 = ("dynamic testing") ;
	public static String authors = "Automation testing - anandharaj";
		@FindBy(xpath="//*[@id=\"imagespanel\"]/li/div/p/span ")
		List<WebElement> figurecitation;
		@FindBy(xpath="//*[@id=\"imagespanel\"]/li")
		List<WebElement> figurelink;
		 private static ExtentTest test;

	 public  FIGUREpage() {
			PageFactory.initElements(getDriver(), this);
		}
	   
	
public void figurelink() throws Throwable {

	  test = wl.startTestCase(testNodes1, testcaseDescription1);
	  
	  test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on right side panel" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on each figure link " );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on  figure tab link " );
	  test.assignCategory(category2);
	  test.assignAuthor(authors); 
	  if(figurelink.isEmpty()== false) {
		  test.log(com.aventstack.extentreports.Status.INFO,"click on each figure link " );
	  for(WebElement wed: figurelink) {	
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
			 test.log(com.aventstack.extentreports.Status.WARNING,"figure link is not present in right side panel");
	 }
	  System.out.println(Status);
		wl.reportStep(getDriver(), "The page figure link is under verification", Status);   

	  }
public void figurelink1() throws Throwable {

	  test = wl.startTestCase(testNodes2, testcaseDescription2);
	  
	  test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on right side panel" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on figure tab link " );
	  test.assignCategory(category2);
	  test.assignAuthor(authors); 	
		if(figurecitation.isEmpty()== false) {
			 test.log(com.aventstack.extentreports.Status.INFO,"click on each figure citation link " );
		for(WebElement wed: figurecitation) {
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
			 test.log(com.aventstack.extentreports.Status.WARNING,"figure citation is not present in right side panel");
		}
		  System.out.println(Status);
			wl.reportStep(getDriver(), "The page figure citation is under verification", Status);   

}
}
