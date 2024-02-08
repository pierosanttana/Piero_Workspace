import java.util.Scanner;

public class _13_BucleWhile {

	public static void main(String[] args) {
		//Bucle(loop) While = Ejecuta un bloque de codigo siempre
		// que su condicion siga siendo verdadera.
		
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		
		while(name.isBlank()) {
			System.out.print("Enter you name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello "+name);

	}

}
