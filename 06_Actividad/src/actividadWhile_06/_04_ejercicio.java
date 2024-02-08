package actividadWhile_06;

public class _04_ejercicio {

	public static void main(String[] args) {
		
		int numero = 1;
		int sumaTotal = 0;
		
		while(numero <= 100) {
			sumaTotal = sumaTotal + numero;
			numero++;
		}
		System.out.println(sumaTotal);
	}

}
