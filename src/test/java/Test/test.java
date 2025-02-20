package Test;
 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
 
import Helper.BaseTest;


import Helper.Interactions;
import Helper.TestCaseListener;  // Make sure this listener is implemented in the Helper package

import testprojectt.testprojectt.App;
 
@Listeners(TestCaseListener.class)
public class test extends BaseTest {
 
    @Test(priority = 1)
    public void openGooglePage() {
        System.out.println("Running test: openGooglePage");
        driver.get("https://www.google.com/");
        System.out.println("Page title is: " + driver.getTitle());
    }
 
    @Test(priority = 2, retryAnalyzer = Helper.RetryAnalyzer.class)

	public void Search_feature() {
    	openGooglePage();	
    	App aut = new App(driver);
		Helper.Interactions interact = new Helper.Interactions(driver);
		interact.executeWithDelay(() -> aut.searchValidation());
	}

    @Test(priority = 3, retryAnalyzer = Helper.RetryAnalyzer.class)
	public void Validate_second_JOIN_US_button_click_TC_003() {
    	openGooglePage();	
    	App aut = new App(driver);
		Helper.Interactions interact = new Helper.Interactions(driver);
		interact.executeWithDelay(() -> aut.clickFeelingluckyBtn());
	}
	 @AfterMethod
		public void afterMethod() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
	 }    

    public void Search_feature() {
        System.out.println("Running test: Search_feature");
        openGooglePage();  
        App aut = new App(driver);
        Interactions interact = new Interactions(driver);
        interact.executeWithDelay(() -> aut.searchValidation());
    }
    @Test(priority = 3, retryAnalyzer = Helper.RetryAnalyzer.class)
    public void Validate_second_JOIN_US_button_click_TC_003() {
        System.out.println("Running test: Validate_second_JOIN_US_button_click_TC_003");
        openGooglePage();  
        App aut = new App(driver);
        Interactions interact = new Interactions(driver);
        interact.executeWithDelay(() -> aut.clickFeelingluckyBtn());
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }    

}

