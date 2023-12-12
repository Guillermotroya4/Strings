/**
 * En este programa lñe pediuremos al usuario una frase y le diremos las veces que se repite cada vocal, mediante un bucle y un switch
 * @author Guillermo Troya Albarrán
 */
public class ej4_string {
    public static void main(String[] args) {

        System.out.print("Introduce una frase: ");
        String frase = System.console().readLine();

        //Aquí convertiremos toda la frase en minuscula para que sean todas las letras iguales
        frase = frase.toLowerCase();

        // Aquí pondremos los contadores en 0 y cuando lea la frase aumentara el contador
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            //Aqui vamos hacer un switch para que en caa caso de vocales aumente el contador deesa vocal
            switch (caracter) {
                case 'a':
                    contadorA++;
                    break;
                case 'e':
                    contadorE++;
                    break;
                case 'i':
                    contadorI++;
                    break;
                case 'o':
                    contadorO++;
                    break;
                case 'u':
                    contadorU++;
                    break;
            }
        }

        //Aquí haremos imprimir la cantidad de vocales que se han acumulado en el contador
        System.out.println("Nº de A's: " + contadorA);
        System.out.println("Nº de E's: " + contadorE);
        System.out.println("Nº de I's: " + contadorI);
        System.out.println("Nº de O's: " + contadorO);
        System.out.println("Nº de U's: " + contadorU);
    }
}


