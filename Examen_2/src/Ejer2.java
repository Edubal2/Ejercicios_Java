import java.util.Arrays;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer las dos cadenas desde la entrada
        String cadena1 = sc.nextLine();
        String cadena2 = sc.nextLine();

        // Convertir a minúsculas y eliminar espacios
        String palabra1 = cadena1.toLowerCase().replace(" ", "");
        String palabra2 = cadena2.toLowerCase().replace(" ", "");

        // Si tienen distinta longitud, no pueden ser anagramas
        if (palabra1.length() != palabra2.length()) {
            System.out.println("No son anagramas");
            return;
        }

        // Convertir cada palabra en un array de caracteres
        char[] palabra1Array = palabra1.toCharArray();
        char[] palabra2Array = palabra2.toCharArray();

        // Ordenar los arrays alfabéticamente
        Arrays.sort(palabra1Array);
        Arrays.sort(palabra2Array);

        // Convertir los arrays ordenados de nuevo a Strings
        String sortedPalabra1 = new String(palabra1Array);
        String sortedPalabra2 = new String(palabra2Array);

        // Comparar si los Strings ordenados son iguales
        if (sortedPalabra1.equals(sortedPalabra2)) {
            System.out.println("Son anagramas");
        } else {
            System.out.println("No son anagramas");
        }
    }
}
