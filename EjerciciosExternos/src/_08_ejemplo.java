
import java.util.Scanner;
import javax.swing.JOptionPane;
public class _08_ejemplo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final double iva = 1.21;
		
		System.out.print("Ingresa el precio del producto sin IVA: ");
		double precioSinIva = scanner.nextDouble();
		double precioConIva = precioSinIva * iva;
		System.out.println("El precio final es: "+precioConIva);
		
		String texto = JOptionPane.showInputDialog("Ingresa el precio del producto sin IVA:");
		double precio = Double.parseDouble(texto);
		
		precioConIva = precio * iva;
		JOptionPane.showMessageDialog(null,"El precio final es: "+precioConIva);
		
		
	}
}
