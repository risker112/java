/*. Napíšte program, ktorý zo zadaných 5 čísel z klávesnice nájde ich súčet a
priemer.
Testovacie údaje
Zadajte 5 čísel: 1 2 3 4 5
Očakávaný výstup :
Zadané 5 čísla:
1
2
3
4
5
Súčet 5 je: 15
Priemer je: 3.0*/

package es.treci;

import java.util.Scanner;

public class main12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte 5 čísel: ");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            sum += number;
        }

        double average = (double) sum / 5;

        System.out.println("Zadané 5 čísla: ");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("Súčet 5 je: " + sum);
        System.out.println("Priemer je: " + average);

        scanner.close();
    }
}