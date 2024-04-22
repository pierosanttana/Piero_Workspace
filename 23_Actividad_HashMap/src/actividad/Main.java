package actividad;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		HashMap<String, Integer> HashMapNombreTelefono = new HashMap<>();

		for (int i = 0; i < 5; i++) {
			HashMapNombreTelefono.put(pedirNombre(), pedirTelefono());
		}

		HashMapNombreTelefono.forEach((k, v) -> {
			System.out.print("clave: " + k.toString());
			System.out.println(" valor: " + v.toString());
		});

	}

	private static int pedirTelefono() {
		System.out.println("Ingresa un número de teleno:");
		String numeroTelf = scanner.nextLine();
		int iNumeroTelf = Integer.parseInt(numeroTelf);
		return iNumeroTelf;
	}

	private static String pedirNombre() {
		System.out.println("Ingresa un el nombre:");
		String nombre = scanner.nextLine();
		return nombre;
	}

}
