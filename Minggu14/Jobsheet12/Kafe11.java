import java.util.Scanner;

public class Kafe11 {
    public static void Menu() {
        //System.out.println("Selamat datang, " + namaPelanggan + "!");

        //if (isMember) {
           //System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
       //}
        //if (kodePromo.equalsIgnoreCase("DISKON50")) {
            //System.out.println("Anda mendapatkan diskon 50%");
        //} else if (kodePromo.equalsIgnoreCase("DISKON30")) {
           //System.out.println("Anda mendapatkan diskon 30%");
        //} else {
           // System.out.println("Kode promo invalid!");
        //}

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
    public static int hitungTotalHarga11(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu();
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int banyakItemu = sc.nextInt();

        int totalHarga = hitungTotalHarga11(pilihanMenu, banyakItemu);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
}
