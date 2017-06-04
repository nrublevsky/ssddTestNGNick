package Pages;

import Utils.User;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by yarik on 5/20/2017.
 */
public class LoginPage extends BasePage {
    Logger log= Logger.getLogger(LoginPage.class);

    @FindBy(id= "mailbox__login")
    private WebElement inputLogin;

    @FindBy(id = "mailbox__password")
    private WebElement inputPassword;

    @FindBy(id = "mailbox__auth__button")
    private WebElement btn;



    protected void login(User user){
        log.info("User name - "+ user.name+ " mail - "+user.mail);
        inputLogin.sendKeys(user.name);
        inputPassword.sendKeys(user.password);
        btn.click();


    }


}
