import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by DELL on 5/7/2017.
 */
public class MyTest extends BaseTest {

    @DataProvider(name = "My")
    public static Object[][] Name() {
         return new Object[][]{{"http://ua.korrespondent.net/"},{"https://mail.ru/"}};
    }

    @Test(dataProvider = "My",invocationCount = 3)
    public void testA(String url) throws Exception {
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(),url);
    }
}
