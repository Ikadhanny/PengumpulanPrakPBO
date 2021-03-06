package com.IkadhannyYudyanpratama.Tugas.No1;

public class Club {
    public String nama;
    public int tahunBerdiri;
    public String stadion;
    public int JuaraUcl;
    public String deskripsi;

    //Overloading tanpa parameter
    public Club () {

    }

    //Overloading 1 parameter
    public Club(String nama) {
        this.nama = nama;
    }

    //Overloading 2 parameter
    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    //Overloading 3 parameter
    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    //Overloading 5 parameter
    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        JuaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    public void getTeam(){
        if (nama == null){
            System.out.println("Nama\t\t\t: Tidak Ada Data");
        }else {
            System.out.println("Nama\t\t\t: " + nama);
        }

        if (tahunBerdiri == 0){
            System.out.println("Tahun Berdiri\t: Tidak Ada Data");
        }else {
            System.out.println("Tahun Berdiri\t: " + tahunBerdiri);
        }

        if (stadion == null){
            System.out.println("Stadion\t\t\t: Tidak Ada Data");
        }else {
            System.out.println("Stadion\t\t\t: " + stadion);
        }

        if (JuaraUcl == 0){
            System.out.println("Juara UCL\t\t: Tidak Ada Data");
        }else {
            System.out.println("Juara UCL\t\t: " + JuaraUcl);
        }

        if (deskripsi == null){
            System.out.println("Deskripsi\t\t: Tidak Ada Data");
        }else {
            System.out.println("Deskripsi\t\t: " + deskripsi);
        }

        System.out.println();
    }
}
