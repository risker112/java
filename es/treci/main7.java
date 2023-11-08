/*Napíšte program na zistenie počtu dní v mesiaci.
Testovacie dáta
Zadaj číslo mesiaca: 2
Zadaj rok: 2022
Očakávaný výstup :
Február 2022 má 29 dní

 */

package es.treci;

import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj číslo mesiaca: ");
        int month = scanner.nextInt();

        System.out.println("Zadaj rok: ");
        int year = scanner.nextInt();

        int days;

        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                days = 30;
                break;
            case 2: // February
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                    days = 29; // Leap year
                } else {
                    days = 28;
                }
                break;
            default:
                days = 0; // Invalid month
        }

        if (days != 0) {
            System.out.println(getMonthName(month) + " " + year + " má " + days + " dní");
        } else {
            System.out.println("Neplatný mesiac");
        }

        scanner.close();
    }

    public static String getMonthName(int month) {
        String monthName;
        switch (month) {
            case 1:
                monthName = "Január";
                break;
            case 2:
                monthName = "Február";
                break;
            case 3:
                monthName = "Marec";
                break;
            case 4:
                monthName = "Apríl";
                break;
            case 5:
                monthName = "Máj";
                break;
            case 6:
                monthName = "Jún";
                break;
            case 7:
                monthName = "Júl";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "Október";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Neznámy";
        }
        return monthName;
    }
}
