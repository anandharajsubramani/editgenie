package com.pageobjects;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.stat.descriptive.moment.SecondMoment;
import org.apache.poi.hssf.record.formula.functions.Second;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Test;
import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;
import com.utility.Log;

public class Homepage extends BASEclass {
	@FindBy(xpath="//*[@id=\"btn\"]")
    WebElement   startproofingclick;
	@FindBy(xpath="//*[@id=\"main\"]/div[4]/div[2]")
    WebElement   searchoptdrb;
	@FindBy(xpath=("//*[@id=\"main\"]/div[51]"))
	WebElement logo; 
	Set<String> sad;
	 List<String> sas;
	 String sd1;
		String sd ;
		
		//leftside click functions
		@FindBy(xpath="//*[@id=\"main\"]/div[52]/i")
	    WebElement leftsideclick;
		
		//rightside click functions
		@FindBy(xpath="//*[@id=\"main\"]/div[47]/div[2]/p[1]/i")
	    WebElement rightsideclick;
		
         //journal title area  front matter
		@FindBy(xpath="/html[@dir='ltr']/body/article/div[1]/div/div[2]/p[1] ")
		WebElement journaltext;
		//article title area frront matter
		@FindBy(xpath="html[1]/body/article/div[1]/div/div[2]/p[1] ")
		WebElement articletitle;
		//authorname area front matter
        @FindBy(xpath="/html[1]/body/article/div/div/div[@class='contrib-group']/span[@class='contrib']/span[@class='name']")
        List<WebElement> authorname;
    
    // common iframes
    @FindBy(xpath=" //*[@id=\"cke_1_contents\"]/iframe")
	WebElement iframe;
	//iframe[@class='cke_panel_frame']  
	
	//iframe[contains(@id, 'cke_')]    
	
	//*[@class="cke cke_reset_all cke_1 cke_panel cke_panel cke_menu_panel cke_ltr"] 

	@FindBy(xpath="//*[@id=\"commentBoxIframe\"] ")
	WebElement commentframe1;
	
	

	
    
    //abstract area comment ,figure add functions
    
    @FindBy(xpath="  /html/body/article/div[1]/div/div[@class='abstract']/div[2]")
   	WebElement abstractpara;
  
    //    
    @FindBy(xpath="/html[1]/body/article/div[1]/div/div[@class='abstract']/div[position()=(2) and contains(text(), 'the')]")
   	WebElement abstractpara1;
    @FindBy(xpath="/html/body/article/div[1]/div/div[8]/div[position()=(2) and contains(text(), 'ovary')]")
	WebElement abstractpara2;
    //comment area functions
    @FindBy(xpath="//*/text()[normalize-space(.)='Comment']/parent::*")
	WebElement comment;
    @FindBy(xpath="/html/body/div/div[2] ")
	WebElement typeelement;
	@FindBy(xpath="//a[@class='cke_dialog_ui_button cke_dialog_ui_button_ok']")
	WebElement clickelementok;
 	@FindBy(xpath=" //div[@class='cke_menu']")
	WebElement select;
 	
 	
 	
 	
    
    @FindBy(xpath="//div[@class='cke_menu']/span ")
    List<WebElement> rightclick;
    

    
   
   
   
    	
		
 public  Homepage() {
		PageFactory.initElements(getDriver(), this);
	}
   
   public void home() throws Throwable {
	   Thread.sleep(2222);
	   Actionsclass.click(getDriver(),startproofingclick);
	   Actionsclass.implicitWait(getDriver(), 10);
	//   Actionsclass.explicitWait(getDriver(), logo, 15);
	   Thread.sleep(10000);
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
   
   public String journal() {
		String title = journaltext.getText();
		System.out.println(title);
		return  title;
	}
  
   public void authortitle() throws Throwable {
	   Thread.sleep(5000); 
	   getDriver().switchTo().frame(iframe);
	  // WebDriverWait wait = new WebDriverWait(getDriver(), );
	 //  wait.until(ExpectedConditions.invisibilityOfElementLocated(fgh));
	   //Actionsclass.implicitWait(getDriver(), 20);
	   System.out.println("ggyg");
	   Actionsclass.explicitWait(getDriver(), articletitle, 10);
	  String gj = articletitle.getText();
	  System.out.println(gj);
	   
   }
   
   public ADDoptions_in_ABSTRACT abstractarea() throws Throwable {
	   Thread.sleep(3000); 
	   System.out.println("ggyg123");
	   
//Actionsclass.implicitWait(getDriver(), 30);
Thread.sleep(30000); 
getDriver().switchTo().frame(iframe);
Actions actions = new Actions(getDriver());
// actions.moveToElement(driver.findElement(locator)).build().perform();
//actions.moveToElement(abstractpara1, 1,-10 ).clickAndHold().moveByOffset(30, 0).release().contextClick().perform();
//abstractpara1.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT, Keys.ARROW_LEFT,Keys.ARROW_LEFT ));
//getDriver().switchTo().frame(iframe);
actions.moveToElement(abstractpara1, 50,30 ).sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT, Keys.ARROW_LEFT,Keys.ARROW_LEFT )).clickAndHold().moveByOffset(30, 0).release().contextClick().build().perform();

//assertEquals(ArithmeticException.class,Exception.class);
getDriver().switchTo().defaultContent();
Thread.sleep(1000);
return new ADDoptions_in_ABSTRACT();
 
   }

   public ADDoptions_in_AUTHORNAME authorname() throws Throwable {
	   System.out.println("bbncvb");
	  int count = authorname.size();
	   System.out.println(count);
	   for(int i=0;i<count;i++) {
		   WebElement alltext = authorname.get(i);
		   String ca = alltext.getText();
		   System.out.println(ca);
		   
	   }
	   for(WebElement wed: authorname ) {
			 System.out.println("bbncvb1234");
			if (wed.equals(wed)) {
				System.out.println("12434bbncvb");
			    Thread.sleep(3000);
				Actionsclass.rightclick(getDriver(), wed);
				break;
			}  
		 }
	   getDriver().switchTo().defaultContent();

	   return new ADDoptions_in_AUTHORNAME();

		 }
   
}

	