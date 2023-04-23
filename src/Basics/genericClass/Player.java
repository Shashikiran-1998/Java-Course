package Basics.genericClass;

import java.util.ArrayList;

public class Player<T> {

//    Player<T>() {
//
//    }
    private ArrayList<T> playersList = new ArrayList<>();

    public void addPlayers(T players) {
        this.playersList.add(players);
    }

    public void addPlayers(ArrayList<T> players) {
        this.playersList.addAll(players);
    }

    public void getPlayers() {
        System.out.println(this.playersList);
    }
}
