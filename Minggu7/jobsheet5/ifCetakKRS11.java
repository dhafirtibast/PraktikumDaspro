import java.util.Scanner;
public class ifCetakKRS11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");

        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = input.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi.");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA.");

        }else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }

    }
}
