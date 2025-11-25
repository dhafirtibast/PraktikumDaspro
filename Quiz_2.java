import java.util.Scanner;

public class Quiz_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Masukkan Jumlah Daerah: ");
        int jmlDaerah = sc.nextInt();
        int[] sumbangan = new int[jmlDaerah];

        for (int i = 0; i < jmlDaerah; i++) {
            System.out.println("\nDaerah ke-"+(i+1));
                int jmlMakanan;
                int jmlPakaian;
                int jmlObat;
                do {
                    System.out.print("Jml makanan ke-"+(j+1)+": ");
                    jmlMakanan = sc.nextInt();
                    if (jmlMakanan < 0) {
                        System.out.println("Nilai tidak valid.");   
                    }
                    System.out.print("Jml pakaian ke-"+(j+1)+": ");
                    jmlPakaian = sc.nextInt();
                    if (jmlPakaian < 0) {
                        System.out.println("Nilai tidak valid.");
                    }
                    System.out.print("Jml obat-obatan ke-"+(j+1)+": ");
                    jmlObat = sc.nextInt();
                    if (jmlObat < 0) {
                        System.out.println("Nilai tidak valid.");
                    }
                } while (true);
                sumbangan[i][j] = jmlMakanan;
                sumbangan[i][j] = jmlPakaian;
                sumbangan[i][j] = jmlObat;
        }

        System.out.println("\nTotal donasi trrkumpul: ");
        for (int i = 0; i < jmlDaerah; i++) {
            double totalMakanan = 0;
            double totalPakaian = 0;
            double totalObat = 0;
            for (int j = 0; j < jumlahJenisSumbangan; j++) {
                totalMakanan += sumbangan[i][j];
                totalMakanan += sumbangan[i][j];
                totalMakanan += sumbangan[i][j];
            }
            double total = totalMakanan+totalPakaian+totalObat;
            System.out.printf("Daerah %d: %.2f\n", (i+1), rata);
        }

        System.out.println("\nRata-rata per pertanyaan: ");
        for (int j = 0; j < j; j++) {
            double total = 0;
            for (int i = 0; i < jmlDaerah; i++) {
                totalMakanan += sumbangan[i][j];
                totalMakanan += sumbangan[i][j];
                totalMakanan += sumbangan[i][j];
            }
            double rata = total/jmlR;
            System.out.printf("Pertanyaan ke-%d: %.2f\n", (j+1), rata);
        }

        double totalKeseluruhan = 0;
        for (int i = 0; i < jmlDaerah; i++) {
            for (int j = 0; j < jumlahJenisSumbangan; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        double rataKeseluruhan = totalKeseluruhan/(jmlR*jmlP);
        System.out.printf("\nRata-rata keseluruhan: %.2f\n", rataKeseluruhan);
    }
}
