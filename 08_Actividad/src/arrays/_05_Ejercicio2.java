package arrays;
import java.util.Scanner;

public class _05_Ejercicio2 {
	/*
	 * Eliminar duplicados: Escribe un programa que solicite al usuario ingresar el
	 * tamaño de un array de números enteros. A continuación se le pedirá números
	 * hasta que el array esta lleno. El programa recorrerá el array para eliminar
	 * los números duplicados y por último imprimirá el nuevo array.
	 */

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

		for (int i = 0; i < array.length; i++) {
			System.out.println("Ingrese un número para la posición " + i + ": ");
			array[i] = scanner.nextInt();
		}

		for (int i = 0; i < arrLongitud; i++) {
			for (int j = i + 1; j < arrLongitud; j++) {
				if (array[i] == array[j]) {
					array[j] = 0;
				}
			}
		}
		// borrarDuplicados(miArray);
		for (int i : array) {
			System.out.print(" - " + i);
		}
		System.out.println();
		// int[] miArray2 = new int[nuevaLongitud(miArray)];
		int nuevaLongitud = arrLongitud;

		for (int i = 0; i < arrLongitud; i++) {
			if (array[i] == 0) {
				nuevaLongitud--;
			}
		}

		int[] array2 = new int[nuevaLongitud];

		int x = 0;

		//for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[j] != 0) {
					array2[x] = array[j];
					x++;
				//	break;
				//} else if (array[j] == 0) {
				//	x++;
			//	}
			}
		}
		for (int i : array2) {
			System.out.print(" - " + i);
		}
		System.out.println();
	}
	/*
	 * 
	 * public static void borrarDuplicados (int[] array){ 
		 * int nuevaLongitud = array.length;
		 * 
		 * for (int i = 0; i < nuevaLongitud; i++) { 
		 * 		for (int j = i + 1; j < nuevaLongitud; j++) { 
		 * 			if(array[i] == array[j]) { 
		 * 				array[j] = 0; 
		 * 			}
		 *  	} 
		 *  }
	 *  }
	 * 
	 * public static int nuevaLongitud (int[] array) { 
	 * 		int cantidadAlmacen = array.length; 
	 * 		for (int i = 0; i < array.length; i++) { 
	 * 			if(array[i] == 0) {
	 * 				cantidadAlmacen--; 
	 * 			} 
	 * 		} return cantidadAlmacen;
	 * 		  
	 * }
	 * 
	 */
}
