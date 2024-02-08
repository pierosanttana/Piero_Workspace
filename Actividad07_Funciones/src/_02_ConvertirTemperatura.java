import java.util.Scanner;

public class _02_ConvertirTemperatura {

	public static void main(String[] args) {
		/*
		 * Convertidor de temperatura: Diseña un algoritmo que convierta temperaturas
		 * entre Celsius y Fahrenheit. El usuario debe elegir la dirección de la
		 * conversión y proporcionar la temperatura.
		 */
		Scanner scanner = new Scanner(System.in);

		menuConvertirTemperatura(scanner);

	}

	private static void menuConvertirTemperatura(Scanner scanner) {
		int opcion = 0;
		System.out.println("-- CONVERTIR TEMPERATURA --");
		do {
			System.out.println("(1) Celsius a Fahrenheit");
			System.out.println("(2) Fahrenheit a Celsius");
			System.out.print("Opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				celsiusAFahrenheit(scanner);
				break;
			case 2:
				fahrenheitACelsius(scanner);
				break;
			default:
				System.out.println();
				System.out.println("-> No es una opción correcta.");
				System.out.println();
				break;
			}
		} while (opcion < 1 || opcion > 2);

	}

	private static void fahrenheitACelsius(Scanner scanner) {
		System.out.println("Ingresa la temperatura en grados Fahrenheit: ");
		double gradosFahrenheit = scanner.nextDouble();

		int gradosCelsius = (int) ((gradosFahrenheit - 32) * 5 / 9);

		System.out.println(gradosFahrenheit + "°F son " + gradosCelsius + "°C ");
	}

	private static void celsiusAFahrenheit(Scanner scanner) {
		System.out.println("Ingresa la temperatura en grados Celsius: ");
		int gradosCelsius = scanner.nextInt();

		double gradosFahrenheit = (gradosCelsius * 9 / 5) + 32;

		System.out.println(gradosCelsius + "°C son " + gradosFahrenheit + "°F");

	}

}
