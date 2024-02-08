package constructoresYMetodos2;

public class Coche {

	int id;
	String marca;
	String modelo;
	double precioBase;
	String fechaMatricula;
	int kilometros;
	
	public Coche() {
		super();
		this.marca = "";
		this.modelo = "";
	}
	
	public Coche(int id, String marca, String modelo, double precioBase, String fechaMatricula, int kilometros) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.fechaMatricula = fechaMatricula;
		this.kilometros = kilometros;
	}


	
	@Override
	public String toString() {
		
		return "ID: " + id + "\nMarca: " + marca + "\nModelo: " + modelo + 
				"\nPrecio Base: " + precioBase + "\nFecha de Matricula: " + fechaMatricula +
				"\nKilometros: " + kilometros;
	}
	
	public void mostrarPrecio() {
		System.out.println("Precio " + this.marca + " - " + this.modelo +
				":\n" + this.precioBase + "€");
	}
	
	public void mostrarAnioMatricula() {
		System.out.println("Año de Matricula:\n" + this.fechaMatricula.substring(6, 10));
		
	}
	
	public void mostrarMatriculaBisiesto() {
		String anioCadena = this.fechaMatricula.substring(6, 10);
		int anio = Integer.valueOf(anioCadena);
		
		if(anio % 4 == 0) {
			System.out.print(this.marca + " - " + this.modelo);
			System.out.println(", el año de su matricula es Bisiesto.");
		}else {
			System.out.print(this.marca + " - " + this.modelo);
			System.out.println(", el año de su matricula no es Bisiesto.");
		}
	}
	
	public double precioPorKilometros() {
		double precioKm = 0;
		
		if(this.kilometros < 10000)
			precioKm = this.precioBase;
		else if(this.kilometros > 10000 & this.kilometros < 50000) {
			precioKm = this.precioBase * 0.80;
		} else if(this.kilometros >= 50000) {
			precioKm = this.precioBase * 0.5;
		}
		return precioKm;
	}
	
	public boolean kilometrosPrimo() {
		boolean esPrimo = true;
		
		if(this.kilometros >= 0) {
			for(int i = 2; i < this.kilometros/2; i++) {
				if( this.kilometros % i == 0) {
					esPrimo = false;
				}
			}		
		}else {
			System.err.println("Número de kilómetros incorrectos, deben ser positivos.");
			esPrimo = false;
		}
		return esPrimo;
	}
	
	public int kilometrosPara200mil() {
		int kilometros = 200000 - this.kilometros;
		//return "Faltan " + kilometros + "km para 200000km.";
		return kilometros;
	}
	
	public int caracteresMarcaModelo() {
		String caracteres = this.marca + this.modelo;
		String caracteresSinEspacios = caracteres.replace(" ","");
		return caracteresSinEspacios.length();
	}
	
	public int diferenciaKilometros(Coche coche) {
		int diferencia = 0;
		diferencia = this.kilometros - coche.kilometros;
		/*
		 * return "La diferencia de kilometros de " + this.marca + " - " + this.modelo +
		 * 		" y " + coche.marca + " - " + coche.modelo + 
		 * 		" es de: " + diferencia + "km.";
		*/
		return diferencia;
	}
	
	public String esMasCaro(Coche coche) {
		String masCaro = "";
		
		if(this.precioBase > coche.precioBase) {
			masCaro = this.modelo;
		}else if (this.precioBase < coche.precioBase) {
			masCaro = coche.modelo;
		}
		return masCaro;
	} 
}
