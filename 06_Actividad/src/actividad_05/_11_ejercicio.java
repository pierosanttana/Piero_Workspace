package actividad_05;

import java.util.Scanner;

public class _11_ejercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Potencia");
		System.out.println("Escribe un número entero como base:");
		int base = scanner.nextInt();
		
		System.out.println("Escribe un número entero como exponente:");
		int exponente = scanner.nextInt();

		int resultado = 1;
		
		for(int i = 1 ; i <= exponente; i++) {
			
			resultado = resultado *  base;
			
		}
		System.out.println("el resultado es: " + resultado);
	}

}
