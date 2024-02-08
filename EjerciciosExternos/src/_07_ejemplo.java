import java.util.Scanner;
import javax.swing.JOptionPane;

public class _07_ejemplo {
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Ingresa un caracter: ");
			char caracter = scanner.next().charAt(0);
			int ascii = (int)caracter;
			
			System.out.println("El codigo ASCII de "+"'"+caracter+"'"+" es: "+ascii);
			
			/* 
			String texto = JOptionPane.showInputDialog("Ingresa un caracter:");
			char caracter2=texto.charAt(0);
			ascii = (int)caracter2; 
			JOptionPane.showMessageDialog(null,"El codigo ASCII de "+"'"+caracter2+"'"+" es: "+ascii);
			
			String name = "Piero";
			char nameCaracter = name.charAt(0);
			System.out.println(nameCaracter);
			*/
			
		}

	

}
