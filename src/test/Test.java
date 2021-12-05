package test;

public class Test {
    public static void main(String[] args) {
        char z = 'Z';
        int a = (int) z;
        z = (char) (a + 5);
        System.out.println(a);
        int shift = 3 % 25;
        System.out.println(shift);
    }
}
