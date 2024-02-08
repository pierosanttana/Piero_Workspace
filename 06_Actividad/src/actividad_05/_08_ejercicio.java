package actividad_05;

import java.util.Scanner;

public class _08_ejercicio {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Factorial");
		System.out.println("Escribe un número entero:");
		int numero = scanner.nextInt();

		int factorial = 1;

		for (int i = numero; i >= 1; i--) {
			factorial *= i;
		}

		System.out.println(numero + "! = " + factorial);
	}
}
