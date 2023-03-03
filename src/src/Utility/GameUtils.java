package Utility;

import _05_creatingGameDataRandomly.Game;
import _05_creatingGameDataRandomly.Goal;

public class GameUtils {
    public static void addGameGoals(Game game){
        int goals = (int) (Math.random()*6);
        int player = (int) (Math.random()*3);
        int time = (int)(Math.random()*90);
        int team = (int)(Math.random()*2);

        /*for (int i=0; i<golos; i++){


        }
        if(team==1){

        }
        Goal[] golos = new Goal[random];

        game.setGoals(golos);
            */
    }
}
