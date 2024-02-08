package ejercicios;

import java.util.Scanner;

public class _06_ConteoDePalabras {
	
	/* 
	 * Conteo de Palabras: Desarrolla un programa 
	 * que cuente el número de palabras en una cadena 
	 * ingresada por el usuario. Considera que las palabras 
	 * están separadas por espacios.
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Conteo de Palabras");
		System.out.println("------------------");
	
		System.out.println("Ingresa una cadena de palabras:");
		String cadena = scanner.nextLine();
		
		String[] cadenaDividida = cadena.split(" ");
		
		System.out.println("El número de palabras en la cadena es: " + cadenaDividida.length);
		
		for (String string : cadenaDividida) {
			System.out.print(string);
		}
	}

}
