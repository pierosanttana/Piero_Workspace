
import java.util.Scanner;

public class _00_PerimetroYArea {
	
	public static void main(String[] args) {
	
	int altura = 0;
	int base = 0;
	int areaRectangulo = 0;
	int perimetroRectangulo = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Vamos a calcular el perímetro y área de un rectángulo dada su base y su altura");
	System.out.println("1. Introduce un numero(entero) como base");
	base = scanner.nextInt();
	System.out.println("1. Introduce un numero(entero) como altura");
	altura = scanner.nextInt();
	
	areaRectangulo = altura * base;		
	perimetroRectangulo = 2 * (altura + base);
	
	System.out.println("El area del rectangulo es: " + areaRectangulo);
	System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo);
	
	
	}
	
}
