package classObjectArrays;

import java.util.Arrays;

public class Usuario {

	int id;
	String nombre;
	int[] valoraciones;
	
	
	public Usuario() {

	}
	

	public Usuario(int id, String nombre, int[] valoraciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.valoraciones = valoraciones;
	}

	@Override
	public String toString() {
		return "Usuario [id= " + this.id + ", nombre= " + this.nombre + ", valoraciones= " + Arrays.toString(valoraciones);
	}
	
	public int valoracionMedia() {
		int media = 0;
		
		for (int i : this.valoraciones) {
			media = media + i;
		}
		media = media / this.valoraciones.length;
		return media;
	}

	public void mostrarValoraciones() {
		System.out.print("Valoraciones: ");
		for(int i = 0; i < this.valoraciones.length; i++) {
			System.out.print(this.valoraciones[i]);
			if(i < this.valoraciones.length-1) {
			System.out.print(",");
			}
		}
		System.out.println(".");
		
	}
	
	public void valoracionesSuperiores(int valoracion) {
		if(valoracion < 10 || valoracion > 0) {
			int contador = 0;
			for (int i : valoraciones) {
				if(i > valoracion ) {
					contador++;
				}
			}
			System.out.println("Valoraciones superiores a " + valoracion + ":");
			System.out.println(contador);
		}else {
			System.out.println("No es un valor correcto.");
		}
		}
	
	public boolean compararValoracionMedia(int media) {
		boolean bMedia = false;
		
		int numero = valoracionMedia();
		
		if(numero > media) {
			bMedia = false;
		}else if(numero < media) {
			bMedia = true;
		}
		
		return bMedia;
	}
	
	
	
	
	
}
