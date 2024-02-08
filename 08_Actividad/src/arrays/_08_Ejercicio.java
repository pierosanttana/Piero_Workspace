package arrays;

import java.util.Scanner;

/* Multiplicar elementos por un número: 
 * Escribe un programa que solicite al usuario ingresar 
 * el tamaño de un array de números enteros. A continuación 
 * se le pedirá números hasta que el array esta lleno y 
 * por último imprimirá la multiplicación de todos los elementos.
 */

public class _08_Ejercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int arrayLongitud;
		
		System.out.println("-----------------------");
		System.out.println(" Multiplicar elementos ");
		System.out.println("-----------------------");
		do {
			System.out.println("Ingrese el tamaño del array: ");
			arrayLongitud = scanner.nextInt(); // Pedimos tamaño del array
			if (arrayLongitud < 1) {
				System.out.println("-----------------------------------------");
				System.out.println("No son validos los valores menores a '1'.");
				System.out.println("-----------------------------------------");
			}
		} while (arrayLongitud < 1); // Si es menos a '1' lo volvemos a pedir.


		int[] arrayNumeros = new int[arrayLongitud];

		for (int i = 0; i < arrayLongitud; i++) {
			System.out.println("Ingresa el número a guardar:");
			arrayNumeros[i] = scanner.nextInt();
		}
		int multiplicacionTotal = 1;
		for (int i = 0; i < arrayLongitud; i++) {
			multiplicacionTotal = multiplicacionTotal * arrayNumeros[i];
		}
		System.out.println("La multiplicación de todos los números guardados es: " + multiplicacionTotal);
	}

}
