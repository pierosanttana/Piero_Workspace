
public class _04_ExpressionJava {

	public static void main(String[] args) {
		
		/*
		 * expression = operands & operators
		 * operands = 	Values, variables, numbers, quantity
		 * operators:
			 * +(suma)
			 * -(resta)
			 * *(multiplicacion)
			 * /(division)
			 * %(modulo) lo que resta en una division '10 % 3 = 1'
		*/

		int friendsActual = 5;
		int newFriends = 2;
		
		double friends;
		
		friends = friendsActual + newFriends; //Resultado '7'
		System.out.println(friends);
		
		friends = friendsActual / newFriends; //Da resultado '2' ya que ambas variables son 'int' osea no tienen decimales 
		System.out.println(friends);
		
		friends = (double)friendsActual / newFriends; //Da resultado '2.5' al poner (double) a la izquierda de
		//la expresion convierte el RESULTADO a otro tipo de dato.
		System.out.println(friends);

		friends = friendsActual % newFriends; //El Operador 'modulo' da el resto de cualaquier division en este caso '1'
		System.out.println(friends);
		
		
		int number = 10; 
		
		number = number + 1; // suma 1 a la variable
		System.out.println(number);
		
		//Operadores 
		
		number ++; // forma corta de sumar 1
		System.out.println(number);
		
		number --; //forma corta de restar 1
		System.out.println(number);
		
		number += 5; //Suma 5 al valor de number
		
		int number2 = 10;
		
		number2 += 2;
		number2 -= 2;
		number2 *= 2;
		number2 /= 2;
		number2 %= 2;
		
		number2 ++;
		number2 --;
		
		System.out.println(number2);
		
		
		System.out.println((float)9/2); //Convierte el resultado en decimal
		System.out.println(11.0/2); //Uno de los valores debe ser decimal
		
	}

}
