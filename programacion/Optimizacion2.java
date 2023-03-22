import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        // Elige opción
        System.out.println("Elige una opción:");
        System.out.println("1. Calcular sumatorio");
        System.out.println("2. Salir");
        int option = scanner.nextInt();
        scanner.nextLine();

        while (option != 1 && option != 2) {
            System.out.println("Error, elija un opción válida (1 o 2)");
            option = scanner.nextInt();
            scanner.nextLine();
        }  
        
        boolean resp = true;
        while (resp) {
            if (option == 1) {
                
                // Pedimos un número positivo                 
                System.out.println("Introduce un número mayor que cero");
                int n = scanner.nextInt();
                scanner.nextLine();

                while (n < 1) {
                    System.out.println("Error, el número debe ser mayor que cero");
                    n = scanner.nextInt();
                    scanner.nextLine();
                }
                // Realizamos la suma
                int suma = 0;
                for (int i = 0; i <= n; i++) {
                    suma = suma + i;
                }
                
                System.out.println("El resultado es " + suma);
            } else if (option == 2) {
                System.out.println("Hasta luego.");
                resp = false;                
            }

            if (resp){            
                // Elige opción de nuevo
                System.out.println("Elige una opción:");
                System.out.println("1. Calcular sumatorio");
                System.out.println("2. Salir");
                option = scanner.nextInt();
                scanner.nextLine();

                while (option != 1 && option != 2) {
                    System.out.println("Error, elija un opción válida (1 o 2)");
                    option = scanner.nextInt();
                    scanner.nextLine();
                }  
            }
        }
    }
} 
