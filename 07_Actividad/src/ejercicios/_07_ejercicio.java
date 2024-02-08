package ejercicios;

import java.util.Scanner;

public class _07_ejercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---------------------------------");
		System.out.println("GENERADOR DE SECUENCIA FIBONACCI");
		System.out.println("---------------------------------");
		System.out.println("Introduce el número de secuencias que quieres ver:");
		int numeroSecuencias = scanner.nextInt();
		
		long valor1 = 0;
		long valor2 = 1;
		long sumaAnteriores;
		
		
		for( int i = 0; i < numeroSecuencias; i++ ) {
			System.out.print("-> " + valor1);
			sumaAnteriores = valor1 + valor2;
			valor1 = valor2;
			valor2 = sumaAnteriores;	
		}
	}
}
