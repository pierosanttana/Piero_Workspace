package _02_bucles;

public class _04_AnidamientoBucle {

	public static void main(String[] args) {
		/*
		 * Es muy habitual anidar tambien bucles, al igual que anidabamos "if"
		 * se suele usar para recorrer o implementar matrices bidimensionales 
		 * 
		 * Por ejemplo, si se pidiera imprimir por pantalla la tabla de multiplicar de
		 * los primeros números naturales
		 */
		
		System.out.println("Tabla de multiplicar");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println();
			for(int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " es igual a " + (i * j));
			}
		}
	}

}
