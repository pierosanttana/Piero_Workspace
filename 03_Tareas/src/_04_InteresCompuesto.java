
public class _04_InteresCompuesto {

	public static void main(String[] args) {
		double interes = 0;
		double principal = 0;
		double tasa = 0;
		double tiempo = 0;
		
		principal = 1000;
		tasa = 0.1; //10%
		tiempo = 1; //en años
		interes = principal * tasa * tiempo;
		
		System.out.println(interes);

		
		principal = 2000;
		tasa = 0.05; //5%
		tiempo = 15; //en años
		interes = principal * tasa * tiempo;
		
		System.out.println(interes);
	}

}
