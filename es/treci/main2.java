/*Napíšte program na riešenie kvadratických rovníc (použite if, else if a else).
• ak D > 0, tak daná kvadratická rovnica má 2 rôzne reálne korene
• ak D = 0, tak daná kvadratická rovnica má dva rovnaké reálne korene,
čiže tzv. dvojnásobný reálny koreň
• ak D < 0, tak daná kvadratická rovnica nemá riešenie v obore reálnych
čísel (samozrejme v obore komplexných čísel má dva imaginárne
komplexne združené korene)*/

package es.treci;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte hodnotu pre a: ");
        double a = scanner.nextDouble();

        System.out.println("Zadajte hodnotu pre b: ");
        double b = scanner.nextDouble();

        System.out.println("Zadajte hodnotu pre c: ");
        double c = scanner.nextDouble();

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Korene sú " + root1 + " a " + root2);
        } else if (D == 0) {
            double root = -b / (2 * a);
            System.out.println("Korene sú " + root + " a " + root);
        } else {
            System.out.println("Rovnica nemá riešenie v obore reálnych čísel.");
        }

        scanner.close();
    }
}

