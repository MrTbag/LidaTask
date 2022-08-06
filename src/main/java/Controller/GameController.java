package Controller;

import java.util.Random;

public class GameController extends Controller{
    public enum GameState {
        ROCK,
        PAPER,
        SCISSORS,
    }

    public static GameState computerState;
    public static GameState playerState;

    private static int playerWins = 0;
    private static int computerWins = 0;
    public static int maximumWins;

    public static void computerPlayTurn(){
        int choice = new Random().nextInt() % 3 + 1;

        switch (choice){
            case (1):
                computerState = GameState.ROCK;
                break;
            case (2):
                computerState = GameState.PAPER;
                break;
            case (3):
                computerState = GameState.SCISSORS;
                break;
            default:
                break;
        }
    }

    public static void playerPlayTurn(GameState choice){
        playerState = choice;
    }

    public static String checkRoundWinner(){
        if (playerState != null && computerState != null){
            if (playerState.equals(GameState.ROCK)){
                if (computerState.equals(GameState.ROCK))
                    return "Computer played " + GameController.computerState.name() + " => " + "Draw";
                if (computerState.equals(GameState.PAPER)) {
                    computerWins ++;
                    return "Computer played " + GameController.computerState.name() + " => " + "You lost this round";
                }
                if (computerState.equals(GameState.SCISSORS)){
                    playerWins ++;
                    return "Computer played " + GameController.computerState.name() + " => " + "You won this round";
                }

            }

            if (playerState.equals(GameState.PAPER)){
                if (computerState.equals(GameState.ROCK)){
                    playerWins ++;
                    return "Computer played " + GameController.computerState.name() + " => " + "You won this round";
                }
                if (computerState.equals(GameState.PAPER))
                    return "Computer played " + GameController.computerState.name() + " => " + "Draw";
                if (computerState.equals(GameState.SCISSORS)){
                    computerWins ++;
                    return "Computer played " + GameController.computerState.name() + " => " + "You lost this round";
                }

            }

            if (playerState.equals(GameState.SCISSORS)){
                if (computerState.equals(GameState.ROCK)){
                    computerWins ++;
                    return "Computer played " + GameController.computerState.name() + " => " + "You lost this round";
                }
                if (computerState.equals(GameState.PAPER)){
                    playerWins ++;
                    return "Computer played " + GameController.computerState.name() + " => " + "You won this round";
                }
                if (computerState.equals(GameState.SCISSORS))
                    return "Computer played " + GameController.computerState.name() + " => " + "Draw";
            }
        }

        return "The turn is not finished yet!";
    }

    public static String checkGameStats(){
        return "Player: " + playerWins + "/" + maximumWins + "  " + "Computer: " + computerWins + "/" + maximumWins;
    }

    public static String checkWinLose(){
        if (playerWins == maximumWins){
            loggedInUser.addWin();
            playerWins = 0;
            computerWins = 0;
            playerState = null;
            computerState = null;
            return "You Won The Game!";
        }
        if (computerWins == maximumWins){
            loggedInUser.addLoss();
            playerWins = 0;
            computerWins = 0;
            playerState = null;
            computerState = null;
            return "You Lost The Game!";
        }

        return "continue";
    }
}
