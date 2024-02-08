import java.util.Scanner;

import javax.swing.JOptionPane;

public class _05_Ejercicio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa un numero: ");
		int numero = scanner.nextInt();
		
		if(numero%2==0) {
			System.out.println("El numero "+numero+" es divisible entre 2.");
		} else {
			System.out.println("El numero "+numero+ " no es divisible entre 2.");
		}
		scanner.close();
		
		String texto = JOptionPane.showInputDialog("Escribe un numero");
		int numero2 = Integer.parseInt(texto);

		if(numero2%2==0) {
			JOptionPane.showMessageDialog(null, "El numero "+numero2+" es divisible entre 2.");
		} else {
			JOptionPane.showMessageDialog(null,"El numero "+numero2+ " no es divisible entre 2.");
		}
	}

}
