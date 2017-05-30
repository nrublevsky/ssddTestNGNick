package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by yarik on 5/27/2017.
 */
public class MyDriverFactory {
    static WebDriver driver = null;

    public static WebDriver getDriver() {
        final String driverName = System.getProperty("driver");
        if ("firefox".equals(driverName)) {
            System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if ("chrome".equals(driverName)){
            System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else {
            System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
