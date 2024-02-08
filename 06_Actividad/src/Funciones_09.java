
public class Funciones_09 {

	public static void main(String[] args) {
		
		//sueldoTotal(sueldoBase, horasExtras, precioHoraExtra)
		sueldoTotal(950, 8, 15);
		sueldoTotal(300, 18, 15);
		
	}
	public static void sueldoTotal(double sueldoBase, double horasExtra,
			double precioHoraExtra) {
		double sueldoTotal = sueldoBase + (horasExtra * precioHoraExtra);
		System.out.println("El salario total es: " + sueldoTotal);
		
	}

}
