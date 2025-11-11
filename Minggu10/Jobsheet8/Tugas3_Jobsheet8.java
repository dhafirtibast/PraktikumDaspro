import java.util.Scanner;
public class Tugas3_Jobsheet8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah cabang: ");
        int jmlCabang = sc.nextInt();

        int totalPelanggan = 0;
        int itemTerjual = 0;

        System.out.println("Jumlah cabang kafe: " + jmlCabang);
        System.out.println();
        System.out.println("=== Input Penjualan Per Cabang ===");
        System.out.println();
        for (int i = 1; i <= jmlCabang; i++) {
            System.out.println("--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jmlPelanggan = sc.nextInt();

            int totalItem = 0;

            for (int j = 1; j <= jmlPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? " );
                int item = sc.nextInt();
                totalItem += item;
                
            }
            System.out.println("Cabang "+i+":");
            System.out.println("- Pelanggan: " + jmlPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItem);
            System.out.println();
            totalPelanggan += jmlPelanggan;
            itemTerjual += totalItem;
            
        }
        System.out.println("Total seluruh cabang: ");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + itemTerjual + " item");
    }
}
