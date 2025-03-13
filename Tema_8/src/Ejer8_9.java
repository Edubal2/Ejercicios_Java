import java.util.Scanner;

public class Ejer8_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena = "JuAn gOMez perEZ";
        System.out.println("Tenemos esta cadena: \"" + cadena + "\" y queremos convertirla las letras en miscula y el principio de cada plabra en mayuscula ");
        System.out.print("Deseas cambiarla s/n: ");
        char n = sc.next().charAt(0);
        sc.nextLine();
        if (n == 's' || n == 'S') {
            System.out.print("Introduce la nueva cadena\n:");
            cadena = sc.nextLine();
        }

        String cadenaMinus = cadena.toLowerCase() ;
        String[] palabras = cadenaMinus.split(" ");
        String cadena2="";

            for (int i = 0; i < palabras.length; i++) {
                palabras[i] = palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1);
            }

        for (int i = 0; i < palabras.length; i++) {
            cadena2 += palabras[i] + " ";
        }

        System.out.println("De acuerdo esta es la cadena trasnformada:\n" + cadena2);
    }
}
