package es.druhy;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vstup    
        System.out.println("Zadajte typ izby: ");
        String roomType = scanner.nextLine();

        System.out.println("Zadajte počet izieb: ");
        int numberOfRooms = scanner.nextInt();

        System.out.println("Zadajte dátum príchodu (yyyy-MM-dd): ");
        String arrivalDateInput = scanner.next();
        LocalDate arrivalDate = LocalDate.parse(arrivalDateInput, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("Zadajte dátum odchodu (yyyy-MM-dd): ");
        String departureDateInput = scanner.next();
        LocalDate departureDate = LocalDate.parse(departureDateInput, DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println("Zadajte počet osôb: ");
        int numberOfPersons = scanner.nextInt();

        // Výpočet
        int pricePerNight = 75;
        int totalDays = (int) arrivalDate.until(departureDate).getDays();
        int totalPrice = pricePerNight * totalDays * numberOfRooms;

        // Výpis
        System.out.println("Typ izby: " + roomType);
        System.out.println("Počet izieb: " + numberOfRooms);
        System.out.println("Dátum príchodu: " + arrivalDate);
        System.out.println("Dátum odchodu: " + departureDate);
        System.out.println("Počet osôb: " + numberOfPersons);
        System.out.println("Celková cena: " + totalPrice);

        scanner.close();
    }
}
