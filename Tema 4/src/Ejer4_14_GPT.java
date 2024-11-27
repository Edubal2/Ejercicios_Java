import java.util.Scanner;

public class Ejer4_14_GPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Piensa en un número del 1 al 100 y el ordenador intentará adivinarlo.");
        System.out.println("Responde si el número es 'mayor', 'menor' o 'igual'.");

        int min = 1;
        int max = 100;
        int intentos = 0;

        while (min <= max) {
            int guess = (min + max) / 2;
            System.out.println("¿Es tu número " + guess + "?");

            String respuesta = scanner.nextLine().toLowerCase();
            intentos++;

            if (respuesta.equals("igual")) {
                System.out.println("¡Genial! El ordenador adivinó tu número en " + intentos + " intentos.");
                break;
            } else if (respuesta.equals("mayor")) {
                min = guess + 1;
            } else if (respuesta.equals("menor")) {
                max = guess - 1;
            } else {
                System.out.println("Respuesta no válida. Por favor, responde con 'mayor', 'menor' o 'igual'.");
            }
        }

        scanner.close();
    }
}
