import java.util.Scanner;
public class Tugas1_Jobsheet8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int jumlah = 0;
        System.out.print("n = "+ n +" : jumlah kuadrat = ");

        for (int i = 1; i <= n; i++) {
            int kuadrat = 0;
            for (int j = 1; j <= i; j++) {
                kuadrat +=  i;
            }
            jumlah += kuadrat;

            System.out.print(kuadrat);
            if (i < n) {
                System.out.print(" + ");
            } else {
                System.out.print(" = "+ jumlah);
            }
        }
    }
}
