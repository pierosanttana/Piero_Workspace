package _01_Coche;

public class RegistroDeCoches {

	public static void main(String[] args) {
		
		Coche coche01 = new Coche();
		coche01.marca = "Toyota";
		coche01.modelo = "Yaris Sedán";
		coche01.matricula = "1234 BCD";
		coche01.peso = 1035;
		coche01.antiguedad = 14;
		coche01.esElectrico = true;
		
		Coche coche02 = new Coche();
		coche02.marca = "Toyota";
		coche02.modelo = "Corolla HEV";
		coche02.matricula = "2345 CDE";
		coche02.peso = 1360;
		coche02.antiguedad = 4;
		coche02.esElectrico = true;
		
		Coche coche03 = new Coche();
		coche03.marca = "Toyota";
		coche03.modelo = "Raize";
		coche03.matricula = "3456 CDF";
		coche03.peso = 1680;
		coche03.antiguedad = 6;
		coche03.esElectrico = false;
		
		Coche coche04 = new Coche();
		Coche coche05 = new Coche();
		Coche coche06 = new Coche();
		
		
		imprimirInformacion(coche01);
		imprimirInformacion(coche02);
		imprimirInformacion(coche03);
		imprimirInformacion(coche04);
		imprimirInformacion(coche05);
		imprimirInformacion(coche06);
		
		System.out.println(coche01);
		
		cambiarPeso(coche06);
		System.out.println(coche06.peso);
		
		

		imprimirInformacion(new Coche());
	}

	public static void cambiarPeso(Coche coche) {
		coche = new Coche();
		coche.peso = 100;
	}


	private static void imprimirInformacion(Coche coche) {
		
		System.out.println("Marca: " + coche.marca);
		System.out.println("Modelo: " + coche.modelo);
		System.out.println("Matricula: " + coche.matricula);
		System.out.println("Peso: " + coche.peso);
		System.out.println("Antiguedad: " +coche.antiguedad);
		System.out.println("Es electrico?: " + coche.esElectrico);
		System.out.println();
		
	}
	


}
