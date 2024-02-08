
public class _08_Funciones_01 {

	/*
	 * Una funcion o metodo es un bloque de codigo que realiza 
	 * alguna operacion 
	 * 
	 * En programacion orientada a objetos POO o OOP en ingles)
	 * a las funciones se le llaman "metodos"
	 * 
	 * Los objetivos de las funciones son basicamente 2:
	 * 1. Reutilizar código 
	 * 2. Ordenar el código
	 * 
	 *  Los metodos o funciones pueden tener parametros de entrada 
	 *  y parametros de salida.
	 */
	public static void main(String[] args) {
		
		System.out.println("Bienvenidos a las funciones o métodos en Java");
		System.out.println("---------------------------------------------");
		System.out.println("Autor:");
		
		System.out.println("Bienvenidos a las funciones o métodos en Java");
		System.out.println("---------------------------------------------");
		System.out.println("Autor:");
		
		/*
		 * Para invocar una función o método lo haremos a traves de su nombre
		 */
		
		//dameElNombreDelAutor();
		System.out.println(dameElNombreDelAutor());
		String cadena = dameElNombreDelAutor();
		System.out.println("El nombre del autor es: " + cadena );
		
		/*
		 * Normalmente, cuando invocamso una función o método que devuelve un
		 * valor, tenemos que hacer algo con él.
		 */

		int numero3 = 100;
		
		{
			numero3 = 90;
			System.out.println(numero3);
		}
		System.out.println(numero3);
		
		imprimirNombreAutor("Piero Santana");
		
		int prueba = calcularPotencia(12, 2);
		
		System.out.println(prueba);
		
		
	}//Fin de metodo main
	
	/*
	 * Las funciones o métodos en Java las podemos declarar ddentro de una clase 
	 * pero ojo! Fuera del método "main", es decir no podemos declarar métodos 
	 * o funciones dentro de método o "funciones"
	 * 
	 * Las funciones para declararlas tienen que tener un nombre de funcion o método
	 * 
	 * En este caso vamos a declarar el método "bienvenida"
	 * Este método no tendrá parametros de entrada. Los parametros de entrada
	 * van entre los paréntesis y separados por "," y son equivalentes a las 
	 * variables.
	 * 
	 * Este método no tendrá parametros de salida, y se especifica con la palabra "void"
	 * justo antes del nombre del método. Que una función o método no tenga parametros
	 * de salida quiere decir que no devuelve nada.
	 */
	
	
	public static void bienvenida () { //Llave de apertura del método "bienvenida"
		
		System.out.println("Bienvenidos a las funciones o métodos en Java");
		System.out.println("---------------------------------------------");
		System.out.println("Autor:");
		
	}//Llave de cierre del método "bienvenida"
	
	public static String dameElNombreDelAutor() {
		/*
		 * Cuando una funcion devuelve un dato debe de tener 
		 * el algun momento la palabra "return" con el tipo de 
		 * dato que queremos devolver
		 * 
		 * Cuando se ejecute el "return" se acabara la funcion
		 */
		
		//return "Felix de Pablo";
		
		/*
		 * Esto es equivalente a lo anterior
		 * 
		 * La variable "cadena" nacera en la linea siguente y
		 * morira cuando salga del bloque, en este caso al final 
		 * 
		 */
		
		String cadena = "Felix de Pablo";
		return cadena;
	}
	
	public static void imprimirNombreAutor(String nombre){
		
		System.out.println("El nombre del autor es: "+ nombre);
	}
	
	public static int calcularPotenciaCuadrada (int numero) {
		int potencia = numero * numero;
		return potencia;
	}
	
	public static int calcularPotencia (int numero, int potencia) {
		int resultado = (int)Math.pow(numero, potencia);
		return resultado;
	}
	

}//Fin de la clase
