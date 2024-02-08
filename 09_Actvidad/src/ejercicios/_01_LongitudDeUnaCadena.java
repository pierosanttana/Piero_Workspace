package ejercicios;

import java.util.Scanner;

public class _01_LongitudDeUnaCadena {
	/* Longitud de una Cadena: 
	 * Escribe un programa que solicite al usuario ingresar 
	 * una cadena y muestre la longitud de la cadena ingresada.
	 */


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Longitud de una cadena");
		System.out.println("----------------------");
	
		System.out.println("Ingresa una cadena de texto: ");
		String cadena = scanner.nextLine();
		
		System.out.println("La longitud de la cadena es de: " + cadena.length() + " caracteres.");

	}

}
