package Utility;

import _05_creatingGameDataRandomly.Game;
import _05_creatingGameDataRandomly.Goal;

public class GameUtils {
    public static void addGameGoals(Game game) {

        int random = (int) (Math.random() * 6);

        Goal[] golos = new Goal[random];

        for (int index = 0; index < golos.length; index++) {

            int team = (int) (Math.random() * 2);
            int player = (int) (Math.random() * 3);
            int time = (int) (Math.random() * 90);

            if (team == 1) {
                Goal goal = new Goal(game.getAwayTeam(), game.getAwayTeam().getPlayerList()[player], time);
                golos[index] = goal;
            } else {
                Goal goal = new Goal(game.getHomeTeam(), game.getHomeTeam().getPlayerList()[player], time);
                golos[index] = goal;
            }
        }

        game.setGoals(golos);
    }
    }