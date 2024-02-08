import javax.swing.JOptionPane; //importar clase JOpcionPane 

//GUI acrónimo de Graphical User Interface(Interfaz gráfica de usuario)

public class _05_JOptionPane {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Escribe tu nombre:"); 
		// creamos un string que el valor sera la respuesta de
		// un cuadro de diálogo GUI con el texto "Escribe tu nombre"
			
		JOptionPane.showMessageDialog(null, "Hola "+name); //Cuadro de dialogo GUI que muestra un mensaje.
		
		int age = Integer.parseInt (JOptionPane.showInputDialog("Escribe tu edad:"));
		//Hay un problema, el input devuelve un String que no puede ser asignado a un int
		//Creamos una clase contenedora de enteros 'Integer'
		//El método 'parseInt' convierte el String en numero entero, el input va dentro de los '()'
		
		JOptionPane.showMessageDialog(null,"Tienes "+age+" años.");
		
		long height = Long.parseLong(JOptionPane.showInputDialog("Escribe tu altura en cm:")); 
		//Creamos una clase contenedora de enteros largos 'Long'
		//El método 'parseLong' convierte el String en numero entero largo, el input va dentro de los '()'
		
		JOptionPane.showMessageDialog(null,"Tu altura es de "+height+"cm.");
		
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Escribe tu nota final"
		+ "(usa '.', no uses ',')")); 
		//Creamos una clase contenedora de numeros decimales 'Double'
		//El método 'parseDouble' convierte el String en numero decimal, el input va dentro de los '()'
		
		JOptionPane.showMessageDialog(null,"Tu notal final fue "+nota);
		
	}

}
