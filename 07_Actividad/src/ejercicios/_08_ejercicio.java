package ejercicios;

import java.util.Scanner;

public class _08_ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ejecutarCalculadora(scanner);
		
		}
	
		public static void ejecutarCalculadora(Scanner scanner) {
			int opcionElegida = 0;
			double resultado = 0;
			
			do {
			System.out.print("--- CALCULADORA ---\n" +
					//"^^^^^^^^^^^^^^^^^^^^^^ \n" +
					"(1) Sumar  \n" +
					"(2) Restar  \n" +
					"(3) Multiplicar  \n" + 
					"(4) Dividir  \n" +
					"(5) Salir \n" +
					"-----------------------\n" +
					"Opción: ");
			opcionElegida = scanner.nextInt();
			System.out.println("-----------------------");
				
			if(opcionElegida == 1) {
				//System.out.println("VAMOS A ESCRIBIR 2 NÚMEROS ");
				System.out.println("SUMAR");
				resultado = sumarNumeros(scanner);
				System.out.println("resultado = " + resultado);
				System.out.println("-----------------------");
				
			}else if(opcionElegida == 2) {
				//System.out.println("VAMOS A ESCRIBIR 2 NÚMEROS ");
				System.out.println("RESTAR");
				resultado = restarNumeros(scanner);
				System.out.println("resultado = " + resultado);
				System.out.println("-----------------------");
				
			}else if(opcionElegida == 3) {
				//System.out.println("VAMOS A ESCRIBIR 2 NÚMEROS ");
				System.out.println("MULTIPLICAR");
				resultado = multiplicarNumeros(scanner);
				System.out.println("resultado = " + resultado);
				System.out.println("-----------------------");
				
			}else if(opcionElegida == 4) {
				//System.out.println("VAMOS A ESCRIBIR 2 NÚMEROS ");
				System.out.println("DIVIDIR");
				resultado = dividirNumeros(scanner);
				System.out.println("resultado = " + resultado);
				System.out.println("-----------------------");
			}else  {
				System.out.println("Opción incorrecta.");
				System.out.println("-----------------------");
			}
				
			}while(opcionElegida!=5);
				System.out.println("Fin del programa.");
				System.out.println("-----------------------");
					
		}
	
		
		public static double sumarNumeros(Scanner scanner) {
			double numero1 = obtenerNumeroDelUsuario(scanner);
			double numero2 = obtenerNumeroDelUsuario(scanner);
			return numero1 + numero2;
		}
		
		public static double restarNumeros(Scanner scanner) {
			double numero1 = obtenerNumeroDelUsuario(scanner);
			double numero2 = obtenerNumeroDelUsuario(scanner);
			return numero1 - numero2;	 
		}
		
		public static double multiplicarNumeros(Scanner scanner) {
			double numero1 = obtenerNumeroDelUsuario(scanner);
			double numero2 = obtenerNumeroDelUsuario(scanner);
			return numero1 * numero2;		
		}
		
		public static double dividirNumeros(Scanner scanner) {
			double numero1 = obtenerNumeroDelUsuario(scanner);
			double numero2 = obtenerNumeroDelUsuario(scanner);
			return numero1 / numero2;		
		}
		
		public static double obtenerNumeroDelUsuario(Scanner scanner) {
			System.out.print("numero: ");
			double numeroDelUsuario = scanner.nextDouble();
			return numeroDelUsuario ;
		}
	}


