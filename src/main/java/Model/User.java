package Model;

import java.util.ArrayList;

public class User implements Comparable<User>{
    private final String name;
    private final String username;
    private final String password;
    private int wins = 0;
    private int losses = 0;
    private int games = 0;
    private double winRate = 0;
    public static ArrayList<User> users = new ArrayList<>();

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
        users.add(this);
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public double getWinRate() {
        return winRate;
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public void addWin(){
        this.wins ++;
        this.games ++;
        this.winRate = (double) wins / games;
    }

    public void addLoss(){
        this.losses ++;
        this.games ++;
        this.winRate = (double) wins / games;
    }

    public static void setUsers(ArrayList<User> users) {
        User.users = users;
    }

    @Override
    public int compareTo(User o) {
        return o.getWins() - this.wins;
    }
}
