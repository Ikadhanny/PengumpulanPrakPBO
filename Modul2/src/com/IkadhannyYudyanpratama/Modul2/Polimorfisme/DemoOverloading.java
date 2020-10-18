package com.IkadhannyYudyanpratama.Modul2.Polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu = new Lagu( "Yoru ni Kakeru");
        Lagu lagu1 = new Lagu( "Halu", "Feby");

        lagu.getDataLagu();
        lagu1.getDataLagu();
    }
}
