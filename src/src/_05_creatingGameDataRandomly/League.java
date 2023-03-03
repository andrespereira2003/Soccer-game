package _05_creatingGameDataRandomly;

import Utility.GameUtils;

public class League {
    public static void main(String[] args) {

        Team[] equipas = createTeams();
        Game[] game = createGames(equipas);

        System.out.println(game[0].getGoals()[0].toString());
    }

    private static Game[] createGames(Team[] equipas) {
        Game game1 = new Game(equipas[0], equipas[1]);

        Goal goal1 = new Goal(equipas[1], equipas[1].getPlayerList()[2], 55);

        /*int random = (int) (Math.random()*6);

        Goal[] golos = new Goal[random];

        System.out.println(random);*/

        GameUtils.addGameGoals(game1);

        return new Game[]{game1};
    }

    public static Team[] createTeams(){
        Player player1 = new Player("George Eliot");
        Player player2 = new Player("Graham Greene");
        Player player3 = new Player("Geoffrey Chaucer");

        Player[] listajogadoresgreens = new Player[]{player1, player2, player3};
        Team team1 = new Team("The Greens", listajogadoresgreens);

        //player1.setPlayerName("Robert Service");

        Player player4 = new Player("Robert Service");
        Player player5 = new Player("Robbie Burns");
        Player player6 = new Player("Rafael Sabatini");

        Player[] listajogadoresreds = new Player[]{player4, player5, player6};
        Team team2 = new Team("The Reds", listajogadoresreds);

        return new Team[]{team1, team2};
    }
}
