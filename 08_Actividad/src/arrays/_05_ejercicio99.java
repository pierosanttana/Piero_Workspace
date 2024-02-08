package arrays;

import java.util.Scanner;

public class _05_ejercicio99 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int arrLongitud;
		do {
			System.out.println("--------------------------");
			System.out.println("-- Eliminar duplicados --");
			System.out.println("--------------------------");
			System.out.println("Ingrese el tamaño del array: ");
			arrLongitud = scanner.nextInt(); // Pedimos tamaño del array
			if (arrLongitud < 1) {
				System.out.println("-> Por favor, ingrese un tamaño válido mayor a cero. <-");
			}
		} while (arrLongitud < 1); // Si es menos a '1' lo volvemos a pedir.

		int[] array = new int[arrLongitud];

		for (int i = 0; i < array.length; i++) { // Llenamos el array con valores
			System.out.println("Ingrese un número para la posición " + i + ": ");
			array[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < arrLongitud; i++) { // Bucle que compará un valor con todos los siguientes
			for (int j = i + 1; j < arrLongitud; j++) {
				if (array[i] == array[j]) { // La condición busca valores que sean iguales
					array[j] = 0; // Si un valor se repite lo vuelve cero '0'		
				}
			}
		}
		
		for(int numero : array) {
			if (numero != 0) {
				System.out.println(numero);
			}
		}

	}

}
