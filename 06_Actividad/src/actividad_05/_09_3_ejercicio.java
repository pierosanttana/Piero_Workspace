package actividad_05;

import java.util.Scanner;

public class _09_3_ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Factorial");
		System.out.println("Escribe un número entero:");
		int numero = scanner.nextInt();
		
		factorial(numero);
	}
	public static void factorial(int numero) {
		
		int operacion = 1;

		for (int i = numero; i >= 1; i--) {
			operacion *= i;
		}

		System.out.println(numero + "! = " + operacion);
	}
}	

