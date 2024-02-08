import java.util.Scanner;

public class _07_EntradaSalida {

	public static void main(String[] args) {
		
		
		
		/*
		 * Es muy habitual en las app tener entradas de datos del usuario 
		 * y salidas de datos una vez procesada la informacion
		 * 
		 * En java tenemos dos maneras de presentar la informacion:
		 * 1. System.out -> Salida estandar de consola
		 * 2. System.err -> Salida de errores de consola
		 */
		
		//Una vez que trabajemos con una salida, podemos usar algun metodo
		//para imprimir por ella, como por ejemplo el metodo "println"
		System.out.println("Salida estandar de consola");
		System.err.println("Salida de errores de consola"); //syserr
		
		/*
		 * Ojo: System.out y System.err trabajan con flujos diferentes
		 * de salidas, por lo tanto si dos sentencias estan muy juntas
		 * puede que salgan de manera diferente
		 * 
		 * En java tenemos una manera de recoger informacion a traves de 
		 * la consola, y es mediante "System.in"
		 * Lamentablemente debemos de apoyarnos en otras clases para poder
		 * recoger la informacion a partir de este "System.in"
		 * El caso más habitual es mediante la clase "Scanner"
		 * 
		 * Para ello debemos de crearnos una variable de tipo Scanner y 
		 * su correspondiente Objeto, diciendole que lea de "System.in"
		 * Para utilizar esta clase debemos de importar el paquete donde 
		 * se encuentre, y las importaciones de paquetes se ponen al 
		 * principio de la clase
		 * Ej: import java.util.Scanner;
		 * El concepto de paquete es muy similar al concepto de directorios
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Una vez creada la variable y el objeto podemos empezar a usar 
		 * metodos del objeto para capturar la informacion. Los metodos son
		 * funcionanlidades que pueden aplicar los objetos
		 * Invocamos un metodo de un objeto mediante el operador "."
		 * 
		 * Mediante el medoto "nextLine()" (Notese como hay parentesis al final)
		 * El programa se quedara parado en esa linea hasta que el usuario 
		 * introduzca una frase para leer y pulse "enter".
		 * 
		 */
		
		System.out.println("Introduzca una frase para leer:");
		/*
		 * Normalmente, el valor que introduzca el usuario debemos 
		 * de almacenarla en algun lugar, como puede ser una variable.
		 * En este caso como queremos leer una frase, vamos a utilizar
		 * un "String"
		 * El metodo "nextLine()" devuelve un String, es por ello que usamos una
		 * variable "String" para almacenar el resultado
		 */
		String frase = sc.nextLine();
		System.out.println("El usuario a introducido la frase: "+ frase);
		
		//Una vez creado el "Scanner" no es necesario crearlo más
		System.out.println("Introduzca una frase para leer:");
		frase = sc.nextLine();
		System.out.println("La segunda frase introducida por el usuario es:" + frase);
		
		System.out.println("Introduzca un numero:");
		String s1 = sc.nextLine();
		
		System.out.println("Introduzca otr numero:");
		String s2 = sc.nextLine();
		
		String s3 = s1 + s2; // concatenando
		System.out.println("La concatenacion de s1 y s2 es: " + s3);
		
		/*
		 * La clase "Scanner" tiene metodos para recoger distintos tipos de datos 
		 * si queremos recoger un entero, debemos utilizar "nextint()"
		 * No podemos guardar un "int" en una variable "String"
		 * String s4 = 4; //Error
		 */
		
		System.out.println("introduzca un numero:");
		int n1 = sc.nextInt();
		
		System.out.println("introduzca otro numero:");
		int n2 = sc.nextInt();
		
		int n3 = n1 + n2; //Suma
		
		System.out.println("El resultado de la suma de n1 y n2 es: " + n3);
		
		//Otros metodos
		System.out.println("Introduzca un long:");
		long l1 = sc.nextLong();
		System.out.println("El numero long es: " + l1);
		
		System.out.println("Introduzca un double (el punto flotante debe separarse por una coma ','):");
		double d1 = sc.nextDouble();
		System.out.println("El numero double es: " + d1);
		
		System.out.println("Introduzca un float(el punto flotante debe separarse por una coma ',')");
		float f1 = sc.nextFloat();
		System.out.println("El numero float es: " + f1);
		
		//String c0 = sc.nextInt();
		
		System.out.println("introduce un numero o una letra;");
		char c1 = sc.next().charAt(0);
		System.out.println("Esto es un char " + c1);
		
		
		int int1 = 1234567890;
		long long1 = 1234567890;
		float float1 = 12.234F;
		double double1 = 12.234567;
		char char1 = 'a';
		String string1 = "a";
		
		
		int1 = (int)long1;
		long1 = int1;
		int1 = (int)float1;
		float1 = int1;
		float1 = (float)double1;
		double1 = float1;
		double1 = int1;
		int1 = char1;
		char1 = (char)int1;
		System.out.println(char1);
		char1 = (char)long1;
		char1 = (char)float1;
		//char1 = (char)string1;
		
		
		
		
		
	}

}
