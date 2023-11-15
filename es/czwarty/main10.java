/*. Napíšte metódu na kontrolu, či rok (celé číslo) zadaný používateľom je
alebo nie je priestupný. Poznámka: Rok je priestupný ak je deliteľný 4 alebo je
deliteľný 4 a zároveň nie je deliteľný 100 alebo je deliteľný 4 a zároveň 100
a zároveň 400.
Očakávaný výstup:
Zadaný rok: 2022
falošné*/

package es.czwarty;

import java.util.Scanner;

public class main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Získajte vstup od používateľa
        System.out.print("Zadaný rok: ");
        int rok = scanner.nextInt();

        // Volanie metódy pre kontrolu priestupného roku
        boolean jePriestupny = kontrolaPriestupnehoRoku(rok);

        // Výstup
        System.out.println(jePriestupny ? "pravda" : "falošné");
    }

    // Metóda na kontrolu, či je rok priestupný
    public static boolean kontrolaPriestupnehoRoku(int rok) {
        return (rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0);
    }
}
