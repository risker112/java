package es.druhy;

import java.util.Random;

public class main1 {
    public static void main(String[] args) {
        Random random = new Random();

        // Generovanie údajov
        int cropCount = random.nextInt(100) + 1;
        String[] cropTypes = {"ovocie", "zelenina", "obilnina"};
        String cropType = cropTypes[random.nextInt(cropTypes.length)];
        double yieldPerCrop = random.nextDouble() * 100;

        // Výpis generovaných údajov
        System.out.println("Počet plodín: " + cropCount);
        System.out.println("Typ plodiny: " + cropType);
        System.out.printf("Úroda na jednu plodinu: %.2f kg\n", yieldPerCrop);
    }
}
