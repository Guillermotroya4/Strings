/**
 * En este programa le pediremops la usaurio dos cadenas de texto y le diremos si son igualkes en todos los caracteres o si son dfiferente o iguales por las mayusculas o minusculñas
 * @author guillermo Troya Albarrán
 */
public class ej2_string {
    public static void main(String[] args) {
        
        System.out.print("Por favor, Ingresa una cadena de texto: ");
        String cadena1 = System.console().readLine();

        System.out.print("Por favor, Ingresa una cadena de texto: ");
        String cadena2 = System.console().readLine();

        //Aquí haremos un boolean para que nos diga luego en el if si la cadena es igual en todo sus caracteres o no
        boolean iguales;
        iguales=cadena1.equals(cadena2);
        if (iguales) {
            System.out.println("Las dos cadenas son iguales en todos sus caracteres");
        }
        else{
            System.out.println("No son iguales en todos sus caracteres");
            }
        
        //Aquí haremos un boolean para que nos diga luego en el if si la cadena es igual, independientemente de las mayusculas y minusculas
        boolean igualesignorado;
        igualesignorado=cadena1.equalsIgnoreCase(cadena2);
        if (igualesignorado) {
            System.out.println("Las dos cadenas son iguales independiente de las mayusculas y minusculas");
        }
        else{
            System.out.println("No son iguales");
            }
    }
}
