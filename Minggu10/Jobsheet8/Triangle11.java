import java.util.Scanner;
public class Triangle11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        int i = 0;
        while (i <= n) {
            int j = 0;
            while (j <= n) {
                System.out.print("*");
                j++;
            }
            i++;
        }
    }
}
