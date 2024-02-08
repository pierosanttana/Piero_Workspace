
public class _03_Variables {

	public static void main(String[] args) {
		
		/*
		 * En java, una variable es un espacio en la memoria que se utiliza para 
		 * almacenar un valor especifico 
		 * (generalmente un literal)
		 * Las variables tienen, un nombre un tipo y un valor.
		 * 
		 * java es un lenguaje tipado estatico, lo que significa que el 
		 * tipo de una variable debe ser especificado al momento de declararlo. 
		 * 
		 * Llamamos "declaracion de una variable" cuando creamos una variable 
		 * por primera vez para usarla durante su ciclo vida
		 * Para declarar una variable en java primero especificamos el tipo, luego 
		 * el nombre y lo igualamos a uhn valor
		 * TIPO_VARIABLE NOMBRE_VARIABLE = VALOR_VARIABLE
		 * 
		 * Ejemplo de variable entera
		 * 
		 */
		int numero1 = 1;
		
		/*
		 * Una vez declarada No podemos volver a declararla mientras exista
		 * 
		 * int numero1 = 5; //Esto da error, la variable ya ha sido 'creada'
		 * 
		 * Lo que si podemos hacer es cambiar el valor de las variables
		 */
		
		numero1 = 5;
		//Podemos imprimir por pantalla valores de variables llamandolas por su nombre
	
		System.out.println(numero1);
		
		numero1 = 20;
		System.out.println(numero1); //Notese que ahora el valor de numero1 ha cambiado
		
		
		/*
		 * Podemos crear variables de distintos tipos
		 * Variables booleanas
		 */
		boolean variableBooleana = true;
		variableBooleana = false;
		
		System.out.println(variableBooleana);
		
		/*
		 * Notese que el nombre de las variables en java van en notación lowerCamelCase
		 * 
		 * OJO!! El nombre de las variables es sensible a mayúsculas y minúsculas
		 * 
		 */
		
		int estoEsUnaVariable = 0;
		int ESTOESUNAVARIABLE = 0;
		
		/*
		 * Las variables en java no pueden empezar por número
		 * int 1numero = 0; // error
		 * Las variables en java DEBEN empezar por:
		 * 1. Caracter alfabetico
		 * 2. guion bajo '_'
		 * 3. simbolo del dolar '$'
		 * 
		 */
		int _numero = 0;
		int $numero = 0;
		
		//Variable de tipo long
		long variableLarga = 23L; //Ojo 'L' al final
		variableLarga = 3_000_000_000L; // Si no ponemos la 'L' daria error por el literal 
		
		//Variable de tipo double
		double variableDouble = 12.34;
		System.out.println(variableDouble);
		
		//Variable de tipo float
		float numero = 12.2938F;
		System.out.println(numero);
		
		/*
		 * Existe otros tipos de variables menos usadas, como el
		 * de tipo byte, que es para numeros pequeños, entre -128 y 127
		 */
		
		byte variableByte = 127;
		
		/*
		 * Tipo char
		 */
		char variableChar = 'c';
		
		//Tipo String o cadena. OJO!!! En este caso se capitaliza la primera 
		//palabra
		String variableCadena = "Esto es una variable de cadena";
		
	
	}

}
