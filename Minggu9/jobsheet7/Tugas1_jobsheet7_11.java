import java.util.Scanner;
public class Tugas1_jobsheet7_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlTiket, hargaTiket = 50000;
        double totalPenjualan = 0, totalTiket = 0;

        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        int jmlPelanggan = sc.nextInt();

        int i = 1;
        while (i <= jmlPelanggan) {
            System.out.println("Pelanggan ke-"+ i +", ");
            System.out.print("Jumlah tiket: ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 1 ) {
                System.out.println("Jumlah tiket tidak valid (negatif). Masukkan jumlah valid!");
                continue;
            }
            
            if (jmlTiket > 4) {
                totalTiket = (0.9*hargaTiket) * jmlTiket;
                System.out.printf("Total harga tiket pelanggan "+i+": R%.0f\n", totalTiket);
            } else if (jmlTiket > 10) {
                totalTiket = (0.85*hargaTiket) * jmlTiket;
                System.out.printf("Total harga tiket pelanggan "+i+": Rp%.0f\n", totalTiket);
            } else {
                totalTiket = hargaTiket * jmlTiket;
                System.out.printf("Total harga tiket pelanggan "+i+": Rp%.0f\n", totalTiket);
            }

        } i++;
        totalPenjualan += totalTiket;
        System.out.printf("Total penjualan hari ini: Rp%.0f\n", totalPenjualan);
        System.out.println("Total pelanggan hari ini: "+ jmlPelanggan);

    }
}
