
public class _02_ConversionTemperatura {

	public static void main(String[] args) {
		int fahrenheit = 0;
		int celsius = 0;
		
		fahrenheit = 70;
		celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println(celsius +"°C");
		
		fahrenheit = 100;
		celsius = (fahrenheit - 32) * 5 / 9;
		
		System.out.println(celsius+"°C");

	}

}
