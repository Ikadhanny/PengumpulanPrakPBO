package com.IkadhannyYudyanPratama.TugasModul1.No2;

public class Construktor {
    private String nama;
    private String umur;
    private String tgl, bln, thn;
    private String alamat;
    private String prodi;

    public Construktor(String nama, String umur, String tgl, String bln, String thn, String alamat, String prodi) {
        this.nama = nama;
        this.umur = umur;
        this.tgl = tgl;
        this.bln = bln;
        this.thn = thn;
        this.alamat = alamat;
        this.prodi = prodi;
    }

    public Construktor(){

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }

    public String getBln() {
        return bln;
    }

    public void setBln(String bln) {
        this.bln = bln;
    }

    public String getThn() {
        return thn;
    }

    public void setThn(String thn) {
        this.thn = thn;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}
