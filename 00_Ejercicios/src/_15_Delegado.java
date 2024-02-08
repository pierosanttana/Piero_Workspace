import java.util.Random;

public class _15_Delegado {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int delegado = random.nextInt(1,21);
		delegado ++;
		
		System.out.println(delegado);
	}

}
