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

public class QUICKLINKpage extends BASEclass {
	public static String Status;
	public static String testCaseName = "editgenie homepage functionality";
	public static String testDescription = "Verify editgenie right side panel once editgenie Homepage is loaded successfully";
	public static String testNodes1 = "Testcase 4 - right side panel quick link Validation";
	public static String testcaseDescription1 = "Verify editgenie right side panel, once editgenie Homepage is loaded successfully";
	public static String category1 = "Regression" ;
	public static String category2 = ("sanity") ;
	public static String category3 = ("dynamic testing") ;
	public static String authors = "Automation testing - anandharaj";
		@FindBy(xpath="//*[@id=\"BookmarkPanel\"]//li")
		List<WebElement> quicklink;
	
		 private static ExtentTest test;

	 public  QUICKLINKpage() {
			PageFactory.initElements(getDriver(), this);
		}
	  
public void quicklink() throws Throwable {
	
	  test = wl.startTestCase(testNodes1, testcaseDescription1);
	  test.assignCategory(category1);
	  test.assignAuthor(authors); 
	  test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on right side panel" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on quick tab" );
	  if(quicklink.isEmpty()== false) {
		  test.log(com.aventstack.extentreports.Status.INFO,"click on each quick link " );
	  for(WebElement wed:quicklink) {
			
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
			test.log(com.aventstack.extentreports.Status.WARNING,"quicklink is not present in right side panel");
		}
	  System.out.println(Status);
		wl.reportStep(getDriver(), "The page quicklink is under verification", Status);   

}
	
}
