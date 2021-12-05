package module2;

public class Lighthouse {
    public static void main(String[] args) {
        double check = 34.3;
        for (int i = 0; i < 60; i = i + 5) {
            if (check >= i && check < i + 3) {
                System.out.println("Green");
            } else if (check >= i + 3 && check < i + 4) {
                System.out.println("Yellow");
            } else if (check >= i + 4 && check < i + 5) {
                System.out.println("Red");
            }
        }
    }
}
