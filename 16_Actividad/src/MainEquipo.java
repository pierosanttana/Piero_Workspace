import java.util.ArrayList;
import java.util.Scanner;

public class MainEquipo {

	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		
		/* Parte de creación de objetos
		 * Habrá que crear otra clase que ejecute el programa principal y cree 2 equipos
		 * diferentes. */
		
		Equipo e1 = new Equipo();
		e1.setListaNombreJugadores(new ArrayList<String> ());
		
		Equipo e2 = new Equipo("Madrid", new ArrayList<String> ());
		
		 // Los valores de los equipos serán los que se metan por teclado.
			pedirDatosEquipo(e1, scanner);
			pedirDatosEquipo(e2, scanner);
		
		 // Los equipos tendrán que ser introducidos en un array de equipos.
		 
		ArrayList<Equipo> arrayEquipos = new ArrayList<Equipo>();
		
		arrayEquipos.add(e1);
		arrayEquipos.add(e2);
			
		 /* A continuación debemos de invocar todos sus métodos y observar los diferentes
		 * resultados. Tendremos que invocar los métodos recorriendo el array de equipos
		 * con un bucle, no podemos invocar los métodos fuera de dicho bucle.
		 */
		
		for(Equipo e : arrayEquipos) {
			System.out.println(e.toString());
			e.mostrarJugadores();
			System.out.println(e.existeJugador("Piero"));
			System.out.println(e.numeroDeJugadores());
			System.out.println(e.numeroJugadoresEsApto());
			System.out.println(e.jugadoresSonIguales(e2.getListaNombreJugadores()));
			System.out.println(e.equipoEsIgual(e2));
			System.out.println("-------------------------");
		}

	}
	
	private static void pedirDatosEquipo(Equipo equipo, Scanner scanner) {

		System.out.println("NUEVO EQUIPO");
		System.out.println("-------------");

		System.out.println("Ingresa un [Nombre]:");
		equipo.setNombre( scanner.nextLine());

		System.out.println("Ingresa la cantidad de Jugadores para agregar:");
		int cantidad = scanner.nextInt();
		scanner.nextLine();

		for (int i = 1; i <= cantidad; i++) {
			System.out.println("Ingresa el nombre del [Jugador " + i + "]:");
			String nombre = scanner.nextLine();
			if (!nombre.isBlank()) {
				equipo.getListaNombreJugadores().add(nombre);
			} else {
				System.err.println("-> Vuelve a intentarlo.");
				System.out.println();
				i--;
			}
		}
	}
}
