package module4.hw;

public class Championship {

    Team[] teams;

    public Championship(Team[] teams) {
        this.teams = teams;
    }

    //Проведение турнира
    public void playTournament() {
        for (int i = 0; i < teams.length - 1; i++) {
            for (int j = i + 1; j < teams.length; j++) {
                teams[i].setLuck();
                teams[i].setGames();
                teams[j].setLuck();
                teams[j].setGames();
                if (teams[i].getLuck() * teams[i].getPower() > teams[j].getLuck() * teams[j].getPower()) {
                    teams[i].setPoints(2);
                } else if (teams[i].getLuck() * teams[i].getPower() < teams[j].getLuck() * teams[j].getPower()) {
                    teams[j].setPoints(2);
                } else {
                    teams[i].setPoints(1);
                    teams[j].setPoints(1);
                }
            }
        }
    }

    //Вывод турнирной таблицы
    public void printTourTable() {
        System.out.println("Team \t Points \t Games");
        for (Team team : teams) {
            System.out.println(team.getTeamsName() + "\t      " + team.getPoints() + "\t         " + team.getGames());
        }
    }
}
