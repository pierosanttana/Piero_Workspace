package ejercicios;

import java.util.Scanner;

public class _09_ConteoDeCaracteres {
	
	/* Conteo de Caracteres:
	 * Escribe un programa que cuente el número de veces 
	 * que aparece un carácter específico ingresado por el 
	 * usuario en una cadena ingresada por el usuario.
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Conteo de Caracteres");
		System.out.println("--------------------");
	
		System.out.println("Ingresa una cadena de palabras:");
		String cadena = scanner.nextLine();
		
		System.out.println("Ingresa una carácter para contar:");
		char caracter = scanner.nextLine().charAt(0);
		
		
		int contador = 0;
		
		for(int i = 0; i < cadena.length(); i++ ) {
			
			if(caracter == cadena.toLowerCase().charAt(i)) {
				contador++;
			}
		}
		
		System.out.println("El total de '" + caracter + "' en la frase es: " + contador + "");
	}

}
