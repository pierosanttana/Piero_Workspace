package ejercicios;

import java.util.Scanner;

public class _05_ReemplazoDeCaracteres {
	/* Reemplazo de Caracteres:
	 * Crea un programa que tome una cadena y reemplace 
	 * todas las ocurrencias de un carácter específico 
	 * con otro carácter ingresado por el usuario.
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Reemplazo de Caracteres");
		System.out.println("-----------------------");
		
		String cadena = "La azafata Ana bajaba cada mañana a la mar salada para lavar la falda anaranjada.";
		
		System.out.println("Frase:");
		System.out.print("-> ");
		System.out.println(cadena);
		
		System.out.println("Elige un carácter específico de la frase para reemplazar: ");
		char caracterEspecifico = scanner.nextLine().charAt(0);
	
		System.out.println("Ingresa el nuevo carácter: ");
		char caracterRemplazo = scanner.nextLine().charAt(0);
		
		String cadenaRemplazada = cadena.replace(caracterEspecifico, caracterRemplazo);
		
		System.out.print("-> ");
		System.out.println(cadenaRemplazada);
		
	}

}
