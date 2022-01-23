package hw6;

public class Squad {
    private String name;
    private Soldier[] squad;
    private double managementLevel;

    public Squad(Soldier[] squad, String name) {
        this.name = name;
        this.squad = squad;
        managementLevel = 1;
        for (Soldier warrior : squad) {
            if (warrior instanceof Sergeant) {
                if (((Sergeant) warrior).getManagementLevel() > this.managementLevel) {
                    this.managementLevel = ((Sergeant) warrior).getManagementLevel();
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public double squadShooting() {
        double squardShoot = 0;
        System.out.println("Стрельбы стрелкового отделения " + name + ":");
        System.out.println("\n" + "Стрелок" + "\t" + "Оружие" + "\t" + "Количество баллов");
        for (Soldier warrior : squad) {
            System.out.println(warrior.getName() + "\t" + warrior.getGun().getType() + "\t" + warrior.shooting());
            squardShoot += warrior.shooting();
        }
        System.out.println("\n" + "Общие очки стрелкового отделения " + name + ": " + squardShoot);
        System.out.println("\n");
        return squardShoot;
    }
}
