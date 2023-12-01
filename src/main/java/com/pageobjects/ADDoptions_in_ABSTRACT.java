package com.pageobjects;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;

public class ADDoptions_in_ABSTRACT extends BASEclass {

 //abstract area comment ,figure add functions
    
   // @FindBy(xpath="  /html/body/article/div[1]/div/div[8]/div[2]")
   //	WebElement abstractpara;
    @FindBy(xpath="//*[@id=\"commentBoxIframe\"] ")
   	WebElement frame1;
    @FindBy(xpath=" //*[@id=\"cke_1_contents\"]/iframe")
  	WebElement iframe;
	@FindBy(xpath="//*[@id=\"main\"]/div[position () =last()]/table/tbody/tr/td/div/table/tbody/tr/td/div/table/tbody/tr/td/div/iframe")
 	WebElement iframe1;
    @FindBy(xpath="/html[1]/body/article/div[1]/div/div[@class='abstract']/div[position()=(2) and contains(text(), 'the')]")
   	WebElement abstractpara1;
    //comment area functions
   
    @FindBy(xpath="//*/text()[normalize-space(.)='Comment']/parent::*")
	WebElement comment;
    @FindBy(xpath="/html/body/div/div[2] ")
	WebElement typeelement;
	@FindBy(xpath="//a[@class='cke_dialog_ui_button cke_dialog_ui_button_ok']")
	WebElement clickelementok;
 	@FindBy(xpath=" //div[@class='cke_menu']")
	WebElement select;
 	
 	
 	
 //link area functions	
 
 	
 	@FindBy(xpath="//*[@id=\"drpTypes\"]")
 	WebElement droplink;
	 @FindBy(xpath="//*[@id=\"drpTypes\"]/option")
   List<WebElement> droplinklist;
	 
 	@FindBy(xpath="//*[@id=\"drpLink\"]")
 	WebElement droplinkfig_citiation;
 	
 	@FindBy(xpath="//*[@id=\"drpLink\"]/option")
 	List<WebElement> droplinkfig_citiationselect;
 	
 	@FindBy(xpath="//*[@id=\"main\"]/div[position () =last()]/table/tbody/tr/td/div/table/tbody/tr[position () =last()]/td/table/tbody/tr/td")
 	WebElement linkok;
		
 public  ADDoptions_in_ABSTRACT() {
		PageFactory.initElements(getDriver(), this);
	}
   
 
 public void addcomment() throws Throwable {
	  
	 Thread.sleep(1000);
	 getDriver().switchTo().frame(getDriver().findElement(By.className("cke_panel_frame")));
	 Thread.sleep(5000); 
	 Actionsclass.click(getDriver(), comment);
	 getDriver().switchTo().defaultContent();
	 Thread.sleep(5000);
	 getDriver().switchTo().frame(frame1);
	 Thread.sleep(5000);
	 Actionsclass.type(typeelement, "nothiong");
	 Thread.sleep(5000);
	 getDriver().switchTo().defaultContent();
	 Thread.sleep(5000);
	 Actionsclass.click(getDriver(), clickelementok);
 }
 
 public void addlink() throws Throwable {
	 Thread.sleep(5000); 
	   System.out.println("ggyg");
	   Thread.sleep(30000); 
	   getDriver().switchTo().frame(iframe);
Actions actions = new Actions(getDriver());
actions.moveToElement(abstractpara1, 50,30 ).sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT, Keys.ARROW_LEFT,Keys.ARROW_LEFT )).clickAndHold().moveByOffset(30, 0).release().keyDown(Keys.CONTROL).sendKeys("l").keyUp(Keys.CONTROL).perform();
getDriver().switchTo().defaultContent();
	 Thread.sleep(1000);
	 getDriver().switchTo().frame(iframe1);
	 Actionsclass.click(getDriver(), droplink);
		try {
			for(WebElement wed:droplinklist) {
				getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				if(wed.getText().trim().equalsIgnoreCase("Figure")) {
					System.out.println("selected option on web element"+" = "+ wed.getText());
					wed.click();
					 Actionsclass.click(getDriver(), droplinkfig_citiation);
					 for(WebElement wed1:droplinkfig_citiationselect) {
						 if(wed1.getText().trim().equalsIgnoreCase("Figure 2")) {
								System.out.println("selected option on web element"+" = "+ wed1.getText());
								wed1.click();	 
						 }
					 }
				}
				}
        } catch(StaleElementReferenceException e) {
        	 
        }
		getDriver().switchTo().defaultContent();
		 Thread.sleep(1000);
		//getDriver().switchTo().frame(iframe12);
		Actionsclass.click(getDriver(), linkok);
	
 }
 
 
 
 

	 
		
}
	
//abstractpara.sendKeys(Keys.chord(Keys.CONTROL,Keys.SHIFT, Keys.ARROW_LEFT,Keys.ARROW_LEFT ));
//abstractpara.sendKeys(Keys.RIGHT);
//abstractpara.sendKeys(Keys.COMMAND,keys.);
//Actionsclass.rightclick(getDriver(), abstractpara1);
//abstractpara.sendKeys(Keys.BACK_SPACE);
//abstractpara.click();
//Actionsclass.rightclick(getDriver(), abstractpara);
//abstractpara.sendKeys("Some text to be partially deleted");
//String tDispay = elementText.substring(elementText.indexOf("the")+2,elementText.indexOf("to"));
//System.out.println(tDispay);    
//int total_page = Integer.valueOf(tDispay.trim());
//System.out.println(total_page);
	   //Actionsclass.explicitWait(getDriver(), abstractpara, 10);
	 // String gj = abstractpara.getText();
	//  System.out.println(gj);	  
