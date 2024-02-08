

import java.util.Scanner;

public class _05_Ejercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ejecutarCalculadora(scanner);
		
		}
	
		public static void ejecutarCalculadora(Scanner scanner) {
			
		
			System.out.print("CALCULADORA SIMPLE \n" +
					"^^^^^^^^^^^^^^^^^^^^ \n" +
					"Pulse (1) para 'Sumar'  \n" +
					"Pulse (2) para 'Restar'  \n" +
					"Pulse (3) para 'Multiplicar'  \n" + 
					"Pulse (4) para 'Dividir'  \n" +
					"Pulse (5) para 'Calcular Resto de una división' \n" +
					"----------------------------------------------- \n" +
					"Opción: ");
			int opcionElegida = scanner.nextInt();
			System.out.println("-------------------------------");
			
			double resultado = 0;
			
			if(opcionElegida == 1) {
				System.out.println("VAMOS A ESCRIBIR 2 NÚMEROS ");
				resultado = sumarNumeros(scanner);
				System.out.println("-------------------------------");
				System.out.println("La suma es: \n" + resultado);
				System.out.println("-------------------------------");
				
			}else if(opcionElegida == 2) {
				System.out.println("VAMOS A ESCRIBIR 2 NÚMEROS ");
				resultado = restarNumeros(scanner);
				System.out.println("-------------------------------");
				System.out.println("La resta es: \n" + resultado);
				System.out.println("-------------------------------");
				
			}else if(opcionElegida == 3) {
				System.out.println("VAMOS A ESCRIBIR 2 NÚMEROS ");
				resultado = multiplicarNumeros(scanner);
				System.out.println("-------------------------------");
				System.out.println("La multiplicación es: \n" + resultado);
				System.out.println("-------------------------------");
				
			}else if(opcionElegida == 4) {
				System.out.println("VAMOS A ESCRIBIR 2 NÚMEROS ");
				resultado = dividirNumeros(scanner);
				System.out.println("-------------------------------");
				System.out.println("La división es: \n" + resultado);
				System.out.println("-------------------------------");
				
			}else if(opcionElegida == 5) {
				System.out.println("VAMOS A ESCRIBIR 2 NÚMEROS ");
				resultado = calcularResto(scanner);
				System.out.println("-------------------------------");
				System.out.println("El resto de la división es: \n" + resultado);
				System.out.println("-------------------------------");
				
			}else if(opcionElegida > 5) {
				System.out.println("¡Esa no es una opción correcta!");
				System.out.println("-------------------------------");
			}
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
		
		public static double calcularResto(Scanner scanner) {
			double numero1 = obtenerNumeroDelUsuario(scanner);
			double numero2 = obtenerNumeroDelUsuario(scanner);
			return numero1 % numero2;
				
		}
		
		public static double obtenerNumeroDelUsuario(Scanner scanner) {
			System.out.print("numero: ");
			double numeroDelUsuario = scanner.nextDouble();
			return numeroDelUsuario ;
		
		}

	}
		

