package _02_Condicionales01;
import java.util.Scanner;

public class _05_Ejercicio {

	public static void main(String[] args) {

		ejecutarCalculadora();
		
		}
		public static void ejecutarCalculadora() {
			
			Scanner scanner = new Scanner(System.in);
		
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
			System.out.println("------------------------------");
			
			double resultado = 0;
			
			if(opcionElegida == 1) {
				resultado = sumarNumeros();
				System.out.println("------------------------------");
				System.out.println("El resultado es: " + resultado);
				System.out.println("------------------------------");
				
			}else if(opcionElegida == 2) {
				resultado = restarNumeros();
				System.out.println("------------------------------");
				System.out.println("El resultado es: " + resultado);
				System.out.println("------------------------------");
				
			}else if(opcionElegida == 3) {
				resultado = multiplicarNumeros();
				System.out.println("------------------------------");
				System.out.println("El resultado es: " + resultado);
				System.out.println("------------------------------");
				
			}else if(opcionElegida == 4) {
				resultado = dividirNumeros();
				System.out.println("------------------------------");
				System.out.println("El resultado es: " + resultado);
				System.out.println("------------------------------");
				
			}else if(opcionElegida == 5) {
				resultado = calcularResto();
				System.out.println("------------------------------");
				System.out.println("El resultado es: " + resultado);
				System.out.println("------------------------------");
				
			}else if(opcionElegida > 5) {
				System.out.println("¡Esa no es una opción correcta!");
				System.out.println("------------------------------");
			}
			

		}
		
		public static double sumarNumeros() {
			double valor1 = pedirNumeroPorPantalla();
			double valor2 = pedirOtroNumeroPorPantalla();
			 return valor1 + valor2;
			
		}
		
		public static double restarNumeros() {
			double valor1 = pedirNumeroPorPantalla();
			double valor2 = pedirOtroNumeroPorPantalla();
			return valor1 - valor2;
			
		}
		
		public static double multiplicarNumeros() {
			double valor1 = pedirNumeroPorPantalla();
			double valor2 = pedirOtroNumeroPorPantalla();
			return valor1 * valor2;
				
		}
		
		public static double dividirNumeros() {
			double valor1 = pedirNumeroPorPantalla();
			double valor2 = pedirOtroNumeroPorPantalla();
			return valor1 / valor2;
				
		}
		
		public static double calcularResto() {
			double valor1 = pedirNumeroPorPantalla();
			double valor2 = pedirOtroNumeroPorPantalla();
			return valor1 % valor2;
	
		}
		
		public static double pedirNumeroPorPantalla() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Escribe un numero: ");
			return scanner.nextDouble();
		}
		
		public static double pedirOtroNumeroPorPantalla() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Escribe otro numero: ");
			return scanner.nextDouble();	
		}
	}