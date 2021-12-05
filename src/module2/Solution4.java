package module2;

public class Solution4 {
    public static void main(String[] args) {
        int number = 23;
        int steps = 0;
        System.out.print(number + " ");
        while (number > 1) {
            if (number % 2 == 0) {
                number /= 2;
                steps++;
                System.out.print(number + " ");
            }else {
                number = number * 3 + 1;
                System.out.print(number + " ");
                steps++;
            }
        }
        System.out.println();
        System.out.println(steps);
    }
}
