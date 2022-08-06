import Controller.Controller;
import Model.User;
import View.MainMenu;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Gson gson = new GsonBuilder().create();
        try {
            if (gson.fromJson(Controller.loadFromFile("users.json"), new TypeToken<List<User>>(){}.getType()) != null)
                User.setUsers(gson.fromJson(Controller.loadFromFile("users.json"), new TypeToken<List<User>>(){}.getType()));
        } catch (IOException e){
            e.printStackTrace();
        }


        Scanner scanner = new Scanner(System.in);
        MainMenu mainMenu = new MainMenu();
        mainMenu.run(scanner);

        String jsonString = gson.toJson(User.getUsers());
        try {
            Controller.savetoFile("users.json", jsonString);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
