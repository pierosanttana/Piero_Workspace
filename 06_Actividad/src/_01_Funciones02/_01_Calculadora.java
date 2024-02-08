package _01_Funciones02;

public class _01_Calculadora {

	public static void main(String[] args) {
		
		calcularSuma(10, 20);
		calcularSuma(10.5, 20);
		calcularResta(30, 23);
		calcularResta(30, 23.5);
		calcularMultiplicacion(30, 3);
		calcularMultiplicacion(30, 3.3);
		calcularDivision(50, 10);
		calcularDivision(77.7, 7);

	}
	
	public static void calcularSuma(int valor1, int valor2) {
		int total = valor1 + valor2;
		System.out.println("El resultado de la suma es: " + total);
	}
	public static void calcularSuma(double valor1, double valor2) {
		double total = valor1 + valor2;
		System.out.println("El resultado de la suma es: " + total);
	}
	
	public static void calcularResta(int valor1, int valor2) {
		int total = valor1 - valor2;
		System.out.println("El resultado de la resta es: " + total);
	}
	public static void calcularResta(double valor1, double valor2) {
		double total = valor1 - valor2;
		System.out.println("El resultado de la resta es: " + total);
	}
	
	public static void calcularMultiplicacion(int valor1, int valor2) {
		int total = valor1 * valor2;
		System.out.println("El resultado de la multiplicacion es: " + total);
	}
	public static void calcularMultiplicacion(double valor1, double valor2) {
		double total = valor1 * valor2;
		System.out.println("El resultado de la multiplicacion es: " + total);
	}
	
	public static void calcularDivision(int valor1, int valor2) {
		int total = valor1 / valor2;
		System.out.println("El resultado de la division es: " + total);
	}
	public static void calcularDivision(double valor1, double valor2) {
		double total = valor1 / valor2;
		System.out.println("El resultado de la division es: " + total);
	}
	
	

}
