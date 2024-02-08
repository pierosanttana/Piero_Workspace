package _01_Funciones02;

public class _02_FiguraGeometrica {

	public static void main(String[] args) {
		
		calcularArea(5, 5); //Area(Base, Altura) Triangulo
		calcularArea(5.5, 5);//Area(Base, Altura) Triangulo
		calcularArea(10);   	//Area(Lado) Cuadrado
		calcularArea(10.5); 	//Area(radio) Circulo
		
		_01_Calculadora.calcularSuma(10, 10);
		
	}
	public static void calcularArea(int valor1, int valor2) {
		int resultado = (valor1 * valor2) / 2;
		System.out.println("El area de un triangulo es: " + resultado);
	}
	public static void calcularArea(double valor1, double valor2) {
		double resultado = (valor1 * valor2) / 2;
		System.out.println("El area de un triangulo es: " + resultado);
	}
	
	public static void calcularArea(int valor1) {
		int resultado = valor1 * valor1;
		System.out.println("El area de un cuadrado es: " + resultado);

	}
	public static void calcularArea(double valor1) {
		double resultado = Math.PI * (valor1 * valor1);
		System.out.println("El area de un circulo es: " + resultado);
	}
	
	
	
	
	
	

}
