/*Napíšte metódu na výpis znakov medzi dvoma znakmi (napr. A až P ).
Poznámka: Vypíš 20 znakov na riadok.
Očakávaný výstup:
( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;
< = > ? @ A B C D E F G H I J K L M N O
P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c
d e f g h i j k l m n o p q r s t u v w
x y z
*/

package es.czwarty;


public class main9 {
    public static void main(String[] args) {
        vypisZnakovMedzi('A', 'z', 20);
    }

    // Metóda na výpis znakov medzi dvoma znakmi
    public static void vypisZnakovMedzi(char zaciatok, char koniec, int znakovNaRiadok) {
        int pocetNaRiadok = 0;
        for (char znak = zaciatok; znak <= koniec; znak++) {
            System.out.print(znak + " ");
            pocetNaRiadok++;
            if (pocetNaRiadok == znakovNaRiadok) {
                System.out.println();
                pocetNaRiadok = 0;
            }
        }
    }
}