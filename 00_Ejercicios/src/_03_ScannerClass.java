import java.util.Scanner; //Importamos el Scanner se encuentra
//dentro del paquete de utilidades de JAVA.

public class _03_ScannerClass {

	public static void main(String[] args) {
	
		Scanner nameScanner = new Scanner(System.in); 
			System.out.println("What is your name?"); //imprimimos la pregunta
			String name = nameScanner.nextLine(); //el valor string será la respuesta
			
			
			System.out.println("How old are you?"); //Pregunta de edad
			int age = nameScanner.nextInt(); // el valor int será la respuesta
			nameScanner.nextLine();
			
			System.out.println("What is your favorite food?"); //pregunta
			String food = nameScanner.nextLine(); //valor respuesta
			
			System.out.println("Hello "+name); //Imprimimos un saludo con la respuesta
			System.out.println("you are "+age+" years old"); //imprime frase con la repuesta
			System.out.println("and you like "+food);
	
		
	}

}
