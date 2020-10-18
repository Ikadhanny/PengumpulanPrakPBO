package com.IkadhannyYudyanpratama.Tugas.No2;

public class Burung extends Binatang{
    public String nama;

    public Burung(String nama) {
        this.nama = nama;
    }

    public void getNama() {
        System.out.println("Nama Burung\t : " + nama);
    }

    public void terbang(){
        System.out.println(nama + " dapat Terbang");
    }
}
