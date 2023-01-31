package org.etsntesla.arm.osobe;

import java.sql.SQLOutput;

public class Osoba {
   private int god;
   private  String ime;
   public static int br_Osoba = 0;

    public Osoba( int _god, String _ime) {
        this.god = _god;
        this.ime = _ime;
        br_Osoba++;
    }

   public static boolean proveraPunoletstva(Osoba osoba) {
        if ( osoba.god >= 18) {
        return true;
        }
        else return false;
    }
    public String getIme () {
        return this.ime;
    }
    public void setIme (String _ime) {
         this.ime=_ime;
    }
    public int getGod () {
        return this.god;
    }
    public void setGod ( int _god ) {
        this.god=_god;
    }

    public void vezbanje () {
        System.out.println ( getIme() + " radi vezbe " );

    }
    public void vezbanje( Osoba osoba) {
        System.out.println( this.ime + " radi vezbe zajedno sa "+ osoba.ime);
    }
    public boolean vezbanje( int _god ) {
        if ( _god > 100 ) {
            return true;
        } else return false;
    }




}


