package actividad_05;

public class _07_ejercicio {

	public static void main(String[] args) {
		
		int sumaTotal = 0;
		
		for(int i = 0; i <= 50; i +=2) {
			System.out.println(i);
			sumaTotal += i;
		}
		System.out.println("La suma total de los numeros pares del 1 al 50 es: "+sumaTotal);
	}

}
