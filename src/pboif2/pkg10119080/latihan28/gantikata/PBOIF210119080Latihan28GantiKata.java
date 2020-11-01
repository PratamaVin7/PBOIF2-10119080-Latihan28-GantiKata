/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * Ganti Kata
 */
public class PBOIF210119080Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        String hasil = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Mengganti Kata====\n");
        System.out.print("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.print("Ganti Kata : ");
        String katayanglama = scanner.nextLine();
        System.out.print("Menjadi Kata : ");
        String katayangbaru = scanner.nextLine();
        String[] perkata = kalimat.split(" ");
        for (String kata : perkata) {
            if (kata.equalsIgnoreCase(katayanglama)) {
                hasil += katayangbaru + " ";
            }
            else {
                hasil += kata + " ";
            }
        }
        System.out.println("Kalimat Baru : "+hasil.trim());
    }
    
}