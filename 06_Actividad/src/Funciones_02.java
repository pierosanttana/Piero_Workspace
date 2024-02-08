
public class Funciones_02 {

	public static void main(String[] args) {
		
		//perimetroRectangulo(base,altura);
		perimetroRectangulo(10,10);
		perimetroRectangulo(20,20);
		perimetroRectangulo(22,11);
		
	}
	public static void perimetroRectangulo(int base, int altura) {
		int perimetroRectangulo = 2 * (base + altura);
		System.out.println(perimetroRectangulo);
		
	}
}
