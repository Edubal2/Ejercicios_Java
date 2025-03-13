package Extra;

import java.util.Scanner;

public class Ejer6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la longitud del array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.print("Introduce los valores de la array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int suma=0;
        int mayor=0;
        int min = 0;
        int max = n;
        for (int j = 0; j < 11; j++) {
            for (int i = min; i < max; i++) {
                suma += array[i];
            }
            if (suma>mayor) {
                mayor = suma;
            }
            System.out.println("\nSuma"+suma);
            suma=0;
            System.out.println("Mayor"+mayor);
            System.out.println("Minimo"+min);
            min++;
      }

    }

  /*  Implementa un programa que encuentre la suma máxima de un subarray contiguo
    dentro de un array de números enteros. Por ejemplo, para el array
    [-2 1 -3 4 -1 2 1 -5 4], la suma máxima sería 6, correspondiente al subarray
               [4, -1, 2, 1].*/
}
