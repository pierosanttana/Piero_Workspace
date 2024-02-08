package _02_bucles;

import java.util.Iterator;

public class _01_FOR_01 {

	/*
	 * Existen otros tipos de sentencias de control que sirven para alterar al flujo
	 * normal de ejecucion de un programa que son los bucles o sentencias repetitivas
	 * 
	 * 
	 * Con la sentencia 'for' podemos repetir un bloque de codigo de 1 a N veces 
	 * 
	 */
	public static void main(String[] args) {
		
		
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		
		
		/*
		 * Para hacer repeticiones mejor usar un bucle, en este caso vamos a
		 * hacerlo con el bucle "for"
		 * Para hacer un bucle "for" usaremos la palabra reservada "for"
		 * Dentro de la estructura "for" podemos encontrar las siguientes partes
		 * 1- Inicio de la variable de control de bucle , normalmente una variable 'int'
		 * 2- Condicion de ejecucion de bucles, es decir cuando se tiene que seguir
		 * ejecutando el bucle. Es una expresion booleana
		 * 3- Incremento de la variable de control de bucle 
		 * Estas tres partes van entre parentesis y separadas por ';'
		 * 
		 */
		
		int i = 0;
		System.out.println("-------------- FOR -------------");
		for (i = 1; i <=10; i+=2) {
			System.out.println(i);
			System.out.println("Hola en este tema vamos a hablar de bucles");
		}
		
			System.out.println("-------------- FOR 1000000-------------");
			
		for (i = 0; i >= 0; i++) {
			System.out.println(i);
			System.out.println("Hola en este tema vamos a hablar de bucles");		
		}
		
		
	}

}
