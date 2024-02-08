import java.util.Scanner;

public class TresEnRaya {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		menu(scanner);

	}

	private static void menu(Scanner scanner) {

		int opcion = 0;
		System.out.println("¡¡JUEGOS!!");

		do {
			System.out.println("----------------");
			System.out.println("(1) Tres en Raya");
			System.out.println("----------------");

			System.out.print("elige una opción:");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				clearConsole();
				tresEnRaya(scanner);
				break;
			default:
				System.out.println();
				System.out.println("No es una opción valida.");
				break;
			}
		} while (opcion != 1);

	}

	private static void tresEnRaya(Scanner scanner) {

		String a1 = "1";
		String a2 = "2";
		String a3 = "3";
		String b1 = "4";
		String b2 = "5";
		String b3 = "6";
		String c1 = "7";
		String c2 = "8";
		String c3 = "9";

		imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);

		for (int turno = 1; turno <= 9; turno++) {

			String jugador = (turno % 2 == 1) ? "X" : "O";

			System.out.println();
			System.out.println("Turno " + turno + " - " + jugador);
			System.out.println();

			System.out.print("Elige una número de posición para marcar: ");
			int posicion = scanner.nextInt();
			clearConsole();
			
			switch (posicion) {
			case 1:
				if(!a1.equalsIgnoreCase("1")) {
					System.out.println("Posición no válida. Intenta de nuevo.");
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					turno--;
					break;
				} else {
				a1 = jugador;
				imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
				break;
				}
			case 2:
				if(!a2.equalsIgnoreCase("2")) {
					System.out.println("Posición no válida. Intenta de nuevo.");
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					turno--;
					break;
				} else {
				a2 = jugador;
				imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
				break;
				}
			case 3:
				if(!a3.equalsIgnoreCase("3")) {
					System.out.println("Posición no válida. Intenta de nuevo.");
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					turno--;
					break;
				} else {
				a3 = jugador;
				imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
				break;
				}
			case 4:
				if(!b1.equalsIgnoreCase("4")) {
					System.out.println("Posición no válida. Intenta de nuevo.");
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					turno--;
					break;
				} else {
				b1 = jugador;
				imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
				break;
				}
			case 5:
				if(!b2.equalsIgnoreCase("5")) {
					System.out.println("Posición no válida. Intenta de nuevo.");
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					turno--;
					break;
				} else {
				b2 = jugador;
				imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
				break;
				}
			case 6:
				if(!b3.equalsIgnoreCase("6")) {
					System.out.println("Posición no válida. Intenta de nuevo.");
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					turno--;
					break;
				} else {
				b3 = jugador;
				imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
				break;
				}
			case 7:
				if(!c1.equalsIgnoreCase("7")) {
					System.out.println("Posición no válida. Intenta de nuevo.");
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					turno--;
					break;
				} else {
				c1 = jugador;
				imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
				break;
				}
			case 8:
				if(!c2.equalsIgnoreCase("8")) {
					System.out.println("Posición no válida. Intenta de nuevo.");
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					turno--;
					break;
				} else {
				c2 = jugador;
				imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
				break;
				}
			case 9:
				if(!c3.equalsIgnoreCase("9")) {
					System.out.println("Posición no válida. Intenta de nuevo.");
					imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
					turno--;
					break;
				} else {
				c3 = jugador;
				imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
				break;
				}
			default:
				System.out.println("No existe esa posición. Intenta de nuevo.");
				System.out.println();
				imprimirTresEnRaya(a1, a2, a3, b1, b2, b3, c1, c2, c3);
				turno--;
				break;
			}

			boolean resultado = comprobarResultado(a1, a2, a3, b1, b2, b3, c1, c2, c3);

			if (resultado) {
				System.out.println();
				System.out.println(jugador + " gana.");
				System.out.println("Fin del juego.");
				break;
			}else if (turno == 9) {
				System.out.println("Empate, Fin del juego.");
			}
		}

	}

	private static boolean comprobarResultado(String a1, String a2, String a3, String b1, String b2, String b3,
			String c1, String c2, String c3) {

		boolean resultado = false;

		if (a1.equals(a2) && a2.equals(a3)) {
			clearConsole();
			System.out.println("     |     |");
			System.out.println("--" + a1 + "--|--" + a2 + "--|--" + a3 + "--");
			System.out.println("     |     |");
			System.out.println("-----------------");
			System.out.println("     |     |");
			System.out.println("  " + b1 + "  |  " + b2 + "  |  " + b3);
			System.out.println("     |     |");
			System.out.println("-----------------");
			System.out.println("     |     |");
			System.out.println("  " + c1 + "  |  " + c2 + "  |  " + c3);
			System.out.println("     |     |");

			resultado = true;
		} else if (b1.equals(b2) && b2.equals(b3)) {
			clearConsole();
			System.out.println("     |     |");
			System.out.println("  " + a1 + "  |  " + a2 + "  |  " + a3);
			System.out.println("     |     |");
			System.out.println("-----------------");
			System.out.println("     |     |");
			System.out.println("--" + b1 + "--|--" + b2 + "--|--" + b3 + "--");
			System.out.println("     |     |");
			System.out.println("-----------------");
			System.out.println("     |     |");
			System.out.println("  " + c1 + "  |  " + c2 + "  |  " + c3);
			System.out.println("     |     |");
			resultado = true;
		} else if (c1.equals(c2) && c2.equals(c3)) {
			clearConsole();
			System.out.println("     |     |");
			System.out.println("  " + a1 + "  |  " + a2 + "  |  " + a3);
			System.out.println("     |     |");
			System.out.println("-----------------");
			System.out.println("     |     |");
			System.out.println("  " + b1 + "  |  " + b2 + "  |  " + b3);
			System.out.println("     |     |");
			System.out.println("-----------------");
			System.out.println("     |     |");
			System.out.println("--" + c1 + "--|--" + c2 + "--|--" + c3 + "--");
			System.out.println("     |     |");
			resultado = true;
		} else if (a1.equals(b1) && b1.equals(c1)) {
			clearConsole();
			System.out.println("  |  |     |");
			System.out.println("  " + a1 + "  |  " + a2 + "  |  " + a3);
			System.out.println("  |  |     |");
			System.out.println("-----------------");
			System.out.println("  |  |     |");
			System.out.println("  " + b1 + "  |  " + b2 + "  |  " + b3);
			System.out.println("  |  |     |");
			System.out.println("-----------------");
			System.out.println("  |  |     |");
			System.out.println("  " + c1 + "  |  " + c2 + "  |  " + c3);
			System.out.println("  |  |     |");
			resultado = true;
		} else if (a2.equals(b2) && b2.equals(c2)) {
			clearConsole();
			System.out.println("     |  |  |");
			System.out.println("  " + a1 + "  |  " + a2 + "  |  " + a3);
			System.out.println("     |  |  |");
			System.out.println("-----------------");
			System.out.println("     |  |  |");
			System.out.println("  " + b1 + "  |  " + b2 + "  |  " + b3);
			System.out.println("     |  |  |");
			System.out.println("-----------------");
			System.out.println("     |  |  |");
			System.out.println("  " + c1 + "  |  " + c2 + "  |  " + c3);
			System.out.println("     |  |  |");
			resultado = true;
		} else if (a3.equals(b3) && b3.equals(c3)) {
			clearConsole();
			System.out.println("     |     |  |");
			System.out.println("  " + a1 + "  |  " + a2 + "  |  " + a3);
			System.out.println("     |     |  |");
			System.out.println("-----------------");
			System.out.println("     |     |  |");
			System.out.println("  " + b1 + "  |  " + b2 + "  |  " + b3);
			System.out.println("     |     |  |");
			System.out.println("-----------------");
			System.out.println("     |     |  |");
			System.out.println("  " + c1 + "  |  " + c2 + "  |  " + c3);
			System.out.println("     |     |  |");
			resultado = true;
		} else if (a1.equals(b2) && b2.equals(c3)) {
			clearConsole();
			System.out.println(" \\   |     |");
			System.out.println("  " + a1 + "  |  " + a2 + "  |  " + a3);
			System.out.println("    \\|     |");
			System.out.println("-----------------");
			System.out.println("     | \\   |");
			System.out.println("  " + b1 + "  |  " + b2 + "  |  " + b3);
			System.out.println("     |    \\|");
			System.out.println("-----------------");
			System.out.println("     |     | \\");
			System.out.println("  " + c1 + "  |  " + c2 + "  |  " + c3);
			System.out.println("     |     |   \\");
			resultado = true;
		} else if (a3.equals(b2) && b2.equals(c1)) {
			clearConsole();
			System.out.println("     |     |   /");
			System.out.println("  " + a1 + "  |  " + a2 + "  |  " + a3);
			System.out.println("     |     | /");
			System.out.println("-----------------");
			System.out.println("     |    /|");
			System.out.println("  " + b1 + "  |  " + b2 + "  |  " + b3);
			System.out.println("     | /   |");
			System.out.println("-----------------");
			System.out.println("    /|     |");
			System.out.println("  " + c1 + "  |  " + c2 + "  |  " + c3);
			System.out.println(" /   |     |");
			resultado = true;
		}

		return resultado;

	}

	private static void imprimirTresEnRaya(String a1, String a2, String a3, String b1, String b2, String b3, String c1,
			String c2, String c3) {

		System.out.println("     |     |");
		System.out.println("  " + a1 + "  |  " + a2 + "  |  " + a3);
		System.out.println("     |     |");
		System.out.println("-----------------");
		System.out.println("     |     |");
		System.out.println("  " + b1 + "  |  " + b2 + "  |  " + b3);
		System.out.println("     |     |");
		System.out.println("-----------------");
		System.out.println("     |     |");
		System.out.println("  " + c1 + "  |  " + c2 + "  |  " + c3);
		System.out.println("     |     |");

	}

	private static void clearConsole() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
	}

}
