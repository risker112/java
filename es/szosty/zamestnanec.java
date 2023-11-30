package es.szosty;

public class zamestnanec {
   private final int  id;
   private final String meno;
   private final Double vyplata;

   zamestnanec(int i, String meno, Double vyplata) {
       this.id = i;
       this.meno = meno;
       this.vyplata = vyplata;
   }

    public int getId() {
        return id;
    }

    public String getMeno() {
        return meno;
    }

    public Double getVyplata() {
        return vyplata;
    }

    public void zobraz(){
        System.out.println(this.id+" "+this.meno+" "+this.vyplata);
    }
}
