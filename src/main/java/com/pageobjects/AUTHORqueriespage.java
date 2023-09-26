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
import com.utility.WebDriverListener123;

public class AUTHORqueriespage extends BASEclass {
	public static String Status;
	public static String testCaseName = "editgenie homepage functionality";
	public static String testDescription = "Verify editgenie right side panel once editgenie Homepage is loaded successfully";
	public static String testNodes1 = "Testcase 1 - right side panel author queries Validation";
	public static String testcaseDescription1 = "Verify editgenie right side panel, once editgenie Homepage is loaded successfully";
	//AUTHOR QUERY COLUMN
		@FindBy(xpath=" //*[@id=\"authorquerypanel\"]//li ")
		List<WebElement> AUTHORQUERIESBUTTON;
		
		 private static ExtentTest test;

	 public  AUTHORqueriespage() {
			PageFactory.initElements(getDriver(), this);
		}
	   
	 WebDriverListener123 wl = new WebDriverListener123();
public void authorqueries() throws Throwable {
	 wl.startTestModule(testCaseName, testDescription); 
	  test = wl.startTestCase(testNodes1, testcaseDescription1);
	  
	  test.log(com.aventstack.extentreports.Status.INFO,"navigating to editgenie" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on right side panel" );
	  test.log(com.aventstack.extentreports.Status.INFO,"click on each author queries " );
	  for(WebElement wed: AUTHORQUERIESBUTTON ) {
			
		if(wed.equals(wed)) {	
			Thread.sleep(5000);
			Actionsclass.click(getDriver(), wed);
		 String gh = Actionsclass.screenShot(getDriver());
		 test.addScreenCaptureFromPath(gh);
		 Status = "pass";
	  }
		else {
			Status = "Fail";
		}
	}
	  System.out.println(Status);
		wl.reportStep(getDriver(), "author queries checking process", Status);   

}
	
	
}
