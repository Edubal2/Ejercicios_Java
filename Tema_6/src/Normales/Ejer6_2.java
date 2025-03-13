package Normales;

import java.util.Scanner;

public class Ejer6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] bool = new boolean[20];
        int[] numeros = new int[20];
        int j = 0;

       for (int i = 0; i < 20; i++) {
            numeros[i] = sc.nextInt();
            if (numeros[i] == -1) break;
        }

        for (int i = 0; i < 20; i++) {
            if (i == numeros[j]) {
                bool[i] = true;
                j++;
            }
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(bool[i] + ", ");
        }
    }
}
