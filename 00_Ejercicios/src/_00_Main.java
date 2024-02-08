
public class _00_Main { //public class y el nombre de la clase

	public static void main(String[] args) {

		int numero1 = 4;
		int numero2 = 4;
		int resultado;
		
		resultado = 2 * numero1 + numero2 / 2;
		System.out.println(resultado);
		
		System.out.println("\t \"Hola Mundo\" \n ");
		//Esto es un comentario de una linea
		// \n sirve para darle un salto de linea
		// \t da tabulacion 
		// \" lo de aqui estara entre comillas dobles \"
		System.out.println("¿Todo bien?");
		/*
		 * Esto tambien es un comentario 
		 * pero de 
		 * muchas lineas
		 */
		int x;	//declaration(declaracion)
				//	+
		x = 33; //assignment (asignacion)
				// = initialization (inicializacion)
		
		System.out.println(x);
		
		int y = 22; //initialization
		
		int z = x+y; //initialization
		
		System.out.println(z);
		
		float decimalCorto = 1.14f;
		double decimalLargo = 3.14;
		boolean valorBooleano = true;
		String name = "Piero";
		char symbol = '$';
		
		System.out.println("El resultado es: "
			+ (decimalCorto+decimalLargo) + " y mi nombre es: "+ name + symbol);
		System.out.println(valorBooleano);
		
	
	}

}
