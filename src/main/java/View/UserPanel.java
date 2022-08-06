package View;

import Controller.UserPanelController;

import java.util.Scanner;

public class UserPanel extends Menu{
    @Override
    public void run(Scanner scanner){
        String cmd;
        do {
            System.out.println();
            System.out.println("UserPanel:");
            System.out.println("1. NewGame");
            System.out.println("2. ShowStats");
            System.out.println("3. Logout");
            cmd = scanner.nextLine();
        } while (!checkCommand(cmd, scanner));
    }

    public boolean checkCommand(String cmd, Scanner scanner){
        if (cmd.equals("1") || cmd.equals("NewGame")){
            GameMenu gameMenu = new GameMenu();
            gameMenu.run(scanner);
            return false;
        }

        if (cmd.equals("2") || cmd.equals("ShowStats")){
            String result = UserPanelController.showStats();
            System.out.println(result);
            return false;
        }

        if (cmd.equals("3") || cmd.equals("Logout")){
            System.out.println(UserPanelController.logout());
            return true;
        }

        System.out.println("Invalid Command!");
        return false;
    }
}
