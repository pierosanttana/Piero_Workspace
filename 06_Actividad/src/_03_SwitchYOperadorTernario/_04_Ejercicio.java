package _03_SwitchYOperadorTernario;

import java.util.Scanner;

public class _04_Ejercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("PAR ó INPAR \n" +
		"Escribe un numero: ");
		int pedirNumero = scanner.nextInt();
		
		
		switch (pedirNumero % 2) {
		case 0: 
			System.out.println("Es par");
		break;
		default:
			System.out.println("No es par");
		break;
		}

	}

}
