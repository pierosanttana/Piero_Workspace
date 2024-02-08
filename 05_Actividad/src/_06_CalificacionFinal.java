
import java.util.Scanner;

public class _06_CalificacionFinal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Un alumno desea saber cuál será su calificación final en la materia de  \n"
				+ "Entornos de Desarrollo");
		System.out.println("--------------------------------------------------------------");
		System.out.println("Dicha calificación se compone de los siguientes porcentajes: \n"
				+ "* 55% del promedio de sus tres calificaciones parciales. \n"
				+ "* 30% de la calificación del examen final. \n"
				+ "* 15% de la calificación de un trabajo final. ");
		System.out.println("--------------------------------------------------------------");

		
		System.out.println("Ingresa la calificacion de su primer parcial:");
		double p1 = scanner.nextDouble();
		
		System.out.println("Ingresa la calificacion de su segunda parcial:");
		double p2 = scanner.nextDouble();
		
		System.out.println("Ingresa la calificacion de su tercer parcial:");
		double p3 = scanner.nextDouble();
		
		double promedioParciales = (p1 + p2 + p3) / 3;
		double porcentaje55 = promedioParciales * 0.55;
		
		System.out.println("Ingresa la calificacion de su examen final:");
		double examenFinal = scanner.nextDouble();
		double porcentaje30 = examenFinal * 0.30;
		
		System.out.println("Ingresa la calificacion de su trabajo final:");
		double trabajoFinal = scanner.nextDouble();
		double porcentaje15 = trabajoFinal * 0.15;
		
		double calificacionFinal = porcentaje55 + porcentaje30 + porcentaje15;
		
		System.out.println("La calificacion final del alumno es: "+ calificacionFinal);
		
		
		
		

	}

}
