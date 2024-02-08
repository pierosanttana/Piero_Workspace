//Esto es un comentario en Java.
//Los comentarios son explicaciones que ponemos en nuestro código
//para aclarar ciertas partes del mismo.
//Son muy utiles para nosotros y para los futuros desarrolladores que
//lean nuestro codigo.
//Los comentarios en Java empiezan por "//"
//Las lineas en Java no se recomienda que pasen de 80 caracteres.
/*
 * Poniendo los comentarios en este formato podemos poner comentarios
 de varias lineas sin necesidad
 de estar poniendo todo el rato "//"
 */
// El formato seria "/* */"

//Java es un lenguaje de programacion orientado a objetos, por lo que
//tenemos que usar clases para poder arrancar nuestro programa
//Las clases se escriben con notación UpperCamelCase.
/*
 *  Es muy importante seguir las convenciones de codigo en Java
 *
 */
/*
 * Notese que las clases siempre tiene  bloques asociados, los bloques de
 * una clase estan delimitados por los simbolos "()"
 *
 * Las clases tienen que llamarse igual que el nombre del
 * fichero donde se encuentran.
 */
//uno dos

public class _01_PrincipiosFundamentales {
//Para que un programa sea ejecutable, tenemos que crear una clase
//y dentro de la clase tenemos que poner el metodo "main", es un metodo
//que tiene que llenarse igualmente a como sigue.
//Al crear la clase con el editor de java podemos
//seleccionar la casilla de
// "crear el metodo main" para que nos lo cree.

//En caso de que se nos olvide. Podemos escribir la palabra "main" y a
//continuacion
//pulsar "control + spacio" para que la ayuda de eclipse nos lo autocomplete.

	public static void main(String[] args) {
		/*
		 * Un programa en java empieza en la linea siguiente al metodo "main" y acaba
		 * cuando salga de dicho metodo, Notese que los metodos siempre tienen bloques
		 * asociados, los bloques de un metodo estan delimitados por los simbolos "( )"
		 * 
		 * Los programas en java se ejecutan de manera SECUENCIAL (bueno, y emn todos)
		 * es decir, van linea a linea ejecutando las sentencias que se van encontrando
		 * Una sentencia es un comando, una orden o una instruccion que le damos al
		 * programa.
		 * 
		 * La sentencia más simple que podemos ejecutar en java, es la de imprimir por
		 * pantalla
		 * 
		 */
		System.out.println("Este literal se imprimirá por pantalla cuando lo ejecutemos");
		/*
		 * Notese que la sentencias de arriba imprime por pantalla y LUEGO hace un salto
		 * de linea Si queremos imprimir por pantalla SIN hacer un salto de linea,
		 * usaremos la sentencia:
		 */
		System.out.print("Esto seria imprimir sin salto de linea");
		System.out.println(" Podemos observar como lo imprime seguido");
		System.out.println("Ahora lo imprimimos seguido");

		/*
		 * Es muy importante que seais ordenados en el codigo FUNDAMENTAL, debeis de
		 * respetar la tabulacion, los saltoa de le linea, etc.
		 * 
		 * Eclipse tiene una manera para ayudaros a mantener el orden, siempre que el
		 * codigo no contenga errores. Para ello seleccionamos todo el codigo que
		 * queremos poner el orden, con el raton o podemos pulsar "command + a", a
		 * continuacion pulsamos el boton derecho y vamos a "source" y luego "format"
		 * 
		 * Ojo!! Siempre que cambiemos algo de nuestreo codigo debemos de guardarlo para
		 * que el compilador de Java se de cuenta de dichos cambios. Podemos guqrdar los
		 * cambios con "command + s"
		 * 
		 * importante! Si cometemos un error al escribir codigo, nos dara un error en
		 * tiempo de compulacion, y probablemente no se permita la ejecucion Por
		 * ejemplo, si no ponemos ";" al final de una sentencia, o escribimos mal el
		 * nombre de una sentencia... Hay muchas maneras de cometer estos errores.
		 * Poniendo el cursos del raton sobre el error podemos intentar sacar
		 * informacion del mismo
		 */

	}// Fin del metodo " main". Aqui acabaria nuestro programa de Java
		// Las sentencias van siempre dentro de metodos! Si poneis sentencias fuera de
		// los metodos
		// no va a funcionar
}// Fin de la clase
