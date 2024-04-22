package actividad;

import java.util.HashMap;
import java.util.Scanner;

public class MainPersona {

	static Scanner scanner;
	static HashMap<String, Persona> HashMapPersonas;

	public static void main(String[] args) {
		
		menu();

	}

	private static void menu() {

		scanner = new Scanner(System.in);

		HashMapPersonas = new HashMap<>();

		String opcion = "";

		do {
			System.out.println(" ------------------------------");
			System.out.println("|[1] Introducir Persona        |");
			System.out.println("|[2] Mostrar Personas          |");
			System.out.println("|[3] Buscar Persona por nombre |");
			System.out.println("|[0] Salir del programa        |");
			System.out.println(" ------------------------------");
			System.out.println("Eligue una opción: ");

			opcion = scanner.nextLine();

			switch (opcion) {
			case "1":
				AltaPersona();
				break;
			case "2":
				mostrarPersonas();
				break;
			case "3":
				buscarPersona();
				break;
			case "0":
				System.out.println("Programa terminado.");
				break;
			default:
				System.out.println("La opción no es valida.");
				break;
			}
		} while (!opcion.equals("0"));

	}

	private static void buscarPersona() {
		
		System.out.println("-- Buscador --");
		String nombre = pedirNombre().toLowerCase();
		if(HashMapPersonas.get(nombre) == null) {
			System.out.println("No se encuentra esa persona.");
		}else {
			System.out.println(HashMapPersonas.get(nombre));			
		}
		
	}

	private static void mostrarPersonas() {

		HashMapPersonas.forEach((k, v) -> {
			System.out.print("clave: " + k.toString());
			System.out.println(" valor: " + v.toString());
		});
	}

	private static void AltaPersona() {
		Persona p1 = new Persona();
		
		String nombre = pedirNombre();
		String nombreBuscado = nombre.toLowerCase();
		String opcion = "";
		
		if(HashMapPersonas.get(nombreBuscado) != null) {
		System.out.println("Esta Persona ya existe, quieres sobreescribirla?");
		System.out.println("Pulsa 'y' para sobreescribir o 'n' para salir");
		opcion = scanner.nextLine().toLowerCase();
		
		
		switch(opcion) {
		case  "y":
			p1.setNombre(pedirNombre());
			p1.setEdad(pedirEdad());
			p1.setPeso(pedirPeso());
			
			HashMapPersonas.put(p1.getNombre().toLowerCase(),p1);
		break;
		case "n":
			System.out.println("");
		break;
		default:
		System.out.println("Opción incorrecta");
		break;
		}
		}else {
		p1.setNombre(nombre);
		p1.setEdad(pedirEdad());
		p1.setPeso(pedirPeso());
		
		HashMapPersonas.put(p1.getNombre().toLowerCase(),p1);
		}
		
	}


	private static String pedirNombre() {
		System.out.println("Ingresa un el nombre:");
		String nombre = scanner.nextLine();
		return nombre;
	}
	
	private static int pedirEdad() {
		System.out.println("Ingresa la edad:");
		String sEdad = scanner.nextLine();
		int iEdad = Integer.parseInt(sEdad);
		return iEdad;
	}
	
	private static double pedirPeso() {
		System.out.println("Ingresa el peso:");
		String sPeso = scanner.nextLine();
		double dPeso = Double.parseDouble(sPeso);
		return dPeso;
	}

}
