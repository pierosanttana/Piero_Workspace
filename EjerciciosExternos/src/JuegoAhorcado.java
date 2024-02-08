import java.util.Scanner;

public class JuegoAhorcado {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingresa una palabra:");
		String palabraIngresada = scanner.nextLine();

		System.out.println("Ingresa una pista:");
		String pistaIngresada = scanner.nextLine();

		char[] arrayPalabra = new char[palabraIngresada.length()];

		for (int i = 0; i < arrayPalabra.length; i++) {
			arrayPalabra[i] = '*';
		}

		int contador = 0;
		boolean letraEncontrada = false;
		boolean palabraEncontrada = true;
		clearConsole();

		System.out.println("--------JUEGO: AHORCADO-------- ");
		System.out.println("Tienes que adivinar una palabra");
		System.out.println();
		imprimirPalabra(arrayPalabra);
		System.out.println();
		System.out.println("Pista -> " + pistaIngresada + ", tiene " + arrayPalabra.length + " letras.");
		System.out.println();

		do {
			System.out.println("------------------");
			System.out.println("Ingresa una letra:");
			char letra = scanner.nextLine().charAt(0);
			clearConsole();

			for (int i = 0; i < palabraIngresada.length(); i++) {
				if (letra == palabraIngresada.charAt(i)) {
					arrayPalabra[i] = palabraIngresada.charAt(i);
					letraEncontrada = true;
				}

			}

			if (letraEncontrada) {
				dibujoAhorcado(contador);
			} else {
				contador++;
				dibujoAhorcado(contador);
			}
			System.out.println("Intentos restantes: " + (6 - contador));
			System.out.println("----------------------");
			imprimirPalabra(arrayPalabra);

			if (contador == 6) {
				clearConsole();
				System.out.println("  ___________");
				System.out.println("  |         |");
				System.out.println("  |         O");
				System.out.println("  |        /|\\");
				System.out.println("  |         |");
				System.out.println("  |        / \\");
				System.out.println("  |");
				System.out.println("  |  ¡¡AHORCADO!!");
				System.out.println();
				System.out.println("La palabra era: " + palabraIngresada);
				System.out.println("--------------");
				System.out.println("Fin del juego.");
			}

			letraEncontrada = false;

			for (int i = 0; i < palabraIngresada.length(); i++) {
				if (arrayPalabra[i] != palabraIngresada.charAt(i)) {
					palabraEncontrada = false;
					break;
				}
			}
			if (palabraEncontrada) {
				System.out.println("¡¡Enhorabuena, Lo haz adivinado!!");
				System.out.println("--------------");
				System.out.println("Fin del juego.");
				break;
			}
			palabraEncontrada = true;

		} while (contador != 6);

	}

	private static void imprimirPalabra(char[] arrayPalabra) {
		System.out.print("Palabra: ");
		for (char c : arrayPalabra) {
			System.out.print(c);
		}
		System.out.println();
		
	}

	private static void dibujoAhorcado(int contador) {

		switch (contador) {
		case 1:
			System.out.println("  ___________");
			System.out.println("  |");
			System.out.println("  |");
			System.out.println("  |");
			System.out.println("  |");
			System.out.println("  |");
			System.out.println("  |");
			System.out.println("  |");
			break;
		case 2:
			System.out.println("  ___________");
			System.out.println("  |         |");
			System.out.println("  |");
			System.out.println("  |");
			System.out.println("  |");
			System.out.println("  |");
			System.out.println("  |");
			System.out.println("  |");
			break;
		case 3:
			System.out.println("  ___________");
			System.out.println("  |         |");
			System.out.println("  |         O");
			System.out.println("  |");
			System.out.println("  |");
			System.out.println("  |");
			System.out.println("  |");
			System.out.println("  |");
			break;
		case 4:
			System.out.println("  ___________");
			System.out.println("  |         |");
			System.out.println("  |         O");
			System.out.println("  |        / \\");
			System.out.println("  |");
			System.out.println("  |");
			System.out.println("  |");
			System.out.println("  |");
			break;
		case 5:
			System.out.println("  ___________");
			System.out.println("  |         |");
			System.out.println("  |         O");
			System.out.println("  |        /|\\");
			System.out.println("  |         |");
			System.out.println("  |");
			System.out.println("  |");
			System.out.println("  |");
			break;

		}

	}

	private static void clearConsole() {
		for (int i = 0; i < 20; i++) {
			System.out.println(); // Imprime líneas en blanco para "limpiar" la consola
		}

	}

}
