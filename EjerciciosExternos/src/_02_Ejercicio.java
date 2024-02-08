import java.util.Scanner;

public class _02_Ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa tu nombre: ");
		
		String name = scanner.nextLine();
		
		System.out.println("Bienvenido "+ name);
	}

}
