ROCK, PAPER, SCISSORS!

A project by Mohammad Mahdi Akbar from Sharif University of Tehran

This project is programmed in java 17 using intellij IDEA

The application is implemented with the help of MVC architecture

The User in this application deals with 3 different menus:

1. MainMenu:
    
    In this menu the user can either sign up, log in, view the scoreboard of players or just simply exit the app.

    Appropriate errors are shown to help you avoid any redundancies or problems with signing up or logging in.
2. UserPanel:
    
    In this menu the user has the opportunity to:
    1. Play a new game with the computer
    2. View their game stats which states their accomplishments or shortcomings through an elaborate list of details
    3. Log out of their account
3. GameMenu:
    
    This is where the actual game is played.
    
    First the user specifies the maximum number of turns needed to win the game. Then he/she can choose whether they want to play either Rock, Paper or Scissors in each turn. The computer also makes a move. 

    At the end of each round the stats of the round is displayed, and you will know how close to winning or losing you are. Ultimately the fate of the game is decided when on side reaches the desired number of wins.

Instructions on how to navigate between menus and do different actions are disclosed whenever you enter a menu at the top of it before you need to make a decision so pay attention to them.

You can type the number representing each command or simply type the command itself. (The commands are case-sensitive!)

Any further required explanations are given so take notice of them.

Every principal detail about each user is saved on the external memory on a file with the help of Gson library. Note that you need to thoroughly close the app (by navigating between menus and exiting through the MainMenu)  in order to have your recent data saved; so avoid terminating the app in any other way.
