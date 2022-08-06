package View;

import Controller.Controller;
import Controller.MainMenuController;

import java.util.Scanner;

public class MainMenu extends Menu{
    @Override
    public void run(Scanner scanner){
        String cmd;
        do {
            System.out.println();
            System.out.println("MainMenu:");
            System.out.println("1. Signup");
            System.out.println("2. Login");
            System.out.println("3. Scoreboard");
            System.out.println("4. Exit");
            cmd = scanner.nextLine();
        } while (!checkCommand(cmd, scanner));
    }

    @Override
    public boolean checkCommand(String cmd, Scanner scanner){
        if (cmd.equals("1") || cmd.equals("Signup")){
            System.out.println("Enter your name, username, password in the same order each in a new line to proceed with the signup");
            System.out.println("The password needs to be at least 8 characters long");
            String name = scanner.nextLine();
            String username = scanner.nextLine();
            String password = scanner.nextLine();
            String result = MainMenuController.signup(name, username, password);
            System.out.println(result);
            return false;
        }

        if (cmd.equals("2") || cmd.equals("Login")){
            System.out.println("Enter your username and password in the same order each in a new line to proceed with the login");
            String username = scanner.nextLine();
            String password = scanner.nextLine();
            String result = MainMenuController.login(username, password);
            System.out.println(result);
            if (!result.endsWith("!")){
                UserPanel userPanel = new UserPanel();
                userPanel.run(scanner);
            }
            return false;
        }

        if (cmd.equals("3") || cmd.equals("Scoreboard")){
            System.out.println(MainMenuController.showUsers());
            return false;
        }

        if (cmd.equals("4") || cmd.equals("Exit")){
            System.out.println("Exiting The App");
            return true;
        }

        System.out.println("Invalid Command!");
        return false;
    }
}
