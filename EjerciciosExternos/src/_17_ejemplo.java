import java.util.Scanner;

public class _17_ejemplo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String dia;
		
		System.out.println("Escribe un dia de la semana");
		dia = scanner.nextLine();
		
		switch(dia){
			case "lunes":
			case "Lunes":
			case "Martes":
			case "martes":
			case "miercoles":
			case "Miercoles":
			case "Jueves":
			case "jueves":
			case "viernes":
			case "Viernes":
				System.out.println("Es laboral");
				break;
			case "Sabado":
			case "sabado":
			case "Domingo":
			case "domingo":
				System.out.println("No es laboral");
				break;
			default:
				System.out.println("Dia de la semana incorrecto.");
		}
	}
}
