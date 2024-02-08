package arrays;

import java.util.Scanner;

public class _02_Ejercicio {

	public static void main(String[] args) {
		// Promedio: Escribe un programa que solicite al usuario 
		// ingresar el tamaño de un array de números reales. 
		// A continuación se le pedirá números hasta que el array 
		// esta lleno y por último imprimirá la media aritmética de todos ellos.
		

		Scanner scanner = new Scanner(System.in);
		
		int arrLongitud;

		do {
			System.out.println("--------------------------");
			System.out.println("-- Promedio --");
			System.out.println("--------------------------");
			System.out.println("Ingrese el tamaño del array: ");
			arrLongitud = scanner.nextInt();
			if (arrLongitud < 1) {
				System.out.println("-> Por favor, ingrese un tamaño válido mayor a cero. <-");
			}
		} while (arrLongitud < 1);
		
		double[] array = new double[arrLongitud];
		
		double sumaValores = 0;
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Ingrese un número para la posición " + i + ": ");
			array[i] = scanner.nextDouble();
			sumaValores = sumaValores + array[i];
		}
		double promedio = sumaValores / arrLongitud;
		promedio = Math.round(promedio * 100d) / 100d;
		System.out.println("El promedio de los números almacenadas es: " + promedio);

	}

}
