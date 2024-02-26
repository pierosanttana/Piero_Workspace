import java.util.Arrays;

public class Equipo {

	String nombre;
	String[] jugadores;

	public Equipo() {
		super();
	}

	public Equipo(String nombre, String[] jugadores) {
		super();
		this.nombre = nombre;
		this.jugadores = jugadores;
	}

	//Los objetos tendrán la opción de mostrar todos sus datos 
	//por pantalla (mediante el método toString())
	
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" + Arrays.toString(jugadores) + "]";
	}
	
	//Los objetos tendrán la opción de mostrar todos sus jugadores
	public void mostrarJugadores() {
		for (String i : jugadores) {
			System.out.println(i);
		}
	}
	
	//Los objetos tendrán la opción de devolver 
	//si existe un jugador pasado por parámetro.
	public boolean estaElJugador(String jugador) {

		for (String i : jugadores) {
			if (i == null) {
				continue;
			} else if (i.equalsIgnoreCase(jugador)) {
				return true;
			}
		}
		return false;
	}
	//Los objetos tendrán la opción de devolver el numero de jugadores que tienen.
	public int cantidadJugadores() {
		int cantidad = jugadores.length;
		for (String i : jugadores) {
			if (i == null || i.isBlank()) {
				cantidad--;
			}
		}
		return cantidad;
	}

	//Los objetos tendrán la opción de devolver si el número de jugadores 
	//que tienen es apto para jugar. 
	//Un equipo es apto para jugar si tiene al menos 7 jugadores.
	public boolean esApto() {
		if (this.cantidadJugadores() >= 7) {
			return true;
		}

		return false;
	}
	
	//Los objetos tendrán la opción de devolver si una lista de 
	//jugadores pasada por parámetro es exactamente igual a su lista de jugadores

	public boolean esIgualListaJugadores(Equipo equipo) {
		
		if (this.cantidadJugadores() != equipo.cantidadJugadores()) {
			return false;
		}
		
		for (String string : equipo.jugadores) {
			if(estaElJugador(string)) {
				continue;
			}else {
				return false;
			}
		}
			return true;
	}
		
		/*
		if (this.jugadores.length == jugadores.length) {
			for (int i = 0; i < this.jugadores.length; i++) {
				esIgual = false;
				for (int j = 0; j < jugadores.length; j++) {
					if (this.jugadores[i].equalsIgnoreCase(jugadores[j])) {
						esIgual = true;
						break;
					}
				}
				if (!esIgual) {
					break;
				}
			}
		}
		return esIgual;
	}
	*/
		
	//Los objetos tendrán la opción de devolver si un equipo pasado por parámetro 
	//es exactamente igual al mismo. Un equipo es exactamente igual si tiene el 
	//mismo nombre y la misma lista de jugadores con los mismos nombres.
	public boolean esIgual(Equipo equipo) {
		
		
		if(this.cantidadJugadores() == equipo.cantidadJugadores() && this.esIgualListaJugadores(equipo)) {
			return true;
		}
		
		return false;
		
		/*
		boolean esIgual = false;

		if (this.nombre.equalsIgnoreCase(equipo.nombre)) {
			if (this.jugadores.length == equipo.jugadores.length) {
				for (int i = 0; i < this.jugadores.length; i++) {
					esIgual = false;

					for (int j = 0; j < equipo.jugadores.length; j++) {
						if (this.jugadores[i].equalsIgnoreCase(equipo.jugadores[j])) {
							esIgual = true;
							break;
						}
					}
					if (!esIgual) {
						break;
					}
				}
			}
		}
		return esIgual;
		*/
	}

}
