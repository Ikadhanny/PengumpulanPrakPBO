package com.IkadhannyYudyanpratama.Tugas.No2;

public class Ikan extends Binatang{
    public String nama;

    public Ikan(String nama) {
        this.nama = nama;
    }

    public void getNama(){
        System.out.println("Nama Ikan\t : " + nama);
    }

    public void berenang(){
        System.out.println(nama + " dapat Berenang");
    }
}
