package Extra;

import java.util.Scanner;

public class Ejer6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la longitud de los arrays a comparar: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.print("Introduce los numeros del primer array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Introduce los numeros del segundo array: ");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    c[k++] = a[i];
                }
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
