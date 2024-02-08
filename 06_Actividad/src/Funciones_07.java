
public class Funciones_07 {

	public static void main(String[] args) {
		
		//mediaDeTresNumeros(numeroA, numeroB, numeroC);
		
		mediaDeTresNumeros(11, 30, 50);
		mediaDeTresNumeros(66, 50, 40);
	
	}
	public static void mediaDeTresNumeros(int numeroA, int numeroB,
			int numeroC) {
		int mediaTotal = (numeroA + numeroB + numeroC) / 3;
		System.out.println(mediaTotal);
	}
}
