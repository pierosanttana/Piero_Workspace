package _02_bucles;

import java.util.Scanner;

public class _03_DO_WHILE {

	public static void main(String[] args) {
		
		/*
		 * Existe una variante del bucle "while", que se llama "do-while"
		 * 
		 * la filosofia esd la misma que la del bucle "While" pero esta vez 
		 * en vez de ejecutarse entre 0 y N, se ejecutará entre 1 y N veces.
		 * Es decir, al menos el bloque de sentencias se ejecutará Una vez.
		 */
		
		int numero = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		do {
			System.out.println("Introzca un numero entre el 1 y el 10");
			numero = scanner.nextInt();
			if(numero > 10) {
				System.out.println("Te has pasado");
			}else if(numero < 1) {
				System.out.println("te ha faltado");
			}
			
		}while(numero < 1 || numero > 10); {
			System.out.println("Numero correcto");
		}
			
		}
		
	}

