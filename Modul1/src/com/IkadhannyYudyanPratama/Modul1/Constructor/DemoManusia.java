package com.IkadhannyYudyanPratama.Modul1.Constructor;

public class DemoManusia {
    public static void main(String[] args) {
        Manusia arrayManusia[] = new Manusia[3];

        //Constructor 1
        Manusia manusia = new Manusia();
        manusia.setNama("Ruby");
        manusia.setUmur(20);

        //Constructor 2
        Manusia manusia1 = new Manusia("Harit");
        //Constructor 3
        Manusia manusia2 = new Manusia( "Alice", 17);

        arrayManusia[0] = manusia;
        arrayManusia[1] = manusia1;
        arrayManusia[2] = manusia2;

        for (Manusia x : arrayManusia){
            System.out.println("Charakter ");
            System.out.println("Nama\t : " + x.getNama());
            System.out.println("Umur\t : " + x.getUmur());
        }
    }
}
