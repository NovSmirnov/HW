package module2;

public class Loader {
    public static void main(String[] args) {
        int sum = 10;
        for (int i = 10; i < 100; i = i + 10) {
            sum += i;
        }
        System.out.println(sum);
    }
}