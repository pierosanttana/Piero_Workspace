package mates;

import java.util.Scanner;

public class main {
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ejecutarCalculadora(scanner);
		
	}
	public static void ejecutarCalculadora(Scanner scanner) {
		int opcionElegida = 0;
		int resultado = 0;
		
		do {
		System.out.println("--- CALCULADORA ---");
			System.out.println("(1) Sumar");
			System.out.println("(2) Restar");
			System.out.println("(3) Multiplicar");
			System.out.println("(4) Dividir");
			System.out.println("(5) Salir");
			System.out.println("-----------------------");
			System.out.println("Opción: ");
		opcionElegida = scanner.nextInt();
		System.out.println("-----------------------");
			
		switch(opcionElegida){
		case 1:
			System.out.println("SUMAR");
			resultado = sumarNumeros(scanner);
			System.out.println("resultado = " + resultado);
			System.out.println("-----------------------");
			break;
			
		case 2:
			System.out.println("RESTAR");
			resultado = restarNumeros(scanner);
			System.out.println("resultado = " + resultado);
			System.out.println("-----------------------");
			break;
		
		case 3:
			System.out.println("MULTIPLICAR");
			resultado = multiplicarNumeros(scanner);
			System.out.println("resultado = " + resultado);
			System.out.println("-----------------------");
			break;
		
		case 4:
			System.out.println("DIVIDIR");
			resultado = dividirNumeros(scanner);
			System.out.println("resultado = " + resultado);
			System.out.println("-----------------------");
			break;
			
		case 5:
			System.out.println("Fin del programa.");
			System.out.println("-----------------------");
			break;
		default:
			System.out.println("Opción incorrecta.");
			System.out.println("-----------------------");
		}
			
		}while(opcionElegida!=5);
			
				
	}
	
	public static int sumarNumeros(Scanner scanner) {
		int numero1 = obtenerNumeroDelUsuario(scanner);
		int numero2 = obtenerNumeroDelUsuario(scanner);
		int suma = Matematica.sumarNumeros(numero1, numero2);
		return  suma;
	}
	
	public static int restarNumeros(Scanner scanner) {
		int numero1 = obtenerNumeroDelUsuario(scanner);
		int numero2 = obtenerNumeroDelUsuario(scanner);
		int resta = Matematica.restarNumeros(numero1, numero2);	 
		return resta;
	}
	
	public static int multiplicarNumeros(Scanner scanner) {
		int numero1 = obtenerNumeroDelUsuario(scanner);
		int numero2 = obtenerNumeroDelUsuario(scanner);
		int multiplicacion = Matematica.multiplicarNumeros(numero1, numero2);		
		return multiplicacion; 
	}
	
	public static int dividirNumeros(Scanner scanner) {
		int numero1 = obtenerNumeroDelUsuario(scanner);
		int numero2 = obtenerNumeroDelUsuario(scanner);
		int division = Matematica.dividirNumeros(numero1, numero2);		
		return division; 
	}
	
	public static int obtenerNumeroDelUsuario(Scanner scanner) {
		System.out.print("numero: ");
		int numeroDelUsuario = scanner.nextInt();
		return numeroDelUsuario ;
	}

}
