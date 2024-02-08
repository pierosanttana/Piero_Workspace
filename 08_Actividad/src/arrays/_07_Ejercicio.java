package arrays;

import java.util.Scanner;

public class _07_Ejercicio {

	public static void main(String[] args) {
		/*
		 * Contar pares e impares: Escribe un programa que solicite al usuario ingresar
		 * el tamaño de un array de números enteros. A continuación se le pedirá números
		 * hasta que el array esta lleno. El programa contará el número de pares e
		 * impares que hay en el array y mostrará dicha cuenta por pantalla.
		 */
		Scanner scanner = new Scanner(System.in);

		int arrLongitud;

		System.out.println("--------------------------");
		System.out.println(" Contador Pares e Impares ");
		System.out.println("--------------------------");
		do {
			System.out.println("Ingrese el tamaño del array: ");
			arrLongitud = scanner.nextInt(); // Pedimos tamaño del array
			if (arrLongitud < 1) {
				System.out.println("-----------------------------------------");
				System.out.println("No son validos los valores menores a '1'.");
				System.out.println("-----------------------------------------");
			}
		} while (arrLongitud < 1); // Si es menos a '1' lo volvemos a pedir.

		int[] arrayNumeros = new int[arrLongitud];

		int paresTotales = 0;
		int imparesTotales = 0;

		for (int i = 0; i < arrLongitud; i++) {
			System.out.println("Ingrese un número para la posición " + i + ": ");
			arrayNumeros[i] = scanner.nextInt();
			if (arrayNumeros[i] % 2 == 0) {
				paresTotales++;
			} else if (arrayNumeros[i] % 2 == 1) {
				imparesTotales++;
			}
		}
		System.out.println("Has guardado un total de:");
		System.out.println("Pares -> " + paresTotales);
		System.out.println("Inpares ->  " + imparesTotales);
	}

}
