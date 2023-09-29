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


public class TABLElinkpage extends BASEclass {
	public static String Status;
	
	public static String testNodes1 = "Testcase 9 - right side panel table link Validation";
	public static String testcaseDescription1 = "Verify editgenie right side panel, once editgenie Homepage is loaded successfully";

	public static String testNodes2 = "Testcase 10 - right side panel table citation link Validation";
	public static String testcaseDescription2 = "Verify editgenie right side panel, once editgenie Homepage is loaded successfully";
		@FindBy(xpath="//*[@id=\"tablepanel\"]/li/div/p/span ")
		List<WebElement> tablecitation;
		@FindBy(xpath="//*[@id=\"tablepanel\"]/li")
		List<WebElement> tablelink;
		 private static ExtentTest test;
		 public static String category1 = "Regression" ;
			public static String category2 = ("sanity") ;
			public static String category3 = ("dynamic testing") ;
			public static String authors = "Automation testing - anandharaj";
	 public  TABLElinkpage() {
			PageFactory.initElements(getDriver(), this);
		}

public void tablelink() throws Throwable {
	  test = wl.startTestCase(testNodes1, testcaseDescription1);
	  test.assignCategory(category1);
	  test.assignAuthor(authors); 
	  test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on right side panel" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on  table  tab link " );
	  if(tablelink.isEmpty()== false) {
		  test.log(com.aventstack.extentreports.Status.INFO,"click on each table link " );
	  for(WebElement wed: tablelink) {	
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
			 test.log(com.aventstack.extentreports.Status.WARNING,"table link is not present in right side panel");
		}
	  System.out.println(Status);
		wl.reportStep(getDriver(), "The page table link is under verification", Status);  
}
public void tablecitation() throws Throwable {
	test = wl.startTestCase(testNodes2, testcaseDescription2);
	 test.assignCategory(category1);
	  test.assignAuthor(authors); 
	  test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on right side panel" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on  table  tab link " );
	  if(tablelink.isEmpty()== false) {
		  test.log(com.aventstack.extentreports.Status.INFO,"click on each table citation link " );
		for(WebElement wed: tablecitation) {
			
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
			 test.log(com.aventstack.extentreports.Status.WARNING,"table citation is not present in right side panel");
		}
		  System.out.println(Status);
			wl.reportStep(getDriver(), "The page table citation link is under verification", Status);   

}
}
