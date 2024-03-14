package juegoMuniemon;

public class Muniemon {

	private String nombre;
	private double vida;
	private double ataque;
	private double defensa;
	private double velocidad;
	private TipoMuniemon tipo;

	@Override
	public String toString() {
		return "Muniemon [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", velocidad=" + velocidad + ", tipo=" + tipo + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public double getDefensa() {
		return defensa;
	}

	public void setDefensa(double defensa) {
		this.defensa = defensa;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public TipoMuniemon getTipo() {
		return tipo;
	}

	public void setTipo(TipoMuniemon tipo) {
		this.tipo = tipo;
	}

	public void atacarMuniemon(Muniemon muniemon) {
		if (this.vida <= 0) {
			System.out.println(this.nombre + " no puede atacar, su vida es 0.");
			return;
		}

		if (muniemon.getVida() <= 0) {
			System.out.println("La vida de " + muniemon.getNombre() + " es 0, no puede pelear.");
			return;
		}

		double ataque = 0;
		ataque = comprobarTipo(muniemon);

		ataque = ataque - muniemon.getDefensa();

		if (ataque <= 0) {
			System.out.println("Tu ataque es muy débil, no puedes ocasionar ningún daño.");
			return;
		}

		System.out.print(this.nombre + " atacó a " + muniemon.getNombre());
		System.out.println(", le quita " + ataque);
		muniemon.setVida(muniemon.getVida() - ataque);

		if (muniemon.getVida() <= 0) {
			System.out.println(muniemon.getNombre() + " ha sido derrotado.");
			muniemon.setVida(0);
		} else {
			System.out.println(muniemon.getNombre() + " ahora tiene " + muniemon.getVida() + " de vida.");
		}
	}

	private double comprobarTipo(Muniemon muniemon) {
		double ataque = this.ataque;
		switch (this.tipo) {
		case FUEGO:
			switch (muniemon.getTipo()) {
			case PLANTA:
				return ataque = this.ataque * 1.50;
			default:
				break;
			}
		case AGUA:
			switch (muniemon.getTipo()) {
			case FUEGO:
				return ataque = this.ataque * 1.50;
			default:
				break;
			}
			break;
		case PLANTA:
			switch (muniemon.getTipo()) {
			case AGUA:
				return ataque = this.ataque * 1.50;
			default:
				break;
			}

		}

		return ataque;
	}
}
