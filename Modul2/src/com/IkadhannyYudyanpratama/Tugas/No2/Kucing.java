package com.IkadhannyYudyanpratama.Tugas.No2;

public class Kucing extends Binatang{
    public String nama;

    public Kucing(String nama) {
        this.nama = nama;
    }

    public void getNama(){
        System.out.println("Nama Kucing\t : " + nama);
    }

    public void meong(){
        System.out.println("Suara " + nama + " Meong");
    }
}
