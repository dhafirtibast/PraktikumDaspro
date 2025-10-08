import java.util.Scanner;
public class aksesMasukPerpus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bawa_kartu, registrasi_online;

        System.out.print("Apakah anda membawa kartu? (true/false) : ");
        boolean jawaban_kartu;

        System.out.print("Apakah anda sudah registrasi online? (true/false) : ");
        boolean jawaban_regis;

        if (bawa_kartu || registrasi_online) {
            System.out.println("Akses diberikan.");
        }else {
            System.out.println("Akses tidak diberikan.");
        }

    }
    
}
