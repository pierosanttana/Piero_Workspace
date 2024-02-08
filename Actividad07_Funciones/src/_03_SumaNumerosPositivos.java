import java.util.Scanner;

public class _03_SumaNumerosPositivos {

	public static void main(String[] args) {
		/*
		 * Suma de números positivos: Crea un algoritmo que solicite 
		 * al usuario ingresar números positivos. El programa debe calcular 
		 * la suma de esos números hasta que se ingrese un número 
		 * negativo y acabará mostrando dicha suma.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		sumarNumerosPositivos(scanner);

	}

	private static void sumarNumerosPositivos(Scanner scanner) {
		
		int sumaTotal = 0;
		int numero = 0;
		
		imprimirMensaje("-- Suma de números Positivos --");
		
		do {
			numero = pedirNumero(scanner);
			
			if(numero > 0) {
				sumaTotal += numero;
			}
		} while (numero > 0);
		
		imprimirMensaje("La suma de todos los números positivos es: " + sumaTotal);
		
	}

	private static int pedirNumero(Scanner scanner) {
		imprimirMensaje("Ingresa un número Positivo para 'Sumar' o Negativo para 'Salir'");
		int numero = scanner.nextInt();
	
		return numero;
	}

	private static void imprimirMensaje(String string) {
		
		System.out.println(string);
	}

}
