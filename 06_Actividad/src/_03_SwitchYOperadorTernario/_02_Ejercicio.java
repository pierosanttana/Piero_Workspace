package _03_SwitchYOperadorTernario;

import java.util.Scanner;

public class _02_Ejercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Escribe tu nota (1 a 100): ");
		int nota = scanner.nextInt();
			
		String resultado = (nota >= 50) ? "Aprobado" : "Suspenso";
		
		System.out.println(resultado);

	}

}
