package com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;

public class ADDoptions_in_AUTHORNAME extends BASEclass {
	public static String category1 = "Regression" ;
	public static String category2 = "sanity" ;
	public static String category3 = "smoke" ;
    public static String authors = "Automation testing - anandharaj";
	public static String Status;
	public static String testNodes1 = "Testcase 1 - author name Validation in author group area";
	public static String testcaseDescription1 = "Verify tracking system logo, once ticketing sytem Homepage is loaded successfully";
	public static String testNodes2 = "Testcase 2 - author name Validation in frot matter area";
	public static String testcaseDescription2 = "Verify tracking system logo, once ticketing sytem Homepage is loaded successfully";
	public static String testNodes3 = "Testcase 3 - add author name Validation in author group area area";
	public static String testcaseDescription3 = "Verify tracking system logo, once ticketing sytem Homepage is loaded successfully";
	public static String testNodes4 = "Testcase 4 - add comment Validation in author group area area";
	public static String testcaseDescription4 = "Verify tracking system logo, once ticketing sytem Homepage is loaded successfully";
	public static String testNodes5 = "Testcase 5 - add front note validation Validation in author group area area";
	public static String testcaseDescription5 = "Verify tracking system logo, once ticketing sytem Homepage is loaded successfully";
	public static String testNodes6 = "Testcase 6 - add affiliation Validation in author group  area";
	public static String testcaseDescription6 = "Verify tracking system logo, once ticketing sytem Homepage is loaded successfully";
	
	
	public static String testNodes7 = "Testcase 7 - add affiliation citiation Validation in author group area";
	public static String testcaseDescription7 = "Verify tracking system logo, once ticketing sytem Homepage is loaded successfully";
	
	public static String testNodes8 = "Testcase 8 - delete affiliation Validation in author group area";
	public static String testcaseDescription8 = "Verify tracking system logo, once ticketing sytem Homepage is loaded successfully";
	
	public static String testNodes9 = "Testcase 9 - author name Validation in frot matter area";
	public static String testcaseDescription9 = "Verify tracking system logo, once ticketing sytem Homepage is loaded successfully";
	
	
	
	
	
	
	private static ExtentTest test;
       @FindBy(xpath="/html[@dir='ltr']/body/article/div[1]/div/div[2]/p[1] ")
		WebElement journaltext;
		
       
       //body[@id='iframeID']/article/front/article-meta/div[3]/p/span
    @FindBy(xpath="/html[1]/body/article/div/div/div[@class='contrib-group']/span[@class='contrib']/span[@class='name']")
      List<WebElement> authorname;
    
    @FindBy(xpath="/html[1]/body/article/div/div/div[@class='contrib-group']/span[@class='contrib' and position()=1]/span[@class='name']")
    WebElement authorname1;
    
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
  
     	@FindBy(xpath="//*/text()[normalize-space(.)='Remove Orcid']/parent::*")
    	WebElement removeorcid;
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
     //	@FindBy(xpath="//*/text()[normalize-space(.)='OK']/parent::*")
    
     	@FindBy(xpath="//div[@class='sa-confirm-button-container']//button")
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
	  
	   System.out.println("yyyyyyyyy123");
	   Thread.sleep(1000);
	   getDriver().switchTo().frame(iframe);
	   Actionsclass.doubleclick(getDriver(), authorname1);
	   getDriver().switchTo().defaultContent();
	   test= wl.startTestCase(testNodes2, testcaseDescription2);
	   test.assignCategory(category1);
		  test.assignAuthor(authors);
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
 
 
 
 public void addauthorname() throws Throwable {
	   Thread.sleep(5000); 
	   getDriver().switchTo().frame(iframe);
	   Actionsclass.rightclick(getDriver(), authorname1);
	   getDriver().switchTo().defaultContent();
	   test= wl.startTestCase(testNodes3, testcaseDescription3);
	   test.assignCategory(category1);
		  test.assignAuthor(authors);
	   	   System.out.println("yyyyyyyyy");
	   getDriver().switchTo().frame(getDriver().findElement(By.className("cke_panel_frame")));
	   Thread.sleep(1000); 
	   test.log(com.aventstack.extentreports.Status.INFO,"verify user able to click on add author name " );
	   boolean results = addauthorname.isEnabled();
	   
	   if (results==true) {
		   
		   Actionsclass.click(getDriver(), addauthorname);
		   test.log(com.aventstack.extentreports.Status.INFO," user able to click on add author name " );
		   getDriver().switchTo().defaultContent();
		   Thread.sleep(1000);
			 Actionsclass.type(surenname, "nothiong");
			 test.log(com.aventstack.extentreports.Status.INFO," user enter on surename details" );
			 Thread.sleep(1000);
			 Actionsclass.type(givenname, "nothiong");
			 test.log(com.aventstack.extentreports.Status.INFO," user enter on givenname details" );
			 Thread.sleep(1000);
			 Actionsclass.click(getDriver(), suffix);
			 Thread.sleep(1000);
			 Actionsclass.selectByIndex(suffixdropdown, 2);
			 Thread.sleep(1000);
			 test.log(com.aventstack.extentreports.Status.INFO," user select on suffix options" );
			 Actionsclass.click(getDriver(), addbutton);	
			 getDriver().switchTo().defaultContent();
			 Status= "Pass";
	   }
	   
	   
	   else {
		   test.log(com.aventstack.extentreports.Status.FAIL," user not  able to click on add author name ");
			  Status = "Fail";
	   }
	  
 }
 
