import java.util.Random; //Importamos la clase Random

public class _08_RandomClass {

	public static void main(String[] args) {

		Random random = new Random(); // Crear instancia de la clase 'Random' con el nombre 'random'
		//Nos generá un valor aleatorio
		//No son numeros aleatorios verdaderos
		//Son llamados Pseudoaleatorio 
		
		int x = random.nextInt(-2,2); //Inicializamos la variable entera 'x' con valor 'random'
		// y si el argumento es '10' limitará a '10' las caras del dado 
		//donde generá un valor aleatorio entre el '0' y '9',  
		System.out.println(x);
		
		float y = random.nextFloat(2); // Inicializamos la varibable float donde nos da numeros decimales 
		// aleatorios desde el 0.0 a 0.99, si ponemos de argumento '2' nos dara un entero aleatorio con 
		//decimales aleatorios desde 0.0 a 1.99
		System.out.println(y);
		
		double w = random.nextDouble(2); // La variable double nos dará lo mismo que float pero con 
		//decimales mucho más largos
		System.out.println(w);
		
		boolean z = random.nextBoolean(); //Dara de valor aleatorio 'true' o 'false'
		System.out.println(z);
		
		//String a = random.toString();
		//System.out.println(a);
		
	}

}
