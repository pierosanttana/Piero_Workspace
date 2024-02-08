package _02_Condicionales01;

import java.util.Scanner;

public class _07_Ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("TIENDA UPGRADE \n" + "Escribe el total de tu compra:");
		double totalCompra = scanner.nextDouble();
		double descuento = 0;
		
		if(totalCompra >= 100) {
			descuento = 0.10;
			double importeDeDescuento = totalCompra * descuento;
			double importeFinal = totalCompra - importeDeDescuento;
			System.out.println("¡¡SORPRESA!! \n" + "Tienes un descuento del 10% = " + importeDeDescuento + "€");
			System.out.println("Precio final = " + importeFinal + "€");	
			
		} else if (totalCompra >= 50) {
			descuento = 0.05;
			double importeDeDescuento = totalCompra * descuento;
			double importeFinal = totalCompra - importeDeDescuento;
			System.out.println("¡¡SORPRESA!! \n" + "Tienes un descuento del 5% = " + descuento + "€");
			System.out.println("Precio final = " + importeFinal + "€");
			
		} else if (totalCompra < 50 && totalCompra > 0) {
			System.out.println("No tienes ningun descuento");
			System.out.println("Precio final = " + totalCompra + "€");
		}
		else {
			System.out.println("No es un importe valido.");
		}
		
	}

}
