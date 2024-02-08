package ejercicios;

import java.util.Scanner;

public class _02_ejercicio {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
	
	//System.out.println("------------------------");
	System.out.println("--- CONVERSOR DE TEMPERATURA ---");
	System.out.println("--------------------------------");
	System.out.println("(1) Celsius a Fahrenheit");
	System.out.println("(2) Fahrenheit a Celsius");
	System.out.println("--------------------------------");
	System.out.println("Introduce la opción que deseas:");
	int opcion = scanner.nextInt();
	
	if(opcion == 1) {
		System.out.println("Introduce los grados Celsius a convertir:");
		int celsius = scanner.nextInt();
		int resultado = (celsius * 9/5) + 32;
		System.out.println(celsius +"°C son " + resultado + "°F");

		
	} else if(opcion == 2) {
		System.out.println("Introduce los grados Fahrenheit a convertir:");
		int fahrenheit = scanner.nextInt();
		int resultado = (fahrenheit - 32) * 5/9 ;
		System.out.println(fahrenheit +"°F son " + resultado + "°C ");
	}else {
		System.out.println("No es una opción correcta.");
	}
		
		
	}

}
