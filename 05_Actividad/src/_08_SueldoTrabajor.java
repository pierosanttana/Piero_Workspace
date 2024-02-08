
import java.util.Scanner;

public class _08_SueldoTrabajor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vamos a calcula el sueldo de un trabajador, cuyo valor es su sueldo base  \n"
				+ "más un número de horas extra trabajadas.");
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Ingresa el sueldo base:");
		double sueldoBase = scanner.nextDouble();
		
		System.out.println("Importante: Cada hora extra son 40€ \n"
			+ "Ingresa el numero de horas extras trabajadas:");
		double horasExtras = scanner.nextDouble();
		
		double TotalExtras = horasExtras * 40;
		double sueldoTotal = sueldoBase + TotalExtras;
		
		System.out.println("El sueldo del trabajor a final de mes es: "+ sueldoTotal);

	}

}
