package jobsheet5;

import java.util.Scanner;

public class SistemPerpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
    System.out.println("=== Sistem Perpustakaan Kampus ===");
        System.out.print("Apakah membawa kartu mahasiswa? (YA/TIDAK): ");
        String kartu = sc.nextLine().toUpperCase();

        System.out.print("Apakah sudah registrasi online? (YA/TIDAK): ");
        String registrasi = sc.nextLine().toUpperCase();

        if (kartu.equals("YA") || registrasi.equals("YA")) {
            System.out.println("Boleh Masuk");
        } else {
            System.out.println("Ditolak Masuk");
        }

        sc.close();
    }
}
