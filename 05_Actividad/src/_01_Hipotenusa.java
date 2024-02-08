
import java.util.Scanner;

public class _01_Hipotenusa {

	public static void main(String[] args) {
		
		float a;
		float b;
		float c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos a calcular la hipotenusa de un triángulo rectángulo");
		System.out.println("Ingresa el lado A: (Ojo: si usas decimales utiliza una coma ',')");
		a = scanner.nextFloat();
		
		System.out.println("Ingresa el lado B: (Ojo: si usas decimales utiliza una coma ',')");
		b = scanner.nextFloat();
		
		c = (float)Math.sqrt((a*a)+(b*b));
		System.out.println("Dados los lados A="+a+" y B="+b+", la hipotenusa es: "+c);
		
		scanner.close();

	}

}
