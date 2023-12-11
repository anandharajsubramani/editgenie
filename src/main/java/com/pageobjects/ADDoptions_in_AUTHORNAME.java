package com.pageobjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;

public class ADDoptions_in_AUTHORNAME extends BASEclass {

       @FindBy(xpath="/html[@dir='ltr']/body/article/div[1]/div/div[2]/p[1] ")
		WebElement journaltext;
		
       
       //body[@id='iframeID']/article/front/article-meta/div[3]/p/span
    @FindBy(xpath="/html[1]/body/article/div/div/div[@class='contrib-group']/span[@class='contrib']/span[@class='name']")
      List<WebElement> authorname;
    
  
    
    @FindBy(xpath="//div[@class='cke_menu']/span ")
    List<WebElement> rightclick;
    
   // WebElement authorname;
	@FindBy(xpath=" //*[@id=\"cke_1_contents\"]/iframe")
	WebElement iframe;
	@FindBy(xpath="//div[position()=last() and @class='cke cke_reset_all cke_1 cke_panel cke_panel cke_menu_panel cke_ltr']/iframe")
	WebElement iframe1;
	
	
	//iframe[contains(@id, 'cke_')]    

	//*[@class="cke cke_reset_all cke_1 cke_panel cke_panel cke_menu_panel cke_ltr"] 
	
// right click on author title option list
    	@FindBy(xpath="//*/text()[normalize-space(.)='Add Author Name']/parent::*")
	    WebElement addauthorname;
     	@FindBy(xpath="//*/text()[normalize-space(.)='Affiliation']/parent::*")
    	WebElement addAffiliation;
     	@FindBy(xpath="//*/text()[normalize-space(.)='Comment']/parent::*")
	    WebElement addcomment;
     	@FindBy(xpath="//*/text()[normalize-space(.)='Add ORCID']/parent::*")
    	WebElement addorcid;
    	@FindBy(xpath="//*/text()[normalize-space(.)='Add Front Note']/parent::*")
    	WebElement addfrontnote;
     	
     	//1) add author name page 
    	@FindBy(xpath="//*[@id=\"up_contrib_name\"]")
	     WebElement givenname;
    	@FindBy(xpath="//*[@id=\"up_contrib_surname\"] ")
    	 WebElement surenname; 
    	@FindBy(xpath="//*[@id=\"selectbox_suffix\"]")
    	 WebElement suffix; 
    	@FindBy(xpath="//*[@id=\"selectbox_suffix\"]")
         WebElement suffixdropdown;
    	@FindBy(xpath="//*[@id=\"btnAuthorName\"]")
        WebElement addbutton;
    	@FindBy(xpath="//*[@id=\"model_update_contrib\"]/div/div/div[1]/button")
        WebElement authorname_cancel_button;
    	
    	
    	//2)add affiliation  page 
     	@FindBy(xpath="//*/text()[normalize-space(.)='Add Affiliation']/parent::* ")
    	WebElement addaffiliation;
    	@FindBy(xpath="//*/text()[normalize-space(.)='Add Affiliation Citation']/parent::* ")
    	WebElement addafficitiation;
    	@FindBy(xpath="//*/text()[normalize-space(.)='Delete Affiliation Citation']/parent::* ")
    	WebElement deleteafficitiation;
    	
    	//2.1) add affiliation	
    	@FindBy(xpath="//*[@id=\"institution_name_2\"]")
     	WebElement addaffi_institute_name;
    	@FindBy(xpath="//*[@id=\"aff_country\"]")
    	WebElement addaffi_country_name;
    	@FindBy(xpath="//*[@id=\"aff_address\"]")
    	WebElement addaffi_address_name;
    	@FindBy(xpath="//*[@id=\"model_make_aff\"]/div/div/div[2]/div[7]/input")
    	WebElement addaffi_ok_button;
    	
    	
    	//2.2) addafficitiation  page 
     	@FindBy(xpath="	//*[@id=\"aff_list\"]")
    	WebElement addaffilist;
     	@FindBy(xpath="	//*[@id=\"aff_list\"]")
    	WebElement addaffilistdrop;
     	//*[@id="institution_name_2"]
     	@FindBy(xpath="//*[@id=\"Div1\"]/div[5]/input")
    	WebElement addaffilistdropok;
     	
