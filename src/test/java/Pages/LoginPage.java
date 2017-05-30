package Pages;

import Utils.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by yarik on 5/20/2017.
 */
public class LoginPage extends BasePage {

    @FindBy(id= "mailbox__login")

    private WebElement inputLogin;

    @FindBy(id = "mailbox__password")
    private WebElement inputPassword;

    @FindBy(id = "mailbox__auth__button")
    private WebElement btn;



    public void login(User user){
        inputLogin.sendKeys(user.name);
        inputPassword.sendKeys(user.password);
        btn.click();


    }


}
