import java.util.Scanner;
public class Tugas3_Jobsheet9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};

        System.out.println("=== Daftar Menu ===");
        System.out.print("1. Nasi Goreng \n2. Mie Goreng \n3. Roti Bakar \n4. Kentang Goreng \n5. Teh Tarik \n6. Cappuccino \n7. Chocolate Ice \n");
        System.out.print("\nMasukkan nama menu: ");
        String userInput = sc.nextLine();

        boolean isFound = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(userInput)) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Menu tersedia.");
        } else {
            System.out.println("Menu tidak tersedia!");
        }
    }
}
