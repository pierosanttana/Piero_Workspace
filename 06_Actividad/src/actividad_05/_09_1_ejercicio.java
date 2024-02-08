package actividad_05;

import java.util.Scanner;

public class _09_1_ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Escribe dos números enteros.");
		System.out.println("(OJO: El 'primer numero' debe ser menor que 'el segundo'");
		System.out.print("Primer número: ");
		int primerNumero = scanner.nextInt();

		System.out.print("Segundo número: ");
		int segundoNumero = scanner.nextInt();

		secuencia(primerNumero, segundoNumero);
		

	}public static void secuencia(int numero1, int numero2) {
		
		for (int i = numero1; i <= numero2; i++) {
			System.out.println("número: " + i);
		}
	}
	
}
