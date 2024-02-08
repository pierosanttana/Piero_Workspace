
public class Funciones_05 {

	public static void main(String[] args) {
		
		//hipoTrianguloRectangulo(catetoA, catetoB);
		
		double triangulo = hipoTrianguloRectangulo(3, 4);
		System.out.println(triangulo);
		triangulo = hipoTrianguloRectangulo(16, 19);
		System.out.println(triangulo);
	}
	public static double hipoTrianguloRectangulo(double catetoA, double catetoB) {
		double hipotenusa = Math.sqrt((catetoA*catetoA)+(catetoB*catetoB));
		return hipotenusa;
	}

}
