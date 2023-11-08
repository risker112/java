package es.prvy;

import java.util.Scanner;
public class main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte prvé číslo: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Zadajte druhé číslo: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

        int difference = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);

        int product = firstNumber * secondNumber;
        System.out.println(firstNumber + " x " + secondNumber + " = " + product);

        int quotient = firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);

        int remainder = firstNumber % secondNumber;
        System.out.println(firstNumber + " mod " + secondNumber + " = " + remainder);

        scanner.close();
    }
}
