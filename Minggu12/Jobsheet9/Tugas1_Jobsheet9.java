import java.util.Scanner;
public class Tugas1_Jobsheet9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai mahasiswa yang akan diinput: ");
        int banyakNilai = sc.nextInt();
        int[] arrNilai = new int[banyakNilai];

        int totalNilai = 0;
        int terendah = 100, tertinggi = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            int nilaiMhs = sc.nextInt();
            arrNilai[i] = nilaiMhs;
            totalNilai += nilaiMhs;
            if (nilaiMhs > tertinggi) {
                tertinggi = nilaiMhs;
            }
            if (nilaiMhs < terendah) {
                terendah = nilaiMhs;
            }
        }
        double rata2 = totalNilai/arrNilai.length;
        System.out.println("Nilai rata-rata: "+rata2);
        System.out.println();
        System.out.println("Nilai terendah: "+terendah);
        System.out.println("Nilai tertinggi: "+tertinggi);

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-"+(i+1)+" : "+arrNilai[i]);
        }

    }
}
