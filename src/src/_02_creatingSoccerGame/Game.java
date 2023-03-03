package _02_creatingSoccerGame;

import java.sql.Array;
import java.util.ArrayList;

public class Game {
    private Team awayTeam;
    private Team homeTeam;
    private Goal[] goals;

    public Game(Team awayTeam, Team homeTeam) {
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.goals = null;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Goal[] getGoals() {
        return goals;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setGoals(Goal[] goals) {
        this.goals = goals;
    }
}
