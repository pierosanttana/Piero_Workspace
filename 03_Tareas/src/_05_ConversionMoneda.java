
public class _05_ConversionMoneda {

	public static void main(String[] args) {
		double dolar = 0;
		double euro = 0;
		double TasaConversion = 0.94;
		
		dolar = 100;
		euro = dolar * TasaConversion;
		System.out.println(euro + "€");
		
		dolar = 2055;
		euro = dolar * TasaConversion ;
		System.out.println(euro + "€");
		
		euro = 100;
		TasaConversion = 1.05;
		dolar = euro * TasaConversion;
		System.out.println("$"+dolar);


	}

}
