package module2;

public class Solution3 {
    public static void main(String[] args) {
        int number = 453;
        int t = String.valueOf(number).length();
        boolean isEven = number % 2 == 0;

        if (t == 1 && isEven) {
            System.out.println("even single digit number");
        }else if (t == 1 && !isEven) {
            System.out.println("odd single digit number");
        }else if (t == 2 && isEven) {
            System.out.println("even two-digit number");
        }else if (t == 2 && !isEven) {
            System.out.println("odd two-digit number");
        }else if (t == 3 && isEven) {
            System.out.println("even three-digit number");
        }else if (t == 3 && !isEven) {
            System.out.println("odd three-digit number");
        }
    }
}
