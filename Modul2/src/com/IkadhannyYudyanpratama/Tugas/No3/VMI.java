package com.IkadhannyYudyanpratama.Tugas.No3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VMI {
    public static void main (String[]args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(isr);

        String nama, status;
        int semester;

        System.out.println("Data Mahasiswa dengan Pacarnya");
        System.out.print("Nama Mahasiswa\t : ");
        nama = bfr.readLine();
        System.out.print("Status Mahasiswa : ");
        status = bfr.readLine();
        System.out.print("Semester\t\t : ");
        semester = Integer.parseInt(bfr.readLine());

        String namaPacar;
        String lamaHubungan;

        System.out.print("Nama Pacar\t\t : ");
        namaPacar = bfr.readLine();
        System.out.print("Lama Hubungan\t : ");
        lamaHubungan = bfr.readLine();
        Mahasiswa pacar = new Pacar(nama, status, semester, namaPacar, lamaHubungan);
        System.out.println();
        pacar.getStatus();
    }
}
