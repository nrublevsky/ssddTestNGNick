package Steps;

import Pages.LoginPage;
import Utils.UserFactory;
import org.apache.log4j.Logger;

/**
 * Created by yarik on 5/20/2017.
 */
public class LoginSteps extends LoginPage {
    Logger log =Logger.getLogger(LoginSteps.class);

   public void loginValidUser()
   {
        login(UserFactory.getValidUser());
    }
    public void loginInValidUser()  {
        login(UserFactory.getInValidUser());
    }
}
