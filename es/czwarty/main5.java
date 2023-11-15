/*. Napíšte metódu na počítanie všetkých slov v reťazci.
Testovacie údaje:
Zadajte reťazec: Kto nevie byť spokojný s málom, nebude spokojný nikdy.
Očakávaný výstup:
Počet slov v reťazci: 9*/
package es.czwarty;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Získajte vstup od používateľa
        System.out.print("Zadajte reťazec: ");
        String retazec = scanner.nextLine();

        // Volanie metódy pre počítanie slov
        int pocetSlov = pocetSlovVRetazci(retazec);

        // Výstup
        System.out.println("Počet slov v reťazci: " + pocetSlov);
    }

    // Metóda na počítanie slov v reťazci
    public static int pocetSlovVRetazci(String retazec) {
        String[] slova = retazec.split("\\s+");
        return slova.length;
    }
}
