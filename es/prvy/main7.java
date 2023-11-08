package es.prvy;

import java.util.Scanner;
public class main7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("zadaj cislo: ");
        int number = scanner.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(number + "x" + i + " = " + number*i);
        }
    }
}
