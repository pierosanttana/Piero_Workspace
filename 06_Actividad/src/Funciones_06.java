
public class Funciones_06 {

	public static void main(String[] args) {
		
		//nombreFuncion(numeroA, numeroB);
		
		int totalSuma = sumarNumeros(9,9);
		System.out.println(totalSuma);
		
		int restaTotal = restarNumeros(9,9);
		System.out.println(restaTotal);
		
		int divisionTotal = dividirNumeros(9,9);
		System.out.println(divisionTotal);
		
		int multiplicacionTotal = multiplicarNumeros(9,9);
		System.out.println(multiplicacionTotal);

		totalSuma = sumarNumeros(94,39);
		System.out.println(totalSuma);
		
		restaTotal = restarNumeros(29,39);
		System.out.println(restaTotal);
		
		divisionTotal = dividirNumeros(29,19);
		System.out.println(divisionTotal);
		
		multiplicacionTotal = multiplicarNumeros(49,69);
		System.out.println(multiplicacionTotal);
		

	}
	public static int sumarNumeros(int numeroA,int numeroB) {
		int sumarNumeros = numeroA + numeroB;
		return sumarNumeros;
	}
	public static int restarNumeros(int numeroA,int numeroB) {
		int restarNumeros = numeroA - numeroB;
		return restarNumeros;
	}
	public static int dividirNumeros(int numeroA,int numeroB) {
		int dividirNumeros = numeroA / numeroB;
		return dividirNumeros;
	}
	public static int multiplicarNumeros(int numeroA,int numeroB) {
		int multiplicarNumeros = numeroA * numeroB;
		
		return multiplicarNumeros;
	}

}
