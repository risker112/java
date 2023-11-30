package es.szosty;

public class zamestnanci {
    public static void main(String[] arg) {
        zamestnanec z1 = new zamestnanec(1, "Peger", 200.1);
        zamestnanec z2 = new zamestnanec(2, "Ferko", 2300.0);
        zamestnanec z3 = new zamestnanec(3, "Palki", 10234.99);
        z1.zobraz();
        z2.zobraz();
        z3.zobraz();

    }
}
