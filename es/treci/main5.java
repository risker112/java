/*. Napíšte program, ktorý načíta číslo od používateľa medzi 1 a 7 a zobrazí

        názov dňa v týždni.
        Testovacie údaje
        Vstupné číslo: 3
        Očakávaný výstup :
        Streda
*/
package es.treci;

import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadajte číslo medzi 1 a 7: ");
        int number = scanner.nextInt();

        String day;

        switch (number) {
            case 1:
                day = "Pondelok";
                break;
            case 2:
                day = "Utorok";
                break;
            case 3:
                day = "Streda";
                break;
            case 4:
                day = "Štvrtok";
                break;
            case 5:
                day = "Piatok";
                break;
            case 6:
                day = "Sobota";
                break;
            case 7:
                day = "Nedeľa";
                break;
            default:
                day = "Neplatný deň. Zadajte číslo medzi 1 a 7.";
        }

        System.out.println(day);

        scanner.close();
    }
}

