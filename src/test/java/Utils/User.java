package Utils;

/**
 * Created by yarik on 5/20/2017.
 */
public class User {
    public String name;
    public String password;
    public String mail;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, String mail) {
        this.name = name;
        this.password = password;
        this.mail = mail;
    }


}
