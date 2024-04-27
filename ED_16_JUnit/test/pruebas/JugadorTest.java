package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.Jugador;
import entidades.Soldado;

class JugadorTest {
	
	private Jugador j1;
	
	
	@BeforeEach
	void setUp() {
		//Se crea un Objeto Soldado limpio (nuevo)
		j1 = new Jugador();
		//configuramos todo lo que queramos antes de cada @Test
	}

	@Test
	void testPonerDorsalEnRango() {
		
		int dorsal = 9;
		int dorsalEsperado = 9;
		
		j1.ponerDorsal(dorsal);
		int dorsalObtenido = j1.getDorsal();
		
		assertEquals(dorsalEsperado, dorsalObtenido);
	}
	
	
	@Test
	void testPonerDorsalFueraRango() {
		
		int dorsal = 31;
		int dorsalEsperado = -1;
		
		j1.ponerDorsal(dorsal);
		int dorsalObtenido = j1.getDorsal();
		
		assertEquals(dorsalEsperado, dorsalObtenido);
	}
	
	@Test
	void testEstaExpulsadoTrue() {
		int tarjetasAmarillas = 2;
		
		j1.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		
		assertTrue(j1.estaExpulsado());
	}
	
	@Test
	void testEstaExpulsadoFalse() {
		int tarjetasAmarillas = 1;
		
		j1.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		
		assertFalse(j1.estaExpulsado());
	}
	
	@Test
	void testEstaExpulsadoTrueRojas() {
		int tarjetasAmarillas = 0;
		int tarjetaRoja = 1;
		
		j1.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j1.setNumeroTarjetasRojas(tarjetaRoja);
		
		assertTrue(j1.estaExpulsado());
	}
	
	@Test
	void testEstaExpulsadoFalseRojas() {
		int tarjetasAmarillas = 1;
		int tarjetaRoja = 0;
		
		j1.setNumeroTarjetasAmarillas(tarjetasAmarillas);
		j1.setNumeroTarjetasRojas(tarjetaRoja);
		
		assertFalse(j1.estaExpulsado());
	}
	
	
	@Test
	void testSetDorsal() {
		int dorsal = 10;
		j1.setDorsal(dorsal);
		
		assertEquals(dorsal, j1.getDorsal());
	}
	
	@Test
	void testGetDorsal() {
		int dorsal = 10;
		j1.setDorsal(dorsal);
		
		int valorObtenido = j1.getDorsal();
		
		assertEquals(dorsal, valorObtenido);
	}
	
	@Test
	void testSetTarjetaAmarilla() {
		int amarilla = 2;
		
		j1.setNumeroTarjetasAmarillas(amarilla);
		
		int valorObtenido = j1.getNumeroTarjetasAmarillas();
		
		assertEquals(amarilla, valorObtenido);
		
	}
	
	@Test
	void testSetTarjetaRoja() {
		int roja = 1;
		
		j1.setNumeroTarjetasRojas(roja);
		
		int valorObtenido = j1.getNumeroTarjetasRojas();
		
		assertEquals(roja, valorObtenido);
		
	}

}
