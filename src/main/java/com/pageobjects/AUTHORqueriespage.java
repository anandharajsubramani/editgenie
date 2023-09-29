package com.pageobjects;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;
import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;


public class AUTHORqueriespage extends BASEclass {
	public static String Status;
	public static String testCaseName = "editgenie homepage functionality";
	public static String testDescription = "Verify editgenie right side panel once editgenie Homepage is loaded successfully";
	public static String testNodes1 = "Testcase 1 - right side panel author queries Validation";
	public static String testcaseDescription1 = "Verify editgenie right side panel, once editgenie Homepage is loaded successfully";
	public static String category1 = "Regression" ;
	public static String category2 = ("sanity") ;
	public static String category3 = ("dynamic testing") ;
	public static String authors = "Automation testing - anandharaj";
	
	
	
	
	//AUTHOR QUERY COLUMN
		@FindBy(xpath=" //*[@id=\"authorquerypanel\"]//li ")
		List<WebElement> AUTHORQUERIESBUTTON;
		
		 private static ExtentTest test;

	 public  AUTHORqueriespage() {
			PageFactory.initElements(getDriver(), this);
		}
	   
	
public void authorqueries() throws Throwable {
	
	  test = wl.startTestCase(testNodes1, testcaseDescription1);
	  test.assignCategory(category1);
	  test.assignAuthor(authors); 
	  test.log(com.aventstack.extentreports.Status.INFO,"navigate to editgenie" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on right side panel" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on  author queries tab " );
	
	  if(AUTHORQUERIESBUTTON.isEmpty()== false) {
		  test.log(com.aventstack.extentreports.Status.INFO,"click on each author queries " );
	  for(WebElement wed: AUTHORQUERIESBUTTON ) {	
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
			test.log(com.aventstack.extentreports.Status.WARNING,"authorqueries is not present in right side panel");
		}
	  
	 System.out.println(Status);
	wl.reportStep(getDriver(), "The page authorqueries is under verification", Status);   

}
	
	
}
