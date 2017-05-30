package Tests;


import Utils.User;
import Utils.UserFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by DELL on 5/7/2017.
 */
public class BaseTest {
    MyApplication  app = new MyApplication();
    User validUser;
    User inValidUser;
    @BeforeSuite
    public void setSuite() throws Exception {
       validUser = UserFactory.getValidUser();
       inValidUser = UserFactory.getInValidUser();
                app.common.appStart();

    }

    @AfterSuite
    public void tearDown() throws Exception {
    app.common.appStop();
    }
}