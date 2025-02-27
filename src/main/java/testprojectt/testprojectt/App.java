package testprojectt.testprojectt;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Interactions;
import Locators.Googletab;


public class App {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	Googletab locator;
    Interactions interact;
    
    public App(WebDriver driver) {
		if (driver == null) {
            throw new IllegalArgumentException("Driver must be set");
        }
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.action = new Actions(driver);
        this.locator = new Googletab();
        this.interact = new Interactions(driver);
	}
    
    public void searchValidation() {
    	interact.sendingKeys(locator.SearchBox, "Privacy setting");
    	WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.SearchBox));
    	ele.sendKeys(Keys.ENTER);
    }
    
    public void clickFeelingluckyBtn() {
		interact.clickElement(locator.feelingluckybtn);
	}
    
    public void clickAboutUsTabBtn() {
		interact.clickElement(locator.AboutUsBtn);
	}
}
