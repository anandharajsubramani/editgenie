package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;

public class ADDoptions_in_refernece extends BASEclass{
	@FindBy(xpath="/html[@dir='ltr']/body/article/div[1]/div/div[2]/p[1] ")
	WebElement journaltext;
	
   
   //authornamelist
@FindBy(xpath="//*[@id='TextBoxesGroup']/div/div/div/div/div/input")
  List<WebElement> authorname;


@FindBy(xpath="//*[@id='TextBoxesGroup']/div[2]/div/div/input")
WebElement collab;
    
@FindBy(xpath="//*[@id='TextBoxesGroup']/div[3]/div/div/input")
WebElement year;

@FindBy(xpath="//*[@id='TextBoxesGroup']/div[4]/div/div/div")
WebElement articletitle;
@FindBy(xpath="//*[@id='TextBoxesGroup']/div[4]/div/div/button")
WebElement articletitle_edit;
@FindBy(xpath="//*[@id=\"txt_Ref_input\"] ")
WebElement articletitle_edit_update;
@FindBy(xpath="//*[@id=\"model_Update_Reference_Title\"]/div/div/div[2]/div[1]/div[3]/button")
WebElement articletitle_edit_update_save;

@FindBy(xpath="//*[@id=\"TextBoxesGroup\"]/div[5]/div/div/div")
WebElement journal_title;
@FindBy(xpath="//*[@id='TextBoxesGroup']/div[5]/div/div/button")
WebElement journal_title_edit;
@FindBy(xpath="//*[@id=\"txt_Ref_input\"] ") 
WebElement journal_title_edit_update;
@FindBy(xpath="//*[@id=\"model_Update_Reference_Title\"]/div/div/div[2]/div[1]/div[3]/button")
WebElement journal_title_edit_update_save;
  
@FindBy(xpath="//*[@id='TextBoxesGroup']/div[6]/div/div/input")
WebElement volume;
@FindBy(xpath="//*[@id='TextBoxesGroup']/div[7]/div/div/input")
WebElement issue;

@FindBy(xpath="//*[@id='TextBoxesGroup']/div[8]/div/div/input")
WebElement first_page;
@FindBy(xpath="//*[@id='TextBoxesGroup']/div[9]/div/div/input")
WebElement pub_id;


@FindBy(xpath="//*[@id='TextBoxesGroup']/div[10]/div/div/input")
WebElement DOI;

@FindBy(xpath="//*[@id='TextBoxesGroup']/div[11]/div/div/input")
WebElement EXT_LINK;

@FindBy(xpath="//*[@id='TextBoxesGroup']/div[12]/div/div/input")
WebElement access_date;
@FindBy(xpath="//*[@id='TextBoxesGroup']/div[13]/div/div/input")
WebElement last_page;

@FindBy(xpath="//*[@id='TextBoxesGroup']/div[14]/div/div/input")
WebElement comment;


@FindBy(xpath="//*[@id=\"addButton\"] ")
WebElement add_ref;
@FindBy(xpath="//input[@value=\"CANCEL\"] ")
WebElement add_ref_cancel;

	
public  ADDoptions_in_refernece() {
	PageFactory.initElements(getDriver(), this);
}



public void editreference() throws Throwable {
	

	  for(WebElement wed: authorname ) {
			 System.out.println("bbncvb1234");
			if (wed.isDisplayed()==true) {
				System.out.println("12434bbncvbnhmbm");
			   wed.sendKeys("fh");
			} 
			else
			{
				System.out.println("element not displayed");
				break;
			}
			
		 }
	
	Actionsclass.type(collab, "collab");
	Actionsclass.type(year, "2023");
	Actionsclass.type(articletitle, "aaaaaaaaaaa");
	Actionsclass.type(journal_title, "journal");
	Actionsclass.type(volume, "44");
	Actionsclass.type(issue, "(22)");
	Actionsclass.type(first_page, "1101");
	Actionsclass.type(pub_id, "123456");
	Actionsclass.type(DOI, "0000-0001-5109-3700");
	Actionsclass.type(EXT_LINK, "collab");
	Actionsclass.type(access_date, "12.12.23");
	Actionsclass.type(last_page, "1111");
	Actionsclass.type(comment, "collab");
	//Actionsclass.click(getDriver(), add_ref);
	Actionsclass.click(getDriver(), add_ref_cancel);
	getDriver().switchTo().alert().accept();
	
	
}




}
