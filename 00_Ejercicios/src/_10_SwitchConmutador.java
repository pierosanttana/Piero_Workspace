
public class _10_SwitchConmutador {

	public static void main(String[] args) {
	
		//switch = Una declaracion que permite comprobar la igualdad de una
		//variable u otro valor, con una lista de valores. 
		//Se puede utilizar solo numeros enteros o String 
		//En una situacion donde utiliza muchas declaraciones 'if' 
		//podria ser mejor utilizar 'switch'
		

		String day = "Monday";
		
		switch (day) {
			case "Monday": System.out.println("It is Monday!");
			break;
			case "Tuesday": System.out.println("It is Tuesday!");
			break;
			case "Wednesday": System.out.println("It is Wednesday!");
			break;
			case "Thursday": System.out.println("It is Thursday!");
			break;
			case "Friday": System.out.println("It is Friday!");
			break;
			case "Saturday": System.out.println("It is Saturday!");
			break;
			case "Sunday": System.out.println("It is Sunday!");
			break;
			
			default : System.out.println("That not is a day."); 
			//Si no encuentra igualdad,imprimira este mensaje.
		}  

	}

}
