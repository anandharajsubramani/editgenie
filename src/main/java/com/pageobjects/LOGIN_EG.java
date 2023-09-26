package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BASEclass;
import com.mystore.actiondriver.Actionsclass;
import com.utility.WebDriverListener123;

public class LOGIN_EG extends BASEclass {
	@FindBy(xpath="//*[@id=\"btn\"]")
    WebElement   searchoptb;
	String sf ;
	static WebDriverListener123 wl = new WebDriverListener123();
	 //  public static WebDriver driver;
	 public  LOGIN_EG() {
			PageFactory.initElements(getDriver(), this);
		}
	
	
	
	
	
	public String validateWARNING() throws Throwable  {
		   Thread.sleep(2222);
		   try {
			   Actionsclass.JSClick(getDriver(),searchoptb);
			sf =getDriver().findElement(By.xpath("/html/body/div[5]/p")).getText();
		} catch (Exception e) {
			e.printStackTrace();
			 wl.onException(e, getDriver());
		}
		   
		   Thread.sleep(2222);
		  
		   System.out.println(sf);
			return sf;
		   	
	}
	
	
	
	
}
