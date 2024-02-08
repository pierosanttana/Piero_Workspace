
public class _00_Conversiones {

	public static void main(String[] args) {
		
		// 1. Conversión de Enteros a Flotante:
		int numeroEntero = 123;
		float numeroFlotante = 0.0F;
		numeroFlotante = numeroEntero;
			System.out.println(numeroFlotante);
			
		//No hace falta hacer un 'casting'
		//Al ser numero Entero no tiene valores decimales, no pierde informacion.
		
		
		// 2. Conversión de Flotantes a Enteros: 
		
		numeroFlotante = 123.45F;
		numeroEntero = (int)numeroFlotante;
			System.out.println(numeroEntero);
			
		//Si hace falta hacer un casting para que no de un error.
		//Si hemos perdido informacion.
		
		
		// 3. De Double a Enteros
	
		double numeroDouble = 1.234567890;
		numeroEntero = (int)numeroDouble;
			System.out.println(numeroEntero);
		
		//Si hace falta hacer casting para convertir
		//Si se pierde la informacion de los decimales.
		
		//4. Enteros a Double
		
		numeroEntero = 9_999_999;
		numeroDouble = numeroEntero;
		System.out.println(numeroDouble);
		
		//No hace falta hacer casting 
		//Y no se pierde informacion 
		
		//5. Caracteres char a Enteros
		
		char unCaracter = 'A'; //
		numeroEntero = unCaracter;
		System.out.println(numeroEntero);
		//Si se puede realizar la operacion
		//No hace falta hacer casting
		//No se pierde informacion pero se convierte en codigo ASCII
		
		//6. Entero a Caracteres char
		
		numeroEntero = 83;
		unCaracter = (char)numeroEntero;
		System.out.println(unCaracter);
		//Si se puede realizar la operacion
		//Si hace falta hacer casting 
		//Pierde su valor
		//Lo convierte en un Caracter ASCII que tenga el valor del entero.
		
		
		//7. Cadenas a Entero
		
		String cadenaTexto = "Hola";
		//numeroEntero = (int)cadenaTexto;
		
		//No se puede realizar la operacion
		//Aunque se haga casting da error
		
		//8. Cadenas String a Caracteres char
		
		cadenaTexto = "A";
		//unCaracter = (char)cadenaTexto;
		
		//No se puede realizar la operacion
		//Aunque se haga casting da error
	
		
		long l1 = 0;
		int i1 = 0;
		byte b1 = 0;
		
		double d1 = 0;
		float f1 = 0;
		
		char c1 = 'a';
		
		
		l1 = i1;
		l1 = b1;
		//l1 = d1;
		//l1 = f1;
		l1 = c1;
		
		//i1 = l1;
		i1 = b1;
		//i1 = d1;
		//i1 = f1;
		i1 = c1;
		
		/*	b1 = l1;
			b1 = i1;
			b1 = d1;
			b1 = f1;
			b1 = c1;
		*/
		d1 = l1;
		d1 = i1;
		d1 = b1;
		d1 = f1;
		d1 = c1;
		
		f1 = l1;
		f1 = i1;
		f1 = b1;
		//f1 = d1;
		f1 = c1;
		
		char c2 = 'a';
		
			int l3 = c2;
			System.out.println(l3);
		
			
		int entero = 10;
		double decimal = 11.20;
		
		
	}

}
