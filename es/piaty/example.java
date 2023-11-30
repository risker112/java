package es.piaty;

import java.util.Scanner;
public class example {
    public static void main (String args[]) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Vloz cislo: ");
        int cislo = scan.nextInt();
        example obj = new example();
        obj.peger();
        najdiParneNeparne(cislo);
        example2.ano();
    }
    public static void najdiParneNeparne(int cislo) {
     if(cislo%2==0)
        System.out.println(cislo+" je parne");
     else
        System.out.println(cislo+" nie je parne");
    }

    public void peger() {
        System.out.println("Peger");
    }

}
