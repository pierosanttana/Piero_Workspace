
public class Funciones_08 {

	public static void main(String[] args) {
		
		//calificacionFinal(parcial1,parcial2,parcial3,examenFinal,trabajoFinal)
		
		double estudianteA = calificacionFinal(7.4, 8, 7.2, 9.2, 8.6);
		System.out.println(estudianteA);
		
		double estudianteB = calificacionFinal(4.5, 9, 7.2, 8.3, 5);
		System.out.println(estudianteB);
	}
	public static double calificacionFinal (double parcial1, double parcial2,
			double parcial3, double examenFinal, double trabajoFinal ) {
		
		double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
		double porcentaje55 = promedioParciales * 0.55;
		
		double porcentaje30 = examenFinal * 0.30;
		
		double porcentaje15 = trabajoFinal * 0.15;
		
		double calificacionFinal = porcentaje55 + porcentaje30 + porcentaje15;
		 
		return calificacionFinal;
	}
	

}
