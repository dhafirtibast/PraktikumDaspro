
import java.util.Scanner;
public class NilaiKelompok11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);
 
            float totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("  Nilai dari Kelompok Penilai " + j + ": ");
                int nlai = sc.nextInt();
                totalNilai += nlai;
            }
            float rataNilai = totalNilai/5;
            System.out.print("Kelompok " + i + ": ");
            System.out.println("nilai rata-rata = " + rataNilai);
            i++;
        }
    }
}
