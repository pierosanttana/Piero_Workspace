import java.util.Scanner;

public class _12_LogicalOperators {
 
	public static void main(String[] args) {
		
		/*
		 * Logical Operators = Se pueden usar para conectar
		 * dos o más expresiones
		 * 
		 * 		&& = (AND) Para que la declaracion sea Verdadera
		 * 		 ambas condiciones deben ser verdaderas
		 * 		|| = (OR) Para que la declaracion sea Verdadera
		 * 			almenos una de las codiciones es verdadera 
		 * 		!  = (NOT) Invertira el valor booleano de una condicion
		 */
		
		//Ejemplo de && (AND)
		int temp = 19;
		
		if(temp>30) {
			System.out.println("It is hot outside");
		}
		else if (temp>=20 && temp<=30) {
			System.out.println("It is warm outside");
		}
		else {
			System.out.println("It is cold outside");
		}
		
		//Ejemplo de ||(OR)
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You are playing a game! Press q or Q to quit");
		String response = scanner.next();
		
		if (response.equals("q") || response.equals("Q")) {
			System.out.println("You quit the game");
		}
		else {
			System.out.println("You are still playing the game");
		}
		
		//Ejemplo de ! (NOT)
		if (!response.equals("q") && !response.equals("Q")) {
			System.out.println("You are still playing the game");
		}
		else {
			System.out.println("You quit the game");
		}
		
		
		
	}
}
