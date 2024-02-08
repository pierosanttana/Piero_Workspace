
import java.util.Scanner;

public class _04_Vendedor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos a calcular las comisiones y sueldo total a final de mes de un vendedor.");
		System.out.println("Introduce el sueldo base del venedor:");
		double sueldoBase = scanner.nextDouble();
		
		System.out.println("El vendedor a realizado tres ventas en el mes,\n"
					+ "recibe 10% de comision por cada venta.");
		System.out.println("Introduce el valor de la primera venta:");
		double v1 = scanner.nextDouble();
		
		System.out.println("Introduce el valor de la segunda venta:");
		double v2 = scanner.nextDouble();
		
		System.out.println("Introduce el valor de la tercera venta:");
		double v3 = scanner.nextDouble();
		
		double comision = (v1 * 0.10) + (v2 * 0.10) + (v3 * 0.10);
		System.out.println("Las comisiones totales son: "+comision);
		
		double FinDeMes = sueldoBase + comision;
		System.out.println("Lo que cobrará el vendedor a fin de mes será: " + FinDeMes);
		
		

	}

}
