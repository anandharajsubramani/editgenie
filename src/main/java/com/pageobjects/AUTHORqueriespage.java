package com.pageobjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
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
		
	   	@FindBy(xpath="//*/text()[normalize-space(.)='Reply with comment']/parent::*")
    	WebElement reply_comment;
	  
		@FindBy(xpath="//*/text()[normalize-space(.)='Update']/parent::*")
    	WebElement reply_update;
		@FindBy(xpath="//*[@id=\"authorquerypanel\"]//iframe")
    	WebElement reply_comment_type;
		
				@FindBy(xpath=" /html/body/div/div[2]")
    	WebElement comment_type;
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
		  int jj = AUTHORQUERIESBUTTON.size();
		  System.out.println("total count:" +"" +jj);
	  for(WebElement wed: AUTHORQUERIESBUTTON ) {	
			Thread.sleep(5000);
			if(wed.isEnabled()==true) {
			String aqVal = wed.getText().substring(0,wed.getText().indexOf("\n"));
			System.out.println( "nnnnn:" +" " +  aqVal);
			System.out.println("ABCD");
					Actionsclass.click(getDriver(), wed);
					  test.log(com.aventstack.extentreports.Status.INFO,"click on resloved check box " );
					// resolved text check box
					getDriver().findElement(By.xpath("//li[@id=\""+aqVal+"\"]//div[@class='col-12 aqactions']//input[@id=\"changeCheck"+aqVal+"\"]")).click();
					Thread.sleep(3333);
					  test.log(com.aventstack.extentreports.Status.INFO,"given  to the comments in resloved text box" );
					// resloved area
					  getDriver().findElement(By.xpath("//li[@id=\""+aqVal+"\"]//text()[normalize-space(.)='Reply with comment']/parent::*")).
					  click(); // getDriver().switchTo().frame(reply_comment_type);
					  //getDriver().switchTo().frame();
					  getDriver().switchTo().frame(getDriver().findElement(By.xpath("//li[@id=\""+aqVal+"\"]//div[@class=\"col-12 aqactions\"]//iframe[@id=\"commentBoxAQ"+aqVal+"\"]")));
					  //getDriver().findElement(By.xpath("//iframe[@id=\"commentBoxAQ"+aqVal+ "\"]//html//body//div//div[2]")).sendKeys("dgfvx");
					  getDriver().findElement(By.xpath(".//html//body//div//div[2]")).clear();
					  getDriver().findElement(By.xpath(".//html//body//div//div[2]")).sendKeys("resloved123");
					  getDriver().switchTo().defaultContent(); 
					  Thread.sleep(2000);
					  getDriver().findElement(By.xpath("//li[@id=\""+aqVal+"\"]//text()[normalize-space(.)='Update']/parent::*")).click();
				     Thread.sleep(2000);
				     test.log(com.aventstack.extentreports.Status.INFO,"file attachement in each athour queries" );
					//file attachment area 
					  getDriver().findElement(By.xpath("//li[@id=\""+aqVal+"\"]//text()[normalize-space(.)='Reply with attachment']/parent::*")).click();
					  Thread.sleep(2000);
					  getDriver().switchTo().frame(getDriver().findElement(By.xpath("//*[@id=\"attachment_iframe\"]")));
					  getDriver().findElement(By.xpath("//div[@class='fileUpload btn btn-primary btn-block']")).click();
					  Robot r = new Robot ();
					  r.delay(2000);
					  StringSelection ss= new StringSelection("Downloads\\PRE-Editing (1) (1).docx");
					  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
					  r.keyPress(KeyEvent.VK_CONTROL);
					  r.keyPress(KeyEvent.VK_V);
					  r.delay(2000);
					  r.keyRelease(KeyEvent.VK_CONTROL);
					  r.keyRelease(KeyEvent.VK_V);
					  r.delay(2000);
					  r.keyPress(KeyEvent.VK_ENTER);
					  r.keyRelease(KeyEvent.VK_ENTER);
					  r.delay(2000);
					  Thread.sleep(1000);
					  getDriver().findElement(By.xpath("//*[@id='attachment']")).click();
					  Thread.sleep(1000);
					  getDriver().findElement(By.xpath("//*[@id=\"model_add_attachment\"]/div/div/div[1]/button")).click();
					  getDriver().switchTo().defaultContent();   
				//  getDriver().findElement(By.xpath("//text()[normalize-space(.)='Browse File']/parent::*")).click();
			}
			// String dd = Actionsclass.screenShot(getDriver());
			// String gh = "." +dd;
			 //test.addScreenCaptureFromPath(gh);
           // test.info(MediaEntityBuilder.createScreenCaptureFromPath(gh).build());

	}
	  Status = "pass";
	  }
	  else {
			Status = "warning";
			test.log(com.aventstack.extentreports.Status.WARNING,"authorqueries is not present in right side panel");
		}
	  
	 System.out.println(Status);
	wl.reportStep(getDriver(), "The page authorqueries is under verification", Status);   

}
	
	
}
