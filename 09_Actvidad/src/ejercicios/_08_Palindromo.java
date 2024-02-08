package ejercicios;

import java.util.Scanner;

public class _08_Palindromo {
	/*
	 * Palíndromo:
	 * Desarrolla un programa que determine si una 
	 * palabra ingresada por el usuario es un palíndromo 
	 * (se lee igual de izquierda a derecha que de derecha a izquierda), 
	 * ignorando mayúsculas y minúsculas.
	 * 
	 */
	
	private static boolean isAlphanumeric(char c) {
	       return Character.isAlphabetic(c) || Character.isDigit(c);
	   }
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Palíndromo");
		System.out.println("--------------------");
	
		System.out.println("Ingresa una palabra:");
		String cadena = scanner.nextLine();
		
		String nuevaCadena = cadena.toLowerCase();
		
		boolean palindromo = true;
		
		int j = nuevaCadena.length()-1;
			
		
		for(int i = 0; i < nuevaCadena.length() ; i++ ) {
			
			if(nuevaCadena.charAt(i) != nuevaCadena.charAt(j)) {
				palindromo = false;
				break;
			}	
			j--;
		}
		
		if(palindromo) {
			System.out.println(cadena + ", es palindromo.");
		}
		else {
			System.out.println(cadena + ", no es palindromo.");
		}
	}
}
