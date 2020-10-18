package com.IkadhannyYudyanPratama.Modul1.Constructor;

public class Manusia {
    private String nama;
    private int umur;

    //Constructor 1 //tanpa parameter
    public Manusia() {}

    //Constructor 2 //1 parameter
    public Manusia(String nama) {
        this.nama = nama;
    }

    //Constructor 3 //2 parameter
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    //method
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
