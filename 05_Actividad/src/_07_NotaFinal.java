
import java.util.Scanner;

public class _07_NotaFinal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("calcular la nota final de un estudiante, considerando que: \n"
		+ "Por cada respuesta correcta 5 puntos \n"+
		"por una incorrecta -1\n"
		+ "y por respuestas en blanco 0. ");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Total de preguntas: 10");

	System.out.println("Escribe en numeros cuantas respuestas correctas obtuvo:");
	int correctas = scanner.nextInt() * 5;
	
	System.out.println("Escribe en numeros cuantas respuestas incorrectas obtuvo:");
	int incorrectas = scanner.nextInt();
	
	System.out.println("Escribe en numeros cuantas respuestas en blanco obtuvo:");
	int blanco = scanner.nextInt();
	
	int notaFinal = correctas - incorrectas;
	
	System.out.println("La nota final es: "+ notaFinal+"/50");
	
	}

}
