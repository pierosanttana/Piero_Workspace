
public class Funciones_04 {

	public static void main(String[] args) {
		
		//areaRectangulo(base,altura);
		
		int rectangulo = calcularArea(15,10);
		System.out.println(rectangulo);
		
		rectangulo = calcularArea(240,50);
		System.out.println(rectangulo);
		
	}
	public static int calcularArea(int base, int altura) {
		int areaRectangulo = base * altura;
		return areaRectangulo;
	}

}
