import java.util.Scanner;

public class conversorMonedas {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("CONVERSOR DE MONEDAS \n" + "Elige una opción:");
		System.out.println("(1) Euro a Dolar \n" + "(2) Sol Peruano a Dolar \n" + "(3) Peso Chileno a Dolar");
		int opcionMenu = scanner.nextInt();

		System.out.println("Ingresa la cantidad a convertir:");
		double cantidad = scanner.nextDouble();

		conversorDeMonedas(cantidad, opcionMenu);

	}

	public static void conversorDeMonedas(double cantidad, int moneda) {

		  switch(moneda) {
		  case(1):
			System.out.println("La cantidad de Euros en Dolares es: " + (cantidad * 1.07));
		  	break;
		  case(2):
			System.out.println("La cantidad de Soles Peruanos en Dolares es: " + (cantidad * 0.26));
		  	break; 
		  case(3):
			System.out.println("La cantidad Pesos Chilenos en Dolares es: " + (cantidad * 0.0011)); 
		  	break; 
		  	}

		 /*
		if (moneda == 1) {
			System.out.println(cantidad + "Euros en Dolares es: $" + (cantidad * 1.07));
		} else if (moneda == 2) {
			System.out.println(cantidad + " Soles Peruanos en Dolares es: $" + (cantidad * 0.26));
		} else if (moneda == 3) {
			System.out.println(cantidad + " Pesos Chilenos en Dolares es: $" + (cantidad * 0.0011));
		}
		 */
		
	}

}