     	//2.3)delete afficitiation  page  
      	@FindBy(xpath="//*[@id=\"delete_aff_list\"]")
    	WebElement deleteaffi_dropdown;
      	@FindBy(xpath="//*[@id=\"citation_list\"]/div[4]/input")
    	WebElement deleteaffi_ok_button;

      	
      	//3) add front note page
      	@FindBy(xpath="//*[@id=\"txt_frontend_desc\"]")
    	WebElement addfrontnote_des;
      	@FindBy(xpath="//*[@id=\"model_make_frontend\"]/div/div[1]/div[2]/div[2]/input[2]")
    	WebElement addfrontnote_save;
     	@FindBy(xpath="//*/text()[normalize-space(.)='OK']/parent::*")
    	WebElement addfrontnote_update_button;
     	
      	//4comment page  
        @FindBy(xpath="//*[@id=\"commentBoxIframe\"] ")
       	WebElement frame1;
        @FindBy(xpath="/html/body/div/div[2] ")
    	WebElement typecomment;
    	@FindBy(xpath="//a[@class='cke_dialog_ui_button cke_dialog_ui_button_ok']")
    	WebElement clickcommentok;
    	
      	//5 orcid page   
    	@FindBy(xpath="//*[@id=\"orcidValue\"] ")
    	WebElement orcid_type;
    	@FindBy(xpath="//*[@id=\"orcidButton\"]")
    	WebElement orcid_search;
    	@FindBy(xpath="//*[@id=\"saveOrcid\"]")
    	WebElement orcid_add;
    	@FindBy(xpath="//*/text()[normalize-space(.)='Yes, Add it!']/parent::*")
    	WebElement orcid_yes_add_it;
    	@FindBy(xpath="//*/text()[normalize-space(.)='OK']/parent::*")
    	WebElement orcid_update_button;
    	   
    	
    	

 
    	
 public  ADDoptions_in_AUTHORNAME() {
		PageFactory.initElements(getDriver(), this);
	}
   
 
 
 public void editauthorname() throws Throwable {
	   Thread.sleep(5000); 
	   System.out.println("yyyyyyyyy");
	   Thread.sleep(1000);
		 Actionsclass.type(surenname, "nothiong");
		 Thread.sleep(1000);
		 Actionsclass.type(givenname, "nothiong");
		 Thread.sleep(1000);
		 Actionsclass.click(getDriver(), suffix);
		 Thread.sleep(1000);
		 Actionsclass.selectByIndex(suffixdropdown, 2);
		 Thread.sleep(1000);
		// Actionsclass.click(getDriver(), addbutton);	   
}
 
 
 
 public void addauthorname() throws Throwable {
	   Thread.sleep(5000); 
	   System.out.println("yyyyyyyyy");
	   getDriver().switchTo().frame(getDriver().findElement(By.className("cke_panel_frame")));
	   Thread.sleep(1000); 
	   Actionsclass.click(getDriver(), addauthorname);
	   getDriver().switchTo().defaultContent();
	   Thread.sleep(1000);
		 Actionsclass.type(surenname, "nothiong");
		 Thread.sleep(1000);
		 Actionsclass.type(givenname, "nothiong");
		 Thread.sleep(1000);
		 Actionsclass.click(getDriver(), suffix);
		 Thread.sleep(1000);
		 Actionsclass.selectByIndex(suffixdropdown, 2);
		 Thread.sleep(1000);
		 Actionsclass.click(getDriver(), addbutton);	   
 }
 
 public void addorcid() throws Throwable {
	  
	 Thread.sleep(1000);
	 getDriver().switchTo().frame(getDriver().findElement(By.className("cke_panel_frame")));
	 Thread.sleep(1000); 
	 Actionsclass.click(getDriver(), addorcid);
	 getDriver().switchTo().defaultContent();
	 Thread.sleep(1000);
	 Actionsclass.type(orcid_type, "0000-0002-1825-0097");
	 Thread.sleep(1000);
	 Actionsclass.click(getDriver(), orcid_search);
	 Thread.sleep(1000);
	 Actionsclass.click(getDriver(), orcid_add);
	 Thread.sleep(1000);
	 Actionsclass.click(getDriver(), orcid_yes_add_it);
	 Thread.sleep(1000);
	 Actionsclass.click(getDriver(), orcid_update_button);
	 
	 
 }
 
 
 
 public void addcomment() throws Throwable {
	  
	 Thread.sleep(1000);
	 getDriver().switchTo().frame(getDriver().findElement(By.className("cke_panel_frame")));
	 Thread.sleep(5000); 
	 Actionsclass.click(getDriver(), addcomment);
	 getDriver().switchTo().defaultContent();
	 Thread.sleep(5000);
	 getDriver().switchTo().frame(frame1);
	 Thread.sleep(5000);
	 Actionsclass.type(typecomment, "nothiong");
	 Thread.sleep(5000);
	 getDriver().switchTo().defaultContent();
	 Thread.sleep(5000);
	 Actionsclass.click(getDriver(), clickcommentok);
 }
 

