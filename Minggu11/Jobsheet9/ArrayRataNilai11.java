import java.util.Scanner;
public class ArrayRataNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhsw = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhsw];
        int jmlMhsLulus = 0;
        int jmlMhsTdkLulus = 0;
        double totalLulus = 0;
        double totalTdkLulus = 0;
        double rata2MhsLulus;
        double rata2MhsTdkLulus;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                jmlMhsLulus ++;
                totalLulus += nilaiMhs[i];
            } else {
                jmlMhsTdkLulus++;
                totalTdkLulus += nilaiMhs[i];
            }
        }
        rata2MhsLulus = totalLulus/jmlMhsLulus;
        rata2MhsTdkLulus = totalTdkLulus/jmlMhsTdkLulus;
        System.out.println("Rata-rata nilai lulus = "+ rata2MhsLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+ rata2MhsTdkLulus);

    }
}
