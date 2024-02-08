package _01_Funciones02;

import java.util.Scanner;

public class _03_Scanner {

	public static void main(String[] args) {
		
		pedirPorPantalla();
		
	}
	public static void pedirPorPantalla() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escribe 1 numero entero: ");
		int valor1 = scanner.nextInt();
		
		System.out.print("Escribe otro numero entero: ");
		int valor2 = scanner.nextInt();
		
		suma(valor1, valor2);
		resta(valor1, valor2);
		multiplicacion(valor1, valor2);
		division(valor1, valor2);
		
	}
	
	public static void suma(int valor1, int valor2) {
		int total = valor1 + valor2;
		System.out.println("El resultado de la suma es: " + total);
	}
	public static void resta(int valor1, int valor2) {
		int total = valor1 - valor2;
		System.out.println("El resultado de la resta es: " + total);
	}
	public static void multiplicacion(int valor1, int valor2) {
		int total = valor1 * valor2;
		System.out.println("El resultado de la multiplicacion es: " + total);
	}
	public static void division(int valor1, int valor2) {
		int total = valor1 / valor2;
		System.out.println("El resultado de la division es: " + total);
	}

}
