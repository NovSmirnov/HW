package hw6;

public class ShootingRange {
    private Squad squad1;
    private Squad squad2;

    public ShootingRange(Squad squad1, Squad squad2) {
        this.squad1 = squad1;
        this.squad2 = squad2;
    }

    public void shootings() {
        double squad1Scores = squad1.squadShooting();
        double squad2Scores = squad2.squadShooting();
        System.out.println("");
        if (squad1Scores > squad2Scores) {
            System.out.println("Победило стрелковое отделение " + squad1.getName());
        } else if (squad1Scores < squad2Scores) {
            System.out.println("Победило стрелковое отделение " + squad2.getName());
        } else {
            System.out.println("Победила дружба!");
        }
    }
}
