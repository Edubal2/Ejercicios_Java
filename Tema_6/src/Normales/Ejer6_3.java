package Normales;

import java.util.Scanner;

public class Ejer6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = N;
        int[] n = new int[N];
        int[] m = new int[M];

        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            M--;
            m[i] = n[M];
        }
        for (int i = 0; i < N; i++) {
            System.out.print(m[i] + " ");
        }
    }
}
