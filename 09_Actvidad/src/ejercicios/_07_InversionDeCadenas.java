package ejercicios;

import java.util.Scanner;

public class _07_InversionDeCadenas {
	
	/*
	 * Inversión de Cadenas:
	 * Escribe un programa que tome una cadena como entrada 
	 * y muestre la misma cadena pero invertida. Por ejemplo, 
	 * si el usuario ingresa "Java", el programa debería mostrar "avaJ".
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inversión de Cadenas");
		System.out.println("--------------------");
	
		System.out.println("Ingresa una cadena de palabras:");
		String cadena = scanner.nextLine();
		
		StringBuilder nuevaCadena  = new StringBuilder();
		
		nuevaCadena.append(cadena);
		
		String cadena2 = nuevaCadena.reverse().toString();
		
		System.out.println(cadena2);
		
		/*
		 * 
		for(int i = cadena.length()-1; i >= 0 ; i-- ) {
			System.out.print(cadena.charAt(i));
		}
		 */
	}
}
