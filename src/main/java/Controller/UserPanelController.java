package Controller;

import Model.User;

public class UserPanelController extends Controller{
    public static String showStats(){
        String result = "";
        result += "Number of wins: " + loggedInUser.getWins() + "\n";

        result += "Number of Losses: " + loggedInUser.getLosses() + "\n";

        result += "Win rate: " + loggedInUser.getWinRate();

        return result;
    }

    public static String logout(){
        loggedInUser = null;

        return "Logged out successfully";
    }
}
