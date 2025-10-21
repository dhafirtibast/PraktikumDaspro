import java.util.Scanner;
public class Tugas2_jobsheet7_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenisKendaraan, durasi, total = 0;

        do {
            System.out.println("=== Sistem Parkir ===");
            System.out.print(" 1. Mobil\n 2. Motor\n 0. Keluar\n");
            System.out.print("Masukkan jenis kendaraan: ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan < 0 || jenisKendaraan > 2) {
                System.out.println("input jenis kendaraan invalid!");
            }

            if (jenisKendaraan == 1 || jenisKendaraan == 2) {
                System.out.print("Durasi parkir (jam): ");
                durasi = sc.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else if (durasi <= 0) {
                    System.out.println("Input tidak valid!");
                } else if (jenisKendaraan == 1) {
                    total += durasi*3000;
                } else if (jenisKendaraan == 2) {
                    total += durasi*2000;
                }  

            }
            System.out.println("Total biaya parkir: Rp" + total);
            System.out.println("------------------------------");
        } while (jenisKendaraan != 0);
        
    } 

}
