/*Napíšte program, ktorý používateľovi poskytne jeden znak z
abecedy. Vypíšte samohlásku alebo spoluhlásku v závislosti od vstupu
používateľa. Ak používateľský vstup nie je písmeno (medzi a, z alebo A, Z),
alebo ide o reťazec s dĺžkou > 1, vypíšte chybové hlásenie.
Testovacie údaje
Zadajte písmeno abecedy: p
Očakávaný výstup :
Zadané písmeno je spoluhláskové

 */

package es.treci;

import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte písmeno abecedy: ");
        String input = scanner.nextLine();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Chybový vstup. Zadajte jedno písmeno abecedy.");
        } else {
            char character = input.toLowerCase().charAt(0);

            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                System.out.println("Zadané písmeno je samohláska.");
            } else {
                System.out.println("Zadané písmeno je spoluhláska.");
            }
        }

        scanner.close();
    }
}