 public void addorcid() throws Throwable {
	 getDriver().switchTo().frame(iframe);
	 
	   Actionsclass.rightclick(getDriver(), authorname1);
	   getDriver().switchTo().defaultContent();
	 Thread.sleep(1000);
	 getDriver().switchTo().frame(getDriver().findElement(By.className("cke_panel_frame")));
	 Thread.sleep(1000); 
	 test.log(com.aventstack.extentreports.Status.INFO,"verify user able to click on add orcid" );
	 System.out.println("fgg123");

		 System.out.println("fgg");
	 if (addorcid.isEnabled()==true) {
		 System.out.println("fgg23");
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
		 getDriver().switchTo().defaultContent();
	 }
	 else {
		  test.log(com.aventstack.extentreports.Status.FAIL," user not  able to click on add orcid because of orcid is already presented");
		  Status = "Fail";
		 Actionsclass.click(getDriver(), removeorcid);
		 getDriver().switchTo().defaultContent();
	 }
	 
	 }
	 

 
 
 
 public void addcomment() throws Throwable {
	  getDriver().switchTo().frame(iframe);
	   Actionsclass.rightclick(getDriver(), authorname1);
	   getDriver().switchTo().defaultContent();
	   test= wl.startTestCase(testNodes4, testcaseDescription4);
	   test.assignCategory(category1);
		  test.assignAuthor(authors);
	 Thread.sleep(1000);
	 getDriver().switchTo().frame(getDriver().findElement(By.className("cke_panel_frame")));
	 Thread.sleep(5000);
	 test.log(com.aventstack.extentreports.Status.INFO,"verify user able to click on add author name " );
	   boolean results = addcomment.isEnabled();
	   
	   if (results==true) {
		   
	 Actionsclass.click(getDriver(), addcomment);
	 test.log(com.aventstack.extentreports.Status.INFO," user able to click on comments " );
	 getDriver().switchTo().defaultContent();
	 Thread.sleep(5000);
	 getDriver().switchTo().frame(frame1);
	 Thread.sleep(5000);
	 Actionsclass.type(typecomment, "nothing");
	 test.log(com.aventstack.extentreports.Status.INFO," user able to enter comments " );
	 Thread.sleep(5000);
	 getDriver().switchTo().defaultContent();
	 Thread.sleep(5000);
	 Actionsclass.click(getDriver(), clickcommentok);
	  getDriver().switchTo().defaultContent();
	   }
	   else {
		   test.log(com.aventstack.extentreports.Status.FAIL," user not  able to click on comments");
			  Status = "Fail";
	   }
 }
 

