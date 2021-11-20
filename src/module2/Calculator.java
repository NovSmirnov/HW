package module2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello! I am the calculator!");
        System.out.println("Please, insert your mathematical expression!");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        double opperand1 = scanner.nextDouble();
        char operation = scanner.next().charAt(0);
        double opperand2 = scanner.nextDouble();
        boolean check = true;
        switch (operation) {
            case '+':
                opperand1 += opperand2;
                break;
            case '-':
                opperand1 -= opperand2;
                break;
            case '*':
                opperand1 *= opperand2;
                break;
            case '/':
                if (opperand2 != 0) {
                    opperand1 /= opperand2;
                }
                else System.out.println("На ноль делить нельзя!");
                break;
            default:
                System.out.println("Введена неверная операция!");
                check = false;
        }
        if(check) {
            System.out.println(opperand1);
            System.out.println();
            System.out.println();
        }
    }
}
