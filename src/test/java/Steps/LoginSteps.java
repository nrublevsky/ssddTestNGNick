package Steps;

import Pages.LoginPage;
import Utils.UserFactory;

/**
 * Created by yarik on 5/20/2017.
 */
public class LoginSteps extends LoginPage {

   public void loginValidUser() throws InterruptedException {
        login(UserFactory.getValidUser());
    }
    public void loginInValidUser() throws InterruptedException {
        login(UserFactory.getInValidUser());
    }
}
