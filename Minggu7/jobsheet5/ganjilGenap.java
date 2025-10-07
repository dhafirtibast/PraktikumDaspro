import java.util.Scanner;
public class ganjilGenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka = 0;
        System.out.print("Masukkan angka: ");
        angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }
}
