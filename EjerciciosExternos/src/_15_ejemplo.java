import java.util.Scanner;

public class _15_ejemplo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			int numero = 0;	
			
		do {
			System.out.println("Introduce un numero mayor a 0: ");
				numero = scanner.nextInt();
		} while (numero < 0);
		
		System.out.println("¡" + numero + " es mayor a 0!");
	}

}
