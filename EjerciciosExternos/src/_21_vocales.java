
public class _21_vocales {

	public static void main(String[] args) {
	
	String frase = "Del siguiente String «La lluvia en Sevilla es una maravilla» +"
			+ "cuenta cuantas vocales hay en total (recorre el String con charAt).";
	
	int contadorVocales = 0;
	for (int i = 0; i < frase.length(); i++) {
		
	//	if(frase.charAt(i)== 'a') {
	//		contadorVocales++;
	//	}
		
		switch (frase.toLowerCase().charAt(i)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			contadorVocales++;
			break;
		}
		
	}
	System.out.println("Número de vocales: " + contadorVocales);

	}

}
