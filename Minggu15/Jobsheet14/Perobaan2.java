import java.util.Scanner;

public class Perobaan2 {
    static int hitungPangkat(int a, int b) {
        if (b == 0) {
            return (1);
        } else {
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
        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}
