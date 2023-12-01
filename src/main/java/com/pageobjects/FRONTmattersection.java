package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;

public class FRONTmattersection extends BASEclass {

	
			@FindBy(xpath="/html/body/article/div[1] ")
			WebElement frontbody;
			    
	

			@FindBy(xpath="/html/body/article/div[2]/div[1]/p")
			WebElement journaltext;
			
			
			

			 public  FRONTmattersection() {
					PageFactory.initElements(getDriver(), this);
					
			
				}
			
			   public String gettitleofhomepage() {
					String title = journaltext.getText();
					System.out.println(title);
					return  title;
				}
			   
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}







