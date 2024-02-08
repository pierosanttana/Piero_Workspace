package actividad_05;

import java.util.Scanner;

public class _09_2_ejercicio {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Tabla de multiplicar");
		System.out.println("Escribe un número entero:");
		int numero = scanner.nextInt();
		
		tablaMultiplicar(numero);

	}
	public static void tablaMultiplicar(int numero) {
		
		for (int i = 0; i <= 12; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
	}

}
