import java.util.Scanner;

public class Kubus11 {
    static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6*(sisi*sisi);
        return luasPermukaan;
    }
    static int hitungVolKubus(int sisi) {
        int volKubus = sisi*sisi*sisi;
        return volKubus;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");
        int sisi = sc.nextInt();
        int vol = hitungVolKubus(sisi);
        int luasP = hitungLuasPermukaan(sisi);
        System.out.println("Sisi = " + sisi);
        System.out.println("Volume kubus = " + vol);
        System.out.println("Luas permukaan kubus = " + luasP);
    }

}
