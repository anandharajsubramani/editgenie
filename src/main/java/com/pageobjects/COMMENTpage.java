package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;

public class COMMENTpage  extends BASEclass{
	public static String Status;
	public static String testNodes1 = "Testcase 3 - right side panel comments Validation";
	public static String testcaseDescription1 = "Verify editgenie right side panel, once editgenie Homepage is loaded successfully";
	public static String category1 = "Regression" ;
	public static String category2 = ("sanity") ;
	public static String category3 = ("dynamic testing") ;
	public static String authors = "Automation testing - anandharaj";

	@FindBy(xpath="//*[@id=\"commentspanel\"]/li")
	List<WebElement> commentslink;
		 private static ExtentTest test;

	 public  COMMENTpage() {
			PageFactory.initElements(getDriver(), this);
		}
	   

public void comments() throws Throwable {

	  test = wl.startTestCase(testNodes1, testcaseDescription1);
	  test.assignCategory(category1);
	  test.assignAuthor(authors); 
	  test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie");
	  test.log(com.aventstack.extentreports.Status.INFO,"click on right side panel");
	  test.log(com.aventstack.extentreports.Status.INFO,"click on comments tab " );
	  if(commentslink.isEmpty()== false) {
			test.log(com.aventstack.extentreports.Status.INFO,"click on each comments " );
	  for(WebElement wed: commentslink) {	
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
			test.log(com.aventstack.extentreports.Status.WARNING,"comments is not present in right side panel");
		}
	  
	 System.out.println(Status);
	wl.reportStep(getDriver(), "The page comments is under verification", Status);
	

}

}
