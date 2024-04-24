package actividad;

import java.util.HashMap;
import java.util.Scanner;

public class MainListin {

	static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		HashMap<String, Long> HashMapNombreTelefono = new HashMap<>();

		for (int i = 0; i < 5; i++) {
			System.out.println("[" + (i + 1) + "]");
			HashMapNombreTelefono.put(pedirNombre(), pedirTelefono());
		}

		HashMapNombreTelefono.forEach((k, v) -> {
			System.out.print("clave: " + k.toString());
			System.out.println(" valor: " + v.toString());
		});

	}

	private static long pedirTelefono() {
		System.out.println("Ingresa un número de teleno:");
		String numeroTelf = scanner.nextLine();
		long iNumeroTelf = Long.parseLong(numeroTelf);
		return iNumeroTelf;
	}

	private static String pedirNombre() {
		System.out.println("Ingresa un el nombre:");
		String nombre = scanner.nextLine();
		return nombre;
	}

}
