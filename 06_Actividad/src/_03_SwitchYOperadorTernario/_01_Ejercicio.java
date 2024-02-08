package _03_SwitchYOperadorTernario;

import java.util.Scanner;

public class _01_Ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escribe un numero:");
		double numero1 = scanner.nextDouble();
		
		System.out.print("Escribe otro numero:");
		double numero2 = scanner.nextDouble();
		
		String compararNumeros = (numero1 >= numero2) ? "El primer número es mayor o igual" : "El segundo número es mayor";
		
		System.out.println(compararNumeros);

	}

}
