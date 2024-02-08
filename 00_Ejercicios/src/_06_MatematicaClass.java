
public class _06_MatematicaClass {
	
	public static void main(String[] args) {
		
		double x = 3.4;
		int y = 6;
		
		double z = Math.max(x, y); //Valor maximo entre 'x' y 'y'
		System.out.println(z);
		
		z = Math.min(x, y); //Valor minimo entre 'x' y 'y' 
		System.out.println(z);
		
		z = Math.abs(y); //Valor absoluto de 'y'
		System.out.println(z);
			
		z = Math.sqrt(y); //raiz cuadrada de 'y'
		System.out.println(z);
		
		z = Math.round(y); //redondeo de 'y'
		System.out.println(z);
	
		z = Math.ceil(y); //redondeo siempre al alza de 'y'
		System.out.println(z);
		
		z = Math.floor(y); //redondeo siempre a la baja de 'y'
		System.out.println(z);
		
		z = Math.random(); //numero random entre el 0 y 1
		System.out.println(z);
		
		z = Math.pow(y,2);
		System.out.println(z);
		
	}	
}
