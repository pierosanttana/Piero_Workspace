import java.util.Scanner;

public class _12_ejemplo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe un numero de ventas:");
		int numeroDeVentas = scanner.nextInt();
		
		int totalVentas = 0;
		
		for(int i = 0; i < numeroDeVentas; i++) {
			System.out.println("Monto de la venta " + (i + 1));
			int montoDeVenta = scanner.nextInt();
			 totalVentas = totalVentas + montoDeVenta; 
		}
		System.out.println("El total de ventas es: " + totalVentas);
	}

}
