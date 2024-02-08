
public class _04_NumeroMayor {

	public static void main(String[] args) {
		
		int numero = 3;

		System.out.println((numero < 0) ? "Es menor a 0" : "Es mayor a 0");
		
		String cadena = (numero < 0) ? "Es menor a 0" : "Es mayor a 0";
		System.out.println(cadena);
		
		boolean mayor = (numero < 0) ? false : true ;
		System.out.println(mayor);
		
		int numerito = (numero < 0) ? numero - numero : numero + numero ;
		System.out.println(numerito);
		
		char boleano = (numero < 0) ? 'V' : 'F';
		System.out.println(boleano);
		
	}

}
