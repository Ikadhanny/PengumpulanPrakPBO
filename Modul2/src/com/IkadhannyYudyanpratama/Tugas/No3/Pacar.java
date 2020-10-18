package com.IkadhannyYudyanpratama.Tugas.No3;

public class Pacar extends Mahasiswa{
    public String namaPacar;
    public String lamaHubungan;

    //constructor
    public Pacar(String nama, String status, int semester, String namaPacar, String lamaHubungan) {
        super(nama, status, semester);
        this.namaPacar = namaPacar;
        this.lamaHubungan = lamaHubungan;
    }
    public void getStatus() {
        System.out.println("Status Mahasiswa : " + nama
                + "\nStatus\t\t\t : " + status
                + "\nSemester\t\t : " + semester
                + "\nNama Pacar\t\t : " + namaPacar
                + "\nLama Hubungan\t : " + lamaHubungan);
    }
}
