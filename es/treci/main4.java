/*Napíšte program, ktorý prečíta číslo s desatinnou čiarkou a vypíše "nula",
ak je číslo nula. V opačnom prípade výpise „pozitívne číslo“ alebo „negatívne
číslo“. Pridajte „malé“, ak je absolútna hodnota čísla menšia ako 1, alebo
„veľké“, ak je väčšia 1 000 000.
Testovacie dáta
Zadajte číslo: 25
Očakávaný výstup :
Vstupná hodnota: 25
Kladné čísl*/

package es.treci;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte číslo: ");
        double number = scanner.nextDouble();

        if (number == 0) {
            System.out.println("Vstupná hodnota: " + number);
            System.out.println("Nula");
        } else if (number > 0) {
            if (Math.abs(number) < 1) {
                System.out.println("Vstupná hodnota: " + number);
                System.out.println("Malé pozitívne číslo");
            } else if (number > 1000000) {
                System.out.println("Vstupná hodnota: " + number);
                System.out.println("Veľké pozitívne číslo");
            } else {
                System.out.println("Vstupná hodnota: " + number);
                System.out.println("Pozitívne číslo");
            }
        } else {
            if (Math.abs(number) < 1) {
                System.out.println("Vstupná hodnota: " + number);
                System.out.println("Malé negatívne číslo");
            } else if (Math.abs(number) > 1000000) {
                System.out.println("Vstupná hodnota: " + number);
                System.out.println("Veľké negatívne číslo");
            } else {
                System.out.println("Vstupná hodnota: " + number);
                System.out.println("Negatívne číslo");
            }
        }

        scanner.close();
    }
}

