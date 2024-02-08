
public class _09_IfStatement {

	public static void main(String[] args) {
		
		// La declaracion 'if' = Ejecuta un bloque de codigo si se evalúa como verdadera.
		
		int age = 19;
		
		if (age >= 65) { // declaracion 'age >= 65'
			System.out.println("Ok Boomer!"); // Si lo evaluado es verdadero se ejecuta este codigo
		}
		else if (age >= 18) { //si la declaracion anterior no es verdadera, comprobará esta
			System.out.println("You are an adult!");
		}
		else if (age >= 13) {
			System.out.println("You are a teenager!");
		}
		else {
			System.out.println("You are not an adult!"); //si la declaracion es falsa, se ejecuta este codigo
		}
		
		
		int time = 23;
		String result =(time < 13) ? "Good day." : "Good evening."; 
		//Si 'result' es true, imprimira "Good day" sino "Good evening"
		System.out.println(result); 
	}

}
