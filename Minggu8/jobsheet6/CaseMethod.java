import java.util.Scanner;
public class CaseMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        System.out.println(" ");
        System.out.println("--- Mata kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS  : ");
        double nilaiUtsAlgo = sc.nextDouble();
        System.out.print("Nilai UAS  : ");
        double nilaiUasAlgo = sc.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugasAlgo = sc.nextDouble();
        System.out.println(" ");
        System.out.println("--- Mata kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS  : ");
        double nilaiUtsStrukdat = sc.nextDouble();
        System.out.print("Nilai UAS  : ");
        double nilaiUasStrukdat = sc.nextDouble();
        System.out.print("Nilai Tugas: ");
        double nilaiTugasStrukdat = sc.nextDouble();
        System.out.println(" ");

        double nilaiAkhirAlgo = (nilaiUtsAlgo * 0.3) + (nilaiUasAlgo * 0.4) + (nilaiTugasAlgo * 0.3);
        double nilaiAkhirStrukdat = (nilaiUtsStrukdat * 0.3) + (nilaiUasStrukdat * 0.4) + (nilaiTugasStrukdat * 0.3);

        String nilaiHurufAlgo = null;
        String nilaiHurufStrukdat = null;

        //Konversi Nilai Huruf Algoritma
        if (100 >= nilaiAkhirAlgo || nilaiAkhirAlgo > 80) {
            nilaiHurufAlgo = "A";
        } else if (80 >= nilaiAkhirAlgo || nilaiAkhirAlgo >73) {
            nilaiHurufAlgo = "B+";
        } else if (73 >= nilaiAkhirAlgo || nilaiAkhirAlgo > 65) {
            nilaiHurufAlgo = "B";
        } else if (65 >= nilaiAkhirAlgo || nilaiAkhirAlgo >60) {
            nilaiHurufAlgo = "C+";
        } else if (60 >= nilaiAkhirAlgo || nilaiAkhirAlgo >50) {
            nilaiHurufAlgo = "C";
        } else if (50 >= nilaiAkhirAlgo || nilaiAkhirAlgo >39) {
            nilaiHurufAlgo = "D";
        } else {
            nilaiHurufAlgo = "E";
        }

        //Konversi Nilai Huruf Struktur Data 
        if (100 >= nilaiAkhirStrukdat || nilaiAkhirStrukdat > 80) {
            nilaiHurufStrukdat = "A";
        } else if (80 >= nilaiAkhirStrukdat || nilaiAkhirStrukdat >73) {
            nilaiHurufStrukdat = "B+";
        } else if (73 >= nilaiAkhirStrukdat || nilaiAkhirStrukdat > 65) {
            nilaiHurufStrukdat = "B";
        } else if (65 >= nilaiAkhirStrukdat || nilaiAkhirStrukdat >60) {
            nilaiHurufStrukdat = "C+";
        } else if (60 >= nilaiAkhirStrukdat || nilaiAkhirStrukdat >50) {
            nilaiHurufStrukdat = "C";
        } else if (50 >= nilaiAkhirStrukdat || nilaiAkhirStrukdat >39) {
            nilaiHurufStrukdat = "D";
        } else {
            nilaiHurufStrukdat = "E";
        }
       
        String statAlgo = (nilaiAkhirAlgo >= 60) ? "LULUS" : "TIDAK LULUS";
        String statStrukdat = (nilaiAkhirStrukdat >= 60) ? "LULUS" : "TIDAK LULUS";

        //Status Kelulusan Semester
        String statSmt = null;
        double rata2Akhir = (nilaiAkhirAlgo + nilaiAkhirStrukdat) / 2.0;
        
        if (statAlgo.equals("LULUS") && statStrukdat.equals("LULUS")) {
            if (rata2Akhir >= 70) {
                statSmt = "LULUS";
            } else {
                statSmt = "TIDAK LULUS";
            }
        } else {
            statSmt = "TIDAK LULUS";
        }

        //OUTPUT
        System.out.println("================== HASIL PENELITIAN AKADEMIK ==================");
        System.out.println("Nama: "+ nama);
        System.out.println("NIM : "+ nim);
        System.out.println(" ");
        System.out.printf("%-25s %-5s %-7s %-7s %-10s %-12s %-12s\n",
                        "Mata Kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai Huruf", "Status");

    }
}