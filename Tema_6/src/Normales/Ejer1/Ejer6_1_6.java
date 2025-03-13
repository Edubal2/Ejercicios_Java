package Normales.Ejer1;

import java.util.Scanner;

public class Ejer6_1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] n = new int[N];

        for (int i = 0; i < N; i++){
            n[i] = M;
        }

        for (int i = 0; i < M; i++){
            System.out.print(n[i] + " ");
        }
    }
}
