package module3;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Программа для ввода элементов одномерного целочисленного массива и расчёта медианного значения этого массива и
 * суммарного количества цифр во всех элементах данного массива.
 */
public class hwModule3 {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел для ввода!");
        Scanner inputNum = new Scanner(System.in);
        int n = inputNum.nextInt();
        int[] myArray = makeArray(n);
        double median = findMedian(myArray);
        int quNumbers = quantityOfNumbers(myArray);
        System.out.println("Медианное значение равно: " + median);
        System.out.println("Общее количество цифр всех введенных значений равно: " + quNumbers);
        inputNum.close();
    }

    /**
     * Создаёт одномерный массив размерности n из вводимых в консоль натуральных чисел.
     * @param n количество элементов массива.
     * @return массив натуральных чисел размерности n
     */
    private static int[] makeArray(int n) {
        int[] myArray = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите число N %d", i + 1);
            System.out.println(" ");
            Scanner inputNum = new Scanner(System.in);
            int z = inputNum.nextInt();
            myArray[i] = z;
        }
        return myArray;
    }

    /**
     * Находит медиану в массиве натуральных чисел.
     * @param myArray массив натуральных чисел.
     * @return медиану.
     */
    private static double findMedian(int[] myArray) {
        Arrays.sort(myArray);
        double median;
        if (myArray.length % 2 == 0) {
            median = (double) (myArray[myArray.length / 2 - 1] + myArray[myArray.length / 2]) / 2;
        } else {
            median = (double) myArray[(myArray.length - 1) / 2];
        }
        return median;
    }

    /**
     * Находит суммарное количество цифр всех элементов целочисленного массива.
     * @param myArray Массив натуральных чисел.
     * @return Суммарное количество цифр всех элементов целочисленного массива.
     */
    private static int quantityOfNumbers(int[] myArray) {
        int quNum = 0;
        for (int i : myArray) {
            quNum += String.valueOf(i).length();
        }
        return quNum;
    }
}
