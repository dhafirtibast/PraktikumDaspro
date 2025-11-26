import java.util.Scanner;

public class RekapPenjualanCafe11 {
    public static void main(String[] args) {
        int[][] data = inputData();
        tampilData(data);
        menuTertinggi(data);
        tampilRerata(data);
    }
    static int[][] inputData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jmlHari = sc.nextInt();

        int[][] hasilPenjualan = new int[jmlMenu][jmlHari];

        for (int i = 0; i < hasilPenjualan.length; i++) {
            for (int j = 0; j < hasilPenjualan[i].length; j++) {
                System.out.print("Input penjualan menu ke-"+(i+1)+" hari ke-"+(j+1)+": ");
                hasilPenjualan[i][j] = sc.nextInt();
            }
        }
        return hasilPenjualan;
    }
    static void tampilData(int[][] x) {
        System.out.println("Rekap hasil penjualan: ");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(x[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static void menuTertinggi(int[][] x) {
        int[] total = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            int tmp = 0;
            for (int j = 0; j < x[0].length; j++) {
                tmp += x[i][j];
            }
            total[i] = tmp;
        }
        int max = total[0];
        int idxMax = 0;
        for (int i = 0; i < total.length; i++) {
            if (total[i] > max) {
                max = total[i];
                idxMax = i; 
            }
        }
        System.out.println("Menu dengan penjualan tertinggi: " + namaMenu(idxMax));
        System.out.println("Total penjualan = " + max);
    }
    static void tampilRerata(int[][] x) {
        System.out.println("Rata-rata penjualan tiap menu: ");
        for (int i = 0; i < x.length; i++) {
            int tmp = 0;
            for (int j = 0; j < x[i].length; j++) {
                tmp += x[i][j];
            }
            double rata = tmp / x[i].length;
            System.out.println("Rata-rata menu ke-"+ (i+1) + ": " + rata);
        }
    }
    static String namaMenu(int idxMax) {
        String nama = null;
        if (idxMax == 0) {
            nama = "Kopi";
        } else if (idxMax == 1) {
            nama = "Teh";
        } else if (idxMax == 2) {
            nama = "Es Kelapa Muda";
        } else if (idxMax == 3) {
            nama = "Roti Bakar";
        } else {
            nama = "Gorengan";
        }
        return nama;
    }
}
