import java.util.Scanner;

public class _16_ejemplo {

	public static void main(String[] args) {
		
		// String password = "EUREKA99";
		
		Scanner scanner = new Scanner(System.in);
		
	
	  	String intento = "";
		int i = 0;
		
		do {
			i++;
			//System.out.println("Intento " + i + " de 3");
			System.out.println("Escribe la contraseña:");
			intento = scanner.nextLine();
			switch (intento){
			case "EUREKA":
				i = 3;
				System.out.println("Contraseña correcta.");
				break;
			default:
			//	System.out.println("----------------------");
			//	System.out.println("Contraseña incorrecta.");
			//	System.out.println("----------------------");
			}
		}while(i < 3); 
		
		
		String contraseña = "eureka";
		int intentos = 3;
		String password;
		boolean acierto = false;
		
		for( i = 0; i < 3 && !acierto ; i++) {
			System.out.println("Introduce la contraseña");
			password = scanner.nextLine();
			if(password.equals(contraseña)){
				System.out.println("Enhorabuena");
				acierto = true;
			}
		}
		
	}

}
