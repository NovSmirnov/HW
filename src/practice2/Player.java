package practice2;

public abstract class Player {

    protected int hp;
    protected int level;
    protected String type;
    protected String weapon;

    public Player(int hp, int level, String type, String weapon) {
        this.hp = hp;
        this.level = level;
        this.type = type;
        this.weapon = weapon;
    }

    public abstract String getFullInfo();

    public abstract void levelUp();

    public abstract boolean doDamage();
}
