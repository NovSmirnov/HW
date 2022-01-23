package practice2;

public class Wizard extends Player{

    private int manaLevel;
    private String element;


    public Wizard(int hp, int level, String type, String weapon, int manaLevel, String element) {
        super(hp, level, type, weapon);
        this.manaLevel = manaLevel;
        this.element = element;
    }

    public void levelUp() {
        super.level += 1;
    }

    public String getFullInfo() {
        return String.format("%d %d %s %s %d %s", super.hp, super.level, super.type, super.weapon, manaLevel, element);
    }

    public boolean doDamage() {
        if (manaLevel >= 10) {
            manaLevel -= 10;
            return true;
        } else {
            return false;
        }
    }
}
