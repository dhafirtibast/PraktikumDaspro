import java.util.Scanner;
public class Tugas2_Jobsheet9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();
        String[] namaPesanan = new String[jmlPesanan];
        double[] hargaPesanan = new double[jmlPesanan];

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println("=== Pesanan ke-"+(i+1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("                      Harga: ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println();
        System.out.println("=== Daftar Pesanan ===");
        double total = 0;
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.printf((i+1)+". "+namaPesanan[i]+" - Rp"+hargaPesanan[i]);
            System.out.println();
            total += hargaPesanan[i];
        }
        System.out.println("Total Biaya: Rp"+total);
    }
}
