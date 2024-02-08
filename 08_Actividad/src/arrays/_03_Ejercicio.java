package arrays;

import java.util.Scanner;

public class _03_Ejercicio {

	public static void main(String[] args) {
		/* Mayor elemento: Escribe un programa que solicite al usuario 
		 * ingresar el tamaño de un array de números enteros. 
		 * A continuación se le pedirá números hasta que el array esta lleno 
		 * y por último recorrerá el array para buscar el mayor número y lo imprimirá.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int arrLongitud;

		do {
			System.out.println("--------------------------");
			System.out.println("-- Mayor elemento --");
			System.out.println("--------------------------");
			System.out.println("Ingrese el tamaño del array: ");
			arrLongitud = scanner.nextInt();
			if (arrLongitud < 1) {
				System.out.println("-> Por favor, ingrese un tamaño válido mayor a cero. <-");
			}
		} while (arrLongitud < 1); // Si es menos a '1' lo volvemos a pedir.
		
		int[] arrayNumeros = new int[arrLongitud];
		
		int numeroMayor = 0;
		
		for(int i = 0; i < arrayNumeros.length; i++) {
			System.out.println("Ingrese un número para la posición " + i + ": ");
			arrayNumeros[i] = scanner.nextInt();
		}
			
		for(int i = 0; i < arrayNumeros.length; i++) {
			if(arrayNumeros[i] > numeroMayor) {
				numeroMayor = arrayNumeros[i];
			}
		}
		System.out.println("El número mayor del array es: " + numeroMayor);
		
		

	}

}
