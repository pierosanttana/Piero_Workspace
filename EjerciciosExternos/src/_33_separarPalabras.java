
public class _33_separarPalabras {

	public static void main(String[] args) {
		
		String cadena = "La lluvia en Sevilla es una maravilla";
		
		String[] arrayCadena = cadena.split(" ");
		
		for (String string : arrayCadena) {
			System.out.println(string);
		}
	}

}
