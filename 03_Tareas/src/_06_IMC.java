
public class _06_IMC {

	public static void main(String[] args) {
		double peso = 0;
		double altura = 0;
		
		peso = 61;
		altura = 1.67;
		double IMC = peso / (altura * altura);
		System.out.println(IMC);
		
		peso = 120;
		altura = 1.60;
		IMC = peso / (altura * altura);
		
		System.out.println(IMC);

	}

}
