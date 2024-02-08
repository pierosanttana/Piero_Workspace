
public class Funciones_03 {
	
	public static void main(String[] args) {
		
		//perimetroRectangulo(base,altura);
		
		int rectangulo = perimetroRectangulo(10, 30);
		System.out.println(rectangulo);
		
		rectangulo = perimetroRectangulo(33, 43);
		System.out.println(rectangulo);
		
		rectangulo = perimetroRectangulo(12, 34);
		System.out.println(rectangulo);
	}
	public static int perimetroRectangulo(int base, int altura) {
		int perimetroRectangulo = 2 * (base + altura);;
		return perimetroRectangulo;
	}
}
