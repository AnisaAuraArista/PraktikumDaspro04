import java.util.Scanner;

public class CM1_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama, nim;
        double uts1, uas1, tugas1, uts2, uas2, tugas2;
        double nilaiAkhir1, nilaiAkhir2, rataRata;
        String huruf1, huruf2, status1, status2, statusSemester;

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama : ");
        nama = sc.nextLine();
        System.out.print("NIM  : ");
        nim = sc.nextLine();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        uts1 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        tugas1 = sc.nextDouble();
       
        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        uts2 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        tugas2 = sc.nextDouble();
       
        nilaiAkhir1 = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
        nilaiAkhir2 = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);
        
        huruf1 = konversiHuruf(nilaiAkhir1);
        huruf2 = konversiHuruf(nilaiAkhir2);
        status1 = (nilaiAkhir1 >= 60) ? "LULUS" : "TIDAK LULUS";
        status2 = (nilaiAkhir2 >= 60) ? "LULUS" : "TIDAK LULUS";
        
        rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;
        
        if (status1.equals("LULUS") && status2.equals("LULUS")) {
            if (rataRata >= 70) {
                statusSemester = "LULUS (Rata-rata >= 70)";
            } else {
                statusSemester = "TIDAK LULUS (Rata-rata < 70)";
            }
        } else {
            statusSemester = "TIDAK LULUS (Salah satu MK tidak lulus)";
        }

        System.out.println("\n================= HASIL PENILAIAN AKADEMIK ==================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Algoritma Pemrograman\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n", uts1, uas1, tugas1, nilaiAkhir1, huruf1, status1);
        System.out.printf("Struktur Data\t\t%.0f\t%.0f\t%.0f\t%.2f\t\t%s\t\t%s\n", uts2, uas2, tugas2, nilaiAkhir2, huruf2, status2);
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Rata-rata Nilai Akhir: %.2f\n", rataRata);
        System.out.println("Status Semester : " + statusSemester);
       
        sc.close();
    }

    public static String konversiHuruf(double nilai) {
        if (nilai > 80 && nilai <= 100) {
           return "A"; 
        }else if (nilai > 73 && nilai <= 80 ) { 
            return "B+";
        }else if (nilai > 65 && nilai <= 73) {
            return "B";
        }else if (nilai > 60 && nilai <= 65){
            return "C+";
        }else if (nilai > 50 && nilai <= 60) {
            return "C";       
        }else if (nilai > 39 && nilai <= 50) {
            return "D";           
        }else  return "E";
    }
}
