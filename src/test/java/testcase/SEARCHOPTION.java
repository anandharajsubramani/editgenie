package testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BASEclass;
import com.pageobjects.Homepage;

public class SEARCHOPTION extends BASEclass {
	Homepage dd;

	@BeforeMethod
	public void setup(String browser) throws Throwable {
		launchbrowser(browser);
		
	}
	
	
	
	
	@AfterMethod()
	public void teardown() throws Throwable {

		}
	@Test()
	public void  searchtest()throws Throwable {
		Thread.sleep(3222);
		System.out.println("yugjh");

		
		
	}
	
	
}
