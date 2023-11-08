package es.druhy;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vstup údajov od užívateľa
        System.out.println("Značka automobilu: ");
        String brand = scanner.nextLine();

        System.out.println("Model automobilu: ");
        String model = scanner.nextLine();

        System.out.println("Spotreba litrov na 100 km: ");
        double consumption = scanner.nextDouble();

        System.out.println("Objem nádrže (litre): ");
        double tankCapacity = scanner.nextDouble();

        System.out.println("Vzdialenosť cesty (kilometre): ");
        double distance = scanner.nextDouble();

        // Výpočet celkovej spotreby paliva
        double totalConsumption = (distance / 100) * consumption;
        int refills = (int) Math.ceil(totalConsumption / tankCapacity);

        // Výpis výsledkov simulácie
        System.out.println("Značka automobilu: " + brand);
        System.out.println("Model automobilu: " + model);
        System.out.println("Spotreba: " + consumption + "l/100 km");
        System.out.println("Objem nádrže: " + tankCapacity + " litrov");
        System.out.println("Vzdialenosť cesty: " + distance + " kilometrov");
        System.out.println("Celková spotreba paliva: " + totalConsumption + " litrov");
        System.out.println("Počet natankovaní: " + refills);

        scanner.close();
    }
}
