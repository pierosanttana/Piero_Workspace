import java.util.Scanner;

public class _25_sumas {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int numero1 = 0;
	int suma = 0;
	
	do {
		System.out.println("Ingresa un número:");
		numero1 = scanner.nextInt();
		}while(numero1 < 1);
		
		for(int i = 0; i <= numero1; i++) {
			suma += i;
		}
		
		System.out.println("La suma de todos los numeros es " + suma);

	}

}
