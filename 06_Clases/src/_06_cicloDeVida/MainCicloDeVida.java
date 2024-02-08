package _06_cicloDeVida;

import java.util.Random;
import java.util.Scanner;

public class MainCicloDeVida {

	public static void main(String[] args) {
		
		
		/*
		 * Un objeto nace cuando instanciamos la clase con la palabra "new"
		 */
		
		new Persona();
		new Persona().edad = 45;
		
		/*
		 * Normalmene si queremos guardar informacion en los atributos
		 * de un objeto, debemos crear tambien una referencia para poder
		 * acceder a dichos atributos. No tiene mucho sentido almacenar
		 * información que no podemos acceder a ella
		 * 
		 * Si que puede tener sentido, crear un objeto sin referencia para 
		 * acceder a sus metodos en un momento dado, pero hay que tener claro, 
		 * que no podemos volver a acceder a dicho objeto
		 * 
		 */
		
		int numero = new Random().nextInt(1,10);
		System.out.println("el numero aleatorio es: " + numero);
		
		/*
		 * ¿Cuanto tiempo viven los objetos en el Heap de memoria?
		 * En java tenemos un programa dentro de la JVM que se llama
		 * Recolector de basura o Garbage Collector. Este programa
		 * pasa aleatoriamente por el Heap de memoria para borrar
		 * objetos. LA condición para que un objeto sea eliminado del Heap
		 * es que no tenga ninguna referencia.
		 * 
		 * En este caso, mientras que los 3 objetos creados arriba seran borrados por el GB,
		 * este objeto NO será borrado ya que tiene una referencia apujntandole.
		 */
		Persona p = new Persona();
		p.edad = 35;
		
		/*
		 * Teoricamente, la JVM tiene un método para obligar a pasar al recolector
		 * de basura, que es el metodo "gc()" de la clase System
		 */
		System.gc();
		
		/*
		 * En POO existe el concepto de null. Null representa "vacio", nulo,
		 * ausencia de valor y se usa la palabra reservada "null"
		 */
		Persona p2 = null;
		String s = null;
		Random rd = null;
		//int i = null; //Solo pueden ser null las referencias
		
		p2 = new Persona();
		p2.edad = 22;
		
		Persona p3 = p2;
		Persona p4 = p3;
		
		p2 = null;
		
		System.out.println(p4.edad);
		
		/*
		 * IMPORTANTE: Pesadilla de los programadores
		 * Siempre que una referecia este apuntando a null e intentemos acceder
		 * a alguno de sus atributos o métodos nos dará el error
		 * "NullPointerException" y se nos parará el programa
		 */
		//System.out.println(p2.edad);
		
		p4 = dameNulo();
		
		System.out.println(p4.edad);
		
		
	}
	
	public static Persona dameNulo() {
		return null;
	}

}
