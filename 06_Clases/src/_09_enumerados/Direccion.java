package _09_enumerados;

import java.util.ArrayList;

public class Direccion {
	private ArrayList<TipoVia> tipoVia;
	private String nombreVia;
	
	
	
	public ArrayList<TipoVia> getTipoVia() {
		return tipoVia;
	}
	
	public void setTipoVia(ArrayList<TipoVia> tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + "]";
	}
	
	
	
	
	
}
