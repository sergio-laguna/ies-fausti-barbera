import java.util.Scanner;
import java.util.ArrayList;
public class ejercicio001 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int media = 0;
		int suma = 0;
			ArrayList<Integer> lista = new ArrayList<Integer>();
			leerValores(lista);
			suma = calcularSumar(lista);
			media = calcularMedia(lista);
			mostrarResultados(suma,media);
		}
	
	public static  ArrayList<Integer> leerValores (ArrayList<Integer>lista) {
		Scanner sc = new Scanner(System.in);
		int fin = 0;
		while (fin != -99) {
			System.out.println("Introduce el valor");
			fin = sc.nextInt();
			if (fin !=-99) {
			lista.add(fin);
			}
		}
	return lista;
	}
	public static int calcularSumar (ArrayList<Integer> lista) {
		int suma = 0;
		for (int i= 0; i < lista.size(); i++) {
			suma += lista.get(i);
		}
		return suma;
	}
	public static int calcularMedia (ArrayList<Integer> lista) {
		int media = 0;
		int suma = 0;
		for (int i= 0; i < lista.size(); i++) { 
			suma +=lista.get(i);
			}
		media = suma/lista.size();
		return media;
	}
	public static void mostrarResultados (int suma, int media ) {
		System.out.println("suma"+suma);
		System.out.println("media"+media);
	}
}