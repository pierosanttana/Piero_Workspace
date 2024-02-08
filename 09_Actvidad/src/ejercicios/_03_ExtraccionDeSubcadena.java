package ejercicios;

import java.util.Scanner;

public class _03_ExtraccionDeSubcadena {
	/*
	 * Extracción de Subcadena:
	 * Pide al usuario que ingrese una cadena y dos índices. 
	 * Luego, muestra la subcadena comprendida entre esos dos índices.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Extracción de Subcadena");
		System.out.println("-----------------------");
	
		System.out.println("Ingresa una cadena de texto: ");
		String cadena = scanner.nextLine();
		
		int indice1 = 0;
		int indice2 = 0;
		
		do {
			System.out.println("Ingresa el valor del índice 1 (Desde 1 hasta " + cadena.length() + "): ");
			indice1 = scanner.nextInt();
			
			if(indice1 < 1 || indice1 > cadena.length()) {
				System.out.println("El valor ingresado no es valido.");	
			}
		}while(indice1 < 1 || indice1 > cadena.length());
		
		do {
			System.out.println("Ingresa el valor del índice 2, (Desde " + (indice1) +  " hasta " + cadena.length() + "):");
			indice2 = scanner.nextInt();
			
			if(indice2 < indice1 || indice2 > cadena.length()) {
				System.out.println("El valor ingresado no es valido.");	
			}
		}while(indice2 < indice1 || indice2 > cadena.length());
	
		
		String subCadena = cadena.substring(indice1, indice2);
		
		System.out.println("La nueva cadena dado los indices es:");
		System.out.println(subCadena);

	}

}
