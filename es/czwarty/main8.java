/* Napíšte metódu na výpočet budúcej hodnoty investície pri danej úrokovej
sadzbe na určitý počet rokov.
Vzorové údaje a Výstup:
Zadaj výšku investície: 1000
Zadaj úrokovú sadzbu: 10
Zadaj počet rokov: 5
Očakávaný výstup:
Roky Budúca hodnota
1 1104.71
2 1220.39
3 1348.18
4 1489.35
5 1645.31
*/

package es.czwarty;

import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Získajte vstup od používateľa
        System.out.print("Zadaj výšku investície: ");
        double vyškaInvestície = scanner.nextDouble();

        System.out.print("Zadaj úrokovú sadzbu: ");
        double urokovaSadzba = scanner.nextDouble();

        System.out.print("Zadaj počet rokov: ");
        int pocetRokov = scanner.nextInt();

        // Volanie metódy pre výpočet budúcej hodnoty investície
        vypocetBuducejHodnotyInvesticie(vyškaInvestície, urokovaSadzba, pocetRokov);
    }

    // Metóda na výpočet budúcej hodnoty investície
    public static void vypocetBuducejHodnotyInvesticie(double vyškaInvestície, double urokovaSadzba, int pocetRokov) {
        System.out.println("Roky   Budúca hodnota");
        for (int rok = 1; rok <= pocetRokov; rok++) {
            double buducaHodnota = vyškaInvestície * Math.pow(1 + urokovaSadzba / 100, rok);
            System.out.printf("%-6d %.2f%n", rok, buducaHodnota);
        }
    }
}
