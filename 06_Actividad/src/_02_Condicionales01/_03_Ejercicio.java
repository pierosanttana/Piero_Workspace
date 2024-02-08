package _02_Condicionales01;

import java.util.Scanner;

public class _03_Ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escribe tu nota (1 a 100): ");
		int numero = scanner.nextInt();
		nota(numero);
		
	}
	
	public static void nota(int numero) {
	
		if(numero > 100) {
			System.out.println("Esa nota no esta en el rango.");
		}else if(numero >= 50) {
			System.out.println("Aprobado");
		} else if(numero < 50) {
			System.out.println("Suspenso");
		}
	}
	

}
