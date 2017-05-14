import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by DELL on 5/7/2017.
 */
public class BaseTest {
    WebDriver driver;
    @BeforeSuite
    public void setSuite() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
        driver=new FirefoxDriver();

    }

    @AfterSuite
    public void tearSuit() throws Exception {
     driver.quit();
    }
}
