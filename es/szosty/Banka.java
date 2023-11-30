package es.szosty;

public class Banka {
    public static void main(String[] arg) {
        BankovyUcet b1 = new BankovyUcet(909090, "Peger", 10000090.00);
        BankovyUcet b2 = new BankovyUcet(909091, "Jozko", 1000.00);
        BankovyUcet b3 = new BankovyUcet(909092, "Pali", 100.00);

        b1.vloz(100.00);
        b1.zostatok();

        b2.vyber(200.00);
        b2.zostatok();

        b3.vyber(10000.00);
        b3.zostatok();
    }
}
