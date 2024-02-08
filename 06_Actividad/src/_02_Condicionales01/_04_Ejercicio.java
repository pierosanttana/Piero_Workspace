package _02_Condicionales01;

import java.util.Scanner;

public class _04_Ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¿Qué edad tienes?");
		int edad = scanner.nextInt();
		
		categoria(edad);
		
	}
	public static void categoria(int edad) {
		
		if(edad < 0) {
			System.out.println("No es una edad correcta.");
		}
		else if(edad <= 12) {
			System.out.println("Pertenecer a la categoria  de 'Niño'.");
		} else if(edad <= 19) {
			System.out.println("Pertenecer a la categoria  de 'Adolescente'.");
		} else if(edad <= 64) {
			System.out.println("Pertenecer a la categoria  de 'Adulto'.");
		} else if(edad > 65) {
			System.out.println("Pertenecer a la categoria  de 'Adulto Mayor'.");
		}
	}

}
