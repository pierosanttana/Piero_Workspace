

import java.util.Scanner;

public class _02_DosNumerosSRMD {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos a cacular con dos números enteros: la suma, resta, división y multiplicación");
		System.out.println("Introduce el primer numero:");
		double numero1 = scanner.nextDouble();
		
		System.out.println("Introduce el segundo numero:");
		double numero2 = scanner.nextDouble();
		
		double suma = numero1 + numero2;
		double resta = numero1 - numero2;
		double multiplicacion = (int)numero1 * numero2;
		double division = numero1 / numero2;
		System.out.println("la suma es: "+ (int)suma );
		System.out.println("la resta es: "+ (int)resta );
		System.out.println("la multiplicacion es: "+ (int)multiplicacion );
		System.out.println("la division es: "+ division );

	}

}
