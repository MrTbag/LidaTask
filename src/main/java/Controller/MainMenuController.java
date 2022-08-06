package Controller;

import Model.User;

import java.util.Collections;
import java.util.SplittableRandom;

public class MainMenuController extends Controller{
    public static String signup(String name, String username, String password){
        if (!isUsernameUnique(username))    return "There is already a user with this specific username!";

        if (!isPasswordValid(password))     return "Password is not valid!";

        new User(name, username, password);
        return "Signed up successfully";
    }

    public static String login(String username, String password){

        if (isUsernameUnique(username))  return "No user exists with this username!";

        User user = getUser(username, password);

        if (user == null)   return "Username and password don't match!";

        loggedInUser = user;
        return "Logged in successfully\nWelcome " + user.getName();
    }

    public static boolean isUsernameUnique(String username){
        for (User user : User.getUsers()) {
            if (user.getUsername().equals(username))
                return false;
        }

        return true;
    }

    public static boolean isPasswordValid(String password){
        if (password.length() < 8)  return false;

        return true;
    }

    public static User getUser(String username, String password){
        for (User user : User.getUsers()) {
            if (user.getUsername().equals(username)){
                if (user.getPassword().equals(password))
                    return user;
            }
        }

        return null;
    }

    public static String showUsers(){
        String result = "";

        Collections.sort(User.getUsers());

        int cnt = 1;
        for (User user : User.getUsers()) {
            result += cnt + ". " + user.getUsername() + " Wins: " + user.getWins() + "\n";
            cnt ++;
        }

        if (User.getUsers().size() == 0)
            result += "No users have played the game yet!";

        return result;
    }
}
