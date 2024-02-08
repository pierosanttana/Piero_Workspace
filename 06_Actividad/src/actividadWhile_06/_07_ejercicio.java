package actividadWhile_06;

import java.util.Scanner;

public class _07_ejercicio {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		long i = 0;
		long factorial = 0;

		System.out.println("¡¡THIS IS FACTORIAL!!");
		System.out.println("Introduce un número entero(Positivo): ");
		long numero = scanner.nextLong();

		i = numero - 1;
		factorial = numero;
		
			do {
				System.out.print(factorial + " x " + i);
				factorial = factorial * i;
				System.out.println(" = " + factorial);
				i--;
			} while (i >= 1);

			System.out.println("------------------------------------------");
			System.out.println("El factorial de " + numero + "! es: " + factorial);
			System.out.println("------------------------------------------");

	}
}
