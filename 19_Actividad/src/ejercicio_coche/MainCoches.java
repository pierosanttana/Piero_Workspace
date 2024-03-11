package ejercicio_coche;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCoches {
	
	private ArrayList<Coche> listaCoches;
	private Scanner scanner;

	public static void main(String[] args) {
		
		MainCoches main = new MainCoches();
		main.arrancarPrograma();
		
	}

	public void arrancarPrograma() {
		scanner = new Scanner(System.in);
		listaCoches = new ArrayList<Coche>();
		int option = 0;
		
		do {
			menuCoches();
			option = scanner.nextInt();
			
		switch(option) {
		case 1 :
			scanner.nextLine();
			createCoche();
			break;
		case 2 :
			showCoches();
			break;
		case 3 :
			showContadorID();
			break;
		case 4 :
			resetContadorID();
			break;
		case 0 :
			System.out.println("Fin del programa.");
			break;
		default:
		}
		}while(option != 0);
		
	}
	
	public void menuCoches(){
		System.out.println("[1] Crear coche");
		System.out.println("[2] Mostrar coches");
		System.out.println("[3] Mostrar contadorID");
		System.out.println("[4] Resetear contadorID");
		System.out.println("[0] Salir del programa");
		
	}
	
	public void createCoche() {
		Coche coche = new Coche();
		
		System.out.println("Ingresa la matricula:");
		String matricula = scanner.nextLine();
		coche.setMatricula(matricula);
		
		System.out.println("Ingresa la marca:");
		String marca = scanner.nextLine();
		coche.setMarca(marca);
		
		listaCoches.add(coche);
		
	}
	
	public void showCoches() {
		for (Coche coche : listaCoches) {
			System.out.println(coche.toString());
		}
	}
	
	public void showContadorID() {
		Coche.showContadorID();
	}
	
	public void resetContadorID() {
		Coche.resetContadorID();
	}
	
	
	
}


