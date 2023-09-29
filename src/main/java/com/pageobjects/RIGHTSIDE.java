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
 
public EDIThistorypage edithistory() throws Throwable {
	Actionsclass.click(getDriver(), EDITHISTORYBUTTON);
	return new EDIThistorypage();
}

public COMMENTpage comments() throws Throwable {
	Actionsclass.click(getDriver(), COMMENTSBUTTON); 
	return new COMMENTpage();

}

public QUICKLINKpage quicklink() throws Throwable {
	Actionsclass.click(getDriver(), QUICKLINKBUTTON); 
	return new QUICKLINKpage();
}

public EQUATIONpage equation() throws Throwable {
	Actionsclass.click(getDriver(),EQUATIONBUTTON); 
	return new EQUATIONpage();
}

public FIGUREpage figure() throws Throwable {
	Actionsclass.click(getDriver(), FIGUREBUTTON);
	return new FIGUREpage();
}

public TABLElinkpage table() throws Throwable {
	Actionsclass.click(getDriver(), TABLEBUTTON);
	return new TABLElinkpage();
}

public REFERANCEpage ref() throws Throwable {
	Actionsclass.click(getDriver(), REFBUTTON); 
	return new REFERANCEpage();
}


}
