package actividadWhile_06;

import java.util.Scanner;

public class _03_ejercicio {

	public static void main(String[] args) {
		

		 for(int i = 0; i <= 5; i+=2) {
		     System.out.println(++i);
		}

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce un número entero:");
		int numero1 = scanner.nextInt();
		
		System.out.println("Introduce otro número que sea mayor que el anterior:");
		int numero2 = scanner.nextInt();
		
		while(numero1 <= numero2) {
			System.out.println("/" + numero1 + "/");
			numero1++;
		}
	}

}
