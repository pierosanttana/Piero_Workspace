package ejercicios;

import java.util.Scanner;

public class _04_ejercicio {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("-------------------------");
		System.out.println("  JUEGO - NÚMERO MAYOR");
		System.out.println("-------------------------");
		System.out.println("Ingresa numeros positivos, ");
		
		int numeroMayor = 0;
		int numero = 0;
		
		do {
			System.out.println("Introduce un número:");
			numero = scanner.nextInt();
			
			if(numero > numeroMayor) {
				numeroMayor = numero;
			}
		}while(numero >= 0);
		
				System.out.println("---------------------------------------");
				System.out.println("El número mayor ingresado es: " + numeroMayor);
				System.out.println("---------------------------------------");
				System.out.println("Fin del programa.");

	}
}
