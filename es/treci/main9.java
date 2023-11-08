/*9. Napíšte program, ktorý získa od užívateľa rok a vypíšte, či je tento rok
priestupný alebo nie. Rok je priestupný ak je deliteľný 4 ale nie 100. Rok je tiež
priestupný ak je deliteľný 400.
Zadanie testovacích údajov
Zadaj rok: 2022
Očakávaný výstup :
Rok 2022 je priestupný rok

 */

package es.treci;

import java.util.Scanner;

public class main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj rok: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Rok " + year + " je priestupný rok.");
        } else {
            System.out.println("Rok " + year + " nie je priestupný rok.");
        }

        scanner.close();
    }
}

