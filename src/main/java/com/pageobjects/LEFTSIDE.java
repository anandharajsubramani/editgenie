package com.pageobjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;

public class LEFTSIDE extends BASEclass {
	@FindBy(xpath="//*[@id=\"main\"]/div[52]/i")
    WebElement leftsideclick;
	
	//JOURNAL COLUMN
	@FindBy(xpath=" //*[@id=\"journalTypeInfo\"]  ")
    WebElement   journalvalidation;
	@FindBy(xpath="//*[@id=\"articleID\"] ")
    WebElement   articleIDvalidation;
	@FindBy(xpath="//*[@id=\"VolumeInfo\"]")
    WebElement   VOLUMEvalidation;
	@FindBy(xpath="//*[@id=\"IssueInfo\"] ")
    WebElement   ISSUEvalidation;
	
	//ARTICLETYPE COLUMN
	@FindBy(xpath="//*[@id=\"articleType\"]  ")
    WebElement   ARTICLETYPEvalidation;
	  
	
	//ISSN COLUMN
		@FindBy(xpath="//*[@id=\"ISSNPrintInformation\"]")
	    WebElement   PRINTISSNvalidation;
		@FindBy(xpath="//*[@id=\"ISSNOnlineInformation\"]")
	    WebElement   ONLINEISSNvalidation;
		
		//ARTICLETITLE COLUMN
		@FindBy(xpath="//*[@id=\"articleTitle\"]")
	    WebElement   ARTICLETITLEvalidation;
		
		//COPYRIGHTS COLUMN
				@FindBy(xpath="//*[@id=\"CopyRight\"]")
			    WebElement  COPYRIGHTSvalidation;

				
	//HISTORY COLUMN
	@FindBy(xpath=("//*[@id=\"HistoryReceived\"]"))
	WebElement receiveddate;
	@FindBy(xpath=("//*[@id=\"HistoryAccepted\"]"))
	WebElement accepteddate; 
	 

 public  LEFTSIDE() {
		PageFactory.initElements(getDriver(), this);
	}
   
 
 public String journalvalidation() throws Throwable {
	   Thread.sleep(3000);
	  String h = journalvalidation.getText();
	   return h;
	   
 }
 
   public String articleidvalidation() throws Throwable {
	   
	   Thread.sleep(3000);
		  String h = articleIDvalidation.getText();
		   return h;
   }
   public String volumevalidation() throws Throwable {
	   
	   Thread.sleep(3000);
		  String h = VOLUMEvalidation.getText();
		   return h;
   } 
  public String issuevalidation() throws Throwable {
	   
	   Thread.sleep(3000);
		  String h = ISSUEvalidation.getText();
		   return h;
   } 
   
  public String articletypevalidation() throws Throwable {
	   
	   Thread.sleep(3000);
		  String h = ARTICLETYPEvalidation.getText();
		   return h;
  } 
  public String printissnvalidation() throws Throwable {
	   
	   Thread.sleep(3000);
		  String h = PRINTISSNvalidation.getText();
		   return h;
 } 
  public String onlineissnvalidation() throws Throwable {
	   
	   Thread.sleep(3000);
		  String h = ONLINEISSNvalidation.getText();
		   return h;
}
  public String articletitlevalidation() throws Throwable {
	   
	   Thread.sleep(3000);
		  String h = ARTICLETITLEvalidation.getText();
		   return h;
}
  public String copyrightsvalidation() throws Throwable {
	   
	   Thread.sleep(3000);
		  String h = COPYRIGHTSvalidation.getText();
		   return h;
}
  public String receiveddate() throws Throwable {
	   Thread.sleep(3000);
	  String h = receiveddate.getText();
	   return h;
	   
   }
   public String accpetedddate() throws Throwable {
	   Thread.sleep(3000);
	  String h = accepteddate.getText();
	   return h;
	   
   }


}
