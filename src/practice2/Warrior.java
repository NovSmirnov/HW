package practice2;

public class Warrior extends Player{

    private String armor;


    public Warrior(int hp, int level, String type, String weapon, String armor) {
        super(hp, level, type, weapon);
        this.armor = armor;
    }

    public void levelUp() {
        super.level += 1;
    }

    public String getFullInfo() {
        return String.format("%d %d %s %s %s", super.hp, super.level, super.type, super.weapon, armor);
    }

    public boolean doDamage() {
        return true;
    }
}
