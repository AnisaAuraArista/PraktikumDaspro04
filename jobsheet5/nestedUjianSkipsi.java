package jobsheet5;

import java.util.Scanner;

public class nestedUjianSkipsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         String pesan;
       System.out.println("Apakah mahasiswa sudah bebas kompen? (ya/tidak): "); 
       String bebasKompen = sc.nextLine().trim();
       System.out.println("Masukkan jumlah log bimbingan Pembimbing 1:");
       int bimbinganP1= sc.nextInt();
       System.out.println("Masukkan Jumlah Log Bimbingan Pembimbing 2:");
       int bimbinganP2 = sc.nextInt();
       if (bebasKompen.equalsIgnoreCase("Ya")){
        if (bimbinganP1 >= 8 && bimbinganP2 >= 4){
            pesan= "Semua syarat terpenuhi. Mahasiswa bpleh mendaftar ujian skripsi";
        }else if (bimbinganP1 < 8 && bimbinganP2 < 4){
            pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali da P2 kurang dari 4 kali";
        }else if (bimbinganP1<8){
            pesan= "Gagal! Log bimbingan P1 belum mencapai 8 kali";
        }else {
            pesan = "Gagal! log bimbingan P2 belum mencapai 4 kali";
        }

    }else{
        pesan = "Gagal! Mahasiswa masih memiliki tanggungan Kompen";
    }
    System.out.println(pesan);
    sc.close();
    }
}
