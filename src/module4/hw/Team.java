package module4.hw;


public class Team {

    private String teamsName;
    private int power;
    private int luck;
    private int games;
    private int points;

    public Team(String teamsName) {
        this.teamsName = teamsName;
        this.power = (int) (Math.random() * 10);
        this.luck = 0;
        this.games = 0;
        this.points = 0;
    }

    public String getTeamsName() {
        return teamsName;
    }

    public int getPower() {
        return power;
    }

    public int getLuck() {
        return luck;
    }

    public int getGames() {
        return games;
    }

    public int getPoints() {
        return points;
    }

    public void setLuck() {
        this.luck = (int) (Math.random() * 10);
    }

    public void setGames() {
        this.games += 1;
    }

    public void setPoints(int points) {
        this.points = this.points + points;
    }
}
