package actividadWhile_06;

import java.util.Scanner;

public class _09_ejercicio {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero como base");
		int base = scanner.nextInt();
		
		System.out.println("Introduce un numero entero como exponente");
		int exponente = scanner.nextInt();
	
		int resultado = 1;
		int i = 1;
		do {
			resultado = resultado * base;
			i++;
		}while(i <= exponente);
		
		System.out.println("el resultado es: " + resultado);
		
	}

}
