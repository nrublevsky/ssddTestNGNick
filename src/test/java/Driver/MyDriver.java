package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

/**
 * Created by yarik on 5/28/2017.
 */
public class MyDriver implements WebDriver {
    private WebDriver  driver;
    private static MyDriver myDriver;

    private MyDriver() {
        this.driver = MyDriverFactory.getDriver();
    }
    public static  MyDriver getDriver(){
     if (myDriver==null)
         return new MyDriver();
     return myDriver;
    }
    @Override
    public void get(String url) {
        driver.get(url);
    }

    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    @Override
    public String getPageSource() {
        return  driver.getPageSource();
    }

    @Override
    public void close() {
     driver.close();
    }

    @Override
    public void quit() {
 driver.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return driver.switchTo();
    }

    @Override
    public Navigation navigate() {
        return driver.navigate();
    }

    @Override
    public Options manage() {
        return driver.manage();
    }

    public  WebElement getWebElementWithWait(WebElement webElement,int timeOut){
        return new WebDriverWait(driver,timeOut, 500)
                .until( ExpectedConditions.visibilityOf(webElement));

    }
   public void scrollUp() {
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,0)");

    }
    /**
     * Scroll Down
     */
    public void scrollDown() {
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");

    }
}
