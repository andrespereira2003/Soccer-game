package _02_creatingSoccerGame;

public class League {
    public static void main(String[] args) {
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

        Game game1 = new Game(team1, team2);

        Goal goal1 = new Goal(team1, player3, 55);

        game1.setGoals(new Goal[]{goal1});

        System.out.println(game1.getGoals()[0].toString());
    }
}
