package ejercicios;

import java.util.Scanner;

public class _01_ejercicio {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("-------------------------");
		System.out.println("CONTADOR DE NÚMEROS PARES");
		System.out.println("-------------------------");
		
		System.out.println("Introduce un número:");
		int numero1 = scanner.nextInt();
		
		System.out.println("Introduce otro número:");
		int numero2 = scanner.nextInt();
		
		int cantidadPares = 0;
		
		if(numero1 < numero2) {
			for(int i = numero1; i <= numero2; i++) {
				if(i % 2 == 0) {
					cantidadPares++;
					//System.out.println(i + "; ");
				}
			}
			System.out.println();
			System.out.println("La cantidad de pares entre " + numero1 + " y " + numero2 + " es: " + cantidadPares);
			
		}else if(numero1 > numero2) {
			for(int i = numero1; i >= numero2; i--) {
				if(i % 2 == 0) {
					cantidadPares++;
					//System.out.print(i + "; ");
				}
			}
			System.out.println();
			System.out.println("La cantidad de pares entre " + numero1 + " y " + numero2 + " es: " + cantidadPares);
			
		}else if(numero1 == numero2) {
			if(numero1 % 2 == 0) {
				//System.out.print(numero1 + "; ");
				cantidadPares++;
			}
			System.out.println();
			System.out.println("La cantidad de pares entre " + numero1 + " y " + numero2 + " es: " + cantidadPares);
			
		}
	}
	
}
