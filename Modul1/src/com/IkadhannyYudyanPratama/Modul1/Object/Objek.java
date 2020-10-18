package com.IkadhannyYudyanPratama.Modul1.Object;

//class main
public class Objek {
    public static void main(String[] args) {
        //deklarasi tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();
        mahasiswaTanpa.setNama("Ikadhanny");
        mahasiswaTanpa.setNim(19104082);

        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t : " + mahasiswaTanpa.getNama());
        System.out.println("NIM\t\t : " + mahasiswaTanpa.getNim());

        //deklarasi dengan parameter
        Mahasiswa mahasiswa = new Mahasiswa("Painom", 1237893);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t : " + mahasiswa.getNama());
        System.out.println("NIM\t\t : " + mahasiswa.getNim());
    }

}
