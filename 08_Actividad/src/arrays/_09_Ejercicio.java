package arrays;

import java.util.Scanner;

public class _09_Ejercicio {

	public static void main(String[] args) {
		/* Unir arrays: Escribe un programa que solicite 
		 * al usuario ingresar el tamaño de dos arrays de números enteros. 
		 * A continuación se le pedirá números hasta que los arrays estén llenos. 
		 * A continuación, el programa unirá los dos arrays en otro array más grande, 
		 * y por último imprimirá la suma de todos los elementos de ese array nuevo.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int arrayLongitud = 0;
		
		System.out.println("------------------");
		System.out.println("-- Unir Arrays --");
		System.out.println("------------------");
		do {
			System.out.println("Primer Array -> Ingrese el tamaño del array: ");
			arrayLongitud = scanner.nextInt(); // Pedimos tamaño del array
			if (arrayLongitud < 1) {
				System.out.println("-----------------------------------------");
				System.out.println("No son validos los valores menores a '1'.");
				System.out.println("-----------------------------------------");
			}
		} while (arrayLongitud < 1); // Si es menos a '1' lo volvemos a pedir.

		int[] arrayNumeros = new int[arrayLongitud];
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Ingresa el número a guardar:");
			arrayNumeros[i] = scanner.nextInt();
		}
		
		int arrayLongitud2 = 0;
		do {
			System.out.println("Segundo Array -> Ingrese el tamaño del array: ");
			arrayLongitud2 = scanner.nextInt(); // Pedimos tamaño del array
			if (arrayLongitud2 < 1) {
				System.out.println("-----------------------------------------");
				System.out.println("No son validos los valores menores a '1'.");
				System.out.println("-----------------------------------------");
			}
		} while (arrayLongitud2 < 1); // Si es menos a '1' lo volvemos a pedir.

		
		int[] arrayNumeros2 = new int[arrayLongitud2];
		
		for (int i = 0; i < arrayLongitud2; i++) {
			System.out.println("Ingresa el número a guardar:");
			arrayNumeros2[i] = scanner.nextInt();
		}
		
		int[] unionArrays = new int[arrayLongitud + arrayLongitud2];
		
		for(int i = 0; i < arrayLongitud; i++) {
			unionArrays[i] = arrayNumeros[i];
		}
		int j = 0;
		for(int i = arrayNumeros.length ; i < unionArrays.length; i++) {
			unionArrays[i] = arrayNumeros2[j];
			j++;
		}
		
		int sumaUnionNumeros = 0;
		for (int i = 0; i < unionArrays.length; i++) {
			sumaUnionNumeros = sumaUnionNumeros + unionArrays[i];
		}
		
		System.out.println("-- La unión de los Arrays --");
		for (int i : unionArrays) {
			System.out.print(" - " + i);
		}
		System.out.println();
		
		System.out.println("La suma de todos los numeros de la unión es: " + sumaUnionNumeros);
		
		

	}

}
