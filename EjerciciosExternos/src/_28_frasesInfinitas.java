import java.util.Scanner;

public class _28_frasesInfinitas {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String frase = "";
		String cadena = ""; 
		
		do {
		System.out.println("Ingresa una frase:");
		frase = scanner.nextLine();
		
		cadena = cadena.concat(frase);
		
		}while(!frase.isBlank());
		
		System.out.println(cadena);

	}

}
