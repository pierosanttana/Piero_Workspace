
public class _01_CalculadoraAreaYPerimetro {

	public static void main(String[] args) {
		int longitud = 0;
		int ancho = 0;
		int areaRectangulo = 0;
		int perimetroRectangulo = 0;

		longitud = 10;
		ancho = 15;
		
		areaRectangulo = longitud * ancho;		
		perimetroRectangulo = 2 * (longitud + ancho);
		
		System.out.println("El area del rectangulo es: " + areaRectangulo);
		System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo);
		
		longitud = 20;
		ancho = 45;
		
		areaRectangulo = longitud * ancho;
		perimetroRectangulo = 2 * (longitud + ancho);
		
		System.out.println("El area del rectangulo es: " + areaRectangulo);
		System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo);
		
		
		

	}

}
