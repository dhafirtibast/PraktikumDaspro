import java.util.Scanner;

public class NilaiMahasiswa11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        int[] nilai = new int[n];

        isianArray(nilai);
        tampilArray(nilai);

        int totaNilai = hitTot(nilai);
        System.out.println("\nTotal nilai seluruh mahasiswa = " + totaNilai);

    }
    static void isianArray(int[] nilai) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1) +": ");
            nilai[i] = sc.nextInt();
        }
    }
    static void tampilArray(int[] nilai) {
        System.out.println("\nDaftar nilai mahasiswa: ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + ": " + nilai[i]);
        }
    }
    static int hitTot(int[] nilai) {
        int totalSeluruh = 0;
        for (int nilaiMhs : nilai) {
            totalSeluruh += nilaiMhs;
        }
        return totalSeluruh;
    }
}
