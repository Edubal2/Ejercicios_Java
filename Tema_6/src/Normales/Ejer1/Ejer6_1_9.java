package Normales.Ejer1;

import java.util.Scanner;
import java.util.Random;

public class Ejer6_1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] n = new int[100];

        for (int i = 0; i < 100; i++) {
            n[i] = rand.nextInt(1,10);
        }

        int N = sc.nextInt();

        System.out.print("El numero N = " + N + " ,esta en las posiciones: ");
        for (int i = 0; i < 100; i++) {
            if (n[i]==N){
               System.out.print(i + "; " +
                       " ");
            }
        }

    }
}
