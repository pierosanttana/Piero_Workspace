import java.util.Scanner;

public class _21_Ejercicio {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Arbol
				
		System.out.println("tamaño del árbol:");
		int lineas = scanner.nextInt();
		
		int espacios = lineas - 1;
		String tronco = " ";
		
		for(int i = 1; i <= lineas; i++) {
			String arbol = " ";
			
			for(int j = 0; j < espacios; j++) {
				arbol = arbol + " ";
			}
			for( int k = 0; k < (i*2-1) ; k++) {
			arbol = arbol + "*";
			}
			espacios--;
			System.out.println(arbol);	
		}
		
		for(int j = 1; j < lineas-1; j++) {
			tronco = tronco + " ";
		}
		
		System.out.println(tronco + "|||");
		System.out.println(tronco + "|||");
	}

}
