package arrays;

import java.util.Scanner;

public class _04_Ejercicio2 {

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
			System.out.println("--------------------------");
			System.out.println("-- Invertir Array --");
			System.out.println("--------------------------");
			System.out.println("Ingrese el tamaño del array: ");
			arrLongitud = scanner.nextInt();
			if (arrLongitud < 1) {
				System.out.println("-> Por favor, ingrese un tamaño válido mayor a cero. <-");
			}
		} while (arrLongitud < 1); // Si es menos a '1' lo volvemos a pedir.


		int[] arrayNumeros = new int[arrLongitud];

		for(int i = 0; i < arrLongitud; i++) {
			System.out.println("Ingrese un número para la posición " + i + ": ");
			arrayNumeros[i] = scanner.nextInt();	
		}
		
		System.out.println("Array");
		for(int i : arrayNumeros) {
			System.out.print(" - " + i);
		}
		System.out.println();
		
		for(int i = 0; i < arrLongitud; i++) {
			int temp = arrayNumeros[i];
			arrayNumeros[i] = arrayNumeros[arrLongitud - 1];
			arrayNumeros[arrLongitud - 1] = temp;
			arrLongitud--;
		}
		
		System.out.println("Array Invertido");
		for(int i : arrayNumeros) {
			System.out.print(" - " + i);
		}
	}

}
