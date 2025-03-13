package Normales.Ejer1;

import java.util.Scanner;

public class Ejer6_1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float maxima=0,minima=0,media=0;
        int debajo=0,exacto=0,encima=0;

        System.out.print("Introduce el numero de alturas que deseas introducir: ");
        int n = sc.nextInt();
        float[] A = new float[n];

        System.out.println("\nIntroduce el valor de la altura en cm:  ");
        for (int i = 0; i < n; i++) {
            System.out.print("Altura " + (i + 1) + ": ");
            A[i] = sc.nextFloat();
        }
        maxima = A[0];
        minima = A[0];

        for (int i = 0; i < n; i++) {
            media+=A[i];
            if (A[i] > maxima) {
                maxima = A[i];
            }
            if (A[i] < minima) {
                minima = A[i];
            }
        }

        media = media/n;

        for (int i = 0; i < n; i++) {
            if (A[i] > media) {
                encima++;
            }else if (A[i] < media) {
                debajo++;
            }else if (A[i] == media) {
                exacto++;
            }
        }

        System.out.println("\nLa altura maxima es: " + maxima + " m");
        System.out.println("La altura minima es: " + minima  + " m");
        System.out.println("La media de alturas es : " + media  + " m");
        System.out.println("Hay " + encima + " personas por encima de la media");
        System.out.println("Hay " + debajo + " personas por debajo de la media");
        System.out.println("Hay " + exacto + " personas que miden los mismo que la media");
    }
}
