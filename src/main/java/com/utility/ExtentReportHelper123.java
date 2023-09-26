package com.utility;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.observer.entity.MediaEntity;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public abstract class ExtentReportHelper123
{

	private static String currentDirectory,reportFileSavePath;
	private static LocalDateTime currentDateTime; 
    private static String TDformat;
	public static ExtentSparkReporter html1;
	//public static ExtentHtmlReporter html1;
	public static ExtentReports extent;
	public ExtentTest test, suiteTest;
	public String testCaseName, testNodes, testDescription, testdesc, category, authors;
	public static File pathCheck;

	 //Get Date and Time
  	public static String GetCurrentDateAndTime()
  	{
  		try
  		{
  			currentDateTime = LocalDateTime.now();
  			TDformat = currentDateTime.format(DateTimeFormatter.ofPattern("d-M-yyyy_hh:mm:ss_a"));
  		}
  		catch(Exception ex)
  		{
  			System.out.println("Error in fetching Current Date and Time : " + ex.getMessage());
  		}
  	return TDformat;
  	}
  	
	//ExtentReport File storing Path
    public static String ExtentReportFileSavingPath()
    {
    	 currentDirectory = System.getProperty("user.dir");
    	 reportFileSavePath = currentDirectory + "/test-output/ExtentReport/";
    	 System.out.println(reportFileSavePath);
    	 System.out.println("asccd4e");
    	 PathCheck();
         return reportFileSavePath;
        
    }
 
    //Path Check Exists Verification
    public static void PathCheck()
    {
    	pathCheck = new File(reportFileSavePath.toString());
 		try {
 			if (pathCheck.exists()) 
 			{
 				File filesList[] = pathCheck.listFiles();
 				for (File file : filesList) 
 				{
 					if (file.isFile()) 
 					{
 						file.delete();
 					}
 					System.out.println("Deleted");
 				}	
 			 pathCheck.mkdir();
 			} 
 			else
 			{
 				pathCheck.mkdir();	
 			}
 		} catch (Exception ex) {
 			System.out.println("Deleting Files Error :" + ex.getMessage());
 			
 		}
 		System.out.println("gvdfj");

    }
    
	//Use @BeforeSuite ==> startResult();
    //Report Config Setup
	public void startResult() throws IOException {
		ExtentReportFileSavingPath();
		//html1 = new ExtentHtmlReporter(reportFileSavePath+"report.html");
		
		//html1 = new ExtentHtmlReporter(reportFileSavePath+"report.html");

		html1= new ExtentSparkReporter(reportFileSavePath+"MyReport.html");
		//html1.config().setChartVisibilityOnOpen(false);
		//html1.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
		
		//html1.config().setDocumentTitle("TRACKING SYSTEM");
		//html1.setAppendExisting(true);		
		extent = new ExtentReports();	
		extent.attachReporter(html1);	
		extent.setSystemInfo("HostName", "DT0868");
		extent.setSystemInfo("ProjectName", "TrackingSYSTEM");
		extent.setSystemInfo("Tester", "2662");
		extent.setSystemInfo("OS", "Win10");
		extent.setSystemInfo("Browser", "Chrome");
	}

	//Use @BeforeClass ==> startTestModule(testCaseName, testDescription);	
	public ExtentTest startTestModule(String testCaseName, String testDescription) {
		suiteTest = extent.createTest(testCaseName, testDescription);
		return suiteTest;
	}

	public ExtentTest startTestCase(String testNodes, String testDesc) {
		test = 	suiteTest.createNode(testNodes, testDesc);
		System.out.println("vvvvvvaaaa");
		return test;
	}
	public String  takeSnap(WebDriver driver) {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		String destination = System.getProperty("user.dir") + "/test-output/ExtentReport/images/" +  "_" + dateName + ".png";

		
		try {
			 FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),
					new File(destination));
		} catch (WebDriverException e) {
			
		} catch (IOException e) {
            
		}
		return destination;
	}
	public void reportLogStep(WebDriver driver, String desc, String status, boolean bSnap)  {
		Media jh=null;
		if(bSnap && status.equalsIgnoreCase("fail"))
		{
			
			
			String snapNumber = takeSnap(driver);
			try {
			  jh = MediaEntityBuilder.createScreenCaptureFromPath(snapNumber).build();
				
			} catch (Exception ex) {
				System.out.println("Error in Taking Screenshot : " + ex.getMessage());
			}catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	//public abstract long takeSnap();
/*	public static String takeSnap(WebDriver driver,String filenam) {
		ExtentReportFileSavingPath();
		TakesScreenshot takesnap = (TakesScreenshot)driver;
		 File source = takesnap.getScreenshotAs(OutputType.FILE);
		 File destfile = new File(reportFileSavePath+"/images/"+ TDformat+filenam);
		System.out.println("123456abcd");
		try {
			 FileUtils.copyFile(source,destfile);
			 
		}  catch (IOException e) {

		}
		return destfile.getAbsolutePath();
	}*/
	
	/*public void reportLogStep(WebDriver driver, String desc, String status, boolean bSnap)  {
        
		Media img=null;
		if(bSnap && !status.equalsIgnoreCase("INFO"))
		{
	
			try {
				img = MediaEntityBuilder.createScreenCaptureFromPath(takeSnap(driver,"wish.jpg"),"nothing").build();
			} catch (Exception ex) {
				System.out.println("Error in Taking Screenshot : " + ex.getMessage());
			}
		}
		
		if(status.equalsIgnoreCase("PASS")) {
			test.pass(desc, img);			
		}else if (status.equalsIgnoreCase("FAIL")) {
			test.fail(desc, img);
			test.log(Status.FAIL, "Usage: BOLD TEXT");
			throw new RuntimeException();
		}else if (status.equalsIgnoreCase("WARNING")) {
			test.warning(desc, img);
		}else if (status.equalsIgnoreCase("INFO")) {
			test.info(desc);
		}							
	}*/
	
		if(status.equalsIgnoreCase("PASS")) {
			test.pass(desc);			
		}else if (status.equalsIgnoreCase("FAIL")) {
			
			test.fail(desc,jh);
		
			//test.fail( img);
			test.log(Status.FAIL, "Usage: BOLD TEXT");
			throw new RuntimeException();
			

		}else if (status.equalsIgnoreCase("WARNING")) {
			test.warning(desc);
		}else if (status.equalsIgnoreCase("INFO")) {
			test.info(desc);
		}							
	}

	public void reportStep(WebDriver driver, String desc, String status) {
		reportLogStep(driver, desc, status, true);
	}

	//Use @AfterSuite
	public void endResult() {
		
		System.out.println("finishedddd");
		extent.flush();
		
	}	
	
}