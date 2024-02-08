import java.util.Scanner;

import javax.swing.JOptionPane;

public class _11_EjemploSwitch {

	public static void main(String[] args) {
		
		/*
		 * Aplicacion que pregunta el 'codigo' de descuento para aplicar una resta al PVP 
		 * y dar un precioFinal.
		 * 
		 * Aplicacion por consola con Scanner o por Input con JOptiionPane
		 */
		int PVP = 100;
		int descuento = 0;
		int precioFinal;
		
		//Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Escribe tu 'codigo' de descuento:");
		//String codigoDescuento = scanner.nextLine();
		String codigoDescuento = JOptionPane.showInputDialog("Escribe tu 'codigo' de descuento:"); ;
		
		switch(codigoDescuento) {
		case "DESCUENTO10": descuento = 10;
			break;
		
		case "DESCUENTO20": descuento = 20;
			break;
		
		case "TODOGRATIS": descuento = 100;
			break;	
			
		default: 
			JOptionPane.showMessageDialog(null,"No has ingresado un codigo de descuento o es incorrecto."); 
			//System.out.println("No has ingresado el codigo de descuento o es incorrecto."); 	
			
		}
		
		precioFinal = PVP - descuento;
			//System.out.println("Total a pagar: " +precioFinal+"€");
			JOptionPane.showMessageDialog(null,"Total a pagar: " +precioFinal+"€");

	}

}
