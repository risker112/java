package es.prvy;

public class main4 {
        public static void main(String[] args) {
            // Operácia a
            int resultA = -5 + 8 * 6;

            // Operácia b
            int resultB = (55 + 9) % 9;

            // Operácia c
            int resultC = 20 + -3 * 5 / 8;

            // Operácia d
            int resultD = 5 + 15 / 3 * 2 - 8 % 3;

            // Výpis výsledku
            System.out.println("Výsledok operácie a: " + resultA);
            System.out.println("Výsledok operácie b: " + resultB);
            System.out.println("Výsledok operácie c: " + resultC);
            System.out.println("Výsledok operácie d: " + resultD);

            // Celkový výstup
            int totalResult = resultA + resultB + resultC + resultD;
            System.out.println("Celkový výsledok: " + totalResult);
        }
}
