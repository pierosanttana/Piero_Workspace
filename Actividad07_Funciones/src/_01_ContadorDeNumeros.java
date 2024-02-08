import java.util.Scanner;

public class _01_ContadorDeNumeros {

	public static void main(String[] args) {
		/*
		 * Contador de números pares: Escribe un algoritmo que cuente 
		 * y muestre la cantidad de números pares en un rango dado por el usuario.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		contadorPares(scanner);

	}


	private static void contadorPares(Scanner scanner) {
		int numero1 = 0;
		int numero2 = 0;
		int contador = 0;
		do {
			System.out.println("Primer número, debe ser mayor a 0.");
			numero1 = pedirNumero(scanner);
		
		}while(numero1 < 1);
		
		do {
			System.out.println("Segundo número, debe ser mayor a " + numero1 + ".");
			numero2 = pedirNumero(scanner);
		
		}while(numero2 < numero1);
		
		for(int i = numero1; i <= numero2; i++) {
			if(i % 2 == 0) {
				contador++;
			}
		}
		System.out.println("Cantidad de pares entre " + numero1 + " y " + numero2 + ":");
		System.out.println(contador);
		
	}

	 private static int pedirNumero(Scanner scanner) {
	        System.out.println("Escribe un número entero: ");
	        return scanner.nextInt();
	    }

	
}
