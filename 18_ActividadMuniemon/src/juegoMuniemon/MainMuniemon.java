package juegoMuniemon;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMuniemon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		menuMuniemon(scanner);

	}

	public static void menuMuniemon(Scanner scanner) {
		int opcion = 0;
		
		ArrayList<Muniemon> arrayMuniemons = new ArrayList<Muniemon>();
		
		do {
			System.out.println(" -----------------------------------");
			System.out.println("|             MUNIEMON              |");
			System.out.println("|            ----------             |");
			System.out.println("|[1] Dar de alta Muniemon           |");
			System.out.println("|[2] Mostrar datos del Muniemon     |");
			System.out.println("|[0] Salir del programa             |");
			System.out.println(" -----------------------------------");
			System.out.println("Eligue una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				scanner.nextLine();
				arrayMuniemons.add(darDeAltaMuniemon(scanner));
				break;
			case 2:
				for (Muniemon muniemon : arrayMuniemons) {
					mostrarDatosMuniemon(muniemon);
				}
				break;
			case 0:
				System.out.println("Programa terminado.");
				break;
			default:
				System.err.println("Opción incorrecta.");
			}
		} while (opcion != 0);

	}


	public static Muniemon darDeAltaMuniemon(Scanner scanner) {
		Muniemon muniemon = new Muniemon();
		
		System.out.println(" --------------------------");
		System.out.println("|     DATOS DE MUNIEMON    |");
		System.out.println(" --------------------------");
		
		System.out.println("Escribe un nombre para tu Muniemon:");
		muniemon.setNombre(scanner.nextLine());

		System.out.println("Ingresa su cantidad de vida:");
		muniemon.setVida(scanner.nextInt());

		System.out.println("Ingresa su cantidad de ataque:");
		muniemon.setAtaque(scanner.nextInt());

		System.out.println("Ingresa su cantidad de defensa:");
		muniemon.setDefensa(scanner.nextInt());
		System.out.println();
		
		int posicion = 0;
		System.out.println(" --------------------------");
		System.out.println("|     TIPOS DE MUNIEMON    |");
		System.out.println(" --------------------------");
		
		for (TipoMuniemon tipo : TipoMuniemon.values()) {
			System.out.println("[" + posicion + "]" + tipo);
			posicion++;
		}
		System.out.println(" --------------------------");
		System.out.println("Eligue el tipo:");
		muniemon.setTipo(TipoMuniemon.values()[scanner.nextInt()]);
		
		return muniemon;
	}
	
	private static void mostrarDatosMuniemon(Muniemon muniemon) {
		System.out.println(" ----------------------");
		System.out.println("      " + muniemon.getNombre());
		System.out.println(" ----------------------");
		System.out.println("  Tipo    : " + muniemon.getTipo());
		System.out.println("  Vida    : " + muniemon.getVida());
		System.out.println("  Ataque  : " + muniemon.getAtaque());
		System.out.println("  Defensa : " + muniemon.getDefensa());
		System.out.println(" ----------------------");
	}

}
