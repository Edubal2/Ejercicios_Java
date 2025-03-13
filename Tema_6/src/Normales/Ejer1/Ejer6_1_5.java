package Normales.Ejer1;

import java.util.Scanner;

public class Ejer6_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[20];
        int valores=0;

        for (int i = 0; i < 20; i++) {
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            valores+=n[i];
        }
        System.out.println(valores/20);
    }
}
