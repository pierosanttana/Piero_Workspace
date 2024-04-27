package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entidades.Soldado;

class SoldadoTest {
	
	private Soldado s1;
	
	@BeforeEach
	void setUp() {
		//Se crea un Objeto Soldado limpio (nuevo)
		s1 = new Soldado();
		//configuramos todo lo que queramos antes de cada @Test
	}
	

	@Test
	void testPuedeDispararBalasPositivas() {
		int balas = 2;
		s1.setNumeroBalas(balas);
		
		assertTrue(s1.puedeDisparar());
	}
	
	@Test
	void testPuedeDispararBalasNegativas() {
		int balas = -2;
		s1.setNumeroBalas(balas);
		
		assertFalse(s1.puedeDisparar());
		
		
		
	}
	
	@Test
	void testPuedeDispararBalasCero() {
		int balas = 0;
		s1.setNumeroBalas(balas);
		
		assertFalse(s1.puedeDisparar());
	}
	
	@Test
	void testDispararBalasPositivas() {
		int balas = 2;
		s1.setNumeroBalas(balas);
		
		Soldado s2 = new Soldado();
		
		
		s1.disparar(s2);
		int valorEsperado = 1;
		
		assertTrue(s2.isEstaMuerto());
		assertEquals(valorEsperado, s1.getNumeroBalas());
		
	}
	
	@Test
	void testDispararBalasEnCero() {
		int balas = 0;
		s1.setNumeroBalas(balas);
		
		Soldado s2 = new Soldado();
			
		s1.disparar(s2);
		int valorEsperado = -1;
		
		assertTrue(s2.isEstaMuerto());
		assertEquals(valorEsperado, s1.getNumeroBalas());
		
	}
	
	@Test
	void testEstaMuertoTrue() {
		s1.setEstaMuerto(true);
	
		assertTrue(s1.isEstaMuerto());
	}
	
	@Test
	void testEstaMuertoFalse() {
		s1.setEstaMuerto(false);
		
		assertFalse(s1.isEstaMuerto());
	}
	
	

}
