package ejercicioOrdenador;

import java.util.ArrayList;

public class MainOrdenador {

	public static void main(String[] args) {
		
		// Se deberá crear un ordenador
		// Esto se hará en un main.
		// Una vez creado el ordenador completo, 
		// se deberá invocar a su método toString() y deberá imprimir el ordenador.
		// A continuación, se deberá invocar el método calcularPrecio() 
		// y volver a imprimir el ordenador.
		Ordenador iMac = new Ordenador();
		// Con un procesador
		iMac.setProcesador(new Procesador("Apple", "M1 Chip" , 10, 1200));
		
		// Una tarjeta grafica (con su RAM)
		iMac.setTarjetaGrafica(new TarjetaGrafica("Apple", "M1", 8, 950, new Ram ("Apple", 8, 0)));
		
		// Una placa base
		iMac.setPlacaBase(new PlacaBase("Apple", 1500, "M1"));
		
		
		// 4 modulos de RAM
		iMac.setListaRams(new ArrayList<Ram>());
		
		iMac.getListaRams().add(new Ram("M1", 16, 500));
		iMac.getListaRams().add(new Ram("M1", 16, 600));
		iMac.getListaRams().add(new Ram("M1", 16, 500));
		iMac.getListaRams().add(new Ram("M1", 16, 600));
		
		// Y 3 periféricos.
		iMac.setListaPerifericos(new ArrayList<Periferico>());
		
		iMac.getListaPerifericos().add(new Periferico("Monitor", "Apple", 2500));
		iMac.getListaPerifericos().add(new Periferico("Magic Keyboard", "Apple", 140));
		iMac.getListaPerifericos().add(new Periferico("Magic Mouse", "Apple", 110));
		
		// Invocar a su método toString()
		System.out.println(iMac);
		// invocar el método calcularPrecio() 
		System.out.println(iMac.calcularPrecio());
		System.out.println(iMac);

	}

}
