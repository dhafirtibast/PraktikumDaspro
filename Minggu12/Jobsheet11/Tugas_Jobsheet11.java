import java.util.Scanner;

public class Tugas_Jobsheet11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlP = 6;
        int jmlR = 10;
        int[][] survei = new int[jmlR][jmlP];

        for (int i = 0; i < jmlR; i++) {
            System.out.println("\nResponden ke-"+(i+1));
            for (int j = 0; j < jmlP; j++) {
                int nilai;
                do {
                    System.out.print("Nilai untuk pertanyaan ke-"+(j+1)+" (1-5): ");
                    nilai = sc.nextInt();
                    if (nilai < 1 || nilai > 5) {
                        System.out.println("Nilai tidak valid. Masukkan nilai antara 1-5");
                    }
                } while (nilai < 1 || nilai > 5);
                survei[i][j] = nilai;
            }
        }

        System.out.println("\nRata-rata per responden: ");
        for (int i = 0; i < jmlR; i++) {
            double total = 0;
            for (int j = 0; j < jmlP; j++) {
                total += survei[i][j];
            }
            double rata = total/jmlP;
            System.out.printf("Responden %d: %.2f\n", (i+1), rata);
        }

        System.out.println("\nRata-rata per pertanyaan: ");
        for (int j = 0; j < jmlP; j++) {
            double total = 0;
            for (int i = 0; i < jmlR; i++) {
                total += survei[i][j];
            }
            double rata = total/jmlR;
            System.out.printf("Pertanyaan ke-%d: %.2f\n", (j+1), rata);
        }

        double totalKeseluruhan = 0;
        for (int i = 0; i < jmlR; i++) {
            for (int j = 0; j < jmlP; j++) {
                totalKeseluruhan += survei[i][j];
            }
        }
        double rataKeseluruhan = totalKeseluruhan/(jmlR*jmlP);
        System.out.printf("\nRata-rata keseluruhan: %.2f\n", rataKeseluruhan);
    }
}
