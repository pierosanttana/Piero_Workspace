import java.util.Scanner;

public class _14_Ejemplo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe un valor para 'a'");
		int a = scanner.nextInt();
		
		System.out.println("Escribe un valor para 'b'");
		int b = scanner.nextInt();
		
		System.out.println("Escribe un valor para 'c'");
		int c = scanner.nextInt();
		
		double discriminante = Math.pow(b,2) - (4 * a * c);
		System.out.println(discriminante);

	}

}
