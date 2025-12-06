import java.util.Scanner;

public class Tugas {
    static Scanner sc = new Scanner(System.in);
    static int rekursif(int[] arr, int n) {
        if (n==0) {
            return (0);
        } else {
            return (arr[n-1] + rekursif(arr, n-1));
        }
    }
    static int iteratif(int[] arr) {
        int total = 0;
        for (int i = arr.length; i >= 1; i--) {
            total += arr[i-1];
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int jml = sc.nextInt();

        int[] angka = new int[jml];

        for (int i = angka.length; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i-1] = sc.nextInt();
        }

        System.out.println("Total rekursif: " + (rekursif(angka, jml)));
        System.out.println("Total iteratif: " + (iteratif(angka)));

        
    }
}
