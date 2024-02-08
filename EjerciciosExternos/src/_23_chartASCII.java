
public class _23_chartASCII {

	public static void main(String[] args) {
		String frase = "Del siguiente String «La lluvia en Sevilla es una maravilla» +"
				+ "cuenta cuantas vocales hay en total (recorre el String con charAt)";
		
		for (int i = 0; i < frase.length(); i++) {
			int ascii = frase.charAt(i);
			System.out.print(ascii + " ");
		}

	}

}
