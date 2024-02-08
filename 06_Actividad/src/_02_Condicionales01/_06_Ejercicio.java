package _02_Condicionales01;

import java.util.Scanner;

public class _06_Ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("PAR ó IMPAR \n" +
		"Escribe un numero: ");
		double numero = scanner.nextDouble();
		
		if(numero % 2 == 0) {
			System.out.println("Es un número par.");
		}else if (numero % 2 == 1){
			System.out.println("Es un número impar.");
		}
	}

}
