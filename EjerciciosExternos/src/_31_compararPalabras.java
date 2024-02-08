import java.util.Scanner;

public class _31_compararPalabras {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	
		System.out.println("-Comparador de palabras-");
		System.out.println("Ingresa una palabra:");
		String palabra1 = scanner.nextLine();
		
		System.out.println("Ingresa otra palabra:");
		String palabra2 = scanner.nextLine();
		
		if(palabra1.equalsIgnoreCase(palabra2)) {
			System.out.println("Las palabras son iguales.");
		}else {
			System.out.println("Las palabras no son iguales.");
		}
		

	}

}
