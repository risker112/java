/*. Napíšte program na zobrazenie tabuľky násobenia daného celého čísla.
Testovacie údaje
Zadajte číslo pre výpočet tabuľky násobenia: 5
Očakávaný výstup :
5 x 0 = 0
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25*/

package es.treci;

import java.util.Scanner;

public class main14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte číslo pre výpočet tabuľky násobenia: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}

