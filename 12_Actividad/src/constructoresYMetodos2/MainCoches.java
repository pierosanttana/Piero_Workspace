package constructoresYMetodos2;

import java.util.Scanner;

public class MainCoches {

	public static void main(String[] args) {
		
		Coche c1 = new Coche();
		Coche c2 = new Coche(0, null, null, 0, null, 0);
		
		pedirValoresCoche(c1);
		pedirValoresCoche(c2);
		
		/*
		Coche c2 = new Coche(901, "Toyota", "Celica", 24900, "05/09/2000", 140_000);
		
		c1.id = 902;
		c1.marca = "Tesla";
		c1.modelo = "Model S";
		c1.precioBase = 55000;
		c1.fechaMatricula = "01/01/2021";
		c1.kilometros = 85_000;
		*/
		
		// Todos los datos por toString()
		System.out.println(c1);
		System.out.println(c2);
		
		// Muestra
		
		c1.mostrarPrecio();
		c2.mostrarPrecio();	
		
		c1.mostrarAnioMatricula();
		c2.mostrarAnioMatricula();
		
		c1.mostrarMatriculaBisiesto();
		c2.mostrarMatriculaBisiesto();
		
		// Devuelve
		
		System.out.println("Precio en función de los kilometros:");
		System.out.println(c1.precioPorKilometros());
		System.out.println(c2.precioPorKilometros());
		
		System.out.println("El número de kilometros es primo?");
		System.out.println(c1.kilometrosPrimo());
		System.out.println(c2.kilometrosPrimo());
	
		System.out.println("Cuantos kilómetros se faltan para llegar a los 200000 km?");
		System.out.println(c1.kilometrosPara200mil());
		System.out.println(c2.kilometrosPara200mil());
		
		System.out.println("Cuantos caracteres tienen la marca y el modelo?");
		System.out.println(c1.caracteresMarcaModelo());
		System.out.println(c2.caracteresMarcaModelo());
		
		System.out.println("Cual es la diferencia de km entre el coche y otro coche pasado por parámetro?");
		System.out.println(c1.diferenciaKilometros(c2));
		System.out.println(c2.diferenciaKilometros(c1));
		
		System.out.println("Cual es el coche más caro?");
		System.out.println(c1.esMasCaro(c2));
		System.out.println(c2.esMasCaro(c1));
		
		
		
		
		
		
	}

	public static void pedirValoresCoche(Coche coche) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el 'ID' para el coche:");
		coche.id = scanner.nextInt();
		
		System.out.println("Ingresa la 'MARCA' del coche:");
		scanner.nextLine();
		coche.marca = scanner.nextLine();
		
		System.out.println("Ingresa el 'MODELO' del coche:");
		coche.modelo = scanner.nextLine();
		
		System.out.println("Ingresa el 'PRECIO' del coche:");
		coche.precioBase = scanner.nextDouble();
		
		System.out.println("Ingresa la 'FECHA DE MATRICULA' del coche:");
		scanner.nextLine();
		coche.fechaMatricula = scanner.nextLine();
		
		System.out.println("Ingresa los 'KILOMETROS' del coche:");
		coche.kilometros = scanner.nextInt();
	}

}
