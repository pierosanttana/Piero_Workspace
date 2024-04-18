package actividad;

import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Scanner;

public class MainEmpleados {
	
	public static ArrayList<Empleado> listaGeneral;

	static Scanner scanner;

	public static void main(String[] args) {

		menu();

	}

	private static void menu() {
		scanner = new Scanner(System.in);
		String opcion = "";

		ArrayList<Empleado> listaGeneral = new ArrayList<Empleado>();

		do {
			System.out.println(" --------------------------------------");
			System.out.println("|[1] Dar de alta un Empleado           |");
			System.out.println("|[2] Mostrar Empleados                 |");
			System.out.println("|[3] Mostrar Salario                   |");
			System.out.println("|[4] Coste total Empresa               |");
			System.out.println("|[0] Salir del programa                |");
			System.out.println(" --------------------------------------");
			System.out.println("Eligue una opción: ");

			opcion = scanner.nextLine();

			switch (opcion) {
			case "1":
				darDeAltaEmpleado(listaGeneral);
				break;
			case "2":
				mostrarEmpleados(listaGeneral);
				break;
			case "3":
				mostrarSalarioEmpleado(listaGeneral);
				break;
			case "4":
				costeTotalEmpresa(listaGeneral);
				break;
			case "0":
				System.out.println("Programa terminado.");
				break;
			default:
				System.out.println("La opción no es valida.");
				break;
			}
		} while (!opcion.equals("0"));
	}

	private static void darDeAltaEmpleado(ArrayList<Empleado> listaGeneral) {
		scanner = new Scanner(System.in);

		String opcion = "";

		do {
			System.out.println(" ------------------------");
			System.out.println("|     DAR DE ALTA        |");
			System.out.println("|[1] Programador         |");
			System.out.println("|[2] Jefe de Proyecto    |");
			System.out.println("|[3] Director            |");
			System.out.println("|[0] Salir del programa  |");
			System.out.println(" ------------------------");
			System.out.println("Eligue una opción: ");

			opcion = scanner.nextLine();

			switch (opcion) {
			case "1":
				listaGeneral.add(darDeAltaProgramador());
				break;
			case "2":
				listaGeneral.add(darDeAltaJefeDeProyecto());
				break;
			case "3":
				listaGeneral.add(darDeAltaDirector(listaGeneral));
				break;
			case "0":
				break;
			default:
				System.out.println("opción incorrecta");
				break;
			}
		} while (!opcion.equals("0"));
	}

	private static Programador darDeAltaProgramador() {
		Programador programador = new Programador();

		System.out.println("- Alta Programador -");

		programador.setNombre(pedirNombre());
		programador.setDni(pedirDni());
		programador.setSueldoBase(pedirSueldo());

		return programador;
	}

	private static JefeDeProyecto darDeAltaJefeDeProyecto() {
		JefeDeProyecto jefe = new JefeDeProyecto();

		System.out.println("- Alta Jefe de Proyecto -");

		jefe.setNombre(pedirNombre());
		jefe.setDni(pedirDni());
		jefe.setSueldoBase(pedirSueldo());
		jefe.setIncentivo(pedirIncentivo());

		return jefe;

	}

	private static Director darDeAltaDirector(ArrayList<Empleado> listaGeneral) {
		Director director = new Director();

		director.setNombre(pedirNombre());
		director.setDni(pedirDni());
		director.setSueldoBase(pedirSueldo());
		director.setListaEmpleados(seleccionarEmpleado(listaGeneral));

		return director;

	}

	private static ArrayList<Empleado> seleccionarEmpleado(ArrayList<Empleado> listaGeneral) {
		ArrayList<Empleado> listaEmpleadosDelDirector = new ArrayList<Empleado>();
		String opcion = "";
		
		do {
			System.out.println("Seleciona un Empleado o pulsa 's' para Salir");
			mostrarEmpleados(listaGeneral);
			opcion = scanner.nextLine();
			
			if (!opcion.equalsIgnoreCase("s")) {
				int iOpcion = Integer.parseInt(opcion);
				listaEmpleadosDelDirector.add(listaGeneral.get(iOpcion));
			}
			
		} while (!opcion.equalsIgnoreCase("s"));

		return listaEmpleadosDelDirector;
	}

	private static void mostrarEmpleados(ArrayList<Empleado> listaGeneral) {
		int contador = 0;
		for (Empleado empleado : listaGeneral) {
			System.out.println("[" + contador++ + "]" + empleado);
		}

	}

	private static void mostrarSalarioEmpleado(ArrayList<Empleado> listaGeneral) {

		mostrarEmpleados(listaGeneral);
		
		System.out.println("Elige un empleado: ");
		String sOpcion = scanner.nextLine();
		int iOpcion = Integer.parseInt(sOpcion);

		System.out.println(listaGeneral.get(iOpcion).SalarioTotal());

	}

	private static void costeTotalEmpresa(ArrayList<Empleado> listaGeneral) {

		double costeTotal = 0;
		for (Empleado empleado : listaGeneral) {
			costeTotal += empleado.SalarioTotal();
		}
		System.out.println("El coste total de salarios es: " + costeTotal + "€");

	}
	

	private static double pedirSueldo() {
		System.out.println("Ingresa el sueldo:");
		String sueldo = scanner.nextLine();
		double iSueldo = Integer.parseInt(sueldo);
		return iSueldo;
	}

	private static String pedirDni() {
		System.out.println("Ingresa el dni:");
		String dni = scanner.nextLine();
		return dni;
	}

	private static String pedirNombre() {
		System.out.println("Ingresa un nombre:");
		String nombre = scanner.nextLine();
		return nombre;
	}
	

	private static double pedirIncentivo() {
		System.out.println("Ingresa la cantidad de incentivo:");
		String incentivo = scanner.nextLine();
		double iIncentivo = Integer.parseInt(incentivo);
		return iIncentivo;
	}

}
