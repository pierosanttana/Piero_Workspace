import java.util.Scanner;

public class _29_convertirFrase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escribe una frase:");
		String cadena = scanner.nextLine();
		
		System.out.println("Ver la frase en:");
		System.out.println("(1)Mayusculas");   
		System.out.println("(2)Minusculas");
		System.out.print("opción: ");
		int opcion = scanner.nextInt();
		
		if(opcion == 1) {
			String cadenaMayus = cadena.toUpperCase();
			System.out.println(cadenaMayus);
		}else if (opcion == 2) {
			String cadenaMayus = cadena.toLowerCase();
			System.out.println(cadenaMayus);
		}else {
			System.out.println("No es una opción correcta.");
		}
		

	}

}
