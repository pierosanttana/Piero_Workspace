package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class _05_ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		
		System.out.println("---------------------------");
		System.out.println("JUEGO - ADIVINA EL NÚMERO");
		System.out.println("---------------------------");
		System.out.println("Una pista:");
		System.out.println("Está entre el 1 y 10, ambos incluidos.");		
		 
		int numeroAleatorio = random.nextInt(10)+1;
		
		int numero = 0;
		int i = 1;
		
		do {
			System.out.println("------------------------");
			System.out.println("Intento " + i);
			System.out.println("Introduce un número:");
			numero = scanner.nextInt();
			i++;
			
			if(numero < 1 || numero > 10) {
				System.out.println("-> Vuelve a leer la pista.");
			}else if(numero < numeroAleatorio ) {
				System.out.println("------------------------");
				System.out.println("-> Un poco más..");
			}else if(numero > numeroAleatorio) {
				System.out.println("------------------------");
				System.out.println("-> Un poco menos..");
			}
		}while(numero != numeroAleatorio);
		
		System.out.println("------------------------");
		System.out.println("¡EUREKA!");
		System.out.println("El número era " + numeroAleatorio + ".");
		System.out.println("------------------------");
	}
}
