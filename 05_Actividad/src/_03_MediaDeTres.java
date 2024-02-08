
import java.util.Scanner;

public class _03_MediaDeTres {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos a calcular la media de tres números.");
		System.out.println("Ingresa el primer numero:");
		double n1 = scanner.nextDouble();
		
		System.out.println("Ingresa el segundo numero:");
		double n2 = scanner.nextDouble();
		
		System.out.println("Ingresa el tercer numero:");
		double n3 = scanner.nextDouble();
		
		double media = (n1 + n2 + n3)/3;
		
		System.out.println("La media de los tres numeros es: "+media);
		
	}
}
