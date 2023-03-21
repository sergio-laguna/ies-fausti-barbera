import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static String pideTexto() {
        System.out.println("Introduce números separados por comas");
        return scanner.nextLine();
    }

    static String[] separa(String texto) {
        String[] palabras = texto.split(",");
        return palabras;
    }

    static int[] convierte(String[] strings) {
        int[] numeros = new int[strings.length];
        for (int i = 0; i < numeros.length; i++) {
            int numero = Integer.parseInt(strings[i]);
            numeros[i] = numero;
        }
        return numeros;
    }

    static int suma(int[] numeros) {
        int suma = 0;
//        for (int i = 0; i < numeros.length; i++) {
//            int numero = numeros[i];
        for (int numero : numeros) {
            suma = suma + numero;
        }
        return suma;
    }

    public static void main(String[] args) {
        String texto = pideTexto();
        String[] palabras = separa(texto);
        int[] numeros = convierte(palabras);
        int suma = suma(numeros);
        System.out.println("El resultado es " + suma);
    }
} 
