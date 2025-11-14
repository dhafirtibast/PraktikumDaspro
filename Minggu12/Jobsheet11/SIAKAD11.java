import java.util.Scanner;

public class SIAKAD11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = sc.nextInt();

        int[][] nilai = new int[jmlMhs][jmlMatkul];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println();
            System.out.println("Input nilai mahasiswa ke-"+(i+1));
            double totalPersiswa = 0;

            for (int j = 0; j < jmlMatkul; j++) {
                System.out.print("Nilai mata kuliah "+(j+1)+": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }

            double rata2 = totalPersiswa/jmlMatkul;
            System.out.printf("Nilai rata-rata mahasiswa ke-%d: %.2f", (i+1), (rata2));
            System.out.println();
        }

        System.out.println("\n=============================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah: ");

        for (int j = 0; j < jmlMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jmlMhs; i++) {
                totalPerMatkul += nilai[i][j];
            }

            double rataMatkul = totalPerMatkul/jmlMhs;
            System.out.printf("Mata Kuliah ke-%d: %.2f\n", (j+1), rataMatkul);
        }
    }
}
