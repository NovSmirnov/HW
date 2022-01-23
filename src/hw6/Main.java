package hw6;

public class Main {
    public static void main(String[] args) {
        Gun pistol = new Gun("Pistol", 1.5, 3);
        Gun rifle = new Gun("Rifle", 2.0, 8);
        Gun assaultRifle = new Gun("Assault rifle", 1.3, 6);

        Soldier jonson = new Soldier("Jonson", 4, pistol);
        Soldier kelly = new Soldier("Kelly", 3, rifle);
        Soldier mike = new Soldier("Mike", 7, assaultRifle);
        Soldier john = new Soldier("John", 5, rifle);
        Soldier brett = new Soldier("Brett", 5, assaultRifle);
        Soldier alex = new Soldier("Alex", 4, pistol);

        Sergeant nick = new Sergeant("Nick", 6, pistol, 1.3);
        Sergeant dixon = new Sergeant("Dixon", 8, assaultRifle, 1.4);
        Sergeant kirk = new Sergeant("Kirk", 5, pistol, 1.2);
        Sergeant sandy = new Sergeant("Sandy", 9, assaultRifle, 1.5);

        Soldier[] squad1 = {jonson, kelly, mike, nick, dixon};
        Soldier[] squad2 = {john, brett, alex, kirk, sandy};

        Squad delta = new Squad(squad1, "Delta");
        Squad bravo = new Squad(squad2, "Bravo");

        ShootingRange firingField = new ShootingRange(delta, bravo);
        firingField.shootings();
    }
}
