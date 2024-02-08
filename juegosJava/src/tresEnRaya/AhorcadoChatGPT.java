package tresEnRaya;
import java.util.Scanner;

public class AhorcadoChatGPT {

	    private static final int MAX_INTENTOS = 6;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        iniciarJuego(scanner);
	    }

	    private static void iniciarJuego(Scanner scanner) {
	        System.out.println("Ingresa una palabra:");
	        String palabraIngresada = scanner.nextLine().toLowerCase(); // Convertir a minúsculas
	        System.out.println("Ingresa una pista:");
	        String pistaIngresada = scanner.nextLine();
	        clearConsole();

	        char[] arrayPalabra = new char[palabraIngresada.length()];
	        for (int i = 0; i < arrayPalabra.length; i++) {
	            arrayPalabra[i] = '*';
	        }

	        int contador = 0;
	        boolean letraEncontrada;
	        boolean palabraEncontrada;

	        System.out.println("--------JUEGO: AHORCADO-------- ");
	        System.out.println("Tienes que adivinar una palabra");
	        System.out.println();
	        imprimirPalabra(arrayPalabra);
	        System.out.println();
	        System.out.println("Pista -> " + pistaIngresada + ", tiene " + arrayPalabra.length + " letras.");
	        System.out.println();

	        do {
	            letraEncontrada = procesarIntento(scanner, palabraIngresada, arrayPalabra);
	            dibujoAhorcado(contador);
	            System.out.println("Intentos restantes: " + (MAX_INTENTOS - contador));
	            System.out.println("----------------------");
	            imprimirPalabra(arrayPalabra);

	            if (!letraEncontrada) {
	                contador++;
	            }

	            if (contador == MAX_INTENTOS) {
	                finDelJuego(palabraIngresada);
	            }

	            palabraEncontrada = verificarPalabraEncontrada(arrayPalabra, palabraIngresada);
	            if (palabraEncontrada) {
	                System.out.println("¡¡Enhorabuena, Lo has adivinado!!");
	                System.out.println("--------------");
	                System.out.println("Fin del juego.");
	                break;
	            }
	        } while (contador != MAX_INTENTOS);
	    }

	    private static boolean procesarIntento(Scanner scanner, String palabra, char[] arrayPalabra) {
	        System.out.println("------------------");
	        System.out.println("Ingresa una letra:");
	        char letra = scanner.nextLine().toLowerCase().charAt(0); // Convertir a minúsculas

	        boolean letraEncontrada = false;
	        for (int i = 0; i < palabra.length(); i++) {
	            if (letra == palabra.charAt(i)) {
	                arrayPalabra[i] = palabra.charAt(i);
	                letraEncontrada = true;
	            }
	        }
	        return letraEncontrada;
	    }

	    private static boolean verificarPalabraEncontrada(char[] arrayPalabra, String palabra) {
	        for (int i = 0; i < palabra.length(); i++) {
	            if (arrayPalabra[i] != palabra.charAt(i)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    private static void finDelJuego(String palabra) {
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
	        System.out.println("La palabra era: " + palabra);
	        System.out.println("--------------");
	        System.out.println("Fin del juego.");
	    }

	    private static void imprimirPalabra(char[] arrayPalabra) {
	        System.out.print("Palabra: ");
	        for (char c : arrayPalabra) {
	            System.out.print(c);
	        }
	        System.out.println();
	    }

	    private static void dibujoAhorcado(int contador) {
	        String[] dibujo = {
	            "  ___________",
	            "  |         |",
	            "  |         O",
	            "  |        /|\\",
	            "  |         |",
	            "  |        / \\"
	        };

	        System.out.println(dibujo[0]);
	        for (int i = 1; i <= contador; i++) {
	            System.out.println(dibujo[i]);
	        }
	    }

	    private static void clearConsole() {
	        for (int i = 0; i < 20; i++) {
	            System.out.println(); // Imprime líneas en blanco para "limpiar" la consola
	        }
	    }
	}
