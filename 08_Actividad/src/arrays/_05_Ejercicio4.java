package arrays;

import java.util.Scanner;
/* 
 * Invertir array: Escribe un programa que solicite 
 * al usuario ingresar el tamaño de un array de números enteros. 
 * A continuación se le pedirá números hasta que el array esta lleno. 
 * El siguiente paso será invertir el orden de los valores  
 * e imprimirlos por pantalla.
 */

public class _05_Ejercicio4 {

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

		System.out.println("array");
		for (int i : array) { // imprime el array con todos sus valores
			System.out.print(" - " + i);
		}
		System.out.println();

		for (int i = 0; i < arrLongitud; i++) { // Bucle que compará un valor con todos los siguientes
			for (int j = i + 1; j < arrLongitud; j++) {
				if (array[i] == array[j]) { // La condición busca valores que sean iguales
					array[j] = 0; // Si un valor se repite lo vuelve cero '0'
					
				}
			}
		}
		System.out.println("array sin duplicados");
		for (int i : array) { // imprime el array con los valores duplicados en 0
			System.out.print(" - " + i);
		}
		System.out.println();

		
		int nuevaLongitud = 0; // variable para nuevo tamaño sin ceros
		for (int i = 0; i < array.length; i++) { // bucle para contar el tamaño del array sin los ceros '0'
			if (array[i] != 0) {
				nuevaLongitud++;
			}
		}
		
		int[] array2 = new int[nuevaLongitud]; // Creamos el nuevo array2 con el tamaño obtenido sin ceros

		int j = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) { // funcion que comprueba si el valor no es 0 lo guarda en el array2
				array2[j] = array[i]; // Si se cumple guarda el valor en la primera posición 'j' y le suma 1
				j++;
			}
		}

		System.out.println("array2");
		for (int i : array2) { // imprime el nuevo array2
			System.out.print(" - " + i);
		}
	}
}