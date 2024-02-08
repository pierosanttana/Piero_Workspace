package adventoCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _00_LeerTexto {
	public static void main(String[] args) {
		// Ruta del archivo que deseas leer

		
		String rutaArchivo = "/Users/pierosantana/Downloads/input.txt";

		int sumador = 0;
		// Utilizar un bloque try-with-resources para asegurar que los recursos se
		// cierren correctamente
		try (FileReader fr = new FileReader(rutaArchivo); BufferedReader br = new BufferedReader(fr)) {

			// Leer línea por línea y mostrar en la consola
			String linea;
			while ((linea = br.readLine()) != null) {

				 System.out.println(linea);
				//String cadena = linea;
				for (int i = 0; i < linea.length(); i++) {
					StringBuilder stringBuilder = new StringBuilder();
					if (Character.isDigit(linea.charAt(i))) {
						stringBuilder.append(linea.charAt(i));
						// System.out.print(cadena.charAt(i));
						for (int j = linea.length() - 1; j >= 0; j--) {
							if (Character.isDigit(linea.charAt(j))) {
								stringBuilder.append(linea.charAt(j));
								// System.out.print(cadena.charAt(j));
								String cadenaNum = stringBuilder.toString();
								
								int numero = Integer.parseInt(cadenaNum);
								
								sumador += numero;
								System.out.println(sumador);
								break;
							}
						}
						break;
					}

				}
				// System.out.println(numero );

			}

		} catch (IOException e) {
			// Manejar cualquier excepción de E/S (entrada/salida) que pueda ocurrir
			e.printStackTrace();
		}

	}
}
