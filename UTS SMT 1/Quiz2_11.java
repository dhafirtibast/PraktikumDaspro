import java.util.Scanner;

public class Quiz2_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Daerah: ");
        int jmlDaerah = sc.nextInt();
        int[][] sumbangan = new int[jmlDaerah][3];
        int[] totalPerDaerah = new int[jmlDaerah];
        int totalKeseluruhan = 0;
        int makanan, pakaian, obat;

        for (int i = 0; i < jmlDaerah; i++) {
            System.out.println("\nDaerah ke-" + (i + 1));
            do {
                System.out.print("Jumlah makanan: ");
                makanan = sc.nextInt();
                if (makanan < 0) {
                    System.out.println("Nilai tdk valid.");
                }
            } while (makanan < 0);
            do {
                System.out.print("Jumlah pakaian: ");
                pakaian = sc.nextInt();
                if (pakaian < 0) {
                    System.out.println(" Nilai tidak valid.");
                }
            } while (pakaian < 0);
            do {
                System.out.print("Jumlah obat-obatan: ");
                obat = sc.nextInt();
                if (obat < 0) {
                    System.out.println(" Nilai tidak valid.");
                }
            } while (obat < 0);
            sumbangan[i][0]= makanan;
            sumbangan[i][1]=pakaian;
            sumbangan[i][2]=obat;

            totalPerDaerah[i]=makanan+pakaian+obat;
            totalKeseluruhan+=totalPerDaerah[i];
        }
        System.out.println("\nRekap sumbangan:");
        for (int i = 0; i < jmlDaerah; i++) {
            double persentase = (double) totalPerDaerah[i]/totalKeseluruhan*100;
            System.out.printf("Daerah %d: Total = %d barang, Kontribusi = %.2f%%\n",
                              (i+1), totalPerDaerah[i], persentase);
        }
        System.out.printf("\nTotal Keseluruhan Sumbangan: %d barang\n", totalKeseluruhan);
    }
}
