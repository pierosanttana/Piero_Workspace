
public class _22_reemplazoVocal {

	public static void main(String[] args) {
		String frase = "Del siguiente String «La lluvia en Sevilla es una maravilla» +"
				+ "cuenta cuantas vocales hay en total (recorre el String con charAt)";
		
		
			String nuevaFrase = frase.replace('a', 'e');
			nuevaFrase = frase.replace('A', 'e');
			
			System.out.println(nuevaFrase);
	
	}

}
