package Utils;


import java.util.ResourceBundle;

/**
 * Created by yarik on 5/20/2017.
 */
public class UserFactory {
    static ResourceBundle user;
    static {
         user = ResourceBundle.getBundle("User");
    }

    public static User getValidUser(){
        return new User(user.getString("name"),user.getString("password"),user.getString("email"));

    }
     public static User getInValidUser(){
        return new User("mytest_", "337774a");
    }
}
