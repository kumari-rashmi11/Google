package Test;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Helper.BaseTest;
import testprojectt.testprojectt.App;

public class test extends BaseTest {
    
   
    @Test(priority = 1)
    public void openGooglePage() {
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
}
