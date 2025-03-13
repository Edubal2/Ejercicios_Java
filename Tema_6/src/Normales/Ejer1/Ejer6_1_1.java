package Normales.Ejer1;

import java.util.Scanner;

public class Ejer6_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[10];

        System.out.println("Introduce 10 numeros reales y te los muestro por pantalla");

        for (int i = 0; i < 10; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
