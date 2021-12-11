package module3;

public class Table {
    public static short size = 9;
    public static String[][] strings;

    public static void main(String[] args) {
        strings = new String[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = size - 1; j >= 0 ; j--) {
                char newChar = (char) (65 + j);
                String temp = new String(newChar + String.valueOf(i + 1));
                strings[size - 1 - i][j] = temp;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(String.join(" ", strings[i]));
        }
    }

}
