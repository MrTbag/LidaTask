package View;

import Controller.GameController;

import java.util.Scanner;

public class GameMenu extends Menu{

    @Override
    public void run(Scanner scanner){
        System.out.println("Welcome to a new game");
        System.out.println("Please specify below the number of wins needed to win a game");
        GameController.maximumWins = Integer.parseInt(scanner.nextLine());
        System.out.println("In each turn you can either play rock, paper or scissors: ");
        String cmd;
        do {
            System.out.println();
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            cmd = scanner.nextLine();
        } while (!checkCommand(cmd, scanner));
    }

    @Override
    public boolean checkCommand(String cmd, Scanner scanner){
        if (cmd.equals("1") || cmd.equals("Rock")){
            GameController.computerPlayTurn();
            GameController.playerPlayTurn(GameController.GameState.ROCK);
            System.out.println(GameController.checkRoundWinner() + "\n" + GameController.checkGameStats());
            String result = GameController.checkWinLose();
            if (result.endsWith("!")){
                System.out.println(result);
                return true;
            }
            return false;
        }

        if (cmd.equals("2") || cmd.equals("Paper")){
            GameController.computerPlayTurn();
            GameController.playerPlayTurn(GameController.GameState.PAPER);
            System.out.println(GameController.checkRoundWinner() + "\n" + GameController.checkGameStats());
            String result = GameController.checkWinLose();
            if (result.endsWith("!")){
                System.out.println(result);
                return true;
            }
            return false;
        }

        if (cmd.equals("3") || cmd.equals("Scissors")){
            GameController.computerPlayTurn();
            GameController.playerPlayTurn(GameController.GameState.SCISSORS);
            System.out.println(GameController.checkRoundWinner() + "\n" + GameController.checkGameStats());
            String result = GameController.checkWinLose();
            if (result.endsWith("!")){
                System.out.println(result);
                return true;
            }
            return false;
        }

        System.out.println("Invalid Command!");
        return false;
    }
}
