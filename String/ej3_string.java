/**
 * en este programa le pediuremos al usuario tres cadenas de texto, que seran el nbombre y dos apellidos y haremos la concatenación en mayúscula de las tres primeras letras de cada cadena
 * @author Guillermo Troya Albarrán
 */
public class ej3_string {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        

        // Pedir al usuario que ingrese el nombre y los dos apellidos
        System.out.println("Ingresa tu nombre:");
        String nombre = System.console().readLine();

        System.out.println("Ingresa tu primer apellido:");
        String apellido1 = System.console().readLine();

        System.out.println("Ingresa tu segundo apellido:");
        String apellido2 = System.console().readLine();

        //Aqui concatenaremos el nombre y los apellidos en una cadena
        String codigoUsuario = obtenerCodigoUsuario(nombre, apellido1, apellido2);

        System.out.println("Su código de usuario es: " + codigoUsuario);        
    }

    // Método para obtener el código de usuario
    private static String obtenerCodigoUsuario(String nombre, String apellido1, String apellido2) {
        // Tomar las tres primeras letras de cada palabra y concatenarlas en mayúsculas
        String codigoUsuario = nombre.substring(0, Math.min(nombre.length(), 3)).toUpperCase() +
                              apellido1.substring(0, Math.min(apellido1.length(), 3)).toUpperCase() +
                              apellido2.substring(0, Math.min(apellido2.length(), 3)).toUpperCase();

        return codigoUsuario;
    }
}

