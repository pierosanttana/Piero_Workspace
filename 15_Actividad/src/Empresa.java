import java.util.Arrays;

public class Empresa {

	String nombre;
	String nif;
	Trabajador[] listaTrabajadores;
	
	
	public Empresa(String nombre, String nif, Trabajador[] listaTrabajadores) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.listaTrabajadores = listaTrabajadores;
	}

	public Empresa() {
		super();
	}


	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", nif=" + nif + ", listaTrabajadores="
				+ Arrays.toString(listaTrabajadores) + "]";
	}
	
	public void mostrarDatosTrabajores() {
		for (Trabajador trabajador : listaTrabajadores) {
			System.out.println(trabajador);
		}
	}
	
	public boolean existeTrabajador(String dni) {
		for (Trabajador trabajador : listaTrabajadores) {
			if (trabajador.dni != null && trabajador.dni.equals(dni)) {
			return true;	
			}
		}
		return false;
	}
	
	public int cantidadTrabajadores() {
		int contador = 0;
		for (Trabajador trabajador : listaTrabajadores) {
			if(trabajador != null) {
				contador++;
			}
		}
		return contador;
	}
	
	public int gastoEnSalarios() {
		int salarioTotal = 0;
		for (Trabajador trabajador : listaTrabajadores) {
			if(trabajador != null) {
			salarioTotal += trabajador.salario;
			}
		}
		return salarioTotal;
	}
	
	public int salariosMayorATresMil() {
		int contador = 0;
		for (Trabajador trabajador : listaTrabajadores) {
			if (trabajador != null && trabajador.salario >= 3000) {
				contador++;
			}
		}
		return contador;
	}
	
	public int salariosMenoresAlSmi() {
		int contador = 0;
		for (Trabajador trabajador : listaTrabajadores) {
			if (trabajador != null && trabajador.salario <= 1134) {
				contador++;
			}
		}
		return contador;
	}
	
	public int cantidadSalariosMayorA(double salario) {
		int contador = 0;
		for (Trabajador trabajador : listaTrabajadores) {
			if (trabajador != null && trabajador.salario >= salario) {
				contador++;
			}
		}
		return contador;
		
	}
	
	public boolean todosDniSonValidos() {
		for (Trabajador trabajador : listaTrabajadores) {
			if(!trabajador.dniEsValido()) {
				return false;
			}
		}
		return true;
	}
	
	public boolean esIgualAEmpresa(Empresa empresa) {
		
		if(nombre != null && empresa.nombre != null) {
			if(nombre.equalsIgnoreCase(empresa.nombre) && nif.equalsIgnoreCase(empresa.nif)) {
				return true;
		}
		}
		
		return false;
	}
}
