package _02_Condicionales01;

import java.util.Scanner;

public class _02_Ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Elige y escribe un numero del 1 y 7: ");
		int numero = scanner.nextInt();
		diasDeSemana(numero);
		
	}
	public static void diasDeSemana(int dia) {
		if(dia == 1 ) {
			System.out.println("Lunes");
		}else if(dia == 2) {
			System.out.println("Martes");
		}else if(dia == 3) {
			System.out.println("Miercoles");
		}else if(dia == 4) {
			System.out.println("Jueves");
		}else if(dia == 5) {
			System.out.println("Viernes");
		}else if(dia == 6) {
			System.out.println("Sabado");
		}else if(dia == 7) {
				System.out.println("Domingo");
		}else {
			System.out.println("Ese no es un numero dentro del rango.");
		}
	}

}
