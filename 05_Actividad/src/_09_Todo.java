import java.util.Scanner;

public class _09_Todo {

	public static void main(String[] args) {
		

	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("Vamos a calcular el perímetro y área de un rectángulo dada su base y su altura.");
	System.out.println("----------------------------------------------------------------------------------");
	
	System.out.println("1. Introduce un numero(entero) como base:");
	int base = scanner.nextInt();
	System.out.println("1. Introduce un numero(entero) como altura:");
	int altura = scanner.nextInt();
	
	int areaRectangulo = altura * base;		
	int perimetroRectangulo = 2 * (altura + base);
	
	System.out.println("El area del rectangulo es: " + areaRectangulo);
	System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo+"\n");
	
	System.out.println("Para continuar pulsa 'enter' ");
	scanner.nextLine();
	scanner.nextLine();
	
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("Vamos a calcular la hipotenusa de un triángulo rectángulo.");
	System.out.println("Importante: Si usas decimales utiliza una coma ','");
	System.out.println("----------------------------------------------------------------------------------");
	
	System.out.println("Ingresa el lado A:");
	float a = scanner.nextFloat();
	
	System.out.println("Ingresa el lado B:");
	float b = scanner.nextFloat();
	
	float c = (float)Math.sqrt((a*a)+(b*b));
	System.out.println("Dados los lados A="+a+" y B="+b);
	System.out.println("la hipotenusa es: "+c+"\n");
	
	System.out.println("Para continuar pulsa 'enter' ");
	scanner.nextLine();
	scanner.nextLine();

	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("Vamos a cacular con dos números enteros: \n" 
		+"la suma \n"
		+"resta \n"
		+"división \n" 
		+"multiplicación");
	System.out.println("----------------------------------------------------------------------------------");
	
	System.out.println("Introduce el primer numero:");
	double numero1 = scanner.nextDouble();
	
	System.out.println("Introduce el segundo numero:");
	double numero2 = scanner.nextDouble();
	
	double suma = numero1 + numero2;
	double resta = numero1 - numero2;
	double multiplicacion = (int)numero1 * numero2;
	double division = numero1 / numero2;
	
	System.out.println("la suma es: "+ (int)suma );
	System.out.println("la resta es: "+ (int)resta );
	System.out.println("la multiplicacion es: "+ (int)multiplicacion );
	System.out.println("la division es: "+ division +"\n");

	System.out.println("Para continuar pulsa 'enter' ");
	scanner.nextLine();
	scanner.nextLine();
	
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("Vamos a calcular la media de tres números.");
	System.out.println("----------------------------------------------------------------------------------");
	
	System.out.println("Ingresa el primer numero:");
	double n1 = scanner.nextDouble();
	
	System.out.println("Ingresa el segundo numero:");
	double n2 = scanner.nextDouble();
	
	System.out.println("Ingresa el tercer numero:");
	double n3 = scanner.nextDouble();
	
	double media = (n1 + n2 + n3)/3;
	
	System.out.println("La media de los tres numeros es: "+media + "\n");
	
	System.out.println("Para continuar pulsa 'enter' ");
	scanner.nextLine();
	scanner.nextLine();
	
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("Vamos a calcular las comisiones y sueldo total a final de mes de un vendedor.");
	System.out.println("----------------------------------------------------------------------------------");
	
	System.out.println("Introduce el sueldo base del venedor:");
	double sueldoBase = scanner.nextDouble();
	
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("El vendedor a realizado tres ventas en el mes, recibe 10% de comision por cada venta.");
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("Introduce el valor de la primera venta:");
	double v1 = scanner.nextDouble();
	
	System.out.println("Introduce el valor de la segunda venta:");
	double v2 = scanner.nextDouble();
	
	System.out.println("Introduce el valor de la tercera venta:");
	double v3 = scanner.nextDouble();
	
	double comision = (v1*0.10)+(v2*0.10)+(v3*0.10);
	System.out.println("Las comisiones totales son: "+comision);
	
	double FinDeMes = sueldoBase + comision;
	System.out.println("Lo que cobrará el vendedor a fin de mes será: " + FinDeMes + "\n");
	
	System.out.println("Para continuar pulsa 'enter' ");
	scanner.nextLine();
	scanner.nextLine();
	
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("Un alumno desea saber cuál será su calificación final en la materia de  \n"
			+ "Entornos de Desarrollo");
	System.out.println("Dicha calificación se compone de los siguientes porcentajes: \n"
			+ "* 55% del promedio de sus tres calificaciones parciales. \n"
			+ "* 30% de la calificación del examen final. \n"
			+ "* 15% de la calificación de un trabajo final. ");
	System.out.println("----------------------------------------------------------------------------------");

	System.out.println("Maxima calificación '100'");
	System.out.println("Ingresa la calificacion de su primer parcial:");
	int p1 = scanner.nextInt();
	
	System.out.println("Ingresa la calificacion de su segunda parcial:");
	int p2 = scanner.nextInt();
	
	System.out.println("Ingresa la calificacion de su tercer parcial:");
	int p3 = scanner.nextInt();
	
	int promedioParciales = (p1 + p2 + p3)/3;
	double porcentaje55 = promedioParciales*0.55;
	
	System.out.println("Ingresa la calificacion de su examen final:");
	int examenFinal = scanner.nextInt();
	double porcentaje30 = examenFinal*0.30;
	
	System.out.println("Ingresa la calificacion de su trabajo final:");
	float trabajoFinal = scanner.nextFloat();
	double porcentaje15 = trabajoFinal*0.15;
	
	int calificacionFinal =(int)(porcentaje55 + porcentaje30 + porcentaje15);
	System.out.println("La calificacion final del alumno es: "+ calificacionFinal+"/100");
	
	System.out.println("Para continuar pulsa 'enter' ");
	scanner.nextLine();
	scanner.nextLine();
	
	System.out.println("----------------------------------------------------------------------------------");
	System.out.println("Calcular la nota final de un estudiante, considerando que: \n"
			+ "Correcta +5 puntos \n"
			+"Incorrecta -1 punto\n"
			+ "En blanco 0 puntos");	
	System.out.println("---------------------------------------------------------------------------");

		System.out.println("Total de preguntas: 10");
		System.out.println("Escribe en numeros cuantas respuestas correctas obtuvo:");
		int correctas = scanner.nextInt() * 5;
		
		System.out.println("Escribe en numeros cuantas respuestas incorrectas obtuvo:");
		int incorrectas = scanner.nextInt();
		
		System.out.println("Escribe en numeros cuantas respuestas en blanco obtuvo:");
		int blanco = scanner.nextInt();
		
		int notaFinal = correctas - incorrectas;
		System.out.println("La nota final es: "+ notaFinal+"/50 \n");
		
		System.out.println("Para continuar pulsa 'enter' ");
		scanner.nextLine();
		scanner.nextLine();
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Vamos a calcula el sueldo de un trabajador, cuyo valor es su sueldo base  \n"
				+ "más un número de horas extra trabajadas.");
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println("Ingresa el sueldo base:");
		sueldoBase = scanner.nextDouble();
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Importante: Cada hora extra son 40€");
		System.out.println("-------------------------------------------------------------------------------- \n");
		System.out.println("Ingresa el numero de horas extras trabajadas:");
		double horasExtras = scanner.nextDouble();
		
		double TotalExtras = horasExtras * 40;
		double sueldoTotal = sueldoBase + TotalExtras;
		
		System.out.println("El sueldo del trabajor a final de mes es: "+ sueldoTotal+"\n");
		
	
	}
}
