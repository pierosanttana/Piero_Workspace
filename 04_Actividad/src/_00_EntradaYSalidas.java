import java.util.Scanner;

public class _00_EntradaYSalidas {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		
		
		
		//char
		System.out.println("introduce un numero o una letra;");
		char c1 = scanner.nextLine().charAt(0); 
		//Con el .chartAt(0) solo guarda el caracter en la posicion '0' aunque
		//escriban más de un caracter
		
		
		//String
		System.out.println("Introduce tu nombre:");
		String name = scanner.nextLine();
		//Pueden escribir letras o numeros sin maximo de caracteres sin dar error.
		
		//int
		System.out.println("Introduce tu DNI sin letras:");
		int dni = scanner.nextInt();
		//Al introducir letras o espacios da error y se detiene el programa 
		
		//byte
		System.out.println("Introduce tu edad:");
		byte age = scanner.nextByte();
		//Si escriben un numero mayor a 127 da error y se detiene el programa
		
		//long
		System.out.println("Introduce tu fecha de nacimiento en numeros sin espacios EJ: 01022001");
		long date = scanner.nextLong();
		//Si ponen espacio, letras o caracteres que no sean solo numeros, da error y se detiene el programa.
		
		//float
		System.out.println("Introduce tu peso en kg usando coma ',':");
		float peso = scanner.nextFloat();
		//Si utilizan un punto '.' da error y termina el programa
		
		//boolean
		System.out.println("Eres humano? elige: true o false");
		boolean b1 = scanner.nextBoolean();
		//Solo pueden utilizar true o false
		
		
		System.out.println(c1);
		System.out.println("Te llamas "+ name + ", tienes " + age + " años de edad, "+"naciste el " + date + " y pesas " + peso + "kg");
		System.out.println("Humano:" + b1);
		
		
		

	}

}
