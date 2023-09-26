package com.pageobjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;
import com.utility.Log;

public class Homepage extends BASEclass {
	@FindBy(xpath="//*[@id=\"btn\"]")
    WebElement   searchoptb;
	@FindBy(xpath="//*[@id=\"main\"]/div[4]/div[2]")
    WebElement   searchoptdrb;
	@FindBy(xpath=("//*[@id=\"main\"]/div[51]"))
	WebElement logo; 
	Set<String> sad;
	 List<String> sas;
	 String sd1;
		String sd ;
		
		
		@FindBy(xpath="//*[@id=\"main\"]/div[52]/i")
	    WebElement leftsideclick;
		
		@FindBy(xpath="//*[@id=\"main\"]/div[47]/div[2]/p[1]/i")
	    WebElement rightsideclick;
		
		  
		
		
		
		
		
		
		
		
		
		
		
 public  Homepage() {
		PageFactory.initElements(getDriver(), this);
	}
   
   public void home() throws Throwable {
	   Thread.sleep(2222);
	   Actionsclass.click(getDriver(),searchoptb);
	   Thread.sleep(8888);
	  /* System.out.println("mmmmmmyyyy1");
	   Thread.sleep(5222);
	 sad =getDriver().getWindowHandles();
	 System.out.println("yyyyyuuuu");
	    sas = new ArrayList(sad);
		 sd = sas.get(0);
		sd1 = sas.get(1);
		 System.out.println("bbbbb");
		//String sd2 = sas.get(2);
		getDriver().switchTo().window(sd1);
		Thread.sleep(5000);
		System.out.println("mmmmmmyyyy");
	 //  String sd2 = sas.get(2);*/
	  // getDriver().switchTo().window(sd2);
		  //Actionsclass.JSClick(getDriver(),searchoptdrb);
		String parent=getDriver().getWindowHandle();
		System.out.println(getDriver().switchTo().window( parent).getTitle()); 
		Set<String>s=getDriver().getWindowHandles();
		
		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		
		getDriver().switchTo().window(child_window);
		if(parent.equals(child_window))
		{
		getDriver().switchTo().window(child_window);
	
		  
		}
		}
		  
   }
   
   public boolean validatelogo() throws Throwable {
		return Actionsclass.isDisplayed(getDriver(), logo);
		
	}
   
   public String gettitleofhomepage() {
		String title = getDriver().getTitle();
		return  title;
	}
   
   
   public LEFTSIDE leftside() throws Throwable {
		Actionsclass.click(getDriver(), leftsideclick);
		return new LEFTSIDE();
		
	}
   public RIGHTSIDE rightside() throws Throwable {
		Actionsclass.click(getDriver(), rightsideclick);
		return new RIGHTSIDE();
		
	}
   
   
   
}

	