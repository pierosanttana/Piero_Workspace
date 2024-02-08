package _02_bucles;

public class _05_Break_Continue {

	public static void main(String[] args) {
		/*
		 * Hay veces que tenemos que alterar el flujo de ejecución de los bucles
		 * Esta práctica conviene evitar, sobre todo al principio cuando
		 * estamos aprendiendo algoritmos.
		 * 
		 * Para alterar el flujo tenemos dos palabras reservadas:
		 * 1- break
		 * 2- continue
		 * 
		 * 
		 * "break"
		 * Con esta palabra rompe la ejecución el bucle donde se encuentra es decir,
		 * sale inmediatamente
		 * 
		 * Voy a imprimir todos los numeros naturales del 1 al 7
		 */
		for(int i = 1; i <= 10; i++) {
			System.out.println("Numero: " + i);
			if(i == 7) {
				break; //Cuando el numero valga 7, dejo de ejecutar el bucle
			}
		}
		/*
		 * El ejemplo de aqui arriba se puede hacer sin "break" mejorando
		 */

	}

}
