package actividad_05;

import java.util.Scanner;

public class _03_ejercicio {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe dos números enteros.");
		System.out.println("(OJO: El 'primer numero' debe ser menor que 'el segundo'");
		System.out.print("Primer número: ");
		int primerNumero = scanner.nextInt();

		System.out.print("Segundo número: ");
		int segundoNumero = scanner.nextInt();

		for (int i = primerNumero; i <= segundoNumero; i++) {
			System.out.println("número: " + i);
		}

	}

}
