import java.util.Scanner;
import java.lang.Math;

public class _18_ejemplo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("NUMEROS RANDOM");
		System.out.println("Introduce un número:");
		int min = scanner.nextInt();
		
		System.out.println("Introduce otro número:");
		int max = scanner.nextInt();
		int rango = 0;
		
		if(min < max) {
			rango = max - min + 1;
			for(int i = 0; i < 10; i++) {
			int numeroRandom =(int) (Math.random() * rango) + min;
			System.out.println(numeroRandom);
			}
		}else if (min > max) {
			rango = min - max + 1;
			for(int i = 0; i < 10; i++) {
			int numeroRandom =(int) (Math.random() * rango) + max;
			System.out.println(numeroRandom);
		}
	
		}

	}

}
