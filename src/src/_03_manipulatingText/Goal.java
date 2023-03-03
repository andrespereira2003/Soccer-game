package _03_manipulatingText;

public class Goal {
    private Team team;
    private Player player;
    private double duration;

    public Goal(Team team, Player player, double duration) {
        this.team = team;
        this.player = player;
        this.duration = duration;
    }

    public Team getTeam() {
        return team;
    }

    public Player getPlayer() {
        return player;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Goal scored after " + this.getDuration() + " by " +
                this.getPlayer().getPlayerName() + " of the " + this.getTeam().getTeamName();
    }
}
