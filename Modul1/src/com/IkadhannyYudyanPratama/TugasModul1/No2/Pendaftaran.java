package com.IkadhannyYudyanPratama.TugasModul1.No2;

import java.util.Scanner;

public class Pendaftaran {
    public static void main(String[] args) {
        String nama;
        String umur;
        String tgl, bln, thn;
        String alamat;
        String prodi;

        Construktor daftar = new Construktor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Data Pendaftaran Anda : ");
        System.out.print("Masukan Nama\t\t : ");
        nama = scanner.nextLine();
        daftar.setNama(nama);
        System.out.print("Masukan Umur\t\t : ");
        umur = scanner.nextLine();
        daftar.setUmur(umur);
        System.out.print("Masukan Tanggal Lahir: ");
        tgl = scanner.nextLine();
        daftar.setTgl(tgl);
        System.out.print("Masukan Bulan Lahir\t : ");
        bln = scanner.nextLine();
        daftar.setBln(bln);
        System.out.print("Masukan Tahun Lahir\t : ");
        thn = scanner.nextLine();
        daftar.setThn(thn);
        System.out.print("Masukan Alamat\t\t : ");
        alamat = scanner.nextLine();
        daftar.setAlamat(alamat);
        System.out.print("Masukan Pilihan Prodi : ");
        prodi = scanner.nextLine();
        daftar.setProdi(prodi);

        System.out.println();
        System.out.println();

        System.out.println("\tDATA PENDAFTAR");
        System.out.println("Nama\t\t : " + daftar.getNama());
        System.out.println("Umur\t\t : " + daftar.getUmur());
        System.out.println("Tanggal Lahir: " + daftar.getTgl() + " " + daftar.getBln() + " " + daftar.getThn());
        System.out.println("Alamat\t\t : " + daftar.getAlamat());
        System.out.println("Prodi\t\t : " + daftar.getProdi());
        System.out.println("Anda Terdaftar ! ");
    }
}