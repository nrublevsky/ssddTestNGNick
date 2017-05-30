package Steps;

import Pages.BasePage;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by yarik on 5/20/2017.
 */
public class CommonSteps extends BasePage {

    public void appStart() {
        driver.get(BASE_URL);
    }

    public void appStop() {
        driver.quit();
    }
}
