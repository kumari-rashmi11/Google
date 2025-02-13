package Test;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {
    
    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setup() {
//        System.setProperty("webdriver.edge.driver", "C:\\WebDrivers\\msedgedriver.exe"); // Set the correct path
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @Test(priority = 1)
    public void openGooglePage() {
        driver.get("https://www.google.com/");
        System.out.println("Page title is: " + driver.getTitle());
    }

	 @AfterMethod
		public void afterMethod() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
	 }    
}
