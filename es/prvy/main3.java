package es.prvy;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        int dividend = 50;
        int divisor = 3;

        int result = dividend / divisor;

        System.out.println("Pevne zadaný podiel je: " + result);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadajte prvý počet: ");
        int userDividend = scanner.nextInt();
        System.out.println("Zadajte druhý počet: ");
        int userDivisor = scanner.nextInt();
        int userResult = userDividend / userDivisor;
        System.out.println("Podiel zadaných čísel je: " + userResult);
    }
}

