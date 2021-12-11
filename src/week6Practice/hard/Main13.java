package week6Practice.hard;

public class Main13 {
    public static void main(String[] args) {
        Squirrel s = new Squirrel(new int[] {2, 5, -3, -1});
        System.out.println(s.maxNuts());
        Squirrel s2 = new Squirrel(new int[] {1, -2, 3, 1, -1, -4, 2, 3});
        System.out.println(s2.maxNuts());
    }
}
