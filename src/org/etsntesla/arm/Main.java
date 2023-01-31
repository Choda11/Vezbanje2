package org.etsntesla.arm;

import org.etsntesla.arm.osobe.Osoba;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        int x = 5;
//        int y = 3;
//        org.etsntesla.arm.osobe.Osoba osoba1 = new org.etsntesla.arm.osobe.Osoba(17, "Mika");
//        org.etsntesla.arm.osobe.Osoba osoba2 = new org.etsntesla.arm.osobe.Osoba(18, "Zika");
//        x = y;
//        osoba1 = osoba2;
//        y = y + 1;
//        System.out.println(" x= " + x + " y= " + y);
//        osoba2.god++;
//        System.out.println(osoba1.ime + " ima " + osoba1.god + " , " + osoba2.ime + " ima " + osoba2.god);
//        System.out.println(osoba1.ime + "ima" + "osoba1.god+");
//        System.out.println("Ukupan broj osoba je " + org.etsntesla.arm.osobe.Osoba.br_Osoba);

        Osoba osoba1 = new Osoba(16, "Mika");
        Osoba osoba2 = new Osoba(24, "Pera");
        System.out.println("Ukupan broj osoba je " + Osoba.br_Osoba);
        Osoba[] nizOsoba = new Osoba[3];
        nizOsoba[0] = osoba1;
        nizOsoba[1] = osoba2;
        nizOsoba[2]= new Osoba(17, "Zika");
        for(Osoba osoba: nizOsoba) {
            if (Osoba.proveraPunoletstva(osoba)){
                System.out.println(osoba.getIme() + " je punoletna ");
            }else{
                System.out.println(osoba.getIme() + " nije punoletna ");
            }
        }
        System.out.println("Ukupan broj osoba je " + Osoba.br_Osoba);
        osoba1.vezbanje();
        osoba1.vezbanje( osoba2 );
        System.out.println( osoba1.vezbanje( 102 ));
    }


}
