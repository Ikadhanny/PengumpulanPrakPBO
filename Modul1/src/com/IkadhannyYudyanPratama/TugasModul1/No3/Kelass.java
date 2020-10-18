package com.IkadhannyYudyanPratama.TugasModul1.No3;

public class Kelass {
    private static String nama = "Ikadhanny";
    private static String nateng = "Yudyan";
    private static String nablkng = "Pratama";
    private static String tgl = "Purwokerto, 17 Oktober 2000";
    private static int umur = 20;
    private static String alamat = "Sumampir, Purwokerto Utara";
    private static String jnskel = "Laki - Laki";
    private static String st = "Aktif";

    public static int SetMinute(){
        int minute = 5;
        return minute;
    }

    public static void main(String[] args) {
        System.out.println("\t\t DAFTAR NAMA KARYAWAN");
        System.out.println("Nama\t\t\t: " + nama + " " + nateng + " " + nablkng);
        System.out.println("TTL\t\t\t\t: " + tgl);
        System.out.println("Umur\t\t\t: " + umur);
        System.out.println("Alamat\t\t\t: " + alamat);
        System.out.println("Jenis Kelamin\t: " + jnskel);
        System.out.println("Status Karyawan : " + st);
        System.out.println();
        System.out.println("Minute : " + SetMinute());
    }
}
