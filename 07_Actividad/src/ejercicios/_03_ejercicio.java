package ejercicios;

import java.util.Scanner;

public class _03_ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numeroPositivo = 0;
		int sumarNumeros = 0;
		System.out.println("-------------------------");
		System.out.println("SUMA DE NÚMEROS POSITIVOS");
		System.out.println("-------------------------");
		do {
			System.out.println("Introduce un número positivo para sumar o negativo para salir:");
			numeroPositivo = scanner.nextInt();	
			if(numeroPositivo >= 0) {
				sumarNumeros = sumarNumeros + numeroPositivo;
			}	
		}while(numeroPositivo >= 0);
		
		if (sumarNumeros > 0) {
		System.out.println("La suma total es: " + sumarNumeros);
		System.out.println("Fin del programa.");
		} else {
			System.out.println("Fin del programa.");
		}
	}
}

