import java.util.Scanner;

public class _26_insertarPositivos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero1 = 0;
		int contador = 0;
		
		do {
		System.out.println("Ingresa un número:");
		numero1 = scanner.nextInt();
		
		if(numero1 > 0) {
			contador++;
		}
		}while(numero1 > 0);
		
		System.out.println(contador);
	}

}
