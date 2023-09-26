package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;

public class RIGHTSIDE extends BASEclass {
	
//AUTHOR QUERY COLUMN
	@FindBy(xpath=" //*[@id=\"liAQ\"]  ")
    WebElement  AUTHORQUERIESBUTTON;
	
//EDIT HISTORY COLUMN
	@FindBy(xpath="//*[@id=\"liEH\"]")
    WebElement  EDITHISTORYBUTTON;
	  
//COMMENTS COLUMN
		@FindBy(xpath="//*[@id=\"liFC\"]")
	    WebElement   COMMENTSBUTTON;
//QUICKLINK COLUMN
   @FindBy(xpath="//*[@id=\"liFH\"]")
	 WebElement   QUICKLINKBUTTON;
		
//EQUATION COLUMN
	@FindBy(xpath="//*[@id=\"liFE\"]")
	WebElement  EQUATIONBUTTON;			
//FIGURE COLUMN
	@FindBy(xpath=("//*[@id=\"liFI\"]"))
	WebElement FIGUREBUTTON;
	
//TABLE COLUMN
	@FindBy(xpath=("//*[@id=\"liFT\"]"))
	WebElement TABLEBUTTON; 
//REF COLUMN
	@FindBy(xpath=("//*[@id=\"liFR\"]"))
	WebElement REFBUTTON; 
	 

 public  RIGHTSIDE() {
		PageFactory.initElements(getDriver(), this);
	}
   
 
public AUTHORqueriespage authorqueries() throws Throwable {
	Actionsclass.click(getDriver(), AUTHORQUERIESBUTTON); 
	
	return new AUTHORqueriespage();
}
 
public void edithistory() throws Throwable {
	Actionsclass.click(getDriver(), EDITHISTORYBUTTON); 
}

public void comments() throws Throwable {
	Actionsclass.click(getDriver(), COMMENTSBUTTON); 
}

public void quicklink() throws Throwable {
	Actionsclass.click(getDriver(), QUICKLINKBUTTON); 
}

public void equation() throws Throwable {
	Actionsclass.click(getDriver(),EQUATIONBUTTON); 
}

public void figure() throws Throwable {
	Actionsclass.click(getDriver(), FIGUREBUTTON); 
}

public void table() throws Throwable {
	Actionsclass.click(getDriver(), TABLEBUTTON); 
}

public void ref() throws Throwable {
	Actionsclass.click(getDriver(), REFBUTTON); 
}


}
