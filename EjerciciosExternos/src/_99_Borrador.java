import java.util.Scanner;

public class _99_Borrador {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe un número: ");
		int a = scanner.nextInt();
		
		
		for(int i = 1; i < a; i++) {
			
			for(int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
			
		}
		System.out.println(suma(a));
	}

	private static int suma(int a) {
		int b = suma(a);
		
		return a + b;
	}
}

