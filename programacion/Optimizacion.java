import java.util.Scanner;

public class Optimizacion {

    static Scanner scanner = new Scanner(System.in);

    // Esto es un comentario
    
    public static void main(String[] args) {
        // Pedimos el texto
        System.out.println("Introduce números separados por comas");
        String texto = scanner.nextLine(); 

        // Separa el texto
        String[] palabras = texto.split(",");
        
        // convierte el texto a números
        int[] numeros = new int[strings.length];
        for (int i = 0; i < numeros.length; i++) {
            int numero = Integer.parseInt(strings[i]);
            numeros[i] = numero;
        }
        
        // Realizamos la suma
        int suma = 0;
        for (int numero : numeros) {
            suma = suma + numero;
        }        
        
        System.out.println("El resultado es " + suma);
    }   
} 
