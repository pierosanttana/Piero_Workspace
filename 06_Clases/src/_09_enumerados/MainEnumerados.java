package _09_enumerados;

public class MainEnumerados {

	public static void main(String[] args) {
		
		Direccion d1 = new Direccion();
		//d1.setTipoVia("Calle");
		//d1.setTipoVia("CALLE");
		//d1.setTipoVia("c\\");
		
		/*
		 * Para acceder a un enumerado concreto lo haremos
		 * a traves de su clase, con un "." y luego el nombre
		 * del enumerado
		 */
		
		System.out.println(TipoVia.CALLE);
		System.out.println(TipoVia.AVENIDA);
		
		/*
		 * Podemos recorrer todos los tipos como un array
		 * accediendo al método "values()"
		 */
		
		System.out.println("Accediendo recorriendo el array");
		for (int i = 0; i < TipoVia.values().length; i++) {
			System.out.println(TipoVia.values()[i]);
		}
		
		System.out.println("Accediendo recorriendo el array con un for each");
		for (TipoVia tv : TipoVia.values()) {
			System.out.println(tv);
		}
		
		
		
	}

}