 public void addfrontnotename() throws Throwable {
	   Thread.sleep(5000); 
	   System.out.println("yyyyyyyyy");
	   getDriver().switchTo().frame(getDriver().findElement(By.className("cke_panel_frame")));
	   Thread.sleep(1000); 
	   Actionsclass.click(getDriver(), addfrontnote);
	   getDriver().switchTo().defaultContent();
	   Thread.sleep(1000);
		 Actionsclass.type(addfrontnote_des, "nothiong");
		 Thread.sleep(1000);
		 Actionsclass.click(getDriver(), addfrontnote_save);
		 Thread.sleep(8000);
		 Actionsclass.click(getDriver(), addfrontnote_update_button);
		 
	
 }
 
 
 
 
 public void addaffiliations() throws Throwable {
	   Thread.sleep(5000); 
		
		  getDriver().switchTo().frame(iframe); 
		  for(WebElement wed: authorname ) {
		  if (wed.equals(wed)) {
		     Thread.sleep(1000);
	         Actionsclass.rightclick(getDriver(), wed); 
		     break; 
		 } 
		  }
		  getDriver().switchTo().defaultContent();
		  getDriver().switchTo().frame(getDriver().findElement(By.className("cke_panel_frame")));
	   Thread.sleep(2000); 
	   Actionsclass.click(getDriver(), addAffiliation);
	   getDriver().switchTo().defaultContent();
	   Thread.sleep(1000);
	   getDriver().switchTo().frame(iframe1);
	   Thread.sleep(2000);
		 Actionsclass.click(getDriver(), addaffiliation);
		 getDriver().switchTo().defaultContent();
		 Thread.sleep(2000);
		 Actionsclass.type(addaffi_institute_name, "anna university");
		 Thread.sleep(2000);
		 Actionsclass.type(addaffi_country_name, "india");
		 Thread.sleep(2000);
		 Actionsclass.type(addaffi_address_name, "adyar,chennai");
		 Thread.sleep(2000);
		 Actionsclass.click(getDriver(), addaffi_ok_button);
}
 
 public void addaffiliation_citiation() throws Throwable {
	 Thread.sleep(1000); 
	  getDriver().switchTo().frame(iframe); 
	  for(WebElement wed: authorname ) {
	  if (wed.equals(wed)) {
	  Thread.sleep(1000);
	 Actionsclass.rightclick(getDriver(), wed); break; } }
	  getDriver().switchTo().defaultContent();
  getDriver().switchTo().frame(getDriver().findElement(By.className("cke_panel_frame")));
  Thread.sleep(1000); 
  Actionsclass.click(getDriver(), addAffiliation);
  getDriver().switchTo().defaultContent();
  Thread.sleep(1000);
  getDriver().switchTo().frame(iframe1);
	 Thread.sleep(2000);
	Actionsclass.click(getDriver(), addafficitiation);
	  getDriver().switchTo().defaultContent();
	  Thread.sleep(2000);
	 Actionsclass.click(getDriver(), addaffilist);
	 Thread.sleep(2000);
	 Actionsclass.selectByIndex(addaffilistdrop, 2);
	 Thread.sleep(2000);
	 Actionsclass.click(getDriver(), addaffilistdropok);
}
 
 public void addaffiliation_delete() throws Throwable {
	 Thread.sleep(1000); 
	  getDriver().switchTo().frame(iframe); 
	  for(WebElement wed: authorname ) {
	  if (wed.equals(wed)) {
	  Thread.sleep(1000);
	 Actionsclass.rightclick(getDriver(), wed); break; } }
	  getDriver().switchTo().defaultContent();
  getDriver().switchTo().frame(getDriver().findElement(By.className("cke_panel_frame")));
  Thread.sleep(1000); 
  Actionsclass.click(getDriver(), addAffiliation);
  getDriver().switchTo().defaultContent();
  Thread.sleep(1000);
  getDriver().switchTo().frame(iframe1);
	 Thread.sleep(2000);
	Actionsclass.click(getDriver(), deleteafficitiation);
	  getDriver().switchTo().defaultContent();
	  Thread.sleep(2000);
	 Actionsclass.click(getDriver(), deleteaffi_dropdown);
	 Thread.sleep(2000);
	 Actionsclass.selectByIndex(deleteaffi_dropdown, 2);
	 Thread.sleep(2000);
	 Actionsclass.click(getDriver(), deleteaffi_ok_button);
}

 
		
}
	
	  
