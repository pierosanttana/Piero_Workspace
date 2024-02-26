import java.util.ArrayList;

public class Equipo {
	/*
	 * Crear una clase en java que represente a una entidad Equipo. El equipo tendrá
	 * 2 atributos nombre y lista con los nombres de los jugadores del equipo.
	 */
	private String nombre;
	private ArrayList<String> listaNombreJugadores;

	/*
	 * Se tendrán que crear 2 constructores: uno sin parámetros, en el que se
	 * dejarán los valores por defecto. otro con todos los parámetros en el que
	 * podamos crear el objeto con todos los valores que queramos.
	 */

	public Equipo() {
		
	}

	public Equipo(String nombre, ArrayList<String> listaNombreJugadores) {
		this.nombre = nombre;
		this.listaNombreJugadores = listaNombreJugadores;
	}

	// Getters and Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getListaNombreJugadores() {
		return listaNombreJugadores;
	}

	public void setListaNombreJugadores(ArrayList<String> listaNombreJugadores) {
		this.listaNombreJugadores = listaNombreJugadores;
	}

	// Además los objetos tendrán la siguiente funcionalidad (métodos)

	// Los objetos tendrán la opción de mostrar todos sus datos por pantalla
	// (mediante el método toString())
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", listaNombreJugadores=" + listaNombreJugadores + "]";
	}

	// Los objetos tendrán la opción de mostrar todos sus jugadores
	public void mostrarJugadores() {
		for (String j : listaNombreJugadores) {
			System.out.println(j);
		}
	}

	// Los objetos tendrán la opción de devolver si existe un jugador pasado por
	// parámetro.
	public boolean existeJugador(String jugador) {
		for (String j : listaNombreJugadores) {
			if (j.equalsIgnoreCase(jugador)) {
				return true;
			}
		}
		return false;
	}

	// Los objetos tendrán la opción de devolver el numero de jugadores que tienen.
	public int numeroDeJugadores() {
		return listaNombreJugadores.size();
	}

	// Los objetos tendrán la opción de devolver si el número de jugadores que
	// tienen es apto para jugar.
	// Un equipo es apto para jugar si tiene al menos 7 jugadores.
	public boolean numeroJugadoresEsApto() {
		if (numeroDeJugadores() >= 7) {
			return true;
		}
		return false;
	}

	// Los objetos tendrán la opción de devolver si una lista de jugadores pasada
	// por parámetro es exactamente igual a su lista de jugadores
	public boolean jugadoresSonIguales(ArrayList<String> listaJugadores) {
		if (numeroDeJugadores() == listaJugadores.size()) {
			for (String j : listaJugadores) {
				if (!existeJugador(j)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	// Los objetos tendrán la opción de devolver si un equipo pasado por parámetro
	// es exactamente igual al mismo.
	// Un equipo es exactamente igual si tiene el mismo nombre y la misma lista de
	// jugadores con los mismos nombres.
	public boolean equipoEsIgual(Equipo equipo) {
		if (nombre.equalsIgnoreCase(equipo.getNombre())) {
			if (jugadoresSonIguales(equipo.getListaNombreJugadores())) {
				return true;
			}
		}
		return false;
	}

}
