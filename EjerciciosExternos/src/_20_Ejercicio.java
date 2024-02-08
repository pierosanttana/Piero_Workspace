import java.util.Scanner;

public class _20_Ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa una frase");
		String frase = scanner.nextLine();
		
		String[] cadenaPartida = frase.split(" ");
		
		int contador = 0;
		
		for (int i = 0; i < cadenaPartida.length; i++) {
			
			if(!cadenaPartida[i].equals("")) {
				contador = contador + 1;
				
			}
			
			
		}
		String primeraPalabra = cadenaPartida[0];
		System.out.println(contador);
		
		if(primeraPalabra.equalsIgnoreCase("UPGRADE")) {
			System.out.println(primeraPalabra.substring(1, 3));
		}
		
		int i = (true) ? 1 : 2;
		
		System.out.println(i);
	}

}
