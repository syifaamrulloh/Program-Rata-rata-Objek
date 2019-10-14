/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan37.program.rata.rata;

import java.util.Scanner;

/**
 *
 * @author syifa
 * NAMA     : Muhamad Syifa Amruloh
 * KELAS    : IF11K
 * NIM      : 10118910
 * 
 * Deskripsi Program : Program ini berisi program untuk Menampilkan Nilai Rata Rata Mahasiswa
 * dengan konsep Objek
 */
public class Nilairatarata {

    Scanner scan = new Scanner(System.in);
    private double ratarata,jumlah=0;
    private int nilai;
    
    public void rata_rata(int i){
        for (int j = 1; j <= i; j++) {
            System.out.print("Nilai Mahasiswa ke-"+j+"\t: ");
            nilai = scan.nextInt();
            jumlah = jumlah + nilai;
        }
        ratarata =jumlah / i;
        System.out.println("\n"+"Maka, Rata-rata Nilainya adalah " + ratarata);
        System.out.println("Developed by : Muhamad Syifa Amruloh");
    }
    
    public static void main(String[] args) {
        // Inisialisasi Objek
        Nilairatarata rt = new Nilairatarata();
        System.out.print("Masukan Banyaknya Mahasiswa\t: ");
        rt.nilai = rt.scan.nextInt();
        rt.rata_rata(rt.nilai);
    }
    
}
