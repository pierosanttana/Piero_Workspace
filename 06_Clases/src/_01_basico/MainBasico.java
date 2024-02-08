package _01_basico;

public class MainBasico {

	public static void main(String[] args) {
		/*
		 * A partir de una clase podremos crear los objetos.
		 * Un objeto es una instancia de una clase.
		 * Los objetos se crean en JVM en un espacio de memoria llamado 'heap'
		 * 
		 * Para crear un objeto en Java usaremos la palabra reservada "new"
		 * Un programa Java tendrá tantos objetos como "news" hayamos hecho.
		 * 
		 * Normalmente necesitamos una variable para apuntar al objeto creado.
		 * Las variables de clase se llaman "referencias"
		 * IMPORTANTE:
		 * - Una variable contiene el valor
		 * EJ: una variable de tipo "int" contiene el valor "5"
		 * -Una referencia contiene la posición de memoria de donde se encuentra el objeto.
		 * EJ: una referencia de tipo String contiene la posición de memoria
		 * "0x123EAF" y en esa memoria estará el objeto de tipo String (con su valor)
		 */
		
		//Las variables se crean en un espacio de memoria llamado "stack"
		int numero = 5;
		
		//Las referencias se crean tambien en el "stack", pero el objeto se crea en el "heap"
		
		/*
		 * Cuando creamos un objeto, por defecto, los primitivos se inicializan a "0"
		 * (booleanos a "false"), y las referencias a "null".
		 */
		Persona personaUno = new Persona();
		Persona personaDos = new Persona();
		
		/* 
		 * Podemos acceder a los objetos mediante la referencia y un '.';
		 */
		System.out.println(personaUno.nombre);
		System.out.println(personaUno.edad);
		System.out.println(personaUno.peso);
		System.out.println(personaDos.estaCasado);
		personaUno.edad = 10;
		
		personaUno = personaDos;
		
		
		System.out.println(personaUno.edad);
		
		

	}

}
