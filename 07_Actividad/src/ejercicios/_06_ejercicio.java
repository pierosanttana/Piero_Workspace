package ejercicios;

import java.util.Scanner;

public class _06_ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("------------------------------");
		System.out.println("VERIFICADOR DE NÚMEROS PRIMOS");
		System.out.println("------------------------------");
		System.out.println("Introduce un número:");
		int numero = scanner.nextInt();
		
		boolean esPrimo = true;
		
		if(numero >= 0) {
			for(int i = 2; i < numero/2; i++) {
				if( numero % i == 0) {
					System.out.println("-> " + numero + " no es primo, " + i + " es divisor.");
					esPrimo = false;
					//break;
				}
			}		
			if(esPrimo) {
				System.out.println("-> " + numero + " es primo.");
			}
		}else {
			System.out.println("Debe ser un numero positivo.");
		}
	}
}
