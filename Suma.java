import java.util.Scanner;

public class Suma {

   public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
    
          System.out.println("### Introduce El Primer Numero ###");
          int num1 = scanner.nextInt();
    
          System.out.println("### Introduce El Segundo Numero ###");
          int num2 = scanner.nextInt();
    
          int suma = num1 + num2;
    
          System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
    
          scanner.close();
     }


}
