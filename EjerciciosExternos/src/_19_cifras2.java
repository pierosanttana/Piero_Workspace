import java.util.Scanner;

public class _19_cifras2 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	int numero = 0;
	int contador = 0;
		do {
			System.out.println("Ingresa un número entero positivo:");
			numero = scanner.nextInt();
		}while(numero < 0);
		
	for(int i  = numero; i > 0; i /= 10) {
		contador++;
	}
		System.out.println(contador);

	}

}
