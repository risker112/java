package es.szosty;

public class BankovyUcet {
    private  int cislo_uctu;
    private String meno;
    private Double peniaze;

    public void vytvorucet(int cislo_uctu, String meno, Double peniaze){
        this.cislo_uctu = cislo_uctu;
        this.meno = meno;
        this.peniaze = peniaze;
    }

    BankovyUcet(int cislo_uctu, String meno, Double peniaze){
        this.cislo_uctu = cislo_uctu;
        this.meno = meno;
        this.peniaze = peniaze;
    }
    public void zostatok(){
        System.out.println(this.cislo_uctu+" "+this.meno +" "+this.peniaze);

    }
    public void vloz(Double vloz){
        this.peniaze += vloz;
    }
    public void vyber(Double vyber){
        if(this.peniaze >= vyber){
            this.peniaze -= vyber;
        }
        else {
            System.out.println("nedostatok penazi");
        }

    }
}
