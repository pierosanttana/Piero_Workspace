package arrays;

import java.util.Scanner;

public class _04_Ejercicio {

	public static void main(String[] args) {
		/* Invertir array: Escribe un programa que solicite 
		 * al usuario ingresar el tamaño de un array de números enteros. 
		 * A continuación se le pedirá números hasta que el array esta lleno. 
		 * El siguiente paso será invertir el orden de los valores  
		 * e imprimirlos por pantalla.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int arrLongitud = 0;

		do {
			System.out.println("---------------------------------------");
			System.out.println("-- Invertir array de Números Enteros --");
			System.out.println("---------------------------------------");
			System.out.println("Ingrese el tamaño del array: ");
			arrLongitud = scanner.nextInt();
			if (arrLongitud < 1) {
				System.out.println("-> Por favor, ingrese un tamaño válido mayor a cero. <-");
			}
		} while (arrLongitud < 1); // Si es menos a '1' lo volvemos a pedir.
		
		
		int[] arrayNumeros = new int[arrLongitud];
		
		for(int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Ingrese un número entero para la posición " + i + ": ");
			arrayNumeros[i] = scanner.nextInt();	
		}
		
		int[] arrayInvertido = new int [arrLongitud];
		
		int j = 0;
		
		for(int i = arrayNumeros.length - 1; i >= 0 ; i--) {
			arrayInvertido[j] = arrayNumeros[i];
			j++;
		}
		
		for (int i : arrayNumeros) {
			System.out.print(i + " - ");
		}
		System.out.println();

		for (int i : arrayInvertido) {
			System.out.print(i + " - ");
		}
		
		
		
		
	}

}
