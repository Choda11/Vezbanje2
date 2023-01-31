package org.etsntesla.arm.vozila;

import org.etsntesla.arm.osobe.Osoba;

public class Auto {
    int srBr;
    Osoba[] putnici;

    public Auto(int srBr) {
        this.srBr = srBr;
        this.putnici = new Osoba[4];
    }

    boolean ulazak(Osoba putnik, int brSed) {
        if (brSed >= 0 && brSed < 4 && this.putnici[brSed] == null) {
            this.putnici[brSed] = putnik;
            return true;
        } else return false;


    }

    boolean izlazak(int brSed) {
        if (this.putnici[brSed] != null) {
            this.putnici[brSed] = null;
            return true;
        } else return false;


    }
}



