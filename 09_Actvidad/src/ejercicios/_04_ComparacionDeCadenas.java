package ejercicios;

import java.util.Scanner;

public class _04_ComparacionDeCadenas {
	/*
	 * Comparación de Cadenas:
	 * Escribe un programa que pida al usuario 
	 * su nombre de usuario y su password. 
	 * El programa mostrará "bienvenido a nuestro programa" 
	 * si el usuario es igual a "Capi" y 
	 * el password es igual a "odioAironMan69", en caso contrario 
	 * el programa mostrará "Usuario o password incorrecto". 
	 * En el caso del usuario, puede ser igual sin tener en cuenta 
	 * mayúsculas o minúsculas, pero en el caso del password tiene 
	 * que ser exactamente igual. Además, se debe de eliminar todos 
	 * los espacios que haya a derecha y a izquierda tanto para el 
	 * usuario como para el password.
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Comparación de Cadenas");
		System.out.println("-----------------------");
		
		String usuario = "Capi";
		String password = "odioAironMan69";
		boolean iniciarSesion;
		
		do {
			iniciarSesion = false;
			
			System.out.println("Ingresa el usuario: ");
			String usuarioIngresado = scanner.nextLine();
			String usuarioSinEspacios = usuarioIngresado.trim();
			
			System.out.println("Ingresa el password: ");
			String passwordIngresado = scanner.nextLine();
			String passwordSinEspacios = passwordIngresado.trim();
		
		if(usuarioSinEspacios.equalsIgnoreCase(usuario) && passwordSinEspacios.equals(password)) {
			System.out.println("¡Bienvenido a nuestro programa!");
		}else {
			System.out.println("Usuario o password incorrecto.");
			iniciarSesion = true;
		}
		}while(iniciarSesion);


	}

}
