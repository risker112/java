/*Napíšte metódu na zobrazenie stredného znaku reťazca.
Poznámka:
a) Ak je dĺžka reťazca nepárna, bude tam jeden stredný znak.
b) Ak je dĺžka reťazca párna, budú tam dva stredné znaky.
Testovacie údaje:
Zadajte reťazec: 350
Očakávaný výstup:
Stredný znak v reťazci: 5
 */

package es.czwarty;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Získajte vstup od používateľa
        System.out.print("Zadajte reťazec: ");
        String retazec = scanner.next();

        // Volanie metódy pre stredný znak
        char strednyZnak = strednyZnakRetazca(retazec);

        // Výstup
        System.out.println("Stredný znak v reťazci: " + strednyZnak);
    }

    // Metóda na zobrazenie stredného znaku reťazca
    public static char strednyZnakRetazca(String retazec) {
        int dlzka = retazec.length();

        if (dlzka % 2 == 0) {
            // Pre párny počet znakov vráti druhý zo stredných znakov
            return retazec.charAt(dlzka / 2 - 1);
        } else {
            // Pre nepárny počet vráti stredný znak
            return retazec.charAt(dlzka / 2);
        }
    }
}
