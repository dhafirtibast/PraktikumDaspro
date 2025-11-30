import java.util.Scanner;

public class Kafe11 {
    public static void Menu() {

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp15.000");
        System.out.println("2. Cappuccino - Rp20.000");
        System.out.println("3. Latte - Rp22.000");
        System.out.println("4. Teh Tarik - Rp12.000");
        System.out.println("5. Roti Bakar - Rp10.000");
        System.out.println("6. Mie Goreng - Rp18.000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }
    public static int hitungTotalHarga11(int[] pilihanMenu, int[] jumlahPesanan, String kodePromo) {
        int[] hargaMenu = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = 0;

        for (int i = 0; i < pilihanMenu.length; i++) {
            totalHarga += hargaMenu[pilihanMenu[i] - 1] * jumlahPesanan[i];
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Promo berlaku: Diskon 50%");
            totalHarga = totalHarga - (totalHarga * 50/100);
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Promo berlaku: Diskon 30%");
            totalHarga = totalHarga - (totalHarga * 30/100);
        } else {
            System.out.println("Kode promo invalid.");
        }

        return totalHarga;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();
        
        System.out.print("\nBerapa jenis menu yang ingin Anda pesan?: ");
        int n = sc.nextInt();

        int[] pilihanMenu = new int[n];
        int[] jumlahPesanan = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nPesanan ke-" + (i+1) + " pilih nomor menu: ");
            pilihanMenu[i] = sc.nextInt();
            System.out.print("Masukkan jumlah item: ");
            jumlahPesanan[i] = sc.nextInt();
        }

        System.out.print("Masukkan kode promo: ");
        sc.nextLine();
        String kodePromo = sc.nextLine();
        int totalHarga = hitungTotalHarga11(pilihanMenu, jumlahPesanan, kodePromo);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}
