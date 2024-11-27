import java.util.ArrayList;
import java.util.Scanner;

public class Ejer4_10_mejorado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Introduce los numeros (finaliza con 0): ");

        int input;
        while (true) {
            input = sc.nextInt();
            if (input == -1) break; // Exit the loop if 0 is entered
            numbers.add(input);
        }

        int positivo = 0, negativo = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            System.out.print("\n" + (i + 1) + ". El numero " + num);
            if (num > 0) {
                System.out.print(" es positivo ");
                positivo++;
            } else if (num < 0) {
                System.out.print(" es negativo ");
                negativo++;
            }
        }

        System.out.println("\n\nHay " + negativo + " numeros negativos y " + positivo + " numeros positivos");
    }
}
