package Extra;

import java.util.Scanner;

public class Ejer6_2_GPT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud del array: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        int[] recortada = new int[length];

        System.out.println("Introduce los valores del array: ");
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }

        int indexRecortada = 0;
        for (int i = 0; i < length; i++) {
            // Si no es el último elemento y no es igual al siguiente, o si es el último elemento
            if (i == length - 1 || array[i] != array[i + 1]) {
                recortada[indexRecortada++] = array[i];
            }
        }

        // Mostrar el array recortado
        System.out.print("Array recortado: ");
        for (int i = 0; i < indexRecortada; i++) {
            System.out.print(recortada[i] + " ");
        }
    }
}
