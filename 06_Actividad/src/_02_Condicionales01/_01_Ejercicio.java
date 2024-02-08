package _02_Condicionales01;

import java.util.Scanner;

public class _01_Ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escribe un numero:");
		double numero1 = scanner.nextDouble();
		
		System.out.print("Escribe otro numero:");
		double numero2 = scanner.nextDouble();
				
		numeros(numero1, numero2);
		
	}
	public static void numeros(double numero1, double numero2) {
		if(numero1 > numero2) {
			System.out.println("El primer número es mayor");
		} else if(numero1 < numero2) {
			System.out.println("El segundo número es mayor");
		} else if(numero1 == numero2) {
			System.out.println("Los dos número son iguales");
		}
	
	}
}