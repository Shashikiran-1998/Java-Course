package Basics.genericClass;

public class main {

    public static void main(String[] args) {
        Player<FootballPlayer> p1=new Player();
        p1.addPlayers(new FootballPlayer());
//        p1.addPlayers(new BasketBallTeam()); // error
    }
}
