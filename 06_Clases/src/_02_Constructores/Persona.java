package _02_Constructores;

/*
 * Siempre que queramos construir un objeto necesitamos la ayuda
 * de lo que se conoce como "Constructor"
 * 
 * Un Constructor en POO es un metodo especial el cual se usa para la creacion 
 * de los objetos. Es imperativo usar siempre algun constructor para crear un objeto.
 * 
 * En java se permite crear mas de u constructor. El constructor de un objeto en java,
 * sigue la misma regla que los métodos, es decir, la firma de un metodo o funcion
 * se puede extrapolar al constructor, pero no podemos cambiar
 * el nombre del constructor. El nombre del constructor SIEMPRE tendrá que ser 
 * el nombre de la clase. Los constructores cuando se crean no devuelven
 * NADA ni siquiera "void".
 */
public class Persona {
	
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;
	
	/*
	 * En java , si no creamos un constructor, la JM de java nos proporcionara
	 * el llamado "constructor por defecto", que es un constructor sin parametros
	 * de entrada.
	 */
	
	//El constructor por defecto es el siguiente:
	
	public Persona() {
		/*
		 * Un constructor VACIO.
		 * Este seria el constructor por defecto que crea java automaticamente
		 * OJO! Siempre y cuando NO creemos más constructores.
		 * Dicho de otra manera, si nosotros no creamos constructor, java
		 * creará el constructor por defecto, en cuando creemos un contructor java 
		 * no creara
		 * 
		 * Podemos alterar el comportamiento de un constructor
		 */
		
		System.out.println("Objeto creado");
		
		/*
		 * Normalmente podemos alterar el comportamiento de un constructor
		 * cuando queremos que todos los valores de los objetos empiecen igual
		 */
		
		edad = 18;
		/*
		 * De esta manera TODOS los objetos tendrán la edad de 18 cuando
		 * invoquemos este constructor
		 */
	}
	
	public Persona(String nombre, int edad, double peso, boolean estaCasado) {
		/*
		 * Aqui tenemos un problema, cuando declaramos una variable dentro
		 * de un constructor con el MISMO nombre que el atributo, tapamos la 
		 * visibilidad del atributo.
		 * 
		 * Aqui NO estamos accediendo al atributo 'nombre', estamos accediendo
		 * al parametro de entrada 'nombre'
		 */
		//nombre = "Felix";
		//edad = 18;
		/*
		 * Para romper esta problematica podemos usar la palabra reservada "this"
		 * 
		 * "this" es una referencia al propio objeto
		 * De momento vamos a usar "this" para acceder a los atributos de un objeto
		 */
		
		this.nombre = nombre;
		/*
		 * El primer nombre es el atributo, el segundo nombre es el parametro 
		 * de entrada
		 * 
		 * Se considera buena practica de programación referirse a los atributos
		 * con "this"
		 */
		
		this.edad = edad;
		this.peso = peso;
		this.estaCasado = estaCasado;
		
		
	}

}
