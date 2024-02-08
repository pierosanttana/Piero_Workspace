import java.util.Scanner;

public class _20_numPrimo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		//int contador = 0;
		
		/*
		do {
			System.out.println("Ingresa un número entero positivo:");
			numero  = scanner.nextInt();
		}while(numero < 0);
		*/
		
		for (int i = 2; i <= 100; i++) {
			int contador = 0;
			for(int j = i - 1 ; j > 1; j--) {
				if(i % j == 0) {
					contador++;
				}
			}
				if (contador < 1) {
					System.out.println(i + " es primo.");
				}
				//else {
				//	System.out.println("No es primo.");
				//}				
				
		}
		

	}

}
