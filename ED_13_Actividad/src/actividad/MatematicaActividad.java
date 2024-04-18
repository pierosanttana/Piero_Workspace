package actividad;

import java.util.Scanner;

import mates.Matematica;

public class MatematicaActividad {

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
			
			if(opcionElegida == 5) {
				System.out.println("Fin del programa.");
				System.out.println("-----------------------");
				break;
			}
			switch(opcionElegida){
			case 1:
				System.out.println("SUMAR");
				break;
				
			case 2:
				System.out.println("RESTAR");
				break;
			
			case 3:
				System.out.println("MULTIPLICAR");
				break;
			
			case 4:
				System.out.println("DIVIDIR");
				break;
				
			default:
				System.out.println("Opción incorrecta.");
				System.out.println("-----------------------");
			}
			
			int numero1 = 0;
			int numero2 = 0;
			
			
			if(opcionElegida < 5 && opcionElegida > 0) {
			System.out.print("numero 1: ");
			numero1 = scanner.nextInt();
			System.out.print("numero 2: ");
			numero2 = scanner.nextInt();
			}
			
			switch(opcionElegida){
			case 1:
				resultado = Matematica.sumarNumeros(numero1, numero2);
				System.out.println("resultado = " + resultado);
				System.out.println("-----------------------");
				break;
				
			case 2:
				resultado = Matematica.restarNumeros(numero1, numero2);
				System.out.println("resultado = " + resultado);
				System.out.println("-----------------------");
				break;
			
			case 3:
				resultado = Matematica.multiplicarNumeros(numero1, numero2);
				System.out.println("resultado = " + resultado);
				System.out.println("-----------------------");
				break;
			
			case 4:
				resultado = Matematica.dividirNumeros(numero1, numero2);
				System.out.println("resultado = " + resultado);
				System.out.println("-----------------------");
				break;
			}
				
			}while(opcionElegida!=5);
		
		
	}

}
