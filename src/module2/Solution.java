package module2;

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        Solution a = new Solution();
        a.checkDay(8);
    }

    public void checkDay(int number) {
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday ");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Введено некорректное значение");
                break;
        }
    }
}
