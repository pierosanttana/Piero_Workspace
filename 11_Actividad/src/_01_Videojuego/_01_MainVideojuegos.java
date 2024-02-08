package _01_Videojuego;

import java.util.Scanner;

public class _01_MainVideojuegos {

	public static void main(String[] args) {
		
		Videojuego vd1 = new Videojuego();
		
		Videojuego vd4 = new Videojuego(null, null);
		Videojuego vd2 = new Videojuego("Call of Duty", "10/12/1993");
		
		Videojuego vd3 = new Videojuego(299, "God of War", 6, 75, "25/01/2005", true);
		
		System.out.println(vd3.precioConDescuento());
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("BIENVENIDO");
		
		System.out.println("---- Primer Objeto ----");
		System.out.println("Ingresa el nombre del videojuego:");
		vd1.nombre = scanner.nextLine();
		
		System.out.println("Ingresa la fecha de creación del videojuego en formato DD/MM/YYYY:");
		vd1.fechaCreacion = scanner.nextLine();
		
		System.out.println("Ingresa el id del videojuego:");
		vd1.id = scanner.nextInt();
		
		System.out.println("Ingresa 'True' o 'False', si el videojuego es de segunda mano:");
		vd1.esSegundaMano = scanner.nextBoolean();
		
		System.out.println("Ingresa la puntuación del videojuego:");
		vd1.puntuacion = scanner.nextFloat();
		
		System.out.println("Ingresa el precio del videojuego:");
		vd1.precio = scanner.nextFloat();
		
		System.out.println("---- Primer Objeto ----");
		invocarMetodos(vd1);
		
		System.out.println("---- Segundo Objeto ----");
		invocarMetodos(vd2);
		
		System.out.println("---- Tercer Objeto ----");
		invocarMetodos(vd3);
		
		compararPrecios(vd1,vd2);
		compararPrecios(vd2,vd3);
		compararPrecios(vd1, vd3);
	 	
	}
	
	public static void compararPrecios(Videojuego videojuego1, Videojuego videojuego2) {
		System.out.println( videojuego1.nombre + " es mas caro que " + videojuego2.nombre + "?");
		System.out.println( videojuego1.esMasCaro(videojuego2));
		
	}

	public static void invocarMetodos(Videojuego videojuego) {
		System.out.println();
		videojuego.mostrarDatos();
		videojuego.cambioFormatoFecha();
		videojuego.esApto();
		videojuego.mostrarNombreYPuntuacion();
		videojuego.mostrarNumNaturales();
		videojuego.mostrarPrecioEnLibras();
		System.out.println("Precio con descuento: " + videojuego.precioConDescuento() + "€");
		System.out.println();
	}
	
	

}
