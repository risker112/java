/*Napíšte program na zobrazenie n členov prirodzených čísel a ich súčtu.
Testovacie údaje
Zadajte číslo: 7
Očakávaný výstup :
Zadané číslo:
7
Prvých n prirodzených čísel je: 7
1
2
3
4
5
6
7
Súčet prirodzených čísel až do n členov:
28
*/


package es.treci;

import java.util.Scanner;

public class main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte číslo: ");
        int n = scanner.nextInt();

        System.out.println("Zadané číslo: " + n);
        System.out.println("Prvých n prirodzených čísel je: " + n);

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("Súčet prirodzených čísel až do n členov: " + sum);

        scanner.close();
    }
}

