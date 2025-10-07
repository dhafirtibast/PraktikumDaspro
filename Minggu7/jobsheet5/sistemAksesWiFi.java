import java.util.Scanner;
public class sistemAksesWiFi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan status Anda (dosen/mahasiswa): ");
        String status = sc.nextLine();

        if (status.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (status.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS Anda: ");
            int sks = sc.nextInt();
            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }

    }
}
