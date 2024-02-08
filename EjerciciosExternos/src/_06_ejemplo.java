import java.util.Scanner;
import javax.swing.JOptionPane;

public class _06_ejemplo {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa un numero: ");
		int numero = scanner.nextInt();
		
		char c1 = (char)numero;
		
		System.out.println("El numero "+numero+" pertenece en la tabla ASCII al caracter "+c1);
		
		
		/* 
		String texto = JOptionPane.showInputDialog("Ingresa un numero");
		int numero2 = Integer.parseInt(texto);
		char c2 = (char)numero2;
		JOptionPane.showMessageDialog(null,"El numero "+numero2+" pertenece en la tabla ASCII al caracter "+c2 );
		*/
		
		
		
		
	}

}
