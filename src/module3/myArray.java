package module3;

import java.util.Arrays;

public class myArray {
    public static void main(String[] args) {
        int[] myArray = new int[11];
        int counter = 0;
        for (int i = 5; i < 16; i++) {
            myArray[counter] = i;
            counter++;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
