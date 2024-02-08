
public class _02_IntercambiarValores {

	public static void main(String[] args) {
		
		String x = "Agua"; //inicializamos la variable 'x' con valor 'Agua'
		String y = "Vino"; //Inicializamos la variable 'y' con valor 'Vino'
		String temporal; // Declaramos la variable 'temporal'
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
		temporal = x; //Asignamos el valor 'x' a la variable 'temporal = Agua'
		//'temporal' nos ayuda a guardar el valor de 'x'
		x = y; //Ahora 'x' vale igual que 'y' 'x = Vino'
		y = temporal; //Ahora 'y = Agua'
		//Asi es como intercambian sus valores las variables.
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
	}

}
