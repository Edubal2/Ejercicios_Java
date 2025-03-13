package Normales.Ejer1;

import java.util.Scanner;

public class Ejer6_1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        int Q = sc.nextInt();

        int n = Math.abs(Q - P) + 1;
        int[] a = new int[n];
        int i = 0;

        if (Q > P) {
            for (; P <= Q; P++) {
                a[i] = P;
                System.out.print(a[i] + " ");
                i++;

            }
        }else if (P > Q) {
            for (; Q <= P; P--) {
                a[i] = P;
                System.out.print(a[i] + " ");
                i++;

            }
        }
    }
}
