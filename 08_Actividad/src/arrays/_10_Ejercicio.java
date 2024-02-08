package arrays;

import java.util.Scanner;

	/*
	 * Eliminar elemento específico: Escribe un programa 
	 * que permita al usuario ingresar un valor y elimine 
	 * todas las ocurrencias de ese valor en un array creado 
	 * al inicio del programa. Muestra el array resultante.
	 */

public class _10_Ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int arrayLongitud = 0;
		System.out.println("-------------------");
		System.out.println(" Eliminar elemento ");
		System.out.println("-------------------");
		do {
			System.out.println("-> Ingrese el tamaño del array: ");
			arrayLongitud = scanner.nextInt(); // Pedimos tamaño del array
			if (arrayLongitud < 1) {
				System.out.println("-----------------------------------------");
				System.out.println("No son validos los valores menores a '1'.");
				System.out.println("-----------------------------------------");
			}
		} while (arrayLongitud < 1); // Si es menos a '1' lo volvemos a pedir.


		int[] array = new int[arrayLongitud];

		for (int i = 0; i < arrayLongitud; i++) {
			System.out.println("Ingresa el número a guardar:");
			array[i] = scanner.nextInt();
		}
		
		System.out.println("-- Array --");
		for (int i : array) {
			System.out.print(" - " + i);
		}
		System.out.println();
		
			System.out.println("------------------------------------------");
			System.out.println("-> Ingresa un número que quieras eliminar: ");
			int elemento = scanner.nextInt();
			
			for (int i = 0; i < arrayLongitud; i++) {
				if(elemento == array[i]) {
					array[i] = 0;
				}	
			}
			System.out.println("-- Nuevo Array --");
			for (int j : array) {
				System.out.print(" - " + j);
			}
			System.out.println();

	}

}
