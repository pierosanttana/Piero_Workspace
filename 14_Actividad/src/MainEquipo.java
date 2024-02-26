import java.util.Scanner;

public class MainEquipo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		Equipo[] arrayEquipos = new Equipo[3];
		
		arrayEquipos[0] = new Equipo();
		arrayEquipos[1] = new Equipo();
		arrayEquipos[2] = new Equipo();
		
		for (Equipo equipo : arrayEquipos) {
			pedirDatosEquipo(equipo, scanner);
			System.out.println();
		}
		
		for (int i = 0; i < arrayEquipos.length - 1; i++) {
			
			System.out.println("Jugadores:");
			arrayEquipos[i].mostrarJugadores();
			System.out.println();
			
			System.out.println("Ingrese el nombre de un jugador:");
			String jugador = scanner.nextLine();
			System.out.println("Esta " + jugador + " en el equipo?: " + arrayEquipos[i].estaElJugador(jugador));
			
			System.out.println("Cantidad de jugadores: " + arrayEquipos[i].cantidadJugadores());
			
			System.out.println("El equipo '" + arrayEquipos[i].nombre + "' es apto? " + arrayEquipos[i].esApto());
			System.out.println();
					
			System.out.println("Elige un equipo con su numero para comparar:");
			int y = 0;
			
			for (Equipo equipo : arrayEquipos) {
				System.out.println("[" + (y++) +"] " + equipo.nombre);;
			}
			int equipo = scanner.nextInt();
			
			
			System.out.println("La lista de jugadores es igual? " + arrayEquipos[i].esIgualListaJugadores(arrayEquipos[equipo]));

			System.out.println("El equipo es igual? " + arrayEquipos[i].esIgual(arrayEquipos[equipo]));
			System.out.println();
			
			scanner.nextLine();
			
		}
		
	}
		
		private static void pedirDatosEquipo(Equipo equipo, Scanner scanner) {

			System.out.println("NUEVO USUARIO");
			System.out.println("-------------");

			System.out.println("Ingresa un [Nombre]:");
			equipo.nombre = scanner.nextLine();

			System.out.println("Ingresa la cantidad de [Jugadores posibles]:");
			int cantidad = scanner.nextInt();
			scanner.nextLine();

			String[] jugadores = new String[cantidad];
			equipo.jugadores = jugadores;

			for (int i = 1; i <= jugadores.length; i++) {
				System.out.println("Ingresa el nombre del [Jugador " + i + "]:");
				String nombre = scanner.nextLine();
				if (!nombre.isBlank()) {
					equipo.jugadores[i - 1] = nombre;
				} else {
					System.err.println("-> Vuelve a intentarlo.");
					System.out.println();
					i--;
				}
			}
		}

}
