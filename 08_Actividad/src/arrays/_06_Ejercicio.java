package arrays;

import java.util.Scanner;

public class _06_Ejercicio {
	public static void main(String[] args) {

		/*
		 * Buscar elemento: Desarrolla un programa que permita al usuario ingresar un
		 * valor y determine si ese valor está presente en un array dado. Se tendrá que
		 * crear un array con valores al inicio del programa.
		 */

		int[] arrayNumeros = { 1, 2, 4, 5, 7, 9, 12, 13, 15, 16, 18, 20 };

		Scanner scanner = new Scanner(System.in);

		int numBuscar = 0;
		System.out.println("-- Buscar elemento --");
		do {
			System.out.println("--------------------------");
			System.out.println("El rango de números: 1 al 20");
			System.out.println("Ingresa el que quieres buscar en la lista: ");
			numBuscar = scanner.nextInt();
		} while (numBuscar < 1 || numBuscar > 20);

		boolean encontrado = false;

		for (int i = 0; i < arrayNumeros.length; i++) {
			if (numBuscar == arrayNumeros[i]) {
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("¡Eureka! Ese número está en la lista.");
		} else {
			System.out.println("Perdón, ese número no está en la lista.");
		}
	}

}
