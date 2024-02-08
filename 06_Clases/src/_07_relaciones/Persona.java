package _07_relaciones;


public class Persona {
	
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;
	//String direccion;
	/*
	 * Trabajar con direcciones de tipo String es complicado y engorroso
	 * ya que la información de dentro no esta normalizada y nos cuesta 
	 * mucho extraerla
	 */

	@Override
	public String toString() {
		return "Persona [nombre= " + nombre + ", edad= " + edad + ", peso= " + peso + ", estaCasado= " + estaCasado + "]";
	}
	
	
	

}

