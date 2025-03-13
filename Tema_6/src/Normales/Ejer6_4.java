package Normales;

import java.util.Scanner;

public class Ejer6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] n = new int[N];
        int iguales = 0;

        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        N--;
        for (int i = 0; i < N; i++) {
            if (n[i] == n[N]) {
                iguales++;
            }
        }
        System.out.println(iguales);
    }
}
