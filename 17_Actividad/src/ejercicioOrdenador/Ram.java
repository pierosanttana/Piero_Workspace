package ejercicioOrdenador;

public class Ram {

	private String marca;
	private int capacidad;
	private double precio;
	


	public Ram(String marca, int capacidad, double precio) {
		super();
		this.marca = marca;
		this.capacidad = capacidad;
		this.precio = precio;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Ram [marca=" + marca + ", capacidad=" + capacidad + ", precio=" + precio + "]";
	}
	
	
	
	
}