 public void addfrontnotename() throws Throwable {
	  getDriver().switchTo().frame(iframe);
	   Actionsclass.rightclick(getDriver(), authorname1);
	   getDriver().switchTo().defaultContent();
	   test= wl.startTestCase(testNodes5, testcaseDescription5);
	   test.assignCategory(category1);
		  test.assignAuthor(authors);

	 Thread.sleep(5000); 
	   System.out.println("yyyyyyyyy43");
	   getDriver().switchTo().frame(getDriver().findElement(By.className("cke_panel_frame")));
	   Thread.sleep(1000); 
	   test.log(com.aventstack.extentreports.Status.INFO,"verify user able to click on add author name " );
	   boolean results = addfrontnote.isEnabled();
	   if (results==true) { 
	   Actionsclass.click(getDriver(), addfrontnote);
	   getDriver().switchTo().defaultContent();
	   Thread.sleep(1000);
		 Actionsclass.type(addfrontnote_des, "nothiong");
		 Thread.sleep(1000);
		 Actionsclass.click(getDriver(), addfrontnote_save);
		
		 Actionsclass.click(getDriver(), addfrontnote_update_button);
		 System.out.println("hjsdf");
		  getDriver().switchTo().defaultContent();
	   }
	   
	   else {
		   test.log(com.aventstack.extentreports.Status.FAIL," user not  able to click on addfront note");
			  Status = "Fail";
	   }  
		  
		  
		  
 }
 
 
 
 
 public void addaffiliations() throws Throwable {
	   Thread.sleep(5000); 
	   System.out.println("hjsdf");
	   getDriver().switchTo().frame(iframe);
	   Actionsclass.rightclick(getDriver(), authorname1);
	   System.out.println("hjsdf");
		  getDriver().switchTo().defaultContent();
		   test= wl.startTestCase(testNodes6, testcaseDescription6);
		   test.assignCategory(category3);
			  test.assignAuthor(authors);

		  getDriver().switchTo().frame(getDriver().findElement(By.className("cke_panel_frame")));
	   Thread.sleep(2000); 
	   test.log(com.aventstack.extentreports.Status.INFO,"verify user able to click on addAffiliation " );
	   boolean results = addAffiliation.isEnabled();
	   if (results==true) { 
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
		  getDriver().switchTo().defaultContent();
	   } 
		  
	   else {
		   test.log(com.aventstack.extentreports.Status.FAIL," user not  able to click on addaffiliation");
			  Status = "Fail";
	   }  
		   
		  
}
 
 public void addaffiliation_citiation() throws Throwable {
	 Thread.sleep(1000); 
	   getDriver().switchTo().frame(iframe);
	   Actionsclass.rightclick(getDriver(), authorname1);
	  getDriver().switchTo().defaultContent();
	  test= wl.startTestCase(testNodes7, testcaseDescription7);
	  test.assignCategory(category3);
	  test.assignAuthor(authors);
  getDriver().switchTo().frame(getDriver().findElement(By.className("cke_panel_frame")));
  Thread.sleep(1000); 

  Actionsclass.click(getDriver(), addAffiliation);
  getDriver().switchTo().defaultContent();
  Thread.sleep(1000);
  getDriver().switchTo().frame(iframe1);
	 Thread.sleep(2000);
	  test.log(com.aventstack.extentreports.Status.INFO,"verify user able to click on addaffiliation citiation " );
	  boolean results = addafficitiation.isEnabled();
	  if (results==true) { 
	Actionsclass.click(getDriver(), addafficitiation);
	  getDriver().switchTo().defaultContent();
	  Thread.sleep(2000);
	 Actionsclass.click(getDriver(), addaffilist);
	 Thread.sleep(2000);
	 Actionsclass.selectByIndex(addaffilistdrop, 2);
	 Thread.sleep(2000);
	 Actionsclass.click(getDriver(), addaffilistdropok);
	  getDriver().switchTo().defaultContent();
	  }
	   else {
		   test.log(com.aventstack.extentreports.Status.FAIL," user not  able to click on addaffiliation citiation");
			  Status = "Fail";
	   }    
	  
	  
	  
}
 
 public void addaffiliation_delete() throws Throwable {
	 Thread.sleep(1000); 
	   getDriver().switchTo().frame(iframe);
	   Actionsclass.rightclick(getDriver(), authorname1);
		  getDriver().switchTo().defaultContent();
		  test= wl.startTestCase(testNodes8, testcaseDescription8);
		  test.assignCategory(category2);
		  test.assignAuthor(authors);
  getDriver().switchTo().frame(getDriver().findElement(By.className("cke_panel_frame")));
  Thread.sleep(1000); 
  Actionsclass.click(getDriver(), addAffiliation);
  getDriver().switchTo().defaultContent();
  Thread.sleep(1000);
  getDriver().switchTo().frame(iframe1);
	 Thread.sleep(2000);
	 test.log(com.aventstack.extentreports.Status.INFO,"verify user able to click on deleteaffiliation citiation " );
	  boolean results = deleteafficitiation.isEnabled();
	  if (results==true) { 
	Actionsclass.click(getDriver(), deleteafficitiation);
	  getDriver().switchTo().defaultContent();
	  Thread.sleep(2000);
	 Actionsclass.click(getDriver(), deleteaffi_dropdown);
	 Thread.sleep(2000);
	 Actionsclass.selectByIndex(deleteaffi_dropdown, 2);
	 Thread.sleep(2000);
	 Actionsclass.click(getDriver(), deleteaffi_ok_button);
	  getDriver().switchTo().defaultContent();
	  }
	  
	   else {
		   test.log(com.aventstack.extentreports.Status.FAIL," user not  able to click on delete affiliation citiation");
			  Status = "Fail";
	   }    
	  
	  
	  
}

 
		
}
	
	  
