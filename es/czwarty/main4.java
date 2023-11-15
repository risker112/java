/*Napíšte metódu na počítanie všetkých samohlások v reťazci.
Testovacie údaje:
Zadajte reťazec: Odvaha
Očakávaný výstup:
Počet samohlások v reťazci: 3
 */


package es.czwarty;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Získajte vstup od používateľa
        System.out.print("Zadajte reťazec: ");
        String retazec = scanner.next();

        // Volanie metódy pre počítanie samohlások
        int pocetSamohlasok = pocetSamohlasokVRetazci(retazec);

        // Výstup
        System.out.println("Počet samohlások v reťazci: " + pocetSamohlasok);
    }

    // Metóda na počítanie samohlások v reťazci
    public static int pocetSamohlasokVRetazci(String retazec) {
        int pocet = 0;
        String samohlasky = "aeiouAEIOU";

        for (int i = 0; i < retazec.length(); i++) {
            char znak = retazec.charAt(i);
            if (samohlasky.contains(String.valueOf(znak))) {
                pocet++;
            }
        }

        return pocet;
    }
}


