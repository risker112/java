/*Napíšte program na zobrazenie n členov nepárneho prirodzeného čísla a
ich súčtu.
Zadaj nepárne prirodzené číslo 5
Očakávaný výstup :
Nepárne čísla sú:
1
3
5
7
9
Súčet 5 nepárnych prirodzených čísel je: 25*/

package es.treci;

import java.util.Scanner;

public class main15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj nepárne prirodzené číslo: ");
        int n = scanner.nextInt();

        System.out.println("Nepárne čísla sú: ");
        int sum = 0;
        for (int i = 1; i <= n * 2; i += 2) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("Súčet " + n + " nepárnych prirodzených čísel je: " + sum);

        scanner.close();
    }
}
