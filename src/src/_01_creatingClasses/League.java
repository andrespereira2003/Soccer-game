package _01_creatingClasses;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class League {
    public static void main(String[] args) {
        Player player1 = new Player("George Eliot");
        Player player2 = new Player("Graham Greene");
        Player player3 = new Player("Geoffrey Chaucer");

        Player[] listajogadoresgreens = new Player[]{player1, player2, player3};
        Team team1 = new Team("The Greens", listajogadoresgreens);

        //player1.setPlayerName("Robert Service");

        for (Player player: team1.getPlayerList()) {
            System.out.println(player.getPlayerName());
        }

        Player player4 = new Player("Robert Service");
        Player player5 = new Player("Robbie Burns");
        Player player6 = new Player("Rafael Sabatini");

        Player[] listajogadoresreds = new Player[]{player4, player5, player6};
        Team team2 = new Team("The Reds", listajogadoresreds);

        for (Player player: team2.getPlayerList()) {
            System.out.println(player.getPlayerName());
        }
    }
}
