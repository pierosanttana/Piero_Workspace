package String;

public class ClaseString {
    public static void main(String[] args) {

        String cadena = "PIERO augusto Santana la Rosa";
        String cadena2 = "augusto PIERO la Rosa Santana";

        String name = cadena.substring(0,5);
        String name2 = cadena.substring(0,5);
        String name3 = name2.toLowerCase();
        String secondName = cadena.substring(6,13);
        String lastName = new String(cadena.substring(14));
        System.out.println("Nombre: " + name);
        System.out.println("Segundo nombre: " + secondName);
        System.out.println("Apellidos: " + lastName);

        String replaceLastName = lastName.replace('a','u');
        System.out.println(replaceLastName);

        System.out.println(name.charAt(4)); //Imprime el caracter en esa posicion
        System.out.println(lastName.indexOf('t')); //Imprime en que posicion se encuentra el caracter
        System.out.println(name.toLowerCase()); //Devuelve la cadena en minisculas
        System.out.println(secondName.toUpperCase()); //Devuelve la cadena en mayusculas
        System.out.println(lastName.trim()); //Devuelve la cadena sin los espacios de los extremos
        System.out.println(cadena.length()); //Imprime el tamaño de la cadena
        System.out.println("name: " + name + " name2: " + name2 + " name3: " + name3);
        System.out.println(cadena.equalsIgnoreCase(cadena2));
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));

       String[] nuevaCadena = cadena.split(" "); //Devuelve un array con partes de la cadena divido
        for (String string : nuevaCadena) {             // por el parametro de entrada
            System.out.println(string);
        }
        System.out.println(name3.equalsIgnoreCase(nuevaCadena[0]));

    }
}
