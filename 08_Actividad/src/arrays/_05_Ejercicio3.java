package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _05_Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Eliminar duplicados: Escribe un programa que solicite al usuario ingresar el
		 * tamaño de un array de números enteros. A continuación se le pedirá números
		 * hasta que el array esta lleno. El programa recorrerá el array para eliminar
		 * los números duplicados y por último imprimirá el nuevo array.
		 */

		Scanner scanner = new Scanner(System.in);

		int numAlmacen;

		do {
			System.out.println("--------------------------");
			System.out.println("-- Eliminar duplicados --");
			System.out.println("--------------------------");
			System.out.println("Ingresa cuantos numeros quieres almacenar: ");
			numAlmacen = scanner.nextInt(); // Pedimos tamaño del array
			if (numAlmacen < 1) {
				System.out.println("-> No son validos los valores menores a '1'. <-");
			}
		} while (numAlmacen < 1); // Si es menos a '1' lo volvemos a pedir.

		int[] array = new int[numAlmacen]; // Creamos el array1 con el tamaño dado

		for (int i = 0; i < array.length; i++) { // Pedimos numeros hasta llenar el array
			System.out.println("Ingrese un número para la posición " + i + ": ");
			array[i] = scanner.nextInt();
		}
		System.out.println();
		System.out.println("Array");
		for (int i : array) { // se imprime el array
			System.out.print(" - " + i);
		}
		Arrays.sort(array); // Se ordena el array

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) { // Condicion que evalua si 'i' es igual al siguiente valor 'i+1'
				array[i] = 0; // Si se cumple iguala 'i' a cero para eliminar duplicados
			}
		}

		System.out.println();
		System.out.println("Array Ordenado sin Duplicados");
		for (int i : array) {
			System.out.print(" - " + i); // IMPRIMIMOS EL ARRAY1
		}

		System.out.println();
		int tamañoArray = 0;
		for (int i = 0; i < array.length; i++) { // bucle para contar el tamaño del array sin los ceros '0'
			if (array[i] != 0) {
				tamañoArray++;
			}
		}
		int[] array2 = new int[tamañoArray]; // Creamos el nuevo array2 con el tamaño obtenido sin ceros

		int j = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) { // funcion que comprueba si el valor no es 0 lo guarda en el array2
				array2[j] = array[i];
				j++;
			}
		}

		System.out.println("ARRAY3");
		for (int i : array2) {
			System.out.print(" - " + i); // IMPRIMIMOS EL ARRAY3
		}
	}
}
