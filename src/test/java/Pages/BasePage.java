package Pages;

import Driver.MyDriver;
import Driver.MyDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by yarik on 5/20/2017.
 */
public abstract class BasePage {
    protected static String BASE_URL = "https://mail.ru/";
    static protected MyDriver driver = MyDriver.getDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }


}
