package arrays;

import java.util.Scanner;

/* 
 * Eliminar duplicados: Escribe un programa que solicite 
 * al usuario ingresar el tamaño de un array de números enteros. 
 * A continuación se le pedirá números hasta que el array esta lleno. 
 * El programa recorrerá el array para eliminar los números duplicados 
 * y por último imprimirá el nuevo array.
 */
public class _05_Ejercicio1 {

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
		} while (arrLongitud < 1); 	// Si es menor a '1' lo volvemos a pedir.

		int[] array = new int[arrLongitud]; // Creamos el array con la longitud que dio el usuario

		for (int i = 0; i < arrLongitud; i++) { // Bucle que recorre el array y pide al usuario números
			System.out.println("Ingrese el número para la posición " + i + ": "); // para guardar en cada posición
			array[i] = scanner.nextInt();
		}

		System.out.println("Array sin revisar:");
		for (int i : array) {
			System.out.print(" - " + i);
		}
		System.out.println();
		int cambio = 1;
		int nuevaLongitud = arrLongitud;

		for (int i = 0; i < nuevaLongitud; i++) { 	// bucle 'i' que recorre el array hasta final
			for (int j = i + 1; j < nuevaLongitud; j++) { // bucle 'j' que compará 'i' con las siguientes posiciones
				if (array[i] == array[j]) { // Condicion que evalua si i == j
					for (int k = j; k < nuevaLongitud - 1; k++) { // Si se cumple la condición entra en este bucle 'k'
						int temp = array[k]; 					  // que mueve a 'j' al final del array
						array[k] = array[k + 1];
						array[k + 1] = temp;
					/*
					}
					System.out.println("-> Cambio numero " + cambio + ":"); //
					for (int x : array) {		 // /imprimo el array para visualizar cada cambio
						System.out.print(" - " + x); //
					*/
					}
					cambio++; 					//
					System.out.println(); 		//

					j--;			 // Restamos 1 a 'j' para volver a comprobar la posición ya que el valor cambio.
					nuevaLongitud--; // Restamos 1 al tamaño del array para que no evalue la ultima posición
				} 					// que es ahora un valor duplicado.
			} 						// Y tambíen nos actualiza el tamaño del array sin valores duplicados
		} 							// para usarlo y crear un array con el tamaño sin duplicados

		System.out.println("Array revisado:"); // Imprimo el array con todos los cambios hechos.
		for (int i : array) {				   
			System.out.print(" - " + i);
		}
		System.out.println();

		int[] newArr = new int[nuevaLongitud]; // Se crea un nuevo Array con la longitud sin valores duplicados

		for (int i = 0; i < newArr.length; i++) { // Bucle que recorre la longitud del nuevo Array
			newArr[i] = array[i]; 	// Copia los valores y deja fuera los duplicados.
		}						

		System.out.println("Nuevo Array sin valores duplicados."); // /imprimo el nuevo array
		for (int i : newArr) {
			System.out.print(" - " + i);
		}
	}

} 