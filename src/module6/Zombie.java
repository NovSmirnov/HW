package module6;

public class Zombie extends Monster {
    private String nameZ;
    private int damageZ;

    public Zombie(String name) {
        super(name + " " + "The Zombie", 5);
        System.out.println("Monster" + " " +  name + " " + "the Zombie was created");
    }

    public void growl() {
        System.out.println("Raaaauuughhhh" + " " + this.nameZ + " " + "the Zombie growled");
    }

    public void attack() {
        System.out.println("Monster" + " " + this.nameZ + " " + "the Zombie attacked with damage" + " " + this.damageZ);
        this.growl();
    }

}
