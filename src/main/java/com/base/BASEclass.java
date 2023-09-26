package com.base;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Parameters;

import com.mystore.actiondriver.Actionsclass;

import com.utility.ExtentManager;

import com.utility.WebDriverListener123;

import io.github.bonigarcia.wdm.WebDriverManager;



public  class BASEclass {
	

	public static String authors = "Automation  - ANANDHARAJ";
	static WebDriverListener123 wl = new WebDriverListener123();
	 //  public static WebDriver driver;
	public static Properties props1;
	public static Properties properties=null;
	public  static String url="";
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	@BeforeSuite(groups=  {"smoke","sanity","regression"})
	public void launchbrowser1() throws IOException {
		//ExtentManager.setExtent();
		DOMConfigurator.configure("log4j.xml");
		wl.startResult();
		File dir = new File("D:\\java\\EDITgenie");
	     File[] files = dir.listFiles();
	System.out.println(files.length);

	for (File file : files) {
		 if (file.isFile()) {
			 
	          try {
	        	  String key = "file" + (file);
	        	  FileInputStream FileInputStream=new FileInputStream(file);
	        	  String value = readFileToString(file);
	    System.out.println(FileInputStream);
	        	
	             props1 = new Properties();
	    		     
	    		      //FileInputStream FileInputStream=new FileInputStream(line);
	    		     // System.out.println(value);
	    		      props1.load(FileInputStream);
	    		      String url= props1.getProperty("url");
		            	
		            	System.out.println(url);
		            	
		            	
		            	props1.setProperty(key, value); 
		                  // props.setProperty(key, value);
	        	/*  String key = "file" + (file+1) ;
	           FileInputStream FileInputStream=new FileInputStream(files[file]);
	                 
	           String value = readFileToString(files[file]);
	              System.out.println(value);
	                props.load(FileInputStream);
	                url= props.getProperty("url");
	            	String uname = props.getProperty("username");
	            	String pword = props.getProperty("password");
	                   props.setProperty(key, value);*/
	       	      
	               
	          } 	
	          catch (Exception ex) {
	 		     ex.printStackTrace();
	 		}
	   }
	}
		
		
		
		
		
		
		
		
		
		
	}



private static String readFileToString(File file) throws IOException {
    StringBuilder sb = new StringBuilder();
BufferedReader br = new BufferedReader(new FileReader(file));

String line;
   while ((line = br.readLine()) != null) {
sb.append(line);
  sb.append(System.lineSeparator());
  //System.out.println(line);


} 
   br.close();
return sb.toString();
   }
	

public static WebDriver getDriver() {
	// Get Driver from threadLocalmap
	return driver.get();
}



@SuppressWarnings("deprecation")
@Parameters("browser")
public static void launchbrowser(String asd1  ) throws Throwable{
	
System.out.println( asd1 );
	
	if(asd1.equalsIgnoreCase("chrome")) {
		System.out.println( asd1+"ryrdh" );
		//WebDriverManager.chromedriver().clearDriverCache().setup();
		System.out.println( asd1+"ryrdh" );
		driver.set(new ChromeDriver());
	}
	getDriver().manage().window().maximize();
	getDriver().manage().deleteAllCookies();
	getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    url= props1.getProperty("url");
    getDriver().get(url);
    Thread.sleep(5222);
    JavascriptExecutor js = (JavascriptExecutor) getDriver();
	  js.executeScript("window.scroll(0,5000)");
	  Thread.sleep(5222);
	 
 	
}


@AfterSuite
public void aftersuite() {
	System.out.println("122343454");
	wl.endResult();
}







}
		  
	