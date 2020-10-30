/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119006.latihan24.perbandingannilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : Perbandingan 2 buah nilai
 */
public class IF110119006Latihan24PerbandinganNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int nilai1, nilai2;
        String hasil;
        boolean ulangi = true;
        
        System.out.println("=======Program Perbandingan Nilai======");
        do {
            System.out.print("Masukkan nilai pertama : ");
            nilai1 = userInput.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            nilai2 = userInput.nextInt();
        
            if (nilai1 > nilai2) {
                hasil = nilai1 + " Lebih besar dari " + nilai2;
            } else {
                hasil = nilai1 + " Lebih kecil dari " + nilai2;
            }

            System.out.println("Hasil : " + hasil);
            System.out.println();
            
            String kondisi;

            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            kondisi = userInput.next();
            
            if("Tidak".equals(kondisi)) {
                ulangi = false;
            }
            
            System.out.println();
            
        }while(ulangi);
        
        
        
        
    }
    
}
