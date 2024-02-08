package ejercicios;

import java.util.Scanner;

public class _02_MayusculasYMinusculas {
	
	/*
	 * Mayúsculas y Minúsculas:
	 * Desarrolla un programa que solicite al usuario 
	 * ingresar una cadena y luego muestre la misma 
	 * cadena en mayúsculas y minúsculas.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Mayúsculas y Minúsculas");
		System.out.println("-----------------------");
	
		System.out.println("Ingresa una cadena de texto: ");
		String cadena = scanner.nextLine();
		
		System.out.println("Cadena en minúsculas: " + cadena.toLowerCase());
		System.out.println("Cadena en mayúsculas: " + cadena.toUpperCase());
		
	}

}
