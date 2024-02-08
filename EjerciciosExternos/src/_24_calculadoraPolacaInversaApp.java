import java.util.Scanner;

public class _24_calculadoraPolacaInversaApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CALCULADORA");
		System.out.println("Ingresa un número:");
		int numero1 = scanner.nextInt();
		System.out.println("Ingresa otro número:");
		int numero2 = scanner.nextInt();
		
		System.out.println("Que operación quieres realizar?");
		System.out.println(" + , - , * , / , ^ , % ");
		System.out.println("operación: ");
		char operacion = scanner.next().charAt(0);

		switch(operacion) {
		case '+':
			suma(numero1, numero2);
			break;
		
		case '-':
			resta(numero1, numero2);
			break;
		case '*':
			multiplicacion(numero1, numero2);
			break;
		case '/':
			division(numero1, numero2);
			break;
		case '^':
			potencia(numero1, numero2);
			break;
		case '%':
			modulo(numero1, numero2);
			break;
		}
		
	}

	private static void potencia(int numero1, int numero2) {
		int resultado = (int) Math.pow(numero1, numero2);
		System.out.println(resultado);
		
	}

	private static void modulo(int numero1, int numero2) {
		int resultado = numero1 % numero2;
		System.out.println(resultado);
	}

	private static void division(float numero1, float numero2) {
		float resultado = (numero1 / numero2);
		System.out.println(resultado);
	}

	private static void multiplicacion(int numero1, int numero2) {
		int resultado = numero1 * numero2;
		System.out.println(resultado);
		
	}

	private static void resta(int numero1, int numero2) {
		int resultado = numero1 - numero2;
		System.out.println(resultado);
	}

	private static void suma(int numero1, int numero2) {
		
		int resultado = numero1 + numero2;
		System.out.println(resultado);
	}

}
