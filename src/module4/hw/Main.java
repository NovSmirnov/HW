package module4.hw;

public class Main {
    public static void main(String[] args) {
        String[] teamNames = new String[] {"Spartak", "Dinamo", "CSKA", "Torpedo"};
        Team[] teams = new Team[teamNames.length];
        for (int i = 0; i < teams.length; i++) {
            teams[i] = new Team(teamNames[i]);
        }

        Championship worldCup = new Championship(teams);
        worldCup.playTournament();
        worldCup.printTourTable();
    }
}
