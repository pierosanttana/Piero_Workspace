import java.util.Scanner;

import javax.swing.JOptionPane;

public class _04_Ejercicio {

	public static void main(String[] args) {
		

		double area;
		double radio1;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Ingresa el radio: ");
		radio1 = scanner.nextDouble();
		area = Math.PI * Math.pow(radio1, 2);
		
		System.out.println("El Area del circulo es: "+ area);
		
		scanner.close();
		
		String texto = JOptionPane.showInputDialog("Ingresa el radio: ");
		double radio2 = Double.parseDouble(texto); 
		double area2 = Math.PI * Math.pow(radio2, 2);
		JOptionPane.showMessageDialog(null,"El Area del circulo es: "+area2);
		

	}

}