package ejercicioOrdenador;

public class TarjetaGrafica {
	
	private String marca;
	private String modelo;
	private int nucleosCuda;
	private double precio;
	private Ram ram;
	

	public TarjetaGrafica() {
		super();
	}

	

	public TarjetaGrafica(String marca, String modelo, int nucleosCuda, double precio, Ram ram) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nucleosCuda = nucleosCuda;
		this.precio = precio;
		this.ram = ram;
	}



	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNucleosCuda() {
		return nucleosCuda;
	}

	public void setNucleosCuda(int nucleosCuda) {
		this.nucleosCuda = nucleosCuda;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "TarjetaGrafica [marca=" + marca + ", modelo=" + modelo + ", nucleosCuda=" + nucleosCuda + ", precio="
				+ precio + ", ram=" + ram + "]";
	}

	
	
	
	
	
}
