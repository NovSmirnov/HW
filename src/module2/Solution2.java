package module2;

public class Solution2 {

    public static void main(String[] args) {
        Solution2 a = new Solution2();
        a.numbers(-2, 8, 9);
    }

    public void numbers(int a, int b, int c) {
        String line = new String("");

        if (a > 0) {
            line += "n positive, ";
        } else if (a < 0) {
            line += "n negative, ";
        } else {
            line += "n equals 0, ";
        }
        if (b > 0) {
            line += "m positive, ";;
        } else if (b < 0) {
            line += "m negative, ";
        } else {
            line += "m equals 0, ";
        }
        if (c > 0) {
            line += "k positive";;
        } else if (c < 0) {
            line += "k negative";
        } else {
            line += "k equals 0";
        }
        System.out.println(line);
    }

}
