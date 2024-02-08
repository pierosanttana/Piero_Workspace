import java.util.Iterator;
import java.util.Scanner;

public class _16_BuclesAnidados {

	public static void main(String[] args) {
		
		//Bucle anidado = buble dentro de un bucle
		
		Scanner scanner = new Scanner (System.in);
		
		int rows;
		int columns;
		String symbol = "";
		
		System.out.print("Ingresa el # de rows: ");
		rows = scanner.nextInt();
		System.out.print("Ingresa el # de columns: ");
		columns = scanner.nextInt();
		System.out.print("Ingresa el symbol a usar: ");
		symbol = scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println("");
			for(int j=1; j<=columns; j++) {
				System.out.println(symbol);
				for(int k=1; k<=columns; k++) {
					System.out.print(symbol);
				}
			}
		}

	}

}
