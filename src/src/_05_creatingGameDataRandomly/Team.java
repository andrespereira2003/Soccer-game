package _05_creatingGameDataRandomly;

public class Team {
    private String teamName;
    private Player[] playerList;

    public Team(String teamName, Player[] playerName) {
        this.teamName = teamName;
        this.playerList = playerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public Player[] getPlayerList() {
        return playerList;
    }
}
