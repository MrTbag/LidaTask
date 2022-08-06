package View;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public void run(Scanner scanner){
        String cmd;
        do {
            cmd = scanner.nextLine();
        } while (!checkCommand(cmd, scanner));
    }

    public boolean checkCommand(String cmd, Scanner scanner){
        return false;
    }
}
