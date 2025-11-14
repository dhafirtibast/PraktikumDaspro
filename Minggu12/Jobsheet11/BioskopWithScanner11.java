import java.util.Scanner;

public class BioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println();
            System.out.println("=== Welkam tu cinema ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println("------------------------");
            System.out.print("Masukkan input (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    do {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Baris atau kolom di luar jangkauan! Silakan masukkan ulang.");
                            continue;
                        }
                        if (penonton[baris-1][kolom-1] != null) {
                            System.out.println("Kursi tidak valid/terisi!");
                            continue;
                        } else {
                            penonton[baris-1][kolom-1] = nama;
                        }
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if (!next.equalsIgnoreCase("y")) {
                            break;
                        }
                    } while (true);
                    break;
                case 2:
                    System.out.println("\n--- Daftar Penonton ---");
                    for (int i = 0; i < penonton.length; i++) {
                        String[] barisKursi = new String[penonton[i].length];
                        for (int j = 0; j < penonton[i].length; j++) {
                            barisKursi[j] = penonton[i][j] != null ? penonton[i][j] : "****";
                        }
                        System.out.println("Baris " + (i + 1) + ": " + String.join(", ", barisKursi));
                    }
                    break;

                case 3:
                    System.out.println("Thanks for coming!");
                    System.out.println();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");;
            }
        }
    }
}