/**
 * En este programa le pediremos al usuario tres cadenas de texto que representan el nombre y dos apellidos. Luego, realizaremos la concatenación en mayúsculas de las tres primeras letras de cada cadena.
 * @author Guillermo Troya Albarrán
 */
public class ej3_string {
    public static void main(String[] args) {
        // Aqui le pediremos al usuario que ingrese el nombre y los dos apellidos, y esa serán las tres cadenas con las que estaremos haciendolo todo
        System.out.println("Ingresa tu nombre:");
        String nombre = System.console().readLine();

        System.out.println("Ingresa tu primer apellido:");
        String apellido1 = System.console().readLine();

        System.out.println("Ingresa tu segundo apellido:");
        String apellido2 = System.console().readLine();

        // Aquí vamos a concatenar las tres primeras letras de cada cadena en mayúsculas
        String codigoUsuario = nombre.substring(0, Math.min(nombre.length(), 3)).toUpperCase() +
                              apellido1.substring(0, Math.min(apellido1.length(), 3)).toUpperCase() +
                              apellido2.substring(0, Math.min(apellido2.length(), 3)).toUpperCase();

        System.out.println("Su código de usuario es: " + codigoUsuario);        
    }
}
