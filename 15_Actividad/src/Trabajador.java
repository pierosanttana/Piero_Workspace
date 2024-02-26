
public class Trabajador {

	String nombre;
	String dni;
	int salario;
	
	
	public Trabajador(String nombre, String dni, int salario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}


	public Trabajador() {
		super();
	}


	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", salario=" + salario + "]";
	}
	
	public boolean dniEsValido() {
	// Expresión regular para validar DNI de 8 dígitos seguido de una letra
	  if(dni != null) {
		String regex = "\\d{8}[A-Za-z]";
	  return dni.matches(regex) && dni.length() == 9;
	  }
	  return false;
	  }
	
	public boolean ganaMasQue(Trabajador trabajador) {
		if(salario > trabajador.salario) {
			return true;
		}
		return false;
	}
	
	public boolean esIgualQue(Trabajador trabajador) {
		
		if(this.nombre.equalsIgnoreCase(trabajador.nombre) && 
				this.dni.equalsIgnoreCase(trabajador.dni) && 
				this.salario == trabajador.salario) {
			return true;
		}
		
		return false;
	}
	
	
	
	
}
