import java.util.Scanner;

public class Daily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("¿Qué hiciste ayer?");
        String ayer = scanner.nextLine();

        System.out.println("¿Qué harás hoy?");
        String hoy = scanner.nextLine();

        System.out.println("¿Tienes algún impedimento?");
        String impedimentos = scanner.nextLine();

        System.out.println();
        System.out.println("=== MI DAILY ===");
        System.out.println("Buenas Noches, equipo.");
        System.out.println("Ayer: " + ayer);
        System.out.println("Hoy: " + hoy);
        System.out.println("Impedimentos: " + impedimentos);

        scanner.close();
    }
}
    
