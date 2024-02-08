
public class _01_Variables {
	public static void main(String[] args) {

		int x;	// declaration

		x = 33; // assignment
				
		int y = 22; // initialization
		
		//declaration + assignment = initialization
		
		System.out.println("x"); //imprime una 'x' como String por estar entre ""
		//No imprime el valor de la variable 'x'

		System.out.println(x); //Imprime el valor de la variable 'x'
		
		System.out.println(x + "y"); // imprime el valor de 'x' y el String 'y' osea '33y' 

		System.out.println(x + y); // Imprime la suma de las variables 'x' 'y'

		float a = 1.12345679f; //Es un numero decimal con maximo 8 caracteres.
		double b = 3.1234567890123456789; //Es un numero decimal con maximo 16 caracteres.
		boolean c = true; //Su valor solo puede ser 'true' o 'false'
		String name = "Piero"; //Su valor es una cadena de texto.
		char symbol = '$'; //Su valor solo puede ser 1 letra/simbolo o caracter.
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(name);
		System.out.println(symbol);
		System.out.println(name.length()); //Imprime en numeros la longitud del 'String'
		System.out.println(name.toUpperCase()); // Convierte el texto en mayusculas
		
		int num1 = 10; //Su valor es un numero entero corto.
		long num2 = 5L; //Su valor es un numero entero largo.

		System.out.println("El resultado de la suma es " + (num1 + num2));
		System.out.println("El resultado de la resta es " + (num1 - num2));
		System.out.println("El resultado de la multiplicacion es " + (num1 * num2));
		System.out.println("El resultado de la division es " + (num1 / num2));

		
	}
}
