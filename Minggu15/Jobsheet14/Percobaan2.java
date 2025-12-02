import java.util.Scanner;

public class Percobaan2 {
    static int hitungPangkat(int a, int b) {
        if (b == 0) {
            System.out.print("1");
            return (1);
        } else {
            System.out.print(a + "x");
            return (a * hitungPangkat(a, b - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;
        
        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();
        
        // menampilkan hasil
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.print(" = " + hasil);
    }
}
