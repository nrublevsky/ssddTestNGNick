package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by DELL on 5/7/2017.
 */
public class MyTest extends BaseTest {

    @Test(description = "@345")
    public void testA() {
        app.login.loginValidUser();

        Assert.assertEquals(app.mail.getUserMail(), validUser.mail);

    }

}
