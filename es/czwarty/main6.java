/*Napíšte metódu na výpočet súčtu číslic v celom čísle.
Testovacie údaje:
Zadajte celé číslo: 25
Očakávaný výstup:
Súčet je 7 */
package es.czwarty;

import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Získajte vstup od používateľa
        System.out.print("Zadajte celé číslo: ");
        int celeCislo = scanner.nextInt();

        // Volanie metódy pre výpočet súčtu číslic
        int sucetCislic = sucetCislicVCisle(celeCislo);

        // Výstup
        System.out.println("Súčet je " + sucetCislic);
    }

    // Metóda na výpočet súčtu číslic v celom čísle
    public static int sucetCislicVCisle(int cislo) {
        int sucet = 0;
        String cisloString = String.valueOf(cislo);

        for (int i = 0; i < cisloString.length(); i++) {
            char cislica = cisloString.charAt(i);
            sucet += Character.getNumericValue(cislica);
        }

        return sucet;
    }
}
