import java.util.Scanner;

public class _27_quitarEspacios {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa una frase:");
		String frase = scanner.nextLine();
		
		String fraseModificada = "";
		/*
		String[] sinEspacios = frase.split(" ");
		
		for (String string : sinEspacios) {
			System.out.print(string);
		
		}
		*/
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) != ' ') {
				fraseModificada += frase.charAt(i);
			}
		}
		
		System.out.println(fraseModificada);
		
		
		

	}

}
