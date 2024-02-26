package ejercicioOrdenador;

import java.util.ArrayList;

public class Ordenador {
	private double precio;
	private Procesador procesador;
	private TarjetaGrafica tarjetaGrafica;
	private PlacaBase placaBase;
	private ArrayList<Ram> listaRams;
	private ArrayList<Periferico> listaPerifericos;
	
	
	public Ordenador() {
		super();
	}


	public Ordenador(double precio, Procesador procesador, TarjetaGrafica tarjetaGrafica, PlacaBase placaBase,
			ArrayList<Ram> listaRams, ArrayList<Periferico> listaPerifericos) {
		super();
		this.precio = precio;
		this.procesador = procesador;
		this.tarjetaGrafica = tarjetaGrafica;
		this.placaBase = placaBase;
		this.listaRams = listaRams;
		this.listaPerifericos = listaPerifericos;
	}


	@Override
	public String toString() {
		return "Ordenador [precio=" + precio + ", procesador=" + procesador + ", tarjetaGrafica=" + tarjetaGrafica
				+ ", placaBase=" + placaBase + ", listaRams=" + listaRams + ", listaPerifericos=" + listaPerifericos + "]";
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Procesador getProcesador() {
		return procesador;
	}


	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}


	public TarjetaGrafica getTarjetaGrafica() {
		return tarjetaGrafica;
	}


	public void setTarjetaGrafica(TarjetaGrafica tarjetaGrafica) {
		this.tarjetaGrafica = tarjetaGrafica;
	}


	public PlacaBase getPlacaBase() {
		return placaBase;
	}


	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}


	public ArrayList<Ram> getListaRams() {
		return listaRams;
	}


	public void setListaRams(ArrayList<Ram> rams) {
		this.listaRams = rams;
	}


	public ArrayList<Periferico> getListaPerifericos() {
		return listaPerifericos;
	}


	public void setListaPerifericos(ArrayList<Periferico> perifericos) {
		this.listaPerifericos = perifericos;
	}
	
	public double calcularPrecio() {
		
		this.precio = this.precio + procesador.getPrecio() + tarjetaGrafica.getPrecio() + placaBase.getPrecio();
		
		for(Ram r : listaRams) {
			this.precio += r.getPrecio();
		}
		
		for(Periferico p : listaPerifericos) {
			this.precio += p.getPrecio();
		}
				
		return this.precio;
	}
	

}
