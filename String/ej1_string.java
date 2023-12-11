/**
 * En este programa vamos a pedirle al usuario una cadena de texto y separaremos cada palabra en una linea de texto diferente
 * @author Guillermo Troya Albarrán
 */
public class ej1_string{
    public static void main (String[]args){

        // Aquí le vamos a pedir al usuario que ingrese una cadena de texto
        System.out.print("Por favor, Ingresa una cadena de texto: ");
        String cadena = System.console().readLine();


        String[] palabras = cadena.split(" ");

//Aqui vamos a separar cada palabara de la cadena y hacer un bucle para que lo repita
        System.out.println("Palabras en líneas separadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

    }
}