package _01_Videojuego;

public class Videojuego {
	
	int id;
	String nombre;
	float puntuacion;
	double precio;
	String fechaCreacion;
	boolean esSegundaMano;
	
	
	public Videojuego() {
		fechaCreacion = "01/01/1970"; 
	}
	
	public Videojuego(int id, String nombre, float puntuacion, float precio, String fechaCreacion, boolean esSegundaMano) {
		this.id = id;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
		this.fechaCreacion = fechaCreacion;
		this.esSegundaMano = esSegundaMano;
		
	}
	
	public Videojuego(String nombre, String fechaCreacion) {
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
	}
	
	public void mostrarDatos() {
		System.out.println("ID: " + this.id);
		System.out.println("NOMBRE: " + this.nombre);
		System.out.println("PUNTUACIÓN: " + this.puntuacion);
		System.out.println("PRECIO: " + this.precio + "€");
		System.out.println("FECHA DE CREACIÓN: " + this.fechaCreacion);
		System.out.println("SEGUNDA MANO?: " + this.esSegundaMano);
	}
	
	public void mostrarNombreYPuntuacion() {
		System.out.println("NOMBRE: " + this.nombre);
		System.out.println("PUNTUACIÓN: " + this.puntuacion);
	}
	
	public void mostrarPrecioEnLibras() {
		double precioLibras = this.precio * 0.86;
		System.out.println("PRECIO EN LIBRAS: " + precioLibras + "£" );
	}
	
	public void cambioFormatoFecha() {
		String[] fechaDividida = this.fechaCreacion.split("/");
		for(int i = 2; i >= 0; i--) {
			System.out.print(fechaDividida[i]);
			if(i >= 1) {
			System.out.print("-");
			}
		}
		System.out.println();
	}
	
	public double precioConDescuento() {
		
		double precio = (this.esSegundaMano) ? this.precio * 0.7 : this.precio;
		/*
		double precio = this.precio;
		if(this.esSegundaMano) {
		precio = this.precio * 0.7;
		}*/
		return precio;
	}
	
	public void esApto() {
		if(this.puntuacion < 5) {
			System.out.println("No es apto para jugar.");
		} else {
			System.out.println("Es apto para jugar.");
		}
	}
	
	public void mostrarNumNaturales() {
		
		for(int i = (int)this.puntuacion + 1; i < 10; i++ ) {
			System.out.println(i);
		}
	}
	
	/**
	 * 
	 * @param vd
	 * @return
	 */
	public boolean esMasCaro(Videojuego vd) {
		boolean esMasCaro = false;
		if(this.precio > vd.precio) {
			esMasCaro = true;
		}
		return esMasCaro;
		
	}
}
