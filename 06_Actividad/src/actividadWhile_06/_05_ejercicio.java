package actividadWhile_06;

import java.util.Scanner;

public class _05_ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("TABLA DE MULTIPLICAR");
		System.out.println("Introduce un numero entero:");
		int numero = scanner.nextInt();
		
		int i = 0;
		
		do{
			int multiplicacion = numero * i;
			System.out.println(numero + " x " + i + " = " + multiplicacion);
			i++;
		} while(i <= 12);
		
		
	}

}
